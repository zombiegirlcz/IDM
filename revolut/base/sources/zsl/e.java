package zsl;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f324963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324965c;

    public e(int i, int i2, int i3) {
        this.f324963a = i;
        this.f324964b = i2;
        this.f324965c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f324963a == eVar.f324963a && this.f324964b == eVar.f324964b && this.f324965c == eVar.f324965c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f324965c) + j6.a.b(this.f324964b, Integer.hashCode(this.f324963a) * 31, 31);
    }
}
