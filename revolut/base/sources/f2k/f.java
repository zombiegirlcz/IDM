package f2k;

import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    public static final RemittanceRouteId a(f5j.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Map map = aVar.u;
        String str = map != null ? (String) map.get("TRANSFER_VENDOR") : null;
        return (str == null || str.length() == 0) ? RemittanceRouteId.BANK.f101914b : new RemittanceRouteId.MobileWallet(str, null);
    }

    public static final String b(FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        if (fundingSource instanceof PocketSource) {
            return fundingSource.f92240a;
        }
        if ((fundingSource instanceof SavingsAccount) || (fundingSource instanceof WealthPortfolio) || (fundingSource instanceof DeFiBalanceSource)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(BankTransferData bankTransferData, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(bankTransferData, "<this>");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        wi0.b.Companion.getClass();
        if (!f5j.c.d(beneficiary, wi0.b.Y1)) {
            return false;
        }
        xi0.b bVar = bankTransferData.f101925b;
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar, xi0.b.z);
    }
}
