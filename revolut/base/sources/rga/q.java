package rga;

import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.api.navigation.CryptoExchangeFeesDestination;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {
    public q(sga.a cryptoBannerRouter) {
        Intrinsics.checkNotNullParameter(cryptoBannerRouter, "cryptoBannerRouter");
    }

    public static xfa.b a(UpgradeEntryPointItemContract$ItemType upgradeEntryPointItemContract$ItemType) {
        if (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Fees) {
            UpgradeEntryPointItemContract$ItemType.Fees fees = (UpgradeEntryPointItemContract$ItemType.Fees) upgradeEntryPointItemContract$ItemType;
            if (fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Stocks.f80979a)) {
                return xfa.b.FEE_STOCKS;
            }
            if (fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Crypto.f80978a)) {
                return xfa.b.FEE_CRYPTO;
            }
            if (fees.equals(UpgradeEntryPointItemContract$ItemType.Fees.Commodity.f80977a)) {
                return xfa.b.FEE_COMMODITY;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder) {
            UpgradeEntryPointItemContract$ItemType.ReviewOrder reviewOrder = (UpgradeEntryPointItemContract$ItemType.ReviewOrder) upgradeEntryPointItemContract$ItemType;
            if (reviewOrder.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks.f80993a)) {
                return xfa.b.ORDER_REVIEW_STOCKS;
            }
            if (reviewOrder instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) {
                return xfa.b.ORDER_REVIEW_CRYPTO;
            }
            if (reviewOrder.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity.f80980a)) {
                return xfa.b.ORDER_REVIEW_COMMODITIES;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(upgradeEntryPointItemContract$ItemType instanceof UpgradeEntryPointItemContract$ItemType.Transaction)) {
            throw new NoWhenBranchMatchedException();
        }
        UpgradeEntryPointItemContract$ItemType.Transaction transaction = (UpgradeEntryPointItemContract$ItemType.Transaction) upgradeEntryPointItemContract$ItemType;
        if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Atm.f80994a)) {
            return xfa.b.TRANSACTION_DETAILS_ATM;
        }
        if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Stocks.f80999a)) {
            return xfa.b.TRANSACTION_DETAILS_STOCKS;
        }
        if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Crypto.f80996a) || transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering.f80997a)) {
            return xfa.b.TRANSACTION_DETAILS_CRYPTO;
        }
        if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Exchange.f80998a)) {
            return xfa.b.TRANSACTION_DETAILS_EXCHANGE;
        }
        if (transaction.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Commodity.f80995a)) {
            return xfa.b.TRANSACTION_DETAILS_COMMODITIES;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final FeatureCommand b(mga.m cryptoContext) {
        KompotOverlayFeatureConfig kompotOverlayFeatureConfig;
        Intrinsics.checkNotNullParameter(cryptoContext, "context");
        Intrinsics.checkNotNullParameter(cryptoContext, "cryptoContext");
        if (cryptoContext instanceof mga.k) {
            kompotOverlayFeatureConfig = new KompotOverlayFeatureConfig((ParcelableDestination) new CryptoExchangeFeesDestination.FeesWithUpgradePlans(lf5.b.ORDER_REVIEW, new CryptoExchangeFeesMode.UpgradePlan(false)), yhi.b.POPUP, (Integer) 17290, 8);
        } else {
            if (!(cryptoContext instanceof mga.l) && !(cryptoContext instanceof mga.j)) {
                throw new NoWhenBranchMatchedException();
            }
            kompotOverlayFeatureConfig = new KompotOverlayFeatureConfig(new CryptoExchangeFeesDestination.FeesWithUpgradePlans(lf5.b.TRANSACTION_DETAILS, new CryptoExchangeFeesMode.UpgradePlan(false)), yhi.b.POPUP, (Integer) null, 12);
        }
        return new FeatureCommand(kompotOverlayFeatureConfig);
    }
}
