package czh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private d() {
    }

    public static e a(AccountId accountId, io3.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        aVar.getClass();
        return new e(xi0.a.a(str), new CryptoExchangeContract$MoneyDetails.BalanceIdentifier.Pocket(accountId, dVar.f163145a));
    }
}
