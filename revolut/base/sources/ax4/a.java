package ax4;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10855b;

    public a(boolean z, boolean z3) {
        this.f10854a = z;
        this.f10855b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f10854a == aVar.f10854a && this.f10855b == aVar.f10855b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10855b) + (Boolean.hashCode(this.f10854a) * 31);
    }
}
