package rz;

/* JADX INFO: loaded from: classes16.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258454a;

    public q(boolean z) {
        this.f258454a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f258454a == ((q) obj2).f258454a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258454a);
    }
}
