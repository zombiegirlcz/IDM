package ny3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f220640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f220641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f220642c;

    public i(f document, g gVar, k successPopup) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(successPopup, "successPopup");
        this.f220640a = document;
        this.f220641b = gVar;
        this.f220642c = successPopup;
    }

    @Override // ny3.p
    public final k F3() {
        return this.f220642c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f220640a, iVar.f220640a) && Intrinsics.f(this.f220641b, iVar.f220641b) && Intrinsics.f(this.f220642c, iVar.f220642c);
    }

    public final int hashCode() {
        int iHashCode = this.f220640a.hashCode() * 31;
        g gVar = this.f220641b;
        return this.f220642c.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    @Override // ny3.p
    public final g l6() {
        return this.f220641b;
    }
}
