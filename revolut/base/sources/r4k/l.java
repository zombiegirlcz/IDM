package r4k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f251478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f251479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BankTransferData f251480c;
    public final m d;
    public final List e;
    public final qv0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4k.b f251481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f251482h;
    public final List i;

    public l(f5j.a beneficiary, TransferFlowType flowType, BankTransferData transferData, m mVar, List list, qv0.i iVar, v4k.b bVar, boolean z, List transferSectionData) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        this.f251478a = beneficiary;
        this.f251479b = flowType;
        this.f251480c = transferData;
        this.d = mVar;
        this.e = list;
        this.f = iVar;
        this.f251481g = bVar;
        this.f251482h = z;
        this.i = transferSectionData;
    }

    public static l a(l lVar, BankTransferData bankTransferData, m mVar, List list, qv0.i iVar, v4k.b bVar, List list2, int i) {
        f5j.a beneficiary = lVar.f251478a;
        TransferFlowType flowType = lVar.f251479b;
        if ((i & 4) != 0) {
            bankTransferData = lVar.f251480c;
        }
        BankTransferData transferData = bankTransferData;
        if ((i & 8) != 0) {
            mVar = lVar.d;
        }
        m mVar2 = mVar;
        lVar.getClass();
        if ((i & 32) != 0) {
            list = lVar.e;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            iVar = lVar.f;
        }
        qv0.i iVar2 = iVar;
        v4k.b bVar2 = (i & 128) != 0 ? lVar.f251481g : bVar;
        boolean z = lVar.f251482h;
        List transferSectionData = (i & 512) != 0 ? lVar.i : list2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        return new l(beneficiary, flowType, transferData, mVar2, list3, iVar2, bVar2, z, transferSectionData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f251478a, lVar.f251478a) && Intrinsics.f(this.f251479b, lVar.f251479b) && Intrinsics.f(this.f251480c, lVar.f251480c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f251481g, lVar.f251481g) && this.f251482h == lVar.f251482h && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f251480c.hashCode() + com.revolut.data.database.models.openbanking.d.c(this.f251479b, this.f251478a.hashCode() * 31, 31)) * 31;
        m mVar = this.d;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 961;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        qv0.i iVar = this.f;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        v4k.b bVar = this.f251481g;
        return this.i.hashCode() + j6.a.c((iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f251482h);
    }
}
