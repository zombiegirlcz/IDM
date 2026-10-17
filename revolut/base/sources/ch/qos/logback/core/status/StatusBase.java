package ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class StatusBase implements Status {
    private static final List<Status> EMPTY_LIST = new ArrayList(0);
    List<Status> childrenList;
    long date;
    int level;
    final String message;
    final Object origin;
    Throwable throwable;

    public StatusBase(int i, String str, Object obj2) {
        this(i, str, obj2, null);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized void add(Status status) {
        try {
            if (status == null) {
                throw new NullPointerException("Null values are not valid Status.");
            }
            if (this.childrenList == null) {
                this.childrenList = new ArrayList();
            }
            this.childrenList.add(status);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        StatusBase statusBase = (StatusBase) obj2;
        if (this.level != statusBase.level) {
            return false;
        }
        String str = this.message;
        String str2 = statusBase.message;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    @Override // ch.qos.logback.core.status.Status
    public Long getDate() {
        return Long.valueOf(this.date);
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized int getEffectiveLevel() {
        int i;
        i = this.level;
        Iterator<Status> it8 = iterator();
        while (it8.hasNext()) {
            int effectiveLevel = it8.next().getEffectiveLevel();
            if (effectiveLevel > i) {
                i = effectiveLevel;
            }
        }
        return i;
    }

    @Override // ch.qos.logback.core.status.Status
    public int getLevel() {
        return this.level;
    }

    @Override // ch.qos.logback.core.status.Status
    public String getMessage() {
        return this.message;
    }

    @Override // ch.qos.logback.core.status.Status
    public Object getOrigin() {
        return this.origin;
    }

    @Override // ch.qos.logback.core.status.Status
    public Throwable getThrowable() {
        return this.throwable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // ch.qos.logback.core.status.Status
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean hasChildren() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<ch.qos.logback.core.status.Status> r0 = r1.childrenList     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            if (r0 <= 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.status.StatusBase.hasChildren():boolean");
    }

    public int hashCode() {
        int i = (this.level + 31) * 31;
        String str = this.message;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized Iterator<Status> iterator() {
        List<Status> list = this.childrenList;
        if (list != null) {
            return list.iterator();
        }
        return EMPTY_LIST.iterator();
    }

    @Override // ch.qos.logback.core.status.Status
    public synchronized boolean remove(Status status) {
        List<Status> list = this.childrenList;
        if (list == null) {
            return false;
        }
        return list.remove(status);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getEffectiveLevel()
            if (r1 == 0) goto L1b
            r2 = 1
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L12
            goto L1e
        L12:
            java.lang.String r1 = "ERROR"
        L14:
            r0.append(r1)
            goto L1e
        L18:
            java.lang.String r1 = "WARN"
            goto L14
        L1b:
            java.lang.String r1 = "INFO"
            goto L14
        L1e:
            java.lang.Object r1 = r3.origin
            if (r1 == 0) goto L31
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.origin
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L31:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.message
            r0.append(r2)
            java.lang.Throwable r2 = r3.throwable
            if (r2 == 0) goto L47
            r0.append(r1)
            java.lang.Throwable r1 = r3.throwable
            r0.append(r1)
        L47:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.status.StatusBase.toString():java.lang.String");
    }

    public StatusBase(int i, String str, Object obj2, Throwable th10) {
        this.level = i;
        this.message = str;
        this.origin = obj2;
        this.throwable = th10;
        this.date = System.currentTimeMillis();
    }
}
