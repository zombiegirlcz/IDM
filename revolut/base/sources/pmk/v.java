package pmk;

import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pfk.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends jki.g implements p {

    @NotNull
    private static final r Companion = new r();
    public final gte.a A;
    public final k B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffk.t f237634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final egk.e f237635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f237636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f237637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cha.b f237638t;
    public final sh3.a u;
    public final ajk.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vjk.a f237639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yjk.a f237640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wli.x f237641y;
    public final ajk.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(jki.p stateMapper, ffk.t pricingPlanInteractor, egk.e pricingPlansUiInteractor, j60.a bottomExpandableDialogControllerExtension, d planManagementDialogModelFactory, cha.b familyPlansInteractor, sh3.a checkoutInteractor, ajk.f pricingPlanNavigationCommandsProvider, vjk.a cancelFamilyExtraExtension, yjk.a cancelLegacyFamilyPlanExtension, wli.x deeplinkHandler, ajk.b outOfAppNavigationProvider, gte.a featureToggleInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(planManagementDialogModelFactory, "planManagementDialogModelFactory");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(cancelFamilyExtraExtension, "cancelFamilyExtraExtension");
        Intrinsics.checkNotNullParameter(cancelLegacyFamilyPlanExtension, "cancelLegacyFamilyPlanExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237634p = pricingPlanInteractor;
        this.f237635q = pricingPlansUiInteractor;
        this.f237636r = bottomExpandableDialogControllerExtension;
        this.f237637s = planManagementDialogModelFactory;
        this.f237638t = familyPlansInteractor;
        this.u = checkoutInteractor;
        this.v = pricingPlanNavigationCommandsProvider;
        this.f237639w = cancelFamilyExtraExtension;
        this.f237640x = cancelLegacyFamilyPlanExtension;
        this.f237641y = deeplinkHandler;
        this.z = outOfAppNavigationProvider;
        this.A = featureToggleInteractor;
        this.B = new k(0);
    }

    @Override // yji.l
    public final void I1() {
        ffk.t tVar = this.f237634p;
        efm.r rVarN = tVar.n();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(te0.w.l(rVarN, tVar.v(loadingStrategy))), null, null, new s(this, continuation, 1), 3);
        Flow flowH = xam.a.h(new s(this, continuation, 2), rd0.e.b(tVar.v(w4l.h.f294642c)));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(flowH, h0Var), null, null, new s(this, continuation, 3), 3);
        yji.l.a1(this, rd0.e.n(rd0.e.b(((wik.t) this.f237635q).d()), h0Var), null, null, new s(this, continuation, 4), 3);
        yji.l.a1(this, nim.a.y(rd0.e.n(((ffk.h) this.f237638t).g(), h0Var), new pmj.b(3)), null, null, new s(this, continuation, 5), 3);
        yji.l.a1(this, nim.a.A(rd0.e.n(rd0.e.b(sh3.a.c(this.u, zhm.u.c(pi3.s.PLAN), null, null, 6)), h0Var), new pmj.b(4)), null, null, new s(this, continuation, 6), 3);
        if (!((jte.d) this.A).c(PricingPlansApi$Toggles.MinimumBalance.f81002c)) {
            x2(new pmj.b(7));
            return;
        }
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p0 p0Var = (p0) tVar.f134850a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, nim.a.y(nim.a.v(rd0.e.n(p0Var.f.b(Unit.f186387a, loadingStrategy), h0Var), new pmj.b(5)), new pmj.b(6)), null, null, new s(this, continuation, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }
}
