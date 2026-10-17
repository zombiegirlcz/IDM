package slj;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f264210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264211b;

    public e(boolean z, boolean z3) {
        this.f264210a = z;
        this.f264211b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f264210a == eVar.f264210a && this.f264211b == eVar.f264211b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264211b) + (Boolean.hashCode(this.f264210a) * 31);
    }
}
