package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273160a;

    public x5(boolean z) {
        this.f273160a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x5) && this.f273160a == ((x5) obj2).f273160a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273160a);
    }
}
