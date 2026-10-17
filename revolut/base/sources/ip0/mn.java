package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn f165405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e5 f165406b;

    public mn(kn model, aw0.e5 e5Var) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f165405a = model;
        this.f165406b = e5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj2;
        return Intrinsics.f(this.f165405a, mnVar.f165405a) && Intrinsics.f(this.f165406b, mnVar.f165406b);
    }

    public final int hashCode() {
        int iHashCode = this.f165405a.hashCode() * 31;
        aw0.e5 e5Var = this.f165406b;
        return iHashCode + (e5Var == null ? 0 : e5Var.hashCode());
    }
}
