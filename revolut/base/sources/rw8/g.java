package rw8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257852a;

    public g(int i) {
        this.f257852a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f257852a == ((g) obj2).f257852a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257852a);
    }
}
