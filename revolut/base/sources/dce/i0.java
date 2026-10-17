package dce;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112867a;

    public i0(boolean z) {
        this.f112867a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && this.f112867a == ((i0) obj2).f112867a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112867a);
    }
}
