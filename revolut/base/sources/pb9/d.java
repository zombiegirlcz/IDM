package pb9;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f234663a;

    public d(int i) {
        this.f234663a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f234663a == ((d) obj2).f234663a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f234663a);
    }
}
