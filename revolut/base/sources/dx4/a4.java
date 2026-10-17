package dx4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class a4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3 f120546a;

    public a4() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a4) && this.f120546a == ((a4) obj2).f120546a;
    }

    public final int hashCode() {
        y3 y3Var = this.f120546a;
        if (y3Var == null) {
            return 0;
        }
        return y3Var.hashCode();
    }

    public a4(y3 y3Var) {
        this.f120546a = y3Var;
    }
}
