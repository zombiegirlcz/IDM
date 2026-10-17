package o23;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221477b;

    public z(boolean z, boolean z3) {
        this.f221476a = z;
        this.f221477b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f221476a == zVar.f221476a && this.f221477b == zVar.f221477b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221477b) + (Boolean.hashCode(this.f221476a) * 31);
    }
}
