package bc9;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14399a;

    public d(int i) {
        this.f14399a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f14399a == ((d) obj2).f14399a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14399a);
    }
}
