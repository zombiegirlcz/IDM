package n3e;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f211997a;

    public g(int i) {
        this.f211997a = i;
    }

    @Override // lk0.f
    public final int a() {
        return 10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f211997a == ((g) obj2).f211997a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f211997a) + (Integer.hashCode(10) * 31);
    }
}
