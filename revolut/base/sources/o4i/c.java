package o4i;

import android.content.Context;
import com.revolut.feature.payments.api.PaymentsToggles$TransactionBreakdownKompotMigration;
import com.revolut.feature_market_data_api.MarketDataApi$Toggles$CryptoBuySellFirmPrices;
import com.revolut.feature_market_data_api.MarketDataApi$Toggles$CryptoFirmPricesMoveMoney;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_api.navigation.BreakdownDestination;
import com.revolut.feature_market_data_api.navigation.ChargeDescriptionFeatureConfig;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.feature_market_data_api.navigation.ExchangePriceDescriptionFeatureConfig;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownTransferFeatureConfig;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.feature_market_data_api.navigation.InterestDescriptionFeatureConfig;
import com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivityContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import java.util.List;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p4i.h;
import sri.m;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements uri.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f222291a;

    public c(gte.a featureToggleInteractor, a breakdownDestinationMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(breakdownDestinationMapper, "breakdownDestinationMapper");
        this.f222291a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TransactionBreakdownFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        Screen chargeDescription;
        Screen.InterestBreakdown.Interest interestApplies;
        Breakdown interestApplies2;
        TransactionBreakdownFeatureConfig config = (TransactionBreakdownFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!((d) this.f222291a).c(PaymentsToggles$TransactionBreakdownKompotMigration.f79168c)) {
            h.Companion.getClass();
            ExplicitActivityDestination explicitActivityDestination = p4i.d.f232935b;
            if (config instanceof ExchangeBreakdownFeatureConfig) {
                ExchangeBreakdownFeatureConfig exchangeBreakdownFeatureConfig = (ExchangeBreakdownFeatureConfig) config;
                chargeDescription = new Screen.TransactionBreakdown(exchangeBreakdownFeatureConfig.f97067b, exchangeBreakdownFeatureConfig.f97066a, exchangeBreakdownFeatureConfig.f97068c, exchangeBreakdownFeatureConfig.e, exchangeBreakdownFeatureConfig.f, exchangeBreakdownFeatureConfig.f97069g, exchangeBreakdownFeatureConfig.f97070h, exchangeBreakdownFeatureConfig.i, exchangeBreakdownFeatureConfig.f97071j, exchangeBreakdownFeatureConfig.k, exchangeBreakdownFeatureConfig.f97072l);
            } else if (config instanceof FeeBreakdownFeatureConfig) {
                FeeBreakdownFeatureConfig feeBreakdownFeatureConfig = (FeeBreakdownFeatureConfig) config;
                chargeDescription = new Screen.FeeBreakdown.Dynamic(feeBreakdownFeatureConfig.f97077b, feeBreakdownFeatureConfig.f97076a, feeBreakdownFeatureConfig.f97078c, feeBreakdownFeatureConfig.e, feeBreakdownFeatureConfig.f, feeBreakdownFeatureConfig.f97079g, feeBreakdownFeatureConfig.f97080h, feeBreakdownFeatureConfig.i, feeBreakdownFeatureConfig.f97081j, feeBreakdownFeatureConfig.k);
            } else if (config instanceof HistoricFeeBreakdownFeatureConfig) {
                HistoricFeeBreakdownFeatureConfig historicFeeBreakdownFeatureConfig = (HistoricFeeBreakdownFeatureConfig) config;
                chargeDescription = new Screen.FeeBreakdown.Static(historicFeeBreakdownFeatureConfig.f97087a, historicFeeBreakdownFeatureConfig.f97088b, historicFeeBreakdownFeatureConfig.f97089c, historicFeeBreakdownFeatureConfig.f97090g, historicFeeBreakdownFeatureConfig.d, historicFeeBreakdownFeatureConfig.e, historicFeeBreakdownFeatureConfig.f, historicFeeBreakdownFeatureConfig.i, null);
            } else if (config instanceof FeeBreakdownTransferFeatureConfig) {
                FeeBreakdownTransferFeatureConfig feeBreakdownTransferFeatureConfig = (FeeBreakdownTransferFeatureConfig) config;
                chargeDescription = new Screen.FeeBreakdown.TransferQuoteDynamic(feeBreakdownTransferFeatureConfig.f97082a, feeBreakdownTransferFeatureConfig.f97083b, feeBreakdownTransferFeatureConfig.f97084c, feeBreakdownTransferFeatureConfig.d, feeBreakdownTransferFeatureConfig.e, feeBreakdownTransferFeatureConfig.f, feeBreakdownTransferFeatureConfig.f97085g, feeBreakdownTransferFeatureConfig.i, null);
            } else if (config instanceof ExchangePriceDescriptionFeatureConfig) {
                ExchangePriceDescriptionFeatureConfig exchangePriceDescriptionFeatureConfig = (ExchangePriceDescriptionFeatureConfig) config;
                chargeDescription = new Screen.TransactionPriceDescription(exchangePriceDescriptionFeatureConfig.f97073a, exchangePriceDescriptionFeatureConfig.f97075c, exchangePriceDescriptionFeatureConfig.d, exchangePriceDescriptionFeatureConfig.e, exchangePriceDescriptionFeatureConfig.f);
            } else if (config instanceof InterestDescriptionFeatureConfig) {
                InterestDescriptionFeatureConfig.Interest interest = ((InterestDescriptionFeatureConfig) config).f97094c;
                if (interest instanceof InterestDescriptionFeatureConfig.Interest.EstimatedInterest) {
                    InterestDescriptionFeatureConfig.Interest.EstimatedInterest estimatedInterest = (InterestDescriptionFeatureConfig.Interest.EstimatedInterest) interest;
                    interestApplies = new Screen.InterestBreakdown.Interest.EstimatedInterest(estimatedInterest.f97098b, estimatedInterest.f97097a);
                } else if (interest instanceof InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest) {
                    InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest dailyEstimatedInterest = (InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest) interest;
                    interestApplies = new Screen.InterestBreakdown.Interest.DailyEstimatedInterest(dailyEstimatedInterest.f97095a, dailyEstimatedInterest.f97096b);
                } else {
                    if (!(interest instanceof InterestDescriptionFeatureConfig.Interest.InterestApplies)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterestDescriptionFeatureConfig.Interest.InterestApplies interestApplies3 = (InterestDescriptionFeatureConfig.Interest.InterestApplies) interest;
                    interestApplies = new Screen.InterestBreakdown.Interest.InterestApplies(interestApplies3.f97099a, interestApplies3.f97100b, interestApplies3.f97101c, interestApplies3.d);
                }
                chargeDescription = new Screen.InterestBreakdown(interestApplies);
            } else {
                if (!(config instanceof ChargeDescriptionFeatureConfig)) {
                    throw new NoWhenBranchMatchedException();
                }
                chargeDescription = new Screen.ChargeDescription(((ChargeDescriptionFeatureConfig) config).f97065c);
            }
            navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new StackedBreakdownActivityContract$Configuration(chargeDescription, config.getF97076a(), config.getF97092a(), config.getF97093b()), null, null, 0, null, null, null, null, false, 1020));
            return;
        }
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof ExchangeBreakdownFeatureConfig) {
            ExchangeBreakdownFeatureConfig exchangeBreakdownFeatureConfig2 = (ExchangeBreakdownFeatureConfig) config;
            interestApplies2 = new Breakdown.Transaction(exchangeBreakdownFeatureConfig2.f97067b, exchangeBreakdownFeatureConfig2.f97066a, exchangeBreakdownFeatureConfig2.f97068c, exchangeBreakdownFeatureConfig2.e, exchangeBreakdownFeatureConfig2.f, exchangeBreakdownFeatureConfig2.f97069g, exchangeBreakdownFeatureConfig2.f97070h, exchangeBreakdownFeatureConfig2.i, exchangeBreakdownFeatureConfig2.f97071j, exchangeBreakdownFeatureConfig2.k, exchangeBreakdownFeatureConfig2.f97072l);
        } else if (config instanceof FeeBreakdownFeatureConfig) {
            FeeBreakdownFeatureConfig feeBreakdownFeatureConfig2 = (FeeBreakdownFeatureConfig) config;
            ChargeBreakdown chargeBreakdown = feeBreakdownFeatureConfig2.f97077b;
            OrderQuoteParamsVariant orderQuoteParamsVariant = feeBreakdownFeatureConfig2.f97076a;
            boolean z = feeBreakdownFeatureConfig2.e;
            xi0.b bVar = feeBreakdownFeatureConfig2.f;
            boolean z3 = feeBreakdownFeatureConfig2.f97079g;
            boolean z4 = feeBreakdownFeatureConfig2.f97080h;
            interestApplies2 = new Breakdown.FeeDynamic(chargeBreakdown, bVar, feeBreakdownFeatureConfig2.k, feeBreakdownFeatureConfig2.i, orderQuoteParamsVariant, z, z3, z4, feeBreakdownFeatureConfig2.f97081j);
        } else if (config instanceof HistoricFeeBreakdownFeatureConfig) {
            HistoricFeeBreakdownFeatureConfig historicFeeBreakdownFeatureConfig2 = (HistoricFeeBreakdownFeatureConfig) config;
            ChargeBreakdown chargeBreakdown2 = historicFeeBreakdownFeatureConfig2.f97087a;
            String str = historicFeeBreakdownFeatureConfig2.f97088b;
            z3i.b bVar2 = historicFeeBreakdownFeatureConfig2.f97089c;
            interestApplies2 = new Breakdown.FeeStatic(chargeBreakdown2, historicFeeBreakdownFeatureConfig2.d, historicFeeBreakdownFeatureConfig2.i, str, bVar2, historicFeeBreakdownFeatureConfig2.e, historicFeeBreakdownFeatureConfig2.f);
        } else if (config instanceof FeeBreakdownTransferFeatureConfig) {
            FeeBreakdownTransferFeatureConfig feeBreakdownTransferFeatureConfig2 = (FeeBreakdownTransferFeatureConfig) config;
            interestApplies2 = new Breakdown.FeeTransferQuoteDynamic(feeBreakdownTransferFeatureConfig2.f97082a, feeBreakdownTransferFeatureConfig2.i, feeBreakdownTransferFeatureConfig2.f97084c, feeBreakdownTransferFeatureConfig2.d, feeBreakdownTransferFeatureConfig2.e, feeBreakdownTransferFeatureConfig2.f, feeBreakdownTransferFeatureConfig2.f97085g);
        } else if (config instanceof ExchangePriceDescriptionFeatureConfig) {
            ExchangePriceDescriptionFeatureConfig exchangePriceDescriptionFeatureConfig2 = (ExchangePriceDescriptionFeatureConfig) config;
            interestApplies2 = new Breakdown.TransactionPriceDescription(exchangePriceDescriptionFeatureConfig2.f97075c, exchangePriceDescriptionFeatureConfig2.d, exchangePriceDescriptionFeatureConfig2.e, exchangePriceDescriptionFeatureConfig2.f);
        } else if (config instanceof ChargeDescriptionFeatureConfig) {
            interestApplies2 = new Breakdown.ChargeDescription(((ChargeDescriptionFeatureConfig) config).f97065c);
        } else {
            if (!(config instanceof InterestDescriptionFeatureConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            InterestDescriptionFeatureConfig.Interest interest2 = ((InterestDescriptionFeatureConfig) config).f97094c;
            if (interest2 instanceof InterestDescriptionFeatureConfig.Interest.EstimatedInterest) {
                InterestDescriptionFeatureConfig.Interest.EstimatedInterest estimatedInterest2 = (InterestDescriptionFeatureConfig.Interest.EstimatedInterest) interest2;
                interestApplies2 = new Breakdown.Interest.EstimatedInterest(estimatedInterest2.f97098b, estimatedInterest2.f97097a);
            } else if (interest2 instanceof InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest) {
                InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest dailyEstimatedInterest2 = (InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest) interest2;
                interestApplies2 = new Breakdown.Interest.DailyEstimatedInterest(dailyEstimatedInterest2.f97095a, dailyEstimatedInterest2.f97096b);
            } else {
                if (!(interest2 instanceof InterestDescriptionFeatureConfig.Interest.InterestApplies)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterestDescriptionFeatureConfig.Interest.InterestApplies interestApplies4 = (InterestDescriptionFeatureConfig.Interest.InterestApplies) interest2;
                interestApplies2 = new Breakdown.Interest.InterestApplies(interestApplies4.f97099a, interestApplies4.f97100b, interestApplies4.f97101c, interestApplies4.d);
            }
        }
        navigator.c(u0.f(new BreakdownDestination(interestApplies2, config.getF97093b())));
    }

    @Override // nte.a
    public final List e() {
        return v.k(MarketDataApi$Toggles$CryptoFirmPricesMoveMoney.f97007c, MarketDataApi$Toggles$CryptoBuySellFirmPrices.f97006c);
    }
}
