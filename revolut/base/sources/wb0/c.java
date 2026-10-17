package wb0;

import com.revolut.feature.backend_flow.domain.models.StoriesScreen;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import in0.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends h implements a, g {

    @NotNull
    private static final b Companion = new b();
    public final /* synthetic */ g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StoriesScreen f295989p;

    public c(StoriesScreen screen, g screenCapturingProtection) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(screenCapturingProtection, "screenCapturingProtection");
        this.o = screenCapturingProtection;
        this.f295989p = screen;
    }

    @Override // yji.l
    public final void I1() {
        StoriesScreen storiesScreen = this.f295989p;
        C1(new BridgeDestination(new FeatureCommand(new RemoteStoriesFeatureConfig.Id(storiesScreen.d, new RemoteStoryModelParams(null, null, storiesScreen.f63664b, 13), this.o.p0(), 1373254820))));
    }

    @Override // in0.g
    public final boolean p0() {
        return this.o.p0();
    }
}
