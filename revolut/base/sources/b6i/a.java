package b6i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12754b;

    public a(boolean z, boolean z3) {
        this.f12753a = z;
        this.f12754b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f12753a == aVar.f12753a && this.f12754b == aVar.f12754b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12754b) + (Boolean.hashCode(this.f12753a) * 31);
    }
}
