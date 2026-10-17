package ch.qos.logback.core.helpers;

import a10.b;
import java.util.LinkedList;
import java.util.List;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
public class ThrowableToStringArray {
    public static String[] convert(Throwable th10) {
        LinkedList linkedList = new LinkedList();
        extract(linkedList, th10, null);
        return (String[]) linkedList.toArray(new String[0]);
    }

    private static void extract(List<String> list, Throwable th10, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th10.getStackTrace();
        int iFindNumberOfCommonFrames = findNumberOfCommonFrames(stackTrace, stackTraceElementArr);
        list.add(formatFirstLine(th10, stackTraceElementArr));
        for (int i = 0; i < stackTrace.length - iFindNumberOfCommonFrames; i++) {
            list.add("\tat " + stackTrace[i].toString());
        }
        if (iFindNumberOfCommonFrames != 0) {
            list.add("\t... " + iFindNumberOfCommonFrames + " common frames omitted");
        }
        Throwable cause = th10.getCause();
        if (cause != null) {
            extract(list, cause, stackTrace);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i++;
            length--;
        }
        return i;
    }

    private static String formatFirstLine(Throwable th10, StackTraceElement[] stackTraceElementArr) {
        String strConcat = (stackTraceElementArr != null ? "Caused by: " : "").concat(th10.getClass().getName());
        return th10.getMessage() != null ? b.u(a.l(strConcat, ": "), th10) : strConcat;
    }
}
