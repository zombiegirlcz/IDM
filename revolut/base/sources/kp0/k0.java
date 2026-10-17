package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188030a;

    public k0(boolean z) {
        this.f188030a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f188030a == ((k0) obj2).f188030a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188030a);
    }
}
