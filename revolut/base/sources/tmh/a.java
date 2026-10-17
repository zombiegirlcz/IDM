package tmh;

import kotlin.jvm.internal.Intrinsics;
import z0h.t1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f272221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0h.c f272222b;

    public a(t1 t1Var, z0h.c cVar) {
        this.f272221a = t1Var;
        this.f272222b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f272221a, aVar.f272221a) && Intrinsics.f(this.f272222b, aVar.f272222b);
    }

    public final int hashCode() {
        t1 t1Var = this.f272221a;
        int iHashCode = (t1Var == null ? 0 : t1Var.hashCode()) * 31;
        z0h.c cVar = this.f272222b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
