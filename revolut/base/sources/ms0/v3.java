package ms0;

/* JADX INFO: loaded from: classes19.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f208467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208468b;

    public v3(int i, int i2) {
        this.f208467a = i;
        this.f208468b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return this.f208467a == v3Var.f208467a && this.f208468b == v3Var.f208468b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208468b) + (Integer.hashCode(this.f208467a) * 31);
    }
}
