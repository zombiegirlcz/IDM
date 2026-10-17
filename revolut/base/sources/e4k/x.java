package e4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f122645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f122646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankTransferData f122647c;
    public final z d;
    public final Integer e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f122648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final krf.a f122649h;
    public final i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f122650j;

    public x(f5j.a beneficiary, TransferFlowType flowType, BankTransferData bankTransferData, z zVar, Integer num, int i, w wVar, krf.a aVar, i0 suggestionsData, boolean z) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(suggestionsData, "suggestionsData");
        this.f122645a = beneficiary;
        this.f122646b = flowType;
        this.f122647c = bankTransferData;
        this.d = zVar;
        this.e = num;
        this.f = i;
        this.f122648g = wVar;
        this.f122649h = aVar;
        this.i = suggestionsData;
        this.f122650j = z;
    }

    public static x a(x xVar, f5j.a aVar, BankTransferData bankTransferData, z zVar, int i, w wVar, krf.a aVar2, i0 i0Var, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            aVar = xVar.f122645a;
        }
        f5j.a beneficiary = aVar;
        TransferFlowType flowType = xVar.f122646b;
        BankTransferData bankTransferData2 = (i2 & 4) != 0 ? xVar.f122647c : bankTransferData;
        z zVar2 = (i2 & 8) != 0 ? xVar.d : zVar;
        Integer num = xVar.e;
        int i3 = (i2 & 32) != 0 ? xVar.f : i;
        w wVar2 = (i2 & 64) != 0 ? xVar.f122648g : wVar;
        krf.a aVar3 = (i2 & 128) != 0 ? xVar.f122649h : aVar2;
        i0 suggestionsData = (i2 & 256) != 0 ? xVar.i : i0Var;
        boolean z3 = (i2 & 512) != 0 ? xVar.f122650j : z;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(suggestionsData, "suggestionsData");
        return new x(beneficiary, flowType, bankTransferData2, zVar2, num, i3, wVar2, aVar3, suggestionsData, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f122645a, xVar.f122645a) && Intrinsics.f(this.f122646b, xVar.f122646b) && Intrinsics.f(this.f122647c, xVar.f122647c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && this.f == xVar.f && Intrinsics.f(this.f122648g, xVar.f122648g) && Intrinsics.f(this.f122649h, xVar.f122649h) && Intrinsics.f(this.i, xVar.i) && this.f122650j == xVar.f122650j;
    }

    public final int hashCode() {
        int iC = com.revolut.data.database.models.openbanking.d.c(this.f122646b, this.f122645a.hashCode() * 31, 31);
        BankTransferData bankTransferData = this.f122647c;
        int iHashCode = (iC + (bankTransferData == null ? 0 : bankTransferData.hashCode())) * 31;
        z zVar = this.d;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        Integer num = this.e;
        int iB = j6.a.b(this.f, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        w wVar = this.f122648g;
        int iHashCode3 = (iB + (wVar == null ? 0 : wVar.hashCode())) * 31;
        krf.a aVar = this.f122649h;
        return Boolean.hashCode(this.f122650j) + ((this.i.hashCode() + ((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }
}
