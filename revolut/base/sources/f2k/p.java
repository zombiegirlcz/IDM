package f2k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mga.a0;
import mga.d0;
import mga.r;

/* JADX INFO: loaded from: classes11.dex */
public final class p {
    public static d0 a(BankTransferEntryPoint entryPoint, kq2.f exchangeRate, BankTransferData transferData) {
        String value = exchangeRate.u;
        kq2.c cVar = transferData.k;
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        int i = o.f131853a[entryPoint.ordinal()];
        if (i == 1) {
            if (value != null) {
                Intrinsics.checkNotNullParameter(value, "value");
            } else {
                value = null;
            }
            return new a0(value, cVar != null ? cVar.name() : null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        String strName = cVar != null ? cVar.name() : null;
        RemittanceRouteId remittanceRouteId = transferData.f101935r;
        return new r(value, strName, remittanceRouteId != null ? remittanceRouteId.f101913a : null);
    }
}
