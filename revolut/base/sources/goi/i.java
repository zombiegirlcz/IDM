package goi;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145172b;

    public i() {
        this(false, 3);
    }

    public static i a(i iVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = iVar.f145171a;
        }
        if ((i & 2) != 0) {
            z3 = iVar.f145172b;
        }
        iVar.getClass();
        return new i(z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f145171a == iVar.f145171a && this.f145172b == iVar.f145172b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145172b) + (Boolean.hashCode(this.f145171a) * 31);
    }

    public /* synthetic */ i(boolean z, int i) {
        this(true, (i & 2) != 0 ? true : z);
    }

    public i(boolean z, boolean z3) {
        this.f145171a = z;
        this.f145172b = z3;
    }
}
