package y8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f311605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f311606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f311607c;

    public j(Class cls, Class cls2, Class cls3) {
        this.f311605a = cls;
        this.f311606b = cls2;
        this.f311607c = cls3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || j.class != obj2.getClass()) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f311605a.equals(jVar.f311605a) && this.f311606b.equals(jVar.f311606b) && l.b(this.f311607c, jVar.f311607c);
    }

    public final int hashCode() {
        int iHashCode = (this.f311606b.hashCode() + (this.f311605a.hashCode() * 31)) * 31;
        Class cls = this.f311607c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f311605a + ", second=" + this.f311606b + CoreConstants.CURLY_RIGHT;
    }
}
