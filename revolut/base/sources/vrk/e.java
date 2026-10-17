package vrk;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f291613a;

    public e(int i) {
        this.f291613a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f291613a == ((e) obj2).f291613a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f291613a);
    }
}
