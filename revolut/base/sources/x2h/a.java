package x2h;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f302570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302571b;

    public a(boolean z, boolean z3) {
        this.f302570a = z;
        this.f302571b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f302570a == aVar.f302570a && this.f302571b == aVar.f302571b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302571b) + (Boolean.hashCode(this.f302570a) * 31);
    }
}
