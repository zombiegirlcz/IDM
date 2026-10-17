package jz;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f179535a;

    public b(int i) {
        this.f179535a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f179535a == ((b) obj2).f179535a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f179535a);
    }
}
