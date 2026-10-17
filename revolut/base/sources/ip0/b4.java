package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163524c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163525g;

    public b4(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f163522a = z;
        this.f163523b = z3;
        this.f163524c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163525g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return this.f163522a == b4Var.f163522a && this.f163523b == b4Var.f163523b && this.f163524c == b4Var.f163524c && this.d == b4Var.d && this.e == b4Var.e && this.f == b4Var.f && this.f163525g == b4Var.f163525g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163525g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163522a) * 31, 31, this.f163523b), 31, this.f163524c), 31, this.d), 31, this.e), 31, this.f);
    }
}
