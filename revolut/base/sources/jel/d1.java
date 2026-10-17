package jel;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f173433a;

    public d1(f0 f0Var) {
        this.f173433a = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d1) && this.f173433a == ((d1) obj2).f173433a;
    }

    public final int hashCode() {
        f0 f0Var = this.f173433a;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.hashCode();
    }
}
