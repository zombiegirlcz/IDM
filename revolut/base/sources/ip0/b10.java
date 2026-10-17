package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163516c;
    public final boolean d;

    public b10(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f163514a = z;
        this.f163515b = z3;
        this.f163516c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj2;
        return this.f163514a == b10Var.f163514a && this.f163515b == b10Var.f163515b && this.f163516c == b10Var.f163516c && this.d == b10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f163514a) * 31, 31, this.f163515b), 31, this.f163516c);
    }
}
