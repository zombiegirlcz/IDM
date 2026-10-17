package d2g;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110823b;

    public u(boolean z, boolean z3) {
        this.f110822a = z;
        this.f110823b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f110822a == uVar.f110822a && this.f110823b == uVar.f110823b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110823b) + (Boolean.hashCode(this.f110822a) * 31);
    }
}
