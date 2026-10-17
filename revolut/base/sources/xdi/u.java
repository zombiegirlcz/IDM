package xdi;

import cli.y;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends oki.h implements m {

    @NotNull
    private static final o Companion = new o();
    public final RevPointsPocketOnboardingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ldi.f f304470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ffk.t f304471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f304472r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jgk.v f304473s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zdi.c f304474t;
    public final zdi.a u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f304475w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f304476x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f304477y;

    public u(cli.n stateMapper, RevPointsPocketOnboardingScreenContract$InputData inputData, ldi.f revPointsPocketInteractor, ffk.t pricingPlanInteractor, mre.c termsNavigationFactory, jgk.v planTermsNavigationFactory, zdi.c errorDialogFactory, zdi.a updateBreakdownDialogFactory, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(planTermsNavigationFactory, "planTermsNavigationFactory");
        Intrinsics.checkNotNullParameter(errorDialogFactory, "errorDialogFactory");
        Intrinsics.checkNotNullParameter(updateBreakdownDialogFactory, "updateBreakdownDialogFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = inputData;
        this.f304470p = revPointsPocketInteractor;
        this.f304471q = pricingPlanInteractor;
        this.f304472r = termsNavigationFactory;
        this.f304473s = planTermsNavigationFactory;
        this.f304474t = errorDialogFactory;
        this.u = updateBreakdownDialogFactory;
        this.v = bottomExpandableDialogControllerExtension;
        this.f304475w = new vii.b();
        this.f304476x = new vii.b();
        this.f304477y = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f304475w, new q(0, continuation, this)), null, new r(0, continuation, this), 3);
        yji.l.b1(this, vkm.q.Q(this.f304476x, new q(1, continuation, this)), null, new r(1, continuation, this), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f304477y;
    }
}
