package rnd;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f255612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f255613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f255614c;
    public final boolean d;

    public h(boolean z, int i, int i2) {
        this.f255612a = z;
        this.f255613b = i;
        this.f255614c = i2;
        this.d = i == i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f255612a == hVar.f255612a && this.f255613b == hVar.f255613b && this.f255614c == hVar.f255614c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f255614c) + j6.a.b(this.f255613b, Boolean.hashCode(this.f255612a) * 31, 31);
    }
}
