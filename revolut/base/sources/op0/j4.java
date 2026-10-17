package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227323c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public j4(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f227321a = z;
        this.f227322b = z3;
        this.f227323c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return this.f227321a == j4Var.f227321a && this.f227322b == j4Var.f227322b && this.f227323c == j4Var.f227323c && this.d == j4Var.d && this.e == j4Var.e && this.f == j4Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227321a) * 31, 31, this.f227322b), 31, this.f227323c), 31, this.d), 31, this.e);
    }
}
