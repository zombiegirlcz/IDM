package x00;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f301453a;

    public e(boolean z) {
        this.f301453a = z;
    }

    @Override // xv.q
    public final boolean c() {
        return this.f301453a;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f301453a == ((e) obj2).f301453a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f301453a);
    }
}
