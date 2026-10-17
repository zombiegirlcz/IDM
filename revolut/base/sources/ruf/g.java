package ruf;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f257550c;

    public g(int i, int i2, int i3) {
        this.f257548a = i;
        this.f257549b = i2;
        this.f257550c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f257548a == gVar.f257548a && this.f257549b == gVar.f257549b && this.f257550c == gVar.f257550c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257550c) + j6.a.b(this.f257549b, Integer.hashCode(this.f257548a) * 31, 31);
    }
}
