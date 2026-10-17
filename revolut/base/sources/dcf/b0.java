package dcf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.trading_add_ons.impl.navigation.deeplinks.AddOnsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6))), new FeatureCommand(new AddOnsFeatureConfig(0)));
            c1l.e eVar = i0Var.v;
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ufm.b bVarA = qxk.a.a(eVar, compositeCommandC, compositeCommandC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
            this.u = 1;
            objB = nim.a.b(bVarA, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB = obj2;
        }
        NaviCommand nextOnboardingCommand = (NaviCommand) objB;
        c1l.f fVar = i0Var.f112949x;
        Intrinsics.h(nextOnboardingCommand);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(nextOnboardingCommand, "nextOnboardingCommand");
        com.revolut.feature.blue_prompt.fullscreen.a aVar2 = ms2.g.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_onboarding_get_started_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_onboarding_get_started_subtitle, null, null, 14);
        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D070", null, null, null, 30));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        k9 k9Var2 = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        return i0Var.C1(new BridgeDestination(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar2, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, nextOnboardingCommand, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), 33291953)));
    }
}
