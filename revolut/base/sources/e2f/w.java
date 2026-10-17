package e2f;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f122087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122088b;

    public w(boolean z, boolean z3) {
        this.f122087a = z;
        this.f122088b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f122087a == wVar.f122087a && this.f122088b == wVar.f122088b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122088b) + (Boolean.hashCode(this.f122087a) * 31);
    }
}
