package x9;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes16.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f303529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f303530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaType f303531c;
    public final boolean d;

    public s(Class cls, boolean z) {
        this.f303530b = cls;
        this.f303531c = null;
        this.d = z;
        this.f303529a = z ? cls.getName().hashCode() + 1 : cls.getName().hashCode();
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (obj2.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj2;
        if (sVar.d != this.d) {
            return false;
        }
        Class cls = this.f303530b;
        return cls != null ? sVar.f303530b == cls : this.f303531c.equals(sVar.f303531c);
    }

    public final int hashCode() {
        return this.f303529a;
    }

    public final String toString() {
        boolean z = this.d;
        Class cls = this.f303530b;
        if (cls != null) {
            return "{class: " + cls.getName() + ", typed? " + z + "}";
        }
        return "{type: " + this.f303531c + ", typed? " + z + "}";
    }

    public s(JavaType javaType) {
        this.f303531c = javaType;
        this.f303530b = null;
        this.d = false;
        this.f303529a = javaType.f26183b - 1;
    }
}
