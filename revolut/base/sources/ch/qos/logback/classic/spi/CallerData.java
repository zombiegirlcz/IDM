package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CallerData {
    public static final int LINE_NA = -1;
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";
    public static final String NA = "?";
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];

    public static StackTraceElement[] extract(Throwable th10, String str, int i, List<String> list) {
        if (th10 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th10.getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            if (!isInFrameworkSpace(stackTrace[i3].getClassName(), str, list)) {
                if (i2 != -1) {
                    break;
                }
            } else {
                i2 = i3 + 1;
            }
        }
        if (i2 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i2;
        if (i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        for (int i5 = 0; i5 < i; i5++) {
            stackTraceElementArr[i5] = stackTrace[i2 + i5];
        }
        return stackTraceElementArr;
    }

    public static boolean isInFrameworkSpace(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals("org.apache.log4j.Category") || str.startsWith("org.slf4j.Logger") || isInFrameworkSpaceList(str, list);
    }

    private static boolean isInFrameworkSpaceList(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        Iterator<String> it8 = list.iterator();
        while (it8.hasNext()) {
            if (str.startsWith(it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement("?", "?", "?", -1);
    }
}
