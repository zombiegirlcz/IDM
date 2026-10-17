package rmb;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f255219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f255220b;

    public d() {
        this(true, true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f255219a == dVar.f255219a && this.f255220b == dVar.f255220b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255220b) + (Boolean.hashCode(this.f255219a) * 31);
    }

    public d(boolean z, boolean z3) {
        this.f255219a = z;
        this.f255220b = z3;
    }
}
