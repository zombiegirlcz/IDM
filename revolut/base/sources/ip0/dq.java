package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163938b;

    public dq(boolean z, boolean z3) {
        this.f163937a = z;
        this.f163938b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj2;
        return this.f163937a == dqVar.f163937a && this.f163938b == dqVar.f163938b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163938b) + (Boolean.hashCode(this.f163937a) * 31);
    }
}
