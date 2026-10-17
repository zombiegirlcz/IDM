package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout;

import ax9.o;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsCheckoutParams;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payment_options.api.PaymentOptionsFeatureConfig;
import efm.r;
import ffk.t;
import hng.g;
import i4b.f;
import i9g.b0;
import i9g.l;
import i9g.n;
import i9g.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jgk.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import md6.p;
import mra.d;
import mre.c;
import oki.h;
import rfm.m;
import txf.j;
import vii.b;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vvc.s;
import wbg.e;
import wbg.g0;
import wbg.j0;
import wbg.l0;
import wbg.s0;
import wbg.v0;
import wbg.w0;
import wbg.y0;
import wbg.z0;
import zhm.h0;
import zhm.w;
import zjh.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements s0 {
    public final t A;
    public final v B;
    public final c C;
    public final l61.a D;
    public final k0c.a E;
    public final b0 F;
    public final odg.a G;
    public final f H;
    public final a6c.f I;
    public final i J;
    public final fcg.f K;
    public final wbg.c L;
    public String M;
    public final b N;
    public final y O;
    public final com.revolut.kompot.navigable.vc.modal.a P;
    public final TravelHotelsCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i90.b f93904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f93905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pre.c f93906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p8g.c f93907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f93908t;
    public final eub.i u;
    public final p8g.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f93909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final akm.c f93910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n0 f93911y;
    public final i9g.y z;

    public a(cli.n stateMapper, TravelHotelsCheckoutScreenContract$InputData inputData, i90.b uuidUtils, l draftInteractor, pre.c termsInteractor, p8g.c travelHotelsFeatureInteractor, n travelBookingInteractor, eub.i revPointsOptInInteractor, p8g.b dropoffSearchInteractor, e pricingCalculator, akm.c revPointsCheckoutDefaultsMapper, n0 travellerInfoProvider, i9g.y travelHotelsInventoryProviderInteractor, t pricingPlanInteractor, v planTermsNavigationFactory, c termsNavigationFactory, l61.a userCompanyInteractor, k0c.a revPointsTermsReviewFlowProvider, b0 travelHotelsPropertyInteractor, odg.a cashbackBadgeControllerExtension, f legalEntityContextProvider, a6c.f revolutPayCheckoutExtension, i travelDocumentInteractor, fcg.f cardOrderDestinationProvider, wbg.c checkoutErrorHandlerControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(travelBookingInteractor, "travelBookingInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(dropoffSearchInteractor, "dropoffSearchInteractor");
        Intrinsics.checkNotNullParameter(pricingCalculator, "pricingCalculator");
        Intrinsics.checkNotNullParameter(revPointsCheckoutDefaultsMapper, "revPointsCheckoutDefaultsMapper");
        Intrinsics.checkNotNullParameter(travellerInfoProvider, "travellerInfoProvider");
        Intrinsics.checkNotNullParameter(travelHotelsInventoryProviderInteractor, "travelHotelsInventoryProviderInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planTermsNavigationFactory, "planTermsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(revPointsTermsReviewFlowProvider, "revPointsTermsReviewFlowProvider");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(cashbackBadgeControllerExtension, "cashbackBadgeControllerExtension");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(revolutPayCheckoutExtension, "revolutPayCheckoutExtension");
        Intrinsics.checkNotNullParameter(travelDocumentInteractor, "travelDocumentInteractor");
        Intrinsics.checkNotNullParameter(cardOrderDestinationProvider, "cardOrderDestinationProvider");
        Intrinsics.checkNotNullParameter(checkoutErrorHandlerControllerExtension, "checkoutErrorHandlerControllerExtension");
        this.o = inputData;
        this.f93904p = uuidUtils;
        this.f93905q = draftInteractor;
        this.f93906r = termsInteractor;
        this.f93907s = travelHotelsFeatureInteractor;
        this.f93908t = travelBookingInteractor;
        this.u = revPointsOptInInteractor;
        this.v = dropoffSearchInteractor;
        this.f93909w = pricingCalculator;
        this.f93910x = revPointsCheckoutDefaultsMapper;
        this.f93911y = travellerInfoProvider;
        this.z = travelHotelsInventoryProviderInteractor;
        this.A = pricingPlanInteractor;
        this.B = planTermsNavigationFactory;
        this.C = termsNavigationFactory;
        this.D = userCompanyInteractor;
        this.E = revPointsTermsReviewFlowProvider;
        this.F = travelHotelsPropertyInteractor;
        this.G = cashbackBadgeControllerExtension;
        this.H = legalEntityContextProvider;
        this.I = revolutPayCheckoutExtension;
        this.J = travelDocumentInteractor;
        this.K = cardOrderDestinationProvider;
        this.L = checkoutErrorHandlerControllerExtension;
        this.N = new b();
        this.O = d.b(this, new g0(0), stateMapper, null, false, 12);
        this.P = hx7.e.a(this, new s(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a r38, afi.a r39, ecg.j r40, com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption r41, gim.c r42) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a, afi.a, ecg.j, com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        r map;
        this.M = wp5.y.u(this.f93904p, "toString(...)");
        i9g.v vVar = (i9g.v) this.f93907s;
        boolean zC = vVar.c();
        TravelHotelsCheckoutScreenContract$InputData travelHotelsCheckoutScreenContract$InputData = this.o;
        l lVar = this.f93905q;
        if (zC) {
            TravelHotelsCheckoutParams travelHotelsCheckoutParams = travelHotelsCheckoutScreenContract$InputData.f93895a;
            map = ue0.e.p(lVar.c(travelHotelsCheckoutParams.f93650a, travelHotelsCheckoutParams.f93651b, travelHotelsCheckoutParams.f93652c, travelHotelsCheckoutParams.d, travelHotelsCheckoutParams.e, travelHotelsCheckoutParams.f), h0.f322473a);
        } else {
            String draftId = travelHotelsCheckoutScreenContract$InputData.f93895a.f93650a;
            lVar.getClass();
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            fag.r rVar = lVar.f159811a;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(draftId, "draftId");
            r rVarMergeWith = new m(rVar.b(draftId), new f9g.h(new f7l.c(11), 14), 1).n().mergeWith(rVar.f133367b.filter(new f9g.h(new f9g.l(draftId, 4), 15)).map(new f9g.h(new f7l.c(12), 11)));
            Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
            map = rVarMergeWith.map(new w4l.c(new w6h.f(24), 18));
            Intrinsics.h(map);
        }
        w6h.f fVar = new w6h.f(22);
        h0 h0Var = h0.f322473a;
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(ue0.e.H(map, h0Var, fVar)), null, null, new w0(this, continuation, 2), 3);
        wbg.s sVar = (wbg.s) this.f93909w;
        yji.l.a1(this, rd0.e.n(xam.a.h(new wbg.i(sVar, continuation, 1), new q0(q.q(new v0b.b(new o(yh5.b.d(sVar.f, sVar.f296200g), 19), sVar, 19)), new wbg.i(sVar, continuation, 0), 1)), h0Var), null, null, new w0(this, continuation, 3), 3);
        yji.l.a1(this, rd0.e.n(nim.a.v(nim.a.v(new v0b.b(new o(yh5.b.d(sVar.f, sVar.f296200g), 19), sVar, 19), wbg.m.f), new w6h.f(23)), h0Var), null, null, new w0(this, continuation, 4), 3);
        yji.l.a1(this, rd0.e.b(ue0.e.p(g.b(((ang.b) this.D).f7765a), h0Var)), null, null, new w0(this, continuation, 5), 3);
        yji.l.a1(this, q.h(sVar.f296202j), null, null, new w0(this, continuation, 6), 3);
        l2(new y0(this, continuation, 1), new yi5.b(26));
        if (vVar.b()) {
            yji.l.a1(this, rd0.e.n(q.q(q.Q(this.N, new w2a.q(continuation, this, 10))), h0Var), null, null, new w0(this, continuation, 1), 3);
        }
        yji.l.a1(this, this.H.j(new md6.q(p.STAYS, false)), null, null, new w0(this, continuation, 0), 3);
        fxf.b product = fxf.b.STAYS;
        gxf.b type = gxf.b.PRIVACY_POLICY;
        i iVar = this.J;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(type, "type");
        j jVar = (j) iVar.f322838b;
        txf.f params = new txf.f(product, type);
        jVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        yji.l.a1(this, rd0.e.n(rd0.e.b(jVar.d.e(params, w4l.h.f294642c)), h0Var), null, null, new w0(this, continuation, 7), 3);
    }

    public final void J2() {
        Object next;
        Points points;
        y yVar = this.O;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        afi.a aVar = (afi.a) ((g0) j2Var.getValue()).f296168a.getContent();
        if (aVar != null) {
            List list = aVar.f;
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((BedOptionSelection) it8.next()).f98090a.f98106c.f98114c);
            }
            cgi.e eVarP = pyd.c.P(list);
            int i = aVar.f4106l;
            HotelsPointsRedeemOption hotelsPointsRedeemOption = ((g0) j2Var2.getValue()).f296169b;
            if (hotelsPointsRedeemOption != null) {
                Intrinsics.checkNotNullParameter(hotelsPointsRedeemOption, "<this>");
                points = new Points(hotelsPointsRedeemOption.d, hotelsPointsRedeemOption.f97977c);
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    RevPoints revPoints = ((BedOptionSelection) it9.next()).f98090a.f98106c.f98114c.f98069g;
                    if (revPoints != null) {
                        arrayList2.add(revPoints);
                    }
                }
                Iterator it10 = arrayList2.iterator();
                if (it10.hasNext()) {
                    next = it10.next();
                    while (it10.hasNext()) {
                        next = ((RevPoints) next).z((RevPoints) it10.next());
                    }
                } else {
                    next = null;
                }
                points = new Points((RevPoints) next, null);
            }
            Points points2 = points;
            Object content = ((g0) j2Var2.getValue()).e.getContent();
            ecg.g gVar = content instanceof ecg.g ? (ecg.g) content : null;
            PaymentMethod.Pocket pocket = gVar != null ? gVar.f124732a : null;
            l71.d dVar = (l71.d) ((g0) j2Var2.getValue()).f296173j.getContent();
            C2(new j0(new TravelHotelsPriceBreakdownScreenContract$InputData(arrayList, eVarP, i, points2, pocket, hb9.b.C(dVar != null ? dVar.a() : null), aVar.f4101b.u)));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.P;
    }

    public final void K2() {
        boolean z;
        y yVar = this.O;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (Intrinsics.f(((g0) j2Var.getValue()).f296172h, Boolean.FALSE)) {
            C2(new l0(this.o.f93895a.f93650a));
            return;
        }
        Data data = (Data) ((g0) j2Var2.getValue()).k.f224257a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.P;
        if (data != null) {
            r0 r0Var = (r0) data.getContent();
            if (r0Var == null) {
                throw new IllegalStateException("Payment is clickable, but RevPoints opt-in info is not loaded");
            }
            if (qk.d.l(r0Var)) {
                h.v2(aVar, new TravelHotelsCheckoutScreenContract$ModalStep.TermsReview(new RevPointsTermsReviewInputData(((m1c.s) r0Var.f201448b).f201451a)), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                return;
            }
        }
        afi.a aVar2 = (afi.a) ((g0) j2Var2.getValue()).f296168a.getContent();
        if (aVar2 == null) {
            throw new IllegalStateException("Payment is clickable, but required information is not loaded");
        }
        ecg.j jVar = (ecg.j) ((g0) j2Var2.getValue()).e.getContent();
        if (jVar == null) {
            throw new IllegalStateException("Payment is clickable, but payment is not selected");
        }
        cgi.e eVarP = pyd.c.P(aVar2.f);
        boolean z3 = jVar instanceof ecg.g;
        if (z3) {
            z = ((ecg.g) jVar).f124733b;
        } else {
            if (jVar instanceof PropertyPayment$Card) {
                int i = v0.f296210a[eVarP.ordinal()];
                if (i == 1) {
                    RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = ((PropertyPayment$Card) jVar).f93915a;
                    if (revolutCardWithBalanceCheck == null || !revolutCardWithBalanceCheck.f93667b) {
                    }
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            } else if (!(jVar instanceof ecg.f) && !(jVar instanceof ecg.h) && !(jVar instanceof ecg.i)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        Continuation continuation = null;
        if (z) {
            l2(new vq5.w(this, aVar2, jVar, continuation, 24), new vsl.f(1, this, a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 17));
            return;
        }
        dj0.d dVar = (dj0.d) ((g0) j2Var2.getValue()).f296170c.getContent();
        if (dVar == null) {
            throw new IllegalStateException("Insufficient funds detected, but price doesn't exist");
        }
        if (z3) {
            h.v2(aVar, new TravelHotelsCheckoutScreenContract$ModalStep.RevPayPocketSelection(dVar), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (jVar instanceof PropertyPayment$Card) {
            C1(new BridgeDestination(new FeatureCommand(new PaymentOptionsFeatureConfig.PaymentOptions(dVar))));
            return;
        }
        if (!(jVar instanceof ecg.f) && !(jVar instanceof ecg.h) && !(jVar instanceof ecg.i)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unsupported payment: ".concat(jVar.getClass().getSimpleName()));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void L2(ty0.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f275445a;
        Object obj2 = model.d;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -760305717:
                if (str.equals("REVOLUT_PRIVACY_NOTICE_ID")) {
                    gxf.a aVar = (gxf.a) ((g0) ((j2) this.O.f22677a).getValue()).f296175m.getContent();
                    if (aVar != null) {
                        C1(new ExternalDestination.Browser(aVar.f147745a, null));
                        return;
                    }
                    return;
                }
                break;
            case -341380427:
                if (str.equals("NUITEE_TERMS_AND_CONDITIONS_ID")) {
                    n2(new z0(this, fgi.a.NUITEE, null), new whi.b(6));
                    return;
                }
                break;
            case -338292628:
                if (str.equals("VRBO_TERMS_AND_CONDITIONS_ID")) {
                    n2(new z0(this, fgi.a.VRBO, null), new whi.b(6));
                    return;
                }
                break;
            case -175840638:
                if (str.equals("REV_POINTS_TERMS_AND_CONDITIONS_ID")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new w3k.i(this, TermsScope.X, continuation, 20), new whi.b(6));
                    return;
                }
                break;
            case 1659728266:
                if (str.equals("CASHBACK_REMOVAL_TERMS_AND_CONDITIONS_ID")) {
                    n2(new y0(this, continuation, 0), new whi.b(6));
                    return;
                }
                break;
            case 2017218210:
                if (str.equals("REVOLUT_TERMS_AND_CONDITIONS_ID")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new w3k.i(this, TermsScope.f90370k0, continuation, 20), new whi.b(6));
                    return;
                }
                break;
            case 2024438356:
                if (str.equals("PROVIDER_TERMS_AND_CONDITIONS_ID")) {
                    fgi.a aVar2 = obj2 instanceof fgi.a ? (fgi.a) obj2 : null;
                    if (aVar2 != null) {
                        n2(new z0(this, aVar2, null), new whi.b(6));
                        return;
                    }
                    return;
                }
                break;
        }
        String str2 = obj2 instanceof lxf.b ? ((lxf.b) obj2).f200570a : null;
        if (str2 != null) {
            C1(new ExternalDestination.Browser(str2, null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.O;
    }
}
