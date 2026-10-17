package y57;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f310998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f310999c;

    public d(int i, int i2, int i3) {
        this.f310997a = i;
        this.f310998b = i2;
        this.f310999c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f310997a == dVar.f310997a && this.f310998b == dVar.f310998b && this.f310999c == dVar.f310999c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f310999c) + j6.a.b(this.f310998b, Integer.hashCode(this.f310997a) * 31, 31);
    }
}
