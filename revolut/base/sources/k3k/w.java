package k3k;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittancePaymentsCountryData f180803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f180804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemittanceTransferData f180805c;
    public final x d;
    public final Integer e;
    public final int f;

    public w(RemittancePaymentsCountryData countryData, TransferFlowType flowType, RemittanceTransferData remittanceTransferData, x xVar, Integer num, int i) {
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f180803a = countryData;
        this.f180804b = flowType;
        this.f180805c = remittanceTransferData;
        this.d = xVar;
        this.e = num;
        this.f = i;
    }

    public static w a(w wVar, RemittanceTransferData remittanceTransferData, x xVar, Integer num, int i, int i2) {
        RemittancePaymentsCountryData countryData = wVar.f180803a;
        TransferFlowType flowType = wVar.f180804b;
        if ((i2 & 4) != 0) {
            remittanceTransferData = wVar.f180805c;
        }
        RemittanceTransferData remittanceTransferData2 = remittanceTransferData;
        if ((i2 & 8) != 0) {
            xVar = wVar.d;
        }
        x xVar2 = xVar;
        if ((i2 & 16) != 0) {
            num = wVar.e;
        }
        Integer num2 = num;
        if ((i2 & 32) != 0) {
            i = wVar.f;
        }
        wVar.getClass();
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return new w(countryData, flowType, remittanceTransferData2, xVar2, num2, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f180803a, wVar.f180803a) && Intrinsics.f(this.f180804b, wVar.f180804b) && Intrinsics.f(this.f180805c, wVar.f180805c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && this.f == wVar.f;
    }

    public final int hashCode() {
        int iC = com.revolut.data.database.models.openbanking.d.c(this.f180804b, this.f180803a.hashCode() * 31, 31);
        RemittanceTransferData remittanceTransferData = this.f180805c;
        int iHashCode = (iC + (remittanceTransferData == null ? 0 : remittanceTransferData.hashCode())) * 31;
        x xVar = this.d;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Integer num = this.e;
        return Integer.hashCode(this.f) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
