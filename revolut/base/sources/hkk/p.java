package hkk;

import cli.y;
import com.revolut.data.model.Data;
import jgk.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends oki.h implements h {
    public final egk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final si7.a f152957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f152958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f152959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q06.l f152960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ajk.b f152961t;
    public final vii.b u;
    public final y v;

    public p(egk.a familyPlansUiInteractor, si7.a insuranceInteractor, mre.c termsNavigationFactory, v pricingPlanTermsNavigationCommandsProvider, q06.l deeplinkRouter, ajk.b outOfAppNavigationProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(familyPlansUiInteractor, "familyPlansUiInteractor");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(pricingPlanTermsNavigationCommandsProvider, "pricingPlanTermsNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = familyPlansUiInteractor;
        this.f152957p = insuranceInteractor;
        this.f152958q = termsNavigationFactory;
        this.f152959r = pricingPlanTermsNavigationCommandsProvider;
        this.f152960s = deeplinkRouter;
        this.f152961t = outOfAppNavigationProvider;
        this.u = new vii.b();
        this.v = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        m mVar = new m(0, this, continuation);
        vii.b bVar = this.u;
        yji.l.a1(this, vkm.q.Q(bVar, mVar), null, null, new n(0, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new m(1, this, continuation)), null, null, new n(1, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
