package n09;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f210926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210927b;

    public b0(boolean z, boolean z3) {
        this.f210926a = z;
        this.f210927b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f210926a == b0Var.f210926a && this.f210927b == b0Var.f210927b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210927b) + (Boolean.hashCode(this.f210926a) * 31);
    }
}
