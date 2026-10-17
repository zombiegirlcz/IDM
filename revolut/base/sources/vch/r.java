package vch;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f287729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f287730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efl.h f287731c;

    public r(dj0.d amountToWithdraw, y0 withdrawTransferData, efl.h hVar) {
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        Intrinsics.checkNotNullParameter(withdrawTransferData, "withdrawTransferData");
        this.f287729a = amountToWithdraw;
        this.f287730b = withdrawTransferData;
        this.f287731c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f287729a, rVar.f287729a) && Intrinsics.f(this.f287730b, rVar.f287730b) && this.f287731c == rVar.f287731c;
    }

    public final int hashCode() {
        int iHashCode = (this.f287730b.hashCode() + (this.f287729a.hashCode() * 31)) * 31;
        efl.h hVar = this.f287731c;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
