package lr6;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199415a;

    public o(int i) {
        this.f199415a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f199415a == ((o) obj2).f199415a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199415a);
    }
}
