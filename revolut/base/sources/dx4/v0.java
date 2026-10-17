package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120798b;

    public v0(String label, l lVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f120797a = label;
        this.f120798b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f120797a, v0Var.f120797a) && Intrinsics.f(this.f120798b, v0Var.f120798b);
    }

    public final int hashCode() {
        int iHashCode = this.f120797a.hashCode() * 31;
        l lVar = this.f120798b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
