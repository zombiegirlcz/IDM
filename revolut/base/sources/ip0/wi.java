package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui f167033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e5 f167034b;

    public wi(ui model, aw0.e5 e5Var) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f167033a = model;
        this.f167034b = e5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj2;
        return Intrinsics.f(this.f167033a, wiVar.f167033a) && Intrinsics.f(this.f167034b, wiVar.f167034b);
    }

    public final int hashCode() {
        int iHashCode = this.f167033a.hashCode() * 31;
        aw0.e5 e5Var = this.f167034b;
        return iHashCode + (e5Var == null ? 0 : e5Var.hashCode());
    }
}
