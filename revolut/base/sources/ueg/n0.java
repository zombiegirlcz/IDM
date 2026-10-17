package ueg;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279407a;

    public n0(boolean z) {
        this.f279407a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && this.f279407a == ((n0) obj2).f279407a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279407a);
    }
}
