package n75;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f212997a;

    public b(int i) {
        this.f212997a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f212997a == ((b) obj2).f212997a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212997a);
    }
}
