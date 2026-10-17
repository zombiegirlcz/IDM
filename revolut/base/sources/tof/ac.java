package tof;

/* JADX INFO: loaded from: classes8.dex */
public final class ac extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6 f272633a;

    public ac(w6 w6Var) {
        this.f272633a = w6Var;
    }

    public final w6 a() {
        return this.f272633a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ac) && this.f272633a == ((ac) obj2).f272633a;
    }

    public final int hashCode() {
        w6 w6Var = this.f272633a;
        if (w6Var == null) {
            return 0;
        }
        return w6Var.hashCode();
    }
}
