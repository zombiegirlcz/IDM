package kbk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f182624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f182625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f182626c;

    public i(h eligibility, g gVar, g gVar2) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        this.f182624a = eligibility;
        this.f182625b = gVar;
        this.f182626c = gVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f182624a == iVar.f182624a && this.f182625b == iVar.f182625b && this.f182626c == iVar.f182626c;
    }

    public final int hashCode() {
        int iHashCode = this.f182624a.hashCode() * 31;
        g gVar = this.f182625b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.f182626c;
        return iHashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }
}
