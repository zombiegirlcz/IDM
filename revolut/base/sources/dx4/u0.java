package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f120782b;

    public u0(String label, l lVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f120781a = label;
        this.f120782b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f120781a, u0Var.f120781a) && Intrinsics.f(this.f120782b, u0Var.f120782b);
    }

    public final int hashCode() {
        int iHashCode = this.f120781a.hashCode() * 31;
        l lVar = this.f120782b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
