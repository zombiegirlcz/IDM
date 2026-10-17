package ryj;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258411b;

    public r(boolean z, boolean z3) {
        this.f258410a = z;
        this.f258411b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f258410a == rVar.f258410a && this.f258411b == rVar.f258411b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258411b) + (Boolean.hashCode(this.f258410a) * 31);
    }
}
