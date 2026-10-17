package zh9;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f322354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f322355c;
    public final boolean d;

    public v(int i, f1 f1Var, int i2, boolean z) {
        this.f322353a = i;
        this.f322354b = f1Var;
        this.f322355c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f322353a == vVar.f322353a && this.f322354b == vVar.f322354b && this.f322355c == vVar.f322355c && this.d == vVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f322353a) * 31;
        f1 f1Var = this.f322354b;
        return Boolean.hashCode(this.d) + j6.a.b(this.f322355c, (iHashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31, 31);
    }
}
