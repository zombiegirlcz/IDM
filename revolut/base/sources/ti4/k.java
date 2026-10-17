package ti4;

import cli.n;
import cli.y;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements dli.b {
    public final y o;

    public k(n stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event, f.f271417a)) {
            C2(i.f271419a);
        } else if (Intrinsics.f(event, e.f271416a)) {
            B2();
        } else {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(((g) event).f271418a, null, 0, false, true, true, 65438))));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
