package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164960c;

    public k5(boolean z, boolean z3, boolean z4) {
        this.f164958a = z;
        this.f164959b = z3;
        this.f164960c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj2;
        return this.f164958a == k5Var.f164958a && this.f164959b == k5Var.f164959b && this.f164960c == k5Var.f164960c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164960c) + j6.a.c(Boolean.hashCode(this.f164958a) * 31, 31, this.f164959b);
    }
}
