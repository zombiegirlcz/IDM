package f67;

import aii.u;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.navigation.PromptMarketingRetailBridgeDestination;
import com.revolut.feature.full_screen_prompt.navigation.PromptRetailBridgeDestination;
import dki.g;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f132406a = 0;

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PromptRetailBridgeDestination) {
            return c.b(new FullScreenPromptScreen((d67.g) ((PromptRetailBridgeDestination) destination).f98300a), new ask.a(1));
        }
        if (destination instanceof PromptMarketingRetailBridgeDestination) {
            return c.b(new PromptMarketingScreen((PromptMarketingScreenContract$InputData) ((PromptMarketingRetailBridgeDestination) destination).f98300a), new ask.a(2));
        }
        return null;
    }
}
