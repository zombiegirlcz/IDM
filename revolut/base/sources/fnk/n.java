package fnk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements i {
    public final PlanPreviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f136711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f136712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f136713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f136714s;

    public n(PlanPreviewScreenContract$InputData inputData, ang.f userInteractor, x deeplinkHandler, cli.n stateMapper, t pricingPlansInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        this.o = inputData;
        this.f136711p = userInteractor;
        this.f136712q = pricingPlansInteractor;
        this.f136713r = new vii.b();
        this.f136714s = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l lVar = new l(1, this, continuation);
        vii.b bVar = this.f136713r;
        yji.l.a1(this, vkm.q.Q(bVar, lVar), null, null, new m(1, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new l(0, this, continuation)), null, null, new m(0, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f136714s;
    }
}
