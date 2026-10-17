package q0l;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptsScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ PartnerConsentPromptsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PartnerConsentPromptsScreen partnerConsentPromptsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = partnerConsentPromptsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = (c) this.v.f104260b0.getValue();
            this.u = 1;
            f fVar = (f) cVar;
            int i2 = e.f241303a[fVar.f241304p.ordinal()];
            if (i2 != 1 && i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType withTradingAccountType = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(TradingAccountType.Gia.f105270a);
            EndPromptParams endPromptParams = new EndPromptParams(true, EndPromptType.TRADING);
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            fVar.C1(new BridgeDestination(new FeatureCommand(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(finishCommand, withTradingAccountType, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)))));
            if (Unit.f186387a == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
