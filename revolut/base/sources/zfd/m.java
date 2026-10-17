package zfd;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f321937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f321938b;

    public m(int i, int i2) {
        this.f321937a = i;
        this.f321938b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f321937a == mVar.f321937a && this.f321938b == mVar.f321938b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f321938b) + (Integer.hashCode(this.f321937a) * 31);
    }
}
