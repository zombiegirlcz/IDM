package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class si0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166361c;
    public final boolean d;

    public si0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166359a = z;
        this.f166360b = z3;
        this.f166361c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj2;
        return this.f166359a == si0Var.f166359a && this.f166360b == si0Var.f166360b && this.f166361c == si0Var.f166361c && this.d == si0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166359a) * 31, 31, this.f166360b), 31, this.f166361c);
    }
}
