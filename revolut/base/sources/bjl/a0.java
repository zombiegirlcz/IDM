package bjl;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16157a;

    public a0(boolean z) {
        this.f16157a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f16157a == ((a0) obj2).f16157a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16157a);
    }
}
