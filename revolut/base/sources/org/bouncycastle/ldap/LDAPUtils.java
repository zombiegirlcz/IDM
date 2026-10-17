package org.bouncycastle.ldap;

import a0.d;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class LDAPUtils {
    private static String[] FILTER_ESCAPE_TABLE = new String[93];

    static {
        char c2 = 0;
        while (true) {
            String[] strArr = FILTER_ESCAPE_TABLE;
            if (c2 >= strArr.length) {
                strArr[42] = "\\2a";
                strArr[40] = "\\28";
                strArr[41] = "\\29";
                strArr[92] = "\\5c";
                strArr[0] = "\\00";
                return;
            }
            strArr[c2] = String.valueOf(c2);
            c2 = (char) (c2 + 1);
        }
    }

    private static String filterEncode(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder(str.length() * 2);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            String[] strArr = FILTER_ESCAPE_TABLE;
            if (cCharAt < strArr.length) {
                sb6.append(strArr[cCharAt]);
            } else {
                sb6.append(cCharAt);
            }
        }
        return sb6.toString();
    }

    public static String parseDN(String str, String str2) {
        int iIndexOf = Strings.toLowerCase(str).indexOf(Strings.toLowerCase(str2));
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(44);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf2 - 1) == '\\') {
            iIndexOf2 = strSubstring.indexOf(44, iIndexOf2 + 1);
            if (iIndexOf2 == -1) {
                iIndexOf2 = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.endsWith("\"")) {
            strSubstring3 = d.o(strSubstring3, 1, 0);
        }
        return filterEncode(strSubstring3);
    }
}
