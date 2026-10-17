package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227470c;

    public w4(boolean z, boolean z3, boolean z4) {
        this.f227468a = z;
        this.f227469b = z3;
        this.f227470c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return this.f227468a == w4Var.f227468a && this.f227469b == w4Var.f227469b && this.f227470c == w4Var.f227470c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227470c) + j6.a.c(Boolean.hashCode(this.f227468a) * 31, 31, this.f227469b);
    }
}
