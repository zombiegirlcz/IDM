package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class StatusUtil {

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    StatusManager f24081sm;

    public StatusUtil(Context context) {
        this.f24081sm = context.getStatusManager();
    }

    public static boolean contextHasStatusListener(Context context) {
        List<StatusListener> copyOfStatusListenerList;
        StatusManager statusManager = context.getStatusManager();
        return (statusManager == null || (copyOfStatusListenerList = statusManager.getCopyOfStatusListenerList()) == null || copyOfStatusListenerList.size() == 0) ? false : true;
    }

    public static List<Status> filterStatusListByTimeThreshold(List<Status> list, long j2) {
        ArrayList arrayList = new ArrayList();
        for (Status status : list) {
            if (status.getDate().longValue() >= j2) {
                arrayList.add(status);
            }
        }
        return arrayList;
    }

    public void addError(Object obj2, String str, Throwable th10) {
        addStatus(new ErrorStatus(str, obj2, th10));
    }

    public void addInfo(Object obj2, String str) {
        addStatus(new InfoStatus(str, obj2));
    }

    public void addStatus(Status status) {
        StatusManager statusManager = this.f24081sm;
        if (statusManager != null) {
            statusManager.add(status);
        }
    }

    public void addWarn(Object obj2, String str) {
        addStatus(new WarnStatus(str, obj2));
    }

    public boolean containsException(Class<?> cls) {
        Iterator<Status> it8 = this.f24081sm.getCopyOfStatusList().iterator();
        while (it8.hasNext()) {
            for (Throwable throwable = it8.next().getThrowable(); throwable != null; throwable = throwable.getCause()) {
                if (throwable.getClass().getName().equals(cls.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsMatch(int i, String str) {
        return containsMatch(0L, i, str);
    }

    public int getHighestLevel(long j2) {
        int level = 0;
        for (Status status : filterStatusListByTimeThreshold(this.f24081sm.getCopyOfStatusList(), j2)) {
            if (status.getLevel() > level) {
                level = status.getLevel();
            }
        }
        return level;
    }

    public boolean hasXMLParsingErrors(long j2) {
        return containsMatch(j2, 2, "XML_PARSING");
    }

    public boolean isErrorFree(long j2) {
        return 2 > getHighestLevel(j2);
    }

    public boolean isWarningOrErrorFree(long j2) {
        return 1 > getHighestLevel(j2);
    }

    public int matchCount(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it8 = this.f24081sm.getCopyOfStatusList().iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (patternCompile.matcher(it8.next().getMessage()).lookingAt()) {
                i++;
            }
        }
        return i;
    }

    public boolean noXMLParsingErrorsOccurred(long j2) {
        return !hasXMLParsingErrors(j2);
    }

    public long timeOfLastReset() {
        List<Status> copyOfStatusList = this.f24081sm.getCopyOfStatusList();
        if (copyOfStatusList == null) {
            return -1L;
        }
        for (int size = copyOfStatusList.size() - 1; size >= 0; size--) {
            Status status = copyOfStatusList.get(size);
            if ("Will reset and reconfigure context ".equals(status.getMessage())) {
                return status.getDate().longValue();
            }
        }
        return -1L;
    }

    public StatusUtil(StatusManager statusManager) {
        this.f24081sm = statusManager;
    }

    public boolean containsMatch(long j2, int i, String str) {
        List<Status> listFilterStatusListByTimeThreshold = filterStatusListByTimeThreshold(this.f24081sm.getCopyOfStatusList(), j2);
        Pattern patternCompile = Pattern.compile(str);
        for (Status status : listFilterStatusListByTimeThreshold) {
            if (i == status.getLevel() && patternCompile.matcher(status.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    public boolean containsMatch(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it8 = this.f24081sm.getCopyOfStatusList().iterator();
        while (it8.hasNext()) {
            if (patternCompile.matcher(it8.next().getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }
}
