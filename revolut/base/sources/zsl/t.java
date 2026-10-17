package zsl;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f324985c;
    public final int d;

    public t(int i, int i2, int i3) {
        super(false);
        this.f324984b = i;
        this.f324985c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f324984b == tVar.f324984b && this.f324985c == tVar.f324985c && this.d == tVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f324985c, Integer.hashCode(this.f324984b) * 31, 31);
    }
}
