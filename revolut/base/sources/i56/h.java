package i56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f158774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f158775b;

    public h(ej0.b amountOut, i iVar) {
        Intrinsics.checkNotNullParameter(amountOut, "amountOut");
        this.f158774a = amountOut;
        this.f158775b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f158774a, hVar.f158774a) && Intrinsics.f(this.f158775b, hVar.f158775b);
    }

    public final int hashCode() {
        int iHashCode = this.f158774a.hashCode() * 31;
        i iVar = this.f158775b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
