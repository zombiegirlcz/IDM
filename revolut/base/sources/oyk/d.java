package oyk;

import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FullScreenPromptScreen f231052b;

    public /* synthetic */ d(FullScreenPromptScreen fullScreenPromptScreen, int i) {
        this.f231051a = i;
        this.f231052b = fullScreenPromptScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        com.revolut.feature.full_screen_prompt.c it8 = (com.revolut.feature.full_screen_prompt.c) obj2;
        switch (this.f231051a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                knm.b.j(this.f231052b, new BridgeDestination((Intrinsics.f(it8, c.C0497c.f74506a) || (it8 instanceof c.a)) ? new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6))) : new FinishCommand(null, null, null, 7)));
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f231052b.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
