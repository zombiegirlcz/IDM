package com.revolut.feature.donations.impl.ui.kompot.screen.charity.details;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.DonationsAvailabilityApi$Toggles;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreenContract$Step;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import cu8.r0;
import efm.d0;
import eub.i;
import go.g;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.f1;
import mra.d;
import nyb.i0;
import nyb.m0;
import nyb.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sa6.a0;
import sa6.e;
import sa6.p;
import sa6.t;
import skm.a2;
import t5e.j;
import t73.z2;
import tb6.c0;
import tb6.m;
import tb6.r;
import tb6.u;
import tb6.w;
import ufm.f;
import vkm.j2;
import y99.x;
import ya6.h0;
import ya6.z;
import yji.l;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements r {

    @NotNull
    public static final u Companion = new u();
    public final j60.a A;
    public final gte.a B;
    public final i0 C;
    public final i D;
    public final kb6.b E;
    public final m0 F;
    public a2 G;
    public a2 H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final y J;
    public final CharityDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aa6.c f72069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a31.a f72070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xua.a f72071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihf.a f72072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aa6.a f72073t;
    public final a0 u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c0 f72074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ua6.a f72075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tb6.b f72076y;
    public final r0 z;

    public c(n stateMapper, CharityDetailsScreenContract$InputData inputData, aa6.c donationsInteractor, a31.a donationsAvailabilityInteractor, xua.a recurringPaymentInteractor, ihf.a transactionStatisticsInteractor, aa6.a donationPocketsInteractor, a0 pendingDonationsInteractor, e campaignsInteractor, c0 transactionsItemProvider, ua6.a donationsNaviCommandsProvider, tb6.b charityDetailsDisclaimerProvider, r0 kycRequiredActionTransformer, j60.a bottomExpandableDialogControllerExtension, gte.a featureToggleInteractor, i0 revPointsProductEligibilityInteractor, i revPointsOptInInteractor, kb6.b donationResultHandlerExtensions, m0 revPointsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionStatisticsInteractor, "transactionStatisticsInteractor");
        Intrinsics.checkNotNullParameter(donationPocketsInteractor, "donationPocketsInteractor");
        Intrinsics.checkNotNullParameter(pendingDonationsInteractor, "pendingDonationsInteractor");
        Intrinsics.checkNotNullParameter(campaignsInteractor, "campaignsInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemProvider, "transactionsItemProvider");
        Intrinsics.checkNotNullParameter(donationsNaviCommandsProvider, "donationsNaviCommandsProvider");
        Intrinsics.checkNotNullParameter(charityDetailsDisclaimerProvider, "charityDetailsDisclaimerProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(donationResultHandlerExtensions, "donationResultHandlerExtensions");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        this.o = inputData;
        this.f72069p = donationsInteractor;
        this.f72070q = donationsAvailabilityInteractor;
        this.f72071r = recurringPaymentInteractor;
        this.f72072s = transactionStatisticsInteractor;
        this.f72073t = donationPocketsInteractor;
        this.u = pendingDonationsInteractor;
        this.v = campaignsInteractor;
        this.f72074w = transactionsItemProvider;
        this.f72075x = donationsNaviCommandsProvider;
        this.f72076y = charityDetailsDisclaimerProvider;
        this.z = kycRequiredActionTransformer;
        this.A = bottomExpandableDialogControllerExtension;
        this.B = featureToggleInteractor;
        this.C = revPointsProductEligibilityInteractor;
        this.D = revPointsOptInInteractor;
        this.E = donationResultHandlerExtensions;
        this.F = revPointsTransactionsInteractor;
        this.I = hx7.e.a(this, new ta8.a(this, 3));
        this.J = d.b(this, new m(0), stateMapper, null, false, 12);
    }

    public static efm.r K2(efm.r rVar) {
        efm.r rVarOnErrorResumeNext = rVar.map(new z2(new t9b.a(20), 25)).onErrorResumeNext(new z2(new t9b.a(21), 26));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        return rVarOnErrorResumeNext;
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarW;
        Flow gVar;
        a2 a2Var = this.G;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        CharityDetailsScreenContract$InputData charityDetailsScreenContract$InputData = this.o;
        String charityId = charityDetailsScreenContract$InputData.f72063a;
        String charityId2 = charityDetailsScreenContract$InputData.f72063a;
        c0 c0Var = this.f72074w;
        sa6.h hVar = c0Var.f269475b;
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        if (c0Var.e.f()) {
            rVarW = nim.a.w(pd.b.r(hVar.a(new CharityTransactionsParams(charityId, 12)), new tb6.a0(c0Var, 3)), new tb6.a0(c0Var, 1));
        } else {
            hVar.getClass();
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            efm.r rVarFlatMap = pd.b.r(((t) hVar.f261319a).b(charityId, false), new s78.d(hVar, 12)).flatMap(new z2(new tb6.a0(c0Var, 2), 27));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
            rVarW = nim.a.w(rVarFlatMap, new tb6.a0(c0Var, 0));
        }
        efm.r rVarDistinctUntilChanged = ue0.e.E(m70.a.g(zi0.c.o(rVarW), null, new j(27), 1), f0.f322471a).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        this.G = l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new w(this, continuation, 0), 3);
        aa6.c cVar = this.f72069p;
        t tVar = (t) cVar;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(charityId2, "charityId");
        l.a1(this, rd0.e.b(pd.b.r(mo3.a.n(((z) tVar.f261345a).a(charityId2, false)), new p(tVar, 0))), null, null, new w(this, continuation, 2), 3);
        boolean zC = ((jte.d) this.B).c(DonationsAvailabilityApi$Toggles.DonationsRecurringTransfer.f71964c);
        a31.a aVar = this.f72070q;
        l.a1(this, xam.a.h(new rf9.h(this, continuation, 6), zC ? new ae8.c(bla.b.b((jla.h) aVar.f955b, y96.d.f311754c.a()), 29) : new g(new Data(Boolean.TRUE, null, false, 6, null), 2)), null, null, new w(this, continuation, 3), 3);
        iff.d dVar = (iff.d) this.f72072s;
        ihm.b bVar = dVar.f161014a.f161008a;
        dj0.d.Companion.getClass();
        d0 d0VarFirst = bVar.first(dj0.d.d);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        icc.c cVar2 = new icc.c(new iff.b(dVar, 0), 25);
        d0VarFirst.getClass();
        f fVar = new f(new ufm.i(d0VarFirst, cVar2, 0), new icc.c(new iff.b(dVar, 1), 26), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        efm.r rVarX = fVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        l.a1(this, rd0.e.b(K2(rVarX)), null, null, new w(this, continuation, 4), 3);
        l.a1(this, rd0.e.b(K2(((sa6.j) this.f72073t).b())), null, null, new w(this, continuation, 5), 3);
        l.a1(this, rd0.e.b(nim.a.w(aa6.c.a(cVar, false), new tb6.t(this, 0))), null, null, new w(this, continuation, 6), 3);
        efm.r rVarDistinctUntilChanged2 = m70.a.g(nim.a.w(hng.g.b(((ang.b) this.f72076y.f269471a).f7765a), new t9b.a(15)), null, new j(25), 1).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        l.a1(this, rd0.e.b(rVarDistinctUntilChanged2), null, null, new w(this, continuation, 7), 3);
        a0 a0Var = this.u;
        h0 h0Var = (h0) a0Var.f261299a;
        h0Var.getClass();
        ufm.c cVar3 = new ufm.c(new s2i.i(h0Var, 21), 2);
        Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
        efm.r rVarX2 = new ufm.i(te0.w.i0(cVar3), new sa6.a(new s78.d(a0Var, 16), 14), 0).x();
        xe0.e eVar = h0Var.f311970a;
        Type PENDING_DONATIONS_TYPE = h0.f311969b;
        Intrinsics.checkNotNullExpressionValue(PENDING_DONATIONS_TYPE, "PENDING_DONATIONS_TYPE");
        efm.r map = rd0.e.c(eVar.C0("STORAGE_KEY_PENDING_DONATIONS", PENDING_DONATIONS_TYPE), kotlin.coroutines.g.f186406a).map(new ya6.f(new x(17), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = rVarX2.mergeWith(map.skip(1L)).map(new sa6.a(new sa6.y(2), 15));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        l.a1(this, rd0.e.b(map2), null, null, new w(this, continuation, 8), 3);
        e eVar2 = this.v;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(charityId2, "charityId");
        ya6.d dVar2 = eVar2.f261312a;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(charityId2, "charityId");
        w4l.f fVar2 = dVar2.d;
        w4l.h hVar2 = w4l.h.f294642c;
        l.a1(this, rd0.e.b(fVar2.e(charityId2, hVar2)), null, null, new w(this, continuation, 9), 3);
        if (aVar.f()) {
            vkm.d dVarB = rd0.e.b(((o) this.D).f(false));
            f1 product = f1.DONATIONS;
            i0 i0Var = this.C;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            lxb.f fVar3 = i0Var.f220799b;
            fVar3.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            gVar = nim.a.A(nim.a.v(u0.m(dVarB, rd0.e.b(fVar3.d.e(product, hVar2))), new t9b.a(22)), new t9b.a(23));
        } else {
            gVar = new g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        l.a1(this, gVar, null, null, new w(this, continuation, 10), 3);
        l.a1(this, new sa6.o(bla.b.b((jla.h) aVar.f955b, y96.e.f311755c.a()), 0), null, null, new w(this, continuation, 1), 3);
    }

    public final void I2() {
        qua.p pVar;
        List list = (List) ((m) ((j2) this.J.f22677a).getValue()).f269481b.getContent();
        String str = (list == null || (pVar = (qua.p) zhm.d0.d0(list)) == null) ? null : pVar.f249314a.f160150a;
        if (str != null) {
            C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(str, false, null, 6))));
        } else {
            C2(new tb6.p(this.o.f72063a));
        }
    }

    public final void J2() {
        y yVar = this.J;
        ba6.l lVar = (ba6.l) ((m) ((j2) yVar.f22677a).getValue()).f269480a.getContent();
        if (lVar != null) {
            String str = lVar.f13938a;
            od0.i iVar = (od0.i) ((m) ((j2) yVar.f22677a).getValue()).f269482c.getContent();
            h.v2(this.I, new CharityDetailsScreenContract$Step.SpareChange(str, iVar != null ? (yvh.b) iVar.f224257a : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(((t) this.f72069p).b(this.o.f72063a, true)), null, new b(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.J;
    }
}
