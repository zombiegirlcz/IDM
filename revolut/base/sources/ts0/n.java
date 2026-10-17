package ts0;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273892b;

    public n(boolean z, boolean z3) {
        this.f273891a = z;
        this.f273892b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f273891a == nVar.f273891a && this.f273892b == nVar.f273892b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273892b) + (Boolean.hashCode(this.f273891a) * 31);
    }

    public n() {
        this(false, false);
    }
}
