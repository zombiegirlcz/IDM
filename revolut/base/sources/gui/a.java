package gui;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f146943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f146944b;

    public a(boolean z, boolean z3) {
        this.f146943a = z;
        this.f146944b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f146943a == aVar.f146943a && this.f146944b == aVar.f146944b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f146944b) + (Boolean.hashCode(this.f146943a) * 31);
    }
}
