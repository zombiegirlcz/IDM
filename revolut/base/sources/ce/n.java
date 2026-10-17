package ce;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f23308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23310c;

    public n(Class cls, int i, int i2) {
        this(t.a(cls), i, i2);
    }

    public static n a(Class cls) {
        return new n(cls, 0, 1);
    }

    public static n b(t tVar) {
        return new n(tVar, 1, 0);
    }

    public static n c(Class cls) {
        return new n(cls, 1, 0);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f23308a.equals(nVar.f23308a) && this.f23309b == nVar.f23309b && this.f23310c == nVar.f23310c;
    }

    public final int hashCode() {
        return ((((this.f23308a.hashCode() ^ 1000003) * 1000003) ^ this.f23309b) * 1000003) ^ this.f23310c;
    }

    public final String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("Dependency{anInterface=");
        sb6.append(this.f23308a);
        sb6.append(", type=");
        int i = this.f23309b;
        sb6.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb6.append(", injection=");
        int i2 = this.f23310c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(a0.d.n("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return v0.a.i(sb6, str, "}");
    }

    public n(t tVar, int i, int i2) {
        m70.a.b(tVar, "Null dependency anInterface.");
        this.f23308a = tVar;
        this.f23309b = i;
        this.f23310c = i2;
    }
}
