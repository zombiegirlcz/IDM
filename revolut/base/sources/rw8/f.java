package rw8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f257851b;

    public f(int i, int i2) {
        this.f257850a = i;
        this.f257851b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f257850a == fVar.f257850a && this.f257851b == fVar.f257851b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257851b) + (Integer.hashCode(this.f257850a) * 31);
    }
}
