package d2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends oki.h implements v {
    public final TravelExperiencesDestinationDiscoveryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1g.l f110827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mub.b f110828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f110829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f110830s;

    public y(cli.n stateMapper, TravelExperiencesDestinationDiscoveryScreenContract$InputData inputData, c1g.l destinationDiscoveryInteractor, mub.b revPointsPillControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destinationDiscoveryInteractor, "destinationDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        this.o = inputData;
        this.f110827p = destinationDiscoveryInteractor;
        this.f110828q = revPointsPillControllerModelExtension;
        this.f110829r = new vii.b();
        this.f110830s = mra.d.b(this, new k(inputData.f93063b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f110829r, new cvi.i(continuation, this, 5)), null, null, new x(this, null), 3);
        yji.l.a1(this, rd0.e.b(((lzb.a) this.f110828q).Z2()), null, null, new cvi.j(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110830s;
    }
}
