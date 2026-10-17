package ch.qos.logback.classic.spi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceElementProxy implements Serializable {
    private static final long serialVersionUID = -2374374378980555982L;

    /* JADX INFO: renamed from: cpd, reason: collision with root package name */
    private ClassPackagingData f24063cpd;

    /* JADX INFO: renamed from: ste, reason: collision with root package name */
    final StackTraceElement f24064ste;
    private transient String steAsString;

    public StackTraceElementProxy(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            throw new IllegalArgumentException("ste cannot be null");
        }
        this.f24064ste = stackTraceElement;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        StackTraceElementProxy stackTraceElementProxy = (StackTraceElementProxy) obj2;
        if (!this.f24064ste.equals(stackTraceElementProxy.f24064ste)) {
            return false;
        }
        ClassPackagingData classPackagingData = this.f24063cpd;
        ClassPackagingData classPackagingData2 = stackTraceElementProxy.f24063cpd;
        if (classPackagingData == null) {
            if (classPackagingData2 != null) {
                return false;
            }
        } else if (!classPackagingData.equals(classPackagingData2)) {
            return false;
        }
        return true;
    }

    public ClassPackagingData getClassPackagingData() {
        return this.f24063cpd;
    }

    public String getSTEAsString() {
        if (this.steAsString == null) {
            this.steAsString = "at " + this.f24064ste.toString();
        }
        return this.steAsString;
    }

    public StackTraceElement getStackTraceElement() {
        return this.f24064ste;
    }

    public int hashCode() {
        return this.f24064ste.hashCode();
    }

    public void setClassPackagingData(ClassPackagingData classPackagingData) {
        if (this.f24063cpd != null) {
            throw new IllegalStateException("Packaging data has been already set");
        }
        this.f24063cpd = classPackagingData;
    }

    public String toString() {
        return getSTEAsString();
    }
}
