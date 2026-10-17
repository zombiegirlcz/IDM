package q5g;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f242396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242397b;

    public y(boolean z, boolean z3) {
        this.f242396a = z;
        this.f242397b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f242396a == yVar.f242396a && this.f242397b == yVar.f242397b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242397b) + (Boolean.hashCode(this.f242396a) * 31);
    }
}
