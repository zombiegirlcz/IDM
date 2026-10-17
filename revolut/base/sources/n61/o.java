package n61;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f212696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212697b;

    public o(boolean z, boolean z3) {
        this.f212696a = z;
        this.f212697b = z3;
    }

    public static o a(o oVar) {
        boolean z = oVar.f212696a;
        oVar.getClass();
        return new o(z, false);
    }

    public final boolean b() {
        return this.f212697b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f212696a == oVar.f212696a && this.f212697b == oVar.f212697b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212697b) + (Boolean.hashCode(this.f212696a) * 31);
    }
}
