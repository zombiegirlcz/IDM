package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163528c;

    public b40(boolean z, boolean z3, boolean z4) {
        this.f163526a = z;
        this.f163527b = z3;
        this.f163528c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj2;
        return this.f163526a == b40Var.f163526a && this.f163527b == b40Var.f163527b && this.f163528c == b40Var.f163528c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163528c) + j6.a.c(Boolean.hashCode(this.f163526a) * 31, 31, this.f163527b);
    }
}
