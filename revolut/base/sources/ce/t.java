package ce;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f23322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23323b;

    public t(Class cls, Class cls2) {
        this.f23322a = cls;
        this.f23323b = cls2;
    }

    public static t a(Class cls) {
        return new t(s.class, cls);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || t.class != obj2.getClass()) {
            return false;
        }
        t tVar = (t) obj2;
        if (this.f23323b.equals(tVar.f23323b)) {
            return this.f23322a.equals(tVar.f23322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23322a.hashCode() + (this.f23323b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f23323b;
        Class cls2 = this.f23322a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
