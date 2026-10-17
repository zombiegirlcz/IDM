package ch.qos.logback.core.helpers;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class Transform {
    private static final int CDATA_END_LEN = 3;
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final String CDATA_START = "<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final String CDATA_PSEUDO_END = "]]&gt;";
    private static final Pattern UNSAFE_XML_CHARS = Pattern.compile("[\u0000-\b\u000b\f\u000e-\u001f<>&'\"]");

    public static void appendEscapingCDATA(StringBuilder sb6, String str) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf("]]>");
        if (iIndexOf < 0) {
            sb6.append(str);
            return;
        }
        int i = 0;
        while (iIndexOf > -1) {
            sb6.append(str.substring(i, iIndexOf));
            sb6.append("]]>]]&gt;<![CDATA[");
            i = CDATA_END_LEN + iIndexOf;
            if (i >= str.length()) {
                return;
            } else {
                iIndexOf = str.indexOf("]]>", i);
            }
        }
        sb6.append(str.substring(i));
    }

    public static String escapeTags(String str) {
        return (str == null || str.length() == 0 || !UNSAFE_XML_CHARS.matcher(str).find()) ? str : escapeTags(new StringBuffer(str));
    }

    public static String escapeTags(StringBuffer stringBuffer) {
        int i;
        String str;
        for (int i2 = 0; i2 < stringBuffer.length(); i2++) {
            char cCharAt = stringBuffer.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '\"') {
                    i = i2 + 1;
                    str = "&quot;";
                } else if (cCharAt == '<') {
                    i = i2 + 1;
                    str = "&lt;";
                } else if (cCharAt == '>') {
                    i = i2 + 1;
                    str = "&gt;";
                } else if (cCharAt == '&') {
                    i = i2 + 1;
                    str = "&amp;";
                } else if (cCharAt == '\'') {
                    i = i2 + 1;
                    str = "&#39;";
                } else if (cCharAt < ' ') {
                    i = i2 + 1;
                    str = "�";
                }
                stringBuffer.replace(i2, i, str);
            }
        }
        return stringBuffer.toString();
    }
}
