package ch.qos.logback.core.pattern.util;

import v0.a;

/* JADX INFO: loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb6 = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i += 2;
                cCharAt = str.charAt(i2);
                if (cCharAt == 'n') {
                    cCharAt = '\n';
                } else if (cCharAt == 'r') {
                    cCharAt = '\r';
                } else if (cCharAt == 't') {
                    cCharAt = '\t';
                } else if (cCharAt == 'f') {
                    cCharAt = '\f';
                }
            } else {
                i = i2;
            }
            sb6.append(cCharAt);
        }
        return sb6.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i) {
        if (str.indexOf(c2) >= 0) {
            stringBuffer.append(c2);
            return;
        }
        if (c2 == '\\') {
            stringBuffer.append(c2);
            return;
        }
        if (c2 != '_') {
            if (c2 == 'n') {
                stringBuffer.append('\n');
                return;
            }
            if (c2 == 'r') {
                stringBuffer.append('\r');
                return;
            }
            if (c2 == 't') {
                stringBuffer.append('\t');
                return;
            }
            String escapeCharsForListing = formatEscapeCharsForListing(str);
            StringBuilder sb6 = new StringBuilder("Illegal char '");
            sb6.append(c2);
            sb6.append(" at column ");
            sb6.append(i);
            sb6.append(". Only \\\\, \\_");
            throw new IllegalArgumentException(a.i(sb6, escapeCharsForListing, ", \\t, \\n, \\r combinations are allowed as escape characters."));
        }
    }

    public String formatEscapeCharsForListing(String str) {
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb6.append(", \\");
            sb6.append(str.charAt(i));
        }
        return sb6.toString();
    }
}
