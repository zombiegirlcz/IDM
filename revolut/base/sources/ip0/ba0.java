package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163570c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163572h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163573j;

    public ba0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f163568a = z;
        this.f163569b = z3;
        this.f163570c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163571g = z29;
        this.f163572h = z31;
        this.i = z41;
        this.f163573j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj2;
        return this.f163568a == ba0Var.f163568a && this.f163569b == ba0Var.f163569b && this.f163570c == ba0Var.f163570c && this.d == ba0Var.d && this.e == ba0Var.e && this.f == ba0Var.f && this.f163571g == ba0Var.f163571g && this.f163572h == ba0Var.f163572h && this.i == ba0Var.i && this.f163573j == ba0Var.f163573j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163573j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163568a) * 31, 31, this.f163569b), 31, this.f163570c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163571g), 31, this.f163572h), 31, this.i);
    }
}
