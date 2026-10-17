package vu0;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f292187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f292188b;

    public y(int i, int i2) {
        this.f292187a = i;
        this.f292188b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f292187a == yVar.f292187a && this.f292188b == yVar.f292188b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f292188b) + (Integer.hashCode(this.f292187a) * 31);
    }
}
