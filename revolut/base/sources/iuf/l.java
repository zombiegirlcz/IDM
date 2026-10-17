package iuf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferRecipient f168567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyRequest f168568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ManualTransferData f168569c;
    public final m d;
    public final qv0.i e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f168570g;

    public l(ManualTransferRecipient manualTransferRecipient, MoneyRequest moneyRequest, ManualTransferData manualTransferData, m mVar, qv0.i iVar, r rVar, List transferSectionData) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        this.f168567a = manualTransferRecipient;
        this.f168568b = moneyRequest;
        this.f168569c = manualTransferData;
        this.d = mVar;
        this.e = iVar;
        this.f = rVar;
        this.f168570g = transferSectionData;
    }

    public static l a(l lVar, ManualTransferRecipient manualTransferRecipient, ManualTransferData manualTransferData, m mVar, qv0.i iVar, r rVar, List list, int i) {
        if ((i & 1) != 0) {
            manualTransferRecipient = lVar.f168567a;
        }
        ManualTransferRecipient manualTransferRecipient2 = manualTransferRecipient;
        MoneyRequest moneyRequest = lVar.f168568b;
        if ((i & 4) != 0) {
            manualTransferData = lVar.f168569c;
        }
        ManualTransferData manualTransferData2 = manualTransferData;
        if ((i & 8) != 0) {
            mVar = lVar.d;
        }
        m mVar2 = mVar;
        if ((i & 16) != 0) {
            iVar = lVar.e;
        }
        qv0.i iVar2 = iVar;
        if ((i & 32) != 0) {
            rVar = lVar.f;
        }
        r rVar2 = rVar;
        if ((i & 64) != 0) {
            list = lVar.f168570g;
        }
        List transferSectionData = list;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(transferSectionData, "transferSectionData");
        return new l(manualTransferRecipient2, moneyRequest, manualTransferData2, mVar2, iVar2, rVar2, transferSectionData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f168567a, lVar.f168567a) && Intrinsics.f(this.f168568b, lVar.f168568b) && Intrinsics.f(this.f168569c, lVar.f168569c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f168570g, lVar.f168570g);
    }

    public final int hashCode() {
        ManualTransferRecipient manualTransferRecipient = this.f168567a;
        int iHashCode = (this.f168568b.hashCode() + ((manualTransferRecipient == null ? 0 : manualTransferRecipient.hashCode()) * 31)) * 31;
        ManualTransferData manualTransferData = this.f168569c;
        int iHashCode2 = (iHashCode + (manualTransferData == null ? 0 : manualTransferData.hashCode())) * 31;
        m mVar = this.d;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        qv0.i iVar = this.e;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        r rVar = this.f;
        return this.f168570g.hashCode() + ((iHashCode4 + (rVar != null ? rVar.f168576a.hashCode() : 0)) * 31);
    }
}
