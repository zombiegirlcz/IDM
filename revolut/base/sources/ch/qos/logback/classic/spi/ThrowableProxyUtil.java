package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableProxyUtil {
    private static final int BUILDER_CAPACITY = 2048;
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb6 = new StringBuilder(2048);
        recursiveAppend(sb6, null, 1, iThrowableProxy);
        return sb6.toString();
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th10, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th10.getStackTrace();
        throwableProxy.commonFrames = throwableProxy2 != null ? findNumberOfCommonFrames(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.stackTraceElementProxyArray = steArrayToStepArray(stackTrace);
    }

    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].f24064ste); length2--) {
                i++;
                length--;
            }
        }
        return i;
    }

    public static void indent(StringBuilder sb6, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb6.append('\t');
        }
    }

    private static void recursiveAppend(StringBuilder sb6, String str, int i, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb6, str, i, iThrowableProxy);
        sb6.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb6, i, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb6, "Suppressed: ", i + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb6, "Caused by: ", i, iThrowableProxy.getCause());
    }

    public static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i = 0; i < length; i++) {
            stackTraceElementProxyArr[i] = new StackTraceElementProxy(stackTraceElementArr[i]);
        }
        return stackTraceElementProxyArr;
    }

    private static void subjoinExceptionMessage(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        sb6.append(iThrowableProxy.getClassName());
        sb6.append(": ");
        sb6.append(iThrowableProxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb6.append("Caused by: ");
        }
        subjoinExceptionMessage(sb6, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb6.append("Wrapped by: ");
        }
        subjoinExceptionMessage(sb6, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb6, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb6.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb6.append(classPackagingData.getCodeLocation());
        sb6.append(CoreConstants.COLON_CHAR);
        sb6.append(classPackagingData.getVersion());
        sb6.append(']');
    }

    public static void subjoinSTEP(StringBuilder sb6, StackTraceElementProxy stackTraceElementProxy) {
        sb6.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb6, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb6, int i, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i2 = 0; i2 < stackTraceElementProxyArray.length - commonFrames; i2++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i2];
            indent(sb6, i);
            subjoinSTEP(sb6, stackTraceElementProxy);
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb6, i);
            sb6.append("... ");
            sb6.append(commonFrames);
            sb6.append(" common frames omitted");
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    private static void subjoinFirstLine(StringBuilder sb6, String str, int i, IThrowableProxy iThrowableProxy) {
        indent(sb6, i - 1);
        if (str != null) {
            sb6.append(str);
        }
        subjoinExceptionMessage(sb6, iThrowableProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb6, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb6, 1, iThrowableProxy);
    }
}
