package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f4625b;

    public p(o oVar, o oVar2) {
        this.f4624a = oVar;
        this.f4625b = oVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f4624a, pVar.f4624a) && Intrinsics.f(this.f4625b, pVar.f4625b);
    }

    public final int hashCode() {
        o oVar = this.f4624a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        o oVar2 = this.f4625b;
        return iHashCode + (oVar2 != null ? oVar2.hashCode() : 0);
    }
}
