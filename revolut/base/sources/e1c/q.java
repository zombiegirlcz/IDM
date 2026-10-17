package e1c;

import cli.y;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.rev_points.extensions.RevPointsTabAction;
import com.revolut.retail.core.navigation.FeatureCommand;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends oki.h implements l {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nyb.k f121959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f121960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f121961r;

    public q(cli.n stateMapper, t pricingPlanInteractor, nyb.k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.o = pricingPlanInteractor;
        this.f121959p = revPointsInteractor;
        this.f121960q = new vii.b();
        this.f121961r = mra.d.b(this, new j(0), stateMapper, null, false, 12);
    }

    public static FeatureCommand I2(RevPointsTabAction revPointsTabAction) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.e.f83420a, null), revPointsTabAction, null, 4)));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f121960q, new dz6.n(continuation, this, 2)), null, null, new e0b.c(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121961r;
    }
}
