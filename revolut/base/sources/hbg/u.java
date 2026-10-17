package hbg;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f150717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150718b;

    public u(boolean z, boolean z3) {
        this.f150717a = z;
        this.f150718b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f150717a == uVar.f150717a && this.f150718b == uVar.f150718b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150718b) + (Boolean.hashCode(this.f150717a) * 31);
    }
}
