package com.yl.lib.sentry.hook.excel

import com.yl.lib.sentry.hook.printer.PrivacyFunBean

/**
 * @author Eric
 * @sinice 2021-11-25 14:28
 */
interface ExcelBuildDataListener {
    fun buildData(sheetIndex: Int, privacyFunBean: PrivacyFunBean): List<String>
}