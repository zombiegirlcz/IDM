package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class q00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165910c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165911g;

    public q00(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f165908a = z;
        this.f165909b = z3;
        this.f165910c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165911g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj2;
        return this.f165908a == q00Var.f165908a && this.f165909b == q00Var.f165909b && this.f165910c == q00Var.f165910c && this.d == q00Var.d && this.e == q00Var.e && this.f == q00Var.f && this.f165911g == q00Var.f165911g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165911g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165908a) * 31, 31, this.f165909b), 31, this.f165910c), 31, this.d), 31, this.e), 31, this.f);
    }
}
