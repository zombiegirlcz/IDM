package r0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f250746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.i f250747b;

    public r(g buttonsState, qv0.i iVar) {
        Intrinsics.checkNotNullParameter(buttonsState, "buttonsState");
        this.f250746a = buttonsState;
        this.f250747b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f250746a, rVar.f250746a) && Intrinsics.f(this.f250747b, rVar.f250747b);
    }

    public final int hashCode() {
        int iHashCode = this.f250746a.hashCode() * 31;
        qv0.i iVar = this.f250747b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
