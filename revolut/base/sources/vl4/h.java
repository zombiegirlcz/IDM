package vl4;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f290262a;

    public h(boolean z) {
        this.f290262a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f290262a == ((h) obj2).f290262a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290262a);
    }
}
