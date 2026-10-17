package raf;

import aii.u;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import grl.k9;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r7i.r;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f252833w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TradingOnboardingFeatureConfig.TradingAccountOrType f252834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType, Continuation continuation) {
        super(1, continuation);
        this.f252833w = nVar;
        this.f252834x = tradingAccountOrType;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f252833w, this.f252834x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVar2 = this.f252833w;
            c1l.e eVar = nVar2.f252838p;
            k9 value = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            EndPromptParams endPromptParams = new EndPromptParams(true, EndPromptType.TRADING);
            AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
            DummyCommand dummyCommand = DummyCommand.f98635a;
            ufm.i iVar = new ufm.i(ue0.e.t(eVar.b(dummyCommand, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(dummyCommand, this.f252834x, null, endPromptParams, retail), null), y0.b(new Pair("NewTransferAccountSelectorScreenModel", "launchOnboardingForAccount"))), new r83.d(22, new r(18)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.u = nVar2;
            this.v = 1;
            Object objB = nim.a.b(iVar, this);
            if (objB == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return nVar.C1((u) obj2);
    }
}
