package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166235b;

    public rt(boolean z, boolean z3) {
        this.f166234a = z;
        this.f166235b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj2;
        return this.f166234a == rtVar.f166234a && this.f166235b == rtVar.f166235b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166235b) + (Boolean.hashCode(this.f166234a) * 31);
    }
}
