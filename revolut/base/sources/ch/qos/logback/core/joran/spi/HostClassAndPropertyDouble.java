package ch.qos.logback.core.joran.spi;

/* JADX INFO: loaded from: classes.dex */
public class HostClassAndPropertyDouble {
    final Class<?> hostClass;
    final String propertyName;

    public HostClassAndPropertyDouble(Class<?> cls, String str) {
        this.hostClass = cls;
        this.propertyName = str;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        HostClassAndPropertyDouble hostClassAndPropertyDouble = (HostClassAndPropertyDouble) obj2;
        Class<?> cls = this.hostClass;
        if (cls == null) {
            if (hostClassAndPropertyDouble.hostClass != null) {
                return false;
            }
        } else if (!cls.equals(hostClassAndPropertyDouble.hostClass)) {
            return false;
        }
        String str = this.propertyName;
        String str2 = hostClassAndPropertyDouble.propertyName;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public Class<?> getHostClass() {
        return this.hostClass;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public int hashCode() {
        Class<?> cls = this.hostClass;
        int iHashCode = ((cls == null ? 0 : cls.hashCode()) + 31) * 31;
        String str = this.propertyName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
