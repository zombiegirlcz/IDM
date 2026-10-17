package c1l;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.feature.support.api.navigation.LegacyHelpCentreFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import g1l.g;
import g1l.m;
import g1l.n;
import gim.i;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import vf0.h;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig f20536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f20537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f20538y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig, NaviCommand naviCommand, NaviCommand naviCommand2, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f20536w = tradingAccountOnboardingFeatureConfig;
        this.f20537x = naviCommand;
        this.f20538y = naviCommand2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f20536w, this.f20537x, this.f20538y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        Object objO;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig tradingAccountOnboardingFeatureConfig = this.f20536w;
        if (i == 0) {
            o.b(obj2);
            n nVar = this.v.f20539a;
            TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = tradingAccountOnboardingFeatureConfig.f104106b;
            this.u = 1;
            if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) {
                TradingAccount tradingAccount = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) tradingAccountOrType).f104113a;
                hVar = new h(tradingAccount.W(), null, f0.f322471a, tradingAccount.getF105262a());
            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) {
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts withTradingAccountAndProducts = (TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) tradingAccountOrType;
                TradingAccount tradingAccount2 = withTradingAccountAndProducts.f104114a;
                hVar = new h(tradingAccount2.W(), null, withTradingAccountAndProducts.f104115b, tradingAccount2.getF105262a());
            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType) {
                hVar = new h(((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType) tradingAccountOrType).f104116a, null, f0.f322471a, null);
            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) {
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts withTradingAccountTypeAndProducts = (TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) tradingAccountOrType;
                hVar = new h(withTradingAccountTypeAndProducts.f104117a, null, withTradingAccountTypeAndProducts.f104118b, null);
            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId) {
                hVar = new h(null, ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId) tradingAccountOrType).f104108a, f0.f322471a, null);
            } else {
                if (!(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts)) {
                    throw new NoWhenBranchMatchedException();
                }
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts withAvailableAccountIdAndProducts = (TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) tradingAccountOrType;
                hVar = new h(null, withAvailableAccountIdAndProducts.f104110a, withAvailableAccountIdAndProducts.f104112c, null);
            }
            objO = e0.o(new m(nVar, (TradingAccountType) hVar.f288433a, (List) hVar.f288435c, (UUID) hVar.d, (String) hVar.f288434b, null), this);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objO = obj2;
        }
        g1l.i iVar = (g1l.i) objO;
        if (Intrinsics.f(iVar, g1l.e.f139717a)) {
            return new FeatureCommand(tradingAccountOnboardingFeatureConfig);
        }
        if (Intrinsics.f(iVar, g1l.f.f139718a)) {
            return this.f20537x;
        }
        if (!Intrinsics.f(iVar, g1l.h.f139720a)) {
            if (!(iVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            g1l.d dVar = ((g) iVar).f139719a;
            boolean zEquals = dVar.equals(g1l.b.f139715a);
            LegacyHelpCentreFeatureConfig.HelpCentre helpCentre = LegacyHelpCentreFeatureConfig.HelpCentre.f89360a;
            if (zEquals) {
                AnalyticsProduct analyticsProduct = tradingAccountOnboardingFeatureConfig.e;
                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                return com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Error("ONBOARDING_NOT_SUPPORTED_RESULT_ID", new TextLocalisedClause(R$string.wealth_asset_type_activation_error_country_not_supported_title, null, null, 14), new TextLocalisedClause(R$string.wealth_asset_type_activation_error_country_not_supported_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), new TextLocalisedClause(R$string.wealth_portfolio_declined_FAQ, null, null, 14), null, analyticsProduct, ConnectionsStatusCodes.MISSING_PERMISSION_ACCESS_WIFI_STATE), new FinishCommand(null, null, null, 7), com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(helpCentre)), new FinishCommand(null, null, null, 7), null, 468);
            }
            if (dVar.equals(g1l.c.f139716a)) {
                AnalyticsProduct analyticsProduct2 = tradingAccountOnboardingFeatureConfig.e;
                Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                return com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Error("ONBOARDING_FAILED_RESULT_ID", new TextLocalisedClause(R$string.wealth_trade_post_onboarding_status_failed_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trade_onboarding_status_failed_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), new TextLocalisedClause(R$string.wealth_portfolio_declined_FAQ, null, null, 14), null, analyticsProduct2, ConnectionsStatusCodes.MISSING_PERMISSION_ACCESS_WIFI_STATE), new FinishCommand(null, null, null, 7), com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(helpCentre)), new FinishCommand(null, null, null, 7), null, 468);
            }
            if (dVar instanceof g1l.a) {
                return ((g1l.a) dVar).f139714a;
            }
            throw new NoWhenBranchMatchedException();
        }
        NaviCommand naviCommand = this.f20538y;
        if (naviCommand != null) {
            return naviCommand;
        }
        AnalyticsProduct analyticsProduct3 = tradingAccountOnboardingFeatureConfig.e;
        Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
        com.revolut.retail.operation_status.modal_screen.a aVar2 = h3l.g.Companion;
        TextLocalisedClause title = new TextLocalisedClause(R$string.wealth_trade_post_onboarding_status_pending_title, null, null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trade_onboarding_status_pending_general_subtitle, null, null, 14);
        SuccessType.OptionalAction successType = new SuccessType.OptionalAction(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, true);
        k3l.a overlayAnimation = k3l.a.NONE;
        Intrinsics.checkNotNullParameter("ONBOARDING_SUCCESS_RESULT_ID", "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(successType, "successType");
        Intrinsics.checkNotNullParameter(overlayAnimation, "overlayAnimation");
        StatusViewContract$Duration.Long duration = StatusViewContract$Duration.Long.f59733a;
        Intrinsics.checkNotNullParameter(duration, "duration");
        return com.revolut.retail.operation_status.modal_screen.a.a(aVar2, new StatusViewConfiguration.Success("ONBOARDING_SUCCESS_RESULT_ID", title, textLocalisedClause, null, analyticsProduct3, null, true, successType, overlayAnimation, null, duration), new FinishCommand(null, null, null, 7), null, new FinishCommand(null, null, null, 7), null, 476);
    }
}
