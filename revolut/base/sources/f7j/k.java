package f7j;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f132638a;

    public k(int i) {
        this.f132638a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f132638a == ((k) obj2).f132638a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f132638a);
    }
}
