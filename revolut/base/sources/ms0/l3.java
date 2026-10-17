package ms0;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f208330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208332c;
    public final long d;
    public final long e;

    public l3(long j2, int i, int i2, long j3, boolean z) {
        this.f208330a = z;
        this.f208331b = i;
        this.f208332c = i2;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj2;
        return this.f208330a == l3Var.f208330a && this.f208331b == l3Var.f208331b && this.f208332c == l3Var.f208332c && this.d == l3Var.d && this.e == l3Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + a0.d.c(j6.a.b(this.f208332c, j6.a.b(this.f208331b, Boolean.hashCode(this.f208330a) * 31, 31), 31), 31, this.d);
    }
}
