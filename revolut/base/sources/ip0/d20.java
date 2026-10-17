package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class d20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163832c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163833g;

    public d20(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f163830a = z;
        this.f163831b = z3;
        this.f163832c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163833g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj2;
        return this.f163830a == d20Var.f163830a && this.f163831b == d20Var.f163831b && this.f163832c == d20Var.f163832c && this.d == d20Var.d && this.e == d20Var.e && this.f == d20Var.f && this.f163833g == d20Var.f163833g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163833g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163830a) * 31, 31, this.f163831b), 31, this.f163832c), 31, this.d), 31, this.e), 31, this.f);
    }
}
