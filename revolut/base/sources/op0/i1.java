package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227305c;

    public i1(boolean z, boolean z3, boolean z4) {
        this.f227303a = z;
        this.f227304b = z3;
        this.f227305c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return this.f227303a == i1Var.f227303a && this.f227304b == i1Var.f227304b && this.f227305c == i1Var.f227305c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227305c) + j6.a.c(Boolean.hashCode(this.f227303a) * 31, 31, this.f227304b);
    }
}
