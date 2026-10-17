package fy6;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138945a;

    public r(boolean z) {
        this.f138945a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f138945a == ((r) obj2).f138945a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138945a);
    }
}
