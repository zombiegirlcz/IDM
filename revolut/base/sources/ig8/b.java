package ig8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161084a;

    public b(int i) {
        this.f161084a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f161084a == ((b) obj2).f161084a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f161084a);
    }
}
