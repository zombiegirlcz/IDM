package m1e;

import ael.q0;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f201483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f201483w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f201483w, continuation, 0);
            default:
                return new j(this.f201483w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                l lVar = this.f201483w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = l.I2(lVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
                TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts withTradingAccountAndProducts = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts((TradingAccount) obj2, u.c(lVar.o.f88416b));
                EndPromptParams endPromptParams = new EndPromptParams(true, EndPromptType.STOCK_LENDING);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                lVar.C1(new BridgeDestination(new FeatureCommand(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommand, withTradingAccountAndProducts, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)))));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                l lVar2 = this.f201483w;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = l.I2(lVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return yji.l.a1(lVar2, lVar2.X1(new mii.k("STOCK_LENDING_DISABLED_SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_result_disabled, null, null, 14), null, null, null, 28)), null, null, new lpl.c(lVar2, continuation, 13), 3);
                    }
                    o.b(obj2);
                }
                ybl.k kVar = lVar2.f201485p;
                String string = ((TradingAccount) obj2).getF105262a().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TradingProductCode tradingProductCode = lVar2.o.f88416b;
                this.v = 2;
                if (((q0) kVar).q(string, tradingProductCode, this) == aVar2) {
                    return aVar2;
                }
                return yji.l.a1(lVar2, lVar2.X1(new mii.k("STOCK_LENDING_DISABLED_SUCCESS_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.wealth_stock_lending_rsuab_result_disabled, null, null, 14), null, null, null, 28)), null, null, new lpl.c(lVar2, continuation, 13), 3);
        }
    }
}
