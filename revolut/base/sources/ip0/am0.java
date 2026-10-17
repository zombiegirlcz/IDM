package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class am0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163470c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163471g;

    public am0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f163468a = z;
        this.f163469b = z3;
        this.f163470c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163471g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof am0)) {
            return false;
        }
        am0 am0Var = (am0) obj2;
        return this.f163468a == am0Var.f163468a && this.f163469b == am0Var.f163469b && this.f163470c == am0Var.f163470c && this.d == am0Var.d && this.e == am0Var.e && this.f == am0Var.f && this.f163471g == am0Var.f163471g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163471g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163468a) * 31, 31, this.f163469b), 31, this.f163470c), 31, this.d), 31, this.e), 31, this.f);
    }
}
