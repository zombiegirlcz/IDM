package ch.qos.logback.core.util;

import a0.d;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StatusPrinter {
    private static PrintStream ps = System.out;
    static CachingDateFormatter cachingDateFormat = new CachingDateFormatter("HH:mm:ss,SSS");

    private static void appendThrowable(StringBuilder sb6, Throwable th10) {
        for (String str : ThrowableToStringArray.convert(th10)) {
            if (!str.startsWith("Caused by: ")) {
                sb6.append(Character.isDigit(str.charAt(0)) ? "\t... " : "\tat ");
            }
            sb6.append(str);
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void buildStr(StringBuilder sb6, String str, Status status) {
        String strR = d.r(str, status.hasChildren() ? "+ " : "|-");
        CachingDateFormatter cachingDateFormatter = cachingDateFormat;
        if (cachingDateFormatter != null) {
            sb6.append(cachingDateFormatter.format(status.getDate().longValue()));
            sb6.append(" ");
        }
        sb6.append(strR);
        sb6.append(status);
        sb6.append(CoreConstants.LINE_SEPARATOR);
        if (status.getThrowable() != null) {
            appendThrowable(sb6, status.getThrowable());
        }
        if (status.hasChildren()) {
            Iterator<Status> it8 = status.iterator();
            while (it8.hasNext()) {
                buildStr(sb6, str + "  ", it8.next());
            }
        }
    }

    private static void buildStrFromStatusList(StringBuilder sb6, List<Status> list) {
        if (list == null) {
            return;
        }
        Iterator<Status> it8 = list.iterator();
        while (it8.hasNext()) {
            buildStr(sb6, "", it8.next());
        }
    }

    public static void print(Context context) {
        print(context, 0L);
    }

    public static void printIfErrorsOccured(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(0L) == 2) {
                print(statusManager);
            }
        } else {
            ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
        }
    }

    public static void printInCaseOfErrorsOrWarnings(Context context) {
        printInCaseOfErrorsOrWarnings(context, 0L);
    }

    public static void setPrintStream(PrintStream printStream) {
        ps = printStream;
    }

    public static void print(Context context, long j2) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            print(statusManager, j2);
            return;
        }
        ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
    }

    public static void printInCaseOfErrorsOrWarnings(Context context, long j2) {
        if (context == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager != null) {
            if (new StatusUtil(context).getHighestLevel(j2) >= 1) {
                print(statusManager, j2);
            }
        } else {
            ps.println("WARN: Context named \"" + context.getName() + "\" has no status manager");
        }
    }

    public static void print(StatusManager statusManager) {
        print(statusManager, 0L);
    }

    public static void print(StatusManager statusManager, long j2) {
        StringBuilder sb6 = new StringBuilder();
        buildStrFromStatusList(sb6, StatusUtil.filterStatusListByTimeThreshold(statusManager.getCopyOfStatusList(), j2));
        ps.println(sb6.toString());
    }

    public static void print(List<Status> list) {
        StringBuilder sb6 = new StringBuilder();
        buildStrFromStatusList(sb6, list);
        ps.println(sb6.toString());
    }
}
