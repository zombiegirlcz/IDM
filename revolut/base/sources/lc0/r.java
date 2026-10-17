package lc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f193768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f193769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f193770c;

    public r(h hVar, q qVar, p pVar) {
        this.f193768a = hVar;
        this.f193769b = qVar;
        this.f193770c = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f193768a, rVar.f193768a) && Intrinsics.f(this.f193769b, rVar.f193769b) && Intrinsics.f(this.f193770c, rVar.f193770c);
    }

    public final int hashCode() {
        h hVar = this.f193768a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        q qVar = this.f193769b;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        p pVar = this.f193770c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
