package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sf0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166347c;
    public final boolean d;

    public sf0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166345a = z;
        this.f166346b = z3;
        this.f166347c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sf0)) {
            return false;
        }
        sf0 sf0Var = (sf0) obj2;
        return this.f166345a == sf0Var.f166345a && this.f166346b == sf0Var.f166346b && this.f166347c == sf0Var.f166347c && this.d == sf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166345a) * 31, 31, this.f166346b), 31, this.f166347c);
    }
}
