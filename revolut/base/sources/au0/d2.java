package au0;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9167c;

    public d2(boolean z, boolean z3, boolean z4) {
        this.f9165a = z;
        this.f9166b = z3;
        this.f9167c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return this.f9165a == d2Var.f9165a && this.f9166b == d2Var.f9166b && this.f9167c == d2Var.f9167c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9167c) + j6.a.c(Boolean.hashCode(this.f9165a) * 31, 31, this.f9166b);
    }
}
