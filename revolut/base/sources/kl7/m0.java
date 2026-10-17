package kl7;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f185360b;

    public m0(int i, int i2) {
        this.f185359a = i;
        this.f185360b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f185359a == m0Var.f185359a && this.f185360b == m0Var.f185360b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f185360b) + (Integer.hashCode(this.f185359a) * 31);
    }
}
