package utils

import java.io.File

class FileUtil {
    companion object {
        fun getDay(): String {
            val fileName = Throwable().stackTrace[1].fileName
            if (fileName != null) {
                return fileName.substring(3, 5)
            }
            return "01"
        }

        fun getFileList(fileName: String): MutableList<String> {
            return getFile(fileName).useLines { it.toMutableList() }
        }

        private fun getFile(fileName: String): File {
            return File("src/main/resources/$fileName")
        }
    }
}
