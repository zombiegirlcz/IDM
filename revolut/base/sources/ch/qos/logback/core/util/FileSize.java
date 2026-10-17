package ch.qos.logback.core.util;

import a0.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class FileSize {
    private static final int DOUBLE_GROUP = 1;
    public static final long GB_COEFFICIENT = 1073741824;
    public static final long KB_COEFFICIENT = 1024;
    public static final long MB_COEFFICIENT = 1048576;
    private static final int UNIT_GROUP = 2;
    final long size;
    private static final String LENGTH_PART = "([0-9]+)";
    private static final String UNIT_PART = "(|kb|mb|gb)s?";
    private static final Pattern FILE_SIZE_PATTERN = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);

    public FileSize(long j2) {
        this.size = j2;
    }

    public static FileSize valueOf(String str) {
        long j2;
        Matcher matcher = FILE_SIZE_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(p.a.p("String value [", str, "] is not in the expected format."));
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        long jLongValue = Long.valueOf(strGroup).longValue();
        if (strGroup2.equalsIgnoreCase("")) {
            j2 = 1;
        } else if (strGroup2.equalsIgnoreCase("kb")) {
            j2 = KB_COEFFICIENT;
        } else if (strGroup2.equalsIgnoreCase("mb")) {
            j2 = MB_COEFFICIENT;
        } else {
            if (!strGroup2.equalsIgnoreCase("gb")) {
                throw new IllegalStateException("Unexpected ".concat(strGroup2));
            }
            j2 = GB_COEFFICIENT;
        }
        return new FileSize(jLongValue * j2);
    }

    public long getSize() {
        return this.size;
    }

    public String toString() {
        long j2 = this.size;
        long j3 = j2 / KB_COEFFICIENT;
        if (j3 == 0) {
            return d.j(this.size, " Bytes", new StringBuilder());
        }
        long j5 = j2 / MB_COEFFICIENT;
        if (j5 == 0) {
            return a.p(j3, " KB");
        }
        long j16 = j2 / GB_COEFFICIENT;
        return j16 == 0 ? a.p(j5, " MB") : a.p(j16, " GB");
    }
}
