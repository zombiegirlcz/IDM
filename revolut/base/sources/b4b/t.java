package b4b;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12246c;
    public final boolean d;

    public t() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f12244a == tVar.f12244a && this.f12245b == tVar.f12245b && this.f12246c == tVar.f12246c && this.d == tVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f12244a) * 31, 31, this.f12245b), 31, this.f12246c);
    }

    public t(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f12244a = z;
        this.f12245b = z3;
        this.f12246c = z4;
        this.d = z6;
    }
}
