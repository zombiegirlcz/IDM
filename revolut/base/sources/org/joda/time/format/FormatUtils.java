package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Writer;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i, int i2) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j2) {
        int iLog;
        if (j2 < 0) {
            if (j2 == Long.MIN_VALUE) {
                return 20;
            }
            iLog = calculateDigitCount(-j2);
        } else {
            if (j2 < 10) {
                return 1;
            }
            if (j2 < 100) {
                return 2;
            }
            if (j2 < 1000) {
                return 3;
            }
            if (j2 < 10000) {
                return 4;
            }
            iLog = (int) (Math.log(j2) / LOG_10);
        }
        return iLog + 1;
    }

    public static String createErrorMessage(String str, int i) {
        String strConcat = str.length() <= i + 35 ? str : str.substring(0, i + 32).concat("...");
        if (i <= 0) {
            return a.l(CoreConstants.DOUBLE_QUOTE_CHAR, "Invalid format: \"", strConcat);
        }
        if (i >= str.length()) {
            return a.p("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbX.append(strConcat.substring(i));
        sbX.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return sbX.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (charSequence.charAt(i + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int i2) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    writer.write(48);
                    i2--;
                }
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                writer.write(48);
                i2--;
            }
            writer.write(i + 48);
            return;
        }
        if (i >= 100) {
            int iLog = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i2 > iLog) {
                writer.write(48);
                i2--;
            }
            writer.write(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            writer.write(48);
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        writer.write(i3 + 48);
        writer.write(((i - (i3 << 3)) - (i3 << 1)) + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            writer.write(i + 48);
        } else {
            if (i >= 100) {
                writer.write(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            writer.write(i2 + 48);
            writer.write(((i - (i2 << 3)) - (i2 << 1)) + 48);
        }
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int i2) throws IOException {
        if (i < 0) {
            appendable.append(CoreConstants.DASH_CHAR);
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i >= 100) {
            int iLog = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i2 > iLog) {
                appendable.append('0');
                i2--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        while (i2 > 2) {
            appendable.append('0');
            i2--;
        }
        int i3 = ((i + 1) * 13421772) >> 27;
        appendable.append((char) (i3 + 48));
        appendable.append((char) (((i - (i3 << 3)) - (i3 << 1)) + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append(CoreConstants.DASH_CHAR);
            if (i == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            int i2 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i2 + 48));
            appendable.append((char) (((i - (i2 << 3)) - (i2 << 1)) + 48));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j2) throws IOException {
        int i = (int) j2;
        if (i == j2) {
            writeUnpaddedInteger(writer, i);
        } else {
            writer.write(Long.toString(j2));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j2) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j2);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j2) throws IOException {
        int i = (int) j2;
        if (i == j2) {
            appendUnpaddedInteger(appendable, i);
        } else {
            appendable.append(Long.toString(j2));
        }
    }

    public static void writePaddedInteger(Writer writer, long j2, int i) throws IOException {
        int i2 = (int) j2;
        if (i2 == j2) {
            writePaddedInteger(writer, i2, i);
            return;
        }
        if (i <= 19) {
            writer.write(Long.toString(j2));
            return;
        }
        if (j2 < 0) {
            writer.write(45);
            if (j2 == Long.MIN_VALUE) {
                while (i > 19) {
                    writer.write(48);
                    i--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j2 = -j2;
        }
        int iLog = ((int) (Math.log(j2) / LOG_10)) + 1;
        while (i > iLog) {
            writer.write(48);
            i--;
        }
        writer.write(Long.toString(j2));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j2, int i) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j2, i);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j2, int i) throws IOException {
        int i2 = (int) j2;
        if (i2 == j2) {
            appendPaddedInteger(appendable, i2, i);
            return;
        }
        if (i <= 19) {
            appendable.append(Long.toString(j2));
            return;
        }
        if (j2 < 0) {
            appendable.append(CoreConstants.DASH_CHAR);
            if (j2 == Long.MIN_VALUE) {
                while (i > 19) {
                    appendable.append('0');
                    i--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j2 = -j2;
        }
        int iLog = ((int) (Math.log(j2) / LOG_10)) + 1;
        while (i > iLog) {
            appendable.append('0');
            i--;
        }
        appendable.append(Long.toString(j2));
    }
}
