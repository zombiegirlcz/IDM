package d0j;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110405a;

    public h0(int i) {
        this.f110405a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && this.f110405a == ((h0) obj2).f110405a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110405a);
    }
}
