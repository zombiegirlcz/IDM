package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.a5 f166336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.z4 f166337b;

    public sd(com.revolut.core.ui_kit.delegates.a5 a5Var, com.revolut.core.ui_kit.delegates.z4 z4Var) {
        this.f166336a = a5Var;
        this.f166337b = z4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj2;
        return Intrinsics.f(this.f166336a, sdVar.f166336a) && Intrinsics.f(this.f166337b, sdVar.f166337b);
    }

    public final int hashCode() {
        com.revolut.core.ui_kit.delegates.a5 a5Var = this.f166336a;
        int iHashCode = (a5Var == null ? 0 : a5Var.hashCode()) * 31;
        com.revolut.core.ui_kit.delegates.z4 z4Var = this.f166337b;
        return iHashCode + (z4Var != null ? z4Var.hashCode() : 0);
    }
}
