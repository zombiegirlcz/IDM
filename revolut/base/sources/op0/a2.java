package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f227163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f227164b;

    public a2(int i, int i2) {
        this.f227163a = i;
        this.f227164b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return this.f227163a == a2Var.f227163a && this.f227164b == a2Var.f227164b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f227164b) + (Integer.hashCode(this.f227163a) * 31);
    }
}
