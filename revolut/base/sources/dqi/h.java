package dqi;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117003a;

    public h(int i) {
        this.f117003a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f117003a == ((h) obj2).f117003a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117003a);
    }
}
