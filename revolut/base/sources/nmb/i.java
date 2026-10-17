package nmb;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217246b;

    public i(boolean z, boolean z3) {
        this.f217245a = z;
        this.f217246b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f217245a == iVar.f217245a && this.f217246b == iVar.f217246b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217246b) + (Boolean.hashCode(this.f217245a) * 31);
    }
}
