package vlk;

import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f290480a;

    public a(w0 w0Var) {
        this.f290480a = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f290480a == ((a) obj2).f290480a;
    }

    public final int hashCode() {
        w0 w0Var = this.f290480a;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.hashCode();
    }
}
