package fmc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import grl.k9;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.robo.impl.navigation.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f136334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f136335x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.robo.impl.navigation.c cVar, boolean z, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f136334w = z;
        this.f136335x = z3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f136334w, this.f136335x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object next;
        Object next2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.robo.impl.navigation.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            objB = com.revolut.feature.robo.impl.navigation.c.b(cVar, this);
            if (objB != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        objB = obj2;
        TradingAccount tradingAccount = (TradingAccount) objB;
        boolean z = false;
        boolean z3 = this.f136334w;
        boolean z4 = z3 && !this.f136335x;
        FeatureCommand featureCommandA = z3 ? jbb.a.a(ibb.c.f160141b, null, null, null, 14) : null;
        Iterator it8 = tradingAccount.J().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (zhm.v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.CREATED, com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE).contains(((TradingAccount.Portfolio) next).f105211b)) {
                break;
            }
        }
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
        if (portfolio == null) {
            throw new IllegalStateException("No portfolio to onboard");
        }
        TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount withTradingAccount = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount);
        NaviCommand naviCommandA = z4 ? jbb.a.a(ibb.c.f160141b, null, null, null, 14) : null;
        if (naviCommandA == null) {
            naviCommandA = DummyCommand.f98635a;
        }
        String string = tradingAccount.getF105262a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = portfolio.f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        CompositeCommand compositeCommand = new CompositeCommand(zhm.v.k(naviCommandA, new FeatureCommand(new RoboFeatureConfig.Onboarding(string, string2, featureCommandA))));
        Iterator it9 = tradingAccount.c0().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next2)) {
                break;
            }
        }
        TradingProduct tradingProduct = (TradingProduct) next2;
        if (Intrinsics.f(tradingProduct != null ? tradingProduct.f105281b : null, TradingProductCode.RoboGB.f105333a) && ((jte.d) cVar.f85100c).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
            z = true;
        }
        EndPromptParams endPromptParams = new EndPromptParams(!z, EndPromptType.ROBO);
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        FeatureCommand featureCommand = new FeatureCommand(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(compositeCommand, withTradingAccount, null, endPromptParams, new AnalyticsProduct.Retail(value)));
        this.u = 2;
        Object objC = com.revolut.feature.robo.impl.navigation.c.c(cVar, featureCommand, this);
        return objC == aVar ? aVar : objC;
    }
}
