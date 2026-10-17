package com.revolut.feature.rev_points.impl.ui.earn;

import a08.p0;
import akd.s;
import al4.p;
import cli.n;
import cli.y;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$PendingAction;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import ffk.t;
import gld.f0;
import h4g.g;
import hzb.j0;
import hzb.u;
import hzb.w;
import hzb.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ldi.f;
import mjf.b0;
import mkd.d;
import nyb.i;
import nyb.i0;
import nyb.j;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p8g.c;
import q06.l;
import rul.e;
import tof.i1;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements u {

    @NotNull
    private static final w Companion = new w();
    public final eub.a A;
    public final j B;
    public final c C;
    public final hyf.a D;
    public final g E;
    public final eub.h F;
    public final f G;
    public final wub.a H;
    public final qub.a I;
    public final kcc.a J;
    public final com.revolut.domain.interactors.transactions.a K;
    public final i4b.f L;
    public final ang.f M;
    public final p19.a N;
    public final gte.a O;
    public final p P;
    public final vii.b Q;
    public final ifm.b R;
    public final y S;
    public final RevPointsEarnScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ozb.f f83799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f83800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f83801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nyb.c f83802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f83803t;
    public final e u;
    public final ztb.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hzb.a f83804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f83805x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f83806y;
    public final o1c.a z;

    public b(n stateMapper, RevPointsEarnScreenContract$InputData inputData, ozb.f learnCompletedDialogMapper, k revPointsInteractor, t pricingPlanInteractor, nyb.c revPointsBenefitsInteractor, i0 revPointsProductEligibilityInteractor, e revPointsSpareChangeInteractor, ztb.a revPointsEarningRatesExtension, hzb.a revPointsEarnRouter, l deeplinkRouter, d slotManagerFeedControllerModelExtension, o1c.a revPointsSpareChangeResultDialogExtension, eub.a revPointsAvailabilityInteractor, j revPointsEarningRatesInteractor, c travelHotelsFeatureInteractor, hyf.a travelExperiencesFeatureInteractor, g shopsFeatureAvailabilityInteractor, eub.h revPointsEarnUpsellBannerInteractor, f revPointsPocketInteractor, wub.a revPointsBuyingFeatureInteractor, qub.a revPointsBuyingInteractor, kcc.a promotedMerchantsAvailabilityInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, i4b.f legalEntityContextProvider, ang.f userInteractor, p19.a lifestyleContentGatewayInteractor, gte.a featureToggleInteractor, p creditCardProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(learnCompletedDialogMapper, "learnCompletedDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsBenefitsInteractor, "revPointsBenefitsInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesExtension, "revPointsEarningRatesExtension");
        Intrinsics.checkNotNullParameter(revPointsEarnRouter, "revPointsEarnRouter");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeResultDialogExtension, "revPointsSpareChangeResultDialogExtension");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarnUpsellBannerInteractor, "revPointsEarnUpsellBannerInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingInteractor, "revPointsBuyingInteractor");
        Intrinsics.checkNotNullParameter(promotedMerchantsAvailabilityInteractor, "promotedMerchantsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewayInteractor, "lifestyleContentGatewayInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        this.o = inputData;
        this.f83799p = learnCompletedDialogMapper;
        this.f83800q = revPointsInteractor;
        this.f83801r = pricingPlanInteractor;
        this.f83802s = revPointsBenefitsInteractor;
        this.f83803t = revPointsProductEligibilityInteractor;
        this.u = revPointsSpareChangeInteractor;
        this.v = revPointsEarningRatesExtension;
        this.f83804w = revPointsEarnRouter;
        this.f83805x = deeplinkRouter;
        this.f83806y = slotManagerFeedControllerModelExtension;
        this.z = revPointsSpareChangeResultDialogExtension;
        this.A = revPointsAvailabilityInteractor;
        this.B = revPointsEarningRatesInteractor;
        this.C = travelHotelsFeatureInteractor;
        this.D = travelExperiencesFeatureInteractor;
        this.E = shopsFeatureAvailabilityInteractor;
        this.F = revPointsEarnUpsellBannerInteractor;
        this.G = revPointsPocketInteractor;
        this.H = revPointsBuyingFeatureInteractor;
        this.I = revPointsBuyingInteractor;
        this.J = promotedMerchantsAvailabilityInteractor;
        this.K = transactionsInteractor;
        this.L = legalEntityContextProvider;
        this.M = userInteractor;
        this.N = lifestyleContentGatewayInteractor;
        this.O = featureToggleInteractor;
        this.P = creditCardProductFeatureTogglesInteractor;
        this.Q = new vii.b();
        this.R = new ifm.b();
        this.S = mra.d.b(this, new hzb.t(0), stateMapper, null, false, 12);
    }

    public static final void I2(b bVar, boolean z) {
        if (!z) {
            bVar.getClass();
            return;
        }
        bVar.Q.a();
        pfm.a aVar = new pfm.a(ue0.e.v(((b0) bVar.K).g(i1.f272794a)), new fn2.c(new h2i.b(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new p0(18, j0.f157116a), hzb.i0.f157113a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        bVar.R.a(hVarW);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (!this.f226127l) {
            RevPointsEarnScreenContract$InputData revPointsEarnScreenContract$InputData = this.o;
            if (revPointsEarnScreenContract$InputData.f83791a) {
                ((ozb.g) this.f83799p).getClass();
                X1(new mii.k("LEARN_COMPLETED_ID", new TextLocalisedClause(R$string.rev_points_learn_completed, null, null, 14), null, null, null, 28));
            }
            RevPointsEarnScreenContract$PendingAction revPointsEarnScreenContract$PendingAction = revPointsEarnScreenContract$InputData.f83792b;
            if (!Intrinsics.f(revPointsEarnScreenContract$PendingAction, RevPointsEarnScreenContract$PendingAction.None.f83793a)) {
                l2(new a(this, revPointsEarnScreenContract$PendingAction, null), new yi5.b(26));
            }
        }
        x xVar = new x(5, this, continuation);
        vii.b bVar = this.Q;
        yji.l.a1(this, q.Q(bVar, xVar), null, null, new hzb.y(5, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(4, this, continuation)), null, null, new hzb.y(4, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(6, this, continuation)), null, null, new hzb.y(7, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(9, this, continuation)), null, null, new hzb.y(10, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(11, this, continuation)), null, null, new hzb.y(12, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(2, this, continuation)), null, null, new hzb.y(2, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(10, this, continuation)), null, null, new hzb.y(11, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(3, this, continuation)), null, null, new hzb.y(3, this, continuation), 3);
        i iVar = (i) this.F;
        yji.l.a1(this, q.Q(iVar.f220797c.C0("REV_POINTS_UPSELL_UPGRADE_BANNER_COOL_DOWN_TIME_ID", Long.TYPE), new ns9.h(continuation, iVar, 8)), null, null, new hzb.y(15, this, continuation), 3);
        if (this.H.b()) {
            yji.l.a1(this, q.Q(bVar, new x(7, this, continuation)), null, null, new hzb.y(8, this, continuation), 3);
        } else {
            H2(this.S, new hy2.k(18));
        }
        yji.l.a1(this, q.Q(bVar, new x(0, this, continuation)), null, null, new hzb.y(0, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(13, this, continuation)), null, null, new hzb.y(16, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new x(1, this, continuation)), null, null, new hzb.y(1, this, continuation), 3);
    }

    public final void J2(RevPointsSpareChangeControllerApi$Result revPointsSpareChangeControllerApi$Result) {
        if ((revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Activated) || (revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Updated) || (revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Deactivated)) {
            l2(new hy2.e(this, null, 3), new yi5.b(26));
        } else if (!(revPointsSpareChangeControllerApi$Result instanceof RevPointsSpareChangeControllerApi$Result.Skipped)) {
            throw new NoWhenBranchMatchedException();
        }
        ((x1c.a) this.z).Z2(revPointsSpareChangeControllerApi$Result);
    }

    @Override // yji.l
    public final void O1() {
        this.R.d();
    }

    @Override // yji.l
    public final void T1(long j2) {
        mkd.a aVar = new mkd.a(new SlotContext(s.REVPOINTS_EARN_HUB));
        f0 f0Var = (f0) this.f83806y;
        f0Var.c3(aVar);
        Continuation continuation = null;
        yji.l.b1(this, f0Var.f144638l.h(), null, new hzb.y(13, this, continuation), 3);
        x xVar = new x(8, this, continuation);
        vii.b bVar = this.Q;
        yji.l.b1(this, q.Q(bVar, xVar), null, new hzb.y(9, this, continuation), 3);
        if (((jte.d) this.O).c(RevPointsApi$Toggles.RevPointsEarnHubTopBrands.f83465c)) {
            yji.l.b1(this, q.Q(bVar, new x(12, this, continuation)), null, new hzb.y(14, this, continuation), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.S;
    }
}
