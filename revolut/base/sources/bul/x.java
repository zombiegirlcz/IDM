package bul;

import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x {
    public static TradingAutoTopUp a(SourcePocketWrapper sourcePocketWrapper, AutoTopUpStatus autoTopUpStatus) {
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        if (!Intrinsics.f(autoTopUpStatus, AutoTopUpStatus.Unavailable.f91772a)) {
            if (!(autoTopUpStatus instanceof AutoTopUpStatus.Available)) {
                throw new NoWhenBranchMatchedException();
            }
            AutoTopUpSource autoTopUpSource = ((AutoTopUpStatus.Available) autoTopUpStatus).f91771a;
            if (autoTopUpSource == null) {
                return null;
            }
            Intrinsics.checkNotNullParameter(autoTopUpSource, "autoTopUpSource");
            if (!(autoTopUpSource instanceof AutoTopUpSource.Pocket)) {
                throw new NoWhenBranchMatchedException();
            }
            io3.d dVar = ((AutoTopUpSource.Pocket) autoTopUpSource).f91770a;
            String str = dVar.f163145a;
            xi0.a aVar = xi0.b.Companion;
            String str2 = dVar.f163147c;
            aVar.getClass();
            return new TradingAutoTopUp.Pocket(str, xi0.a.a(str2));
        }
        if (!sourcePocketWrapper.b() && sourcePocketWrapper.d) {
            return null;
        }
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        SourcePocket sourcePocket = sourcePocketWrapper.f91794a;
        if (sourcePocket instanceof SourcePocket.Holding) {
            SourcePocket.Holding holding = (SourcePocket.Holding) sourcePocket;
            return new TradingAutoTopUp.Holding(holding.f91776a.f183150c, holding.getF91784h());
        }
        if (sourcePocket instanceof SourcePocket.Pocket) {
            SourcePocket.Pocket pocket = (SourcePocket.Pocket) sourcePocket;
            return new TradingAutoTopUp.Pocket(pocket.f91785a.f163145a, pocket.getF91784h());
        }
        if (sourcePocket instanceof SourcePocket.VaultWrapper) {
            SourcePocket.VaultWrapper vaultWrapper = (SourcePocket.VaultWrapper) sourcePocket;
            return new TradingAutoTopUp.Pocket(opg.c.j(vaultWrapper.f91791a), vaultWrapper.getF91784h());
        }
        if (sourcePocket instanceof SourcePocket.Savings) {
            SourcePocket.Savings savings = (SourcePocket.Savings) sourcePocket;
            return new TradingAutoTopUp.Pocket(savings.getPocketId(), savings.getF91784h());
        }
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return TradingAutoTopUp.CombinedBuyingPower.f104654a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
