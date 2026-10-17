package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227437b;

    public u(boolean z, boolean z3) {
        this.f227436a = z;
        this.f227437b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f227436a == uVar.f227436a && this.f227437b == uVar.f227437b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227437b) + (Boolean.hashCode(this.f227436a) * 31);
    }
}
