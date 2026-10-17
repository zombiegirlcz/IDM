package uk2;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280650a;

    public g(int i) {
        this.f280650a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f280650a == ((g) obj2).f280650a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280650a);
    }
}
