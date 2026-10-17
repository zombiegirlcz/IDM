package vrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f291589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f291590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f291591c;
    public final TransferQuoteSplit d;
    public final krf.c e;

    public i(dj0.d amount, dj0.d fromAmountAfterCharges, dj0.d dVar, TransferQuoteSplit transferQuoteSplit, krf.c cVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fromAmountAfterCharges, "fromAmountAfterCharges");
        this.f291589a = amount;
        this.f291590b = fromAmountAfterCharges;
        this.f291591c = dVar;
        this.d = transferQuoteSplit;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f291589a, iVar.f291589a) && Intrinsics.f(this.f291590b, iVar.f291590b) && Intrinsics.f(this.f291591c, iVar.f291591c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = v7.c(this.f291589a.hashCode() * 31, 31, this.f291590b);
        dj0.d dVar = this.f291591c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        TransferQuoteSplit transferQuoteSplit = this.d;
        int iHashCode2 = (iHashCode + (transferQuoteSplit == null ? 0 : transferQuoteSplit.f92287a.hashCode())) * 31;
        krf.c cVar = this.e;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
