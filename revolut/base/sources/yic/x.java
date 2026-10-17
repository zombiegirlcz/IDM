package yic;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends oki.h implements r {

    @NotNull
    public static final t Companion = new t();
    public final bgc.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final utk.f f314300p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vgc.p f314301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ffk.t f314302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tga.k f314303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i7d.o f314304t;
    public final vii.b u;
    public final y v;

    public x(bgc.d rentAndBillsInteractor, utk.f nextPaymentInteractor, vgc.p rentAndBillsRevPointsInteractor, ffk.t pricingPlanInteractor, tga.k pricingPlanUpgradeEntryPointItemProvider, i7d.o helpWidgetControllerModelExtension, tyc.l stateMapper) {
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(nextPaymentInteractor, "nextPaymentInteractor");
        Intrinsics.checkNotNullParameter(rentAndBillsRevPointsInteractor, "rentAndBillsRevPointsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = rentAndBillsInteractor;
        this.f314300p = nextPaymentInteractor;
        this.f314301q = rentAndBillsRevPointsInteractor;
        this.f314302r = pricingPlanInteractor;
        this.f314303s = pricingPlanUpgradeEntryPointItemProvider;
        this.f314304t = helpWidgetControllerModelExtension;
        this.u = new vii.b();
        this.v = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        v vVar = new v(1, continuation, this);
        vii.b bVar = this.u;
        wkm.l lVarQ = vkm.q.Q(bVar, vVar);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new u(2, null, this), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(bVar, new v(2, continuation, this)), h0Var), null, null, new u(4, null, this), 3);
        vgc.e eVar = (vgc.e) this.o;
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, boh.f.e(vkm.q.q(rd0.e.b(eVar.f288821b.v(loadingStrategy))), new v73.c(eVar, loadingStrategy, 23)), null, null, new u(0, null, this), 3);
        ffk.t tVar = this.f314302r;
        yji.l.a1(this, rd0.e.b(tVar.q()), null, null, new u(7, null, this), 3);
        yji.l.a1(this, rd0.e.b(tVar.x()), null, null, new u(5, null, this), 3);
        yji.l.a1(this, vkm.q.Q(new t0(this.v.B(new yi5.b(5)), 1), new v(0, continuation, this)), null, null, new u(1, null, this), 3);
        yji.l.a1(this, this.f314300p.e(), null, null, new u(3, null, this), 3);
        yji.l.a1(this, mo3.a.g(this.f314303s.d(mga.u.f205220a), null, new yd8.a(13), 1), null, null, new u(6, null, this), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.u.a();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
