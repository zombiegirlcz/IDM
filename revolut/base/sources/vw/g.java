package vw;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f292588c;

    public g(boolean z, int i, int i2) {
        this.f292586a = z;
        this.f292587b = i;
        this.f292588c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f292586a == gVar.f292586a && this.f292587b == gVar.f292587b && this.f292588c == gVar.f292588c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f292588c) + j6.a.b(this.f292587b, Boolean.hashCode(this.f292586a) * 31, 31);
    }
}
