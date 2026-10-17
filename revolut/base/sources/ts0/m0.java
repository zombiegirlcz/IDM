package ts0;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f273889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f273890b;

    public m0(float f, int i) {
        this.f273889a = f;
        this.f273890b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Float.compare(this.f273889a, m0Var.f273889a) == 0 && this.f273890b == m0Var.f273890b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273890b) + (Float.hashCode(this.f273889a) * 31);
    }
}
