package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation;

import a6c.f;
import ax9.o;
import bbg.a0;
import bbg.e0;
import bbg.f0;
import bbg.j;
import bbg.r;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCostWithOldPricing;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentFailedException;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import eub.i;
import hng.g;
import i9g.b0;
import i9g.n;
import i9g.v;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mub.b;
import oki.h;
import qei.k;
import vkm.j2;
import vkm.q;
import vkm.q0;
import wbg.c;
import wbg.e;
import wbg.m;
import wbg.s;
import wkm.l;
import zhm.d0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements r {
    public final b A;
    public final vii.b B;
    public final vii.b C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final TravelHotelsAmendmentConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f93826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9g.h f93827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f93828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f93829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f93830t;
    public final l61.a u;
    public final k0c.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f93831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wj0.a f93832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fcg.f f93833y;
    public final c z;

    public a(f0 stateMapper, p8g.c travelHotelsFeatureInteractor, TravelHotelsAmendmentConfirmationScreenContract$InputData inputData, e checkoutPricingCalculator, i9g.h bookingAmendmentInteractor, n travelHotelsBookingInteractor, b0 travelHotelsPropertyInteractor, i revPointsOptInInteractor, l61.a userCompanyInteractor, k0c.a revPointsTermsReviewFlowProvider, f revolutPayCheckoutExtension, wj0.a idempotencyKeyHolder, fcg.f cardOrderDestinationProvider, c checkoutErrorHandlerControllerExtension, b revPointsPillControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checkoutPricingCalculator, "checkoutPricingCalculator");
        Intrinsics.checkNotNullParameter(bookingAmendmentInteractor, "bookingAmendmentInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(revPointsTermsReviewFlowProvider, "revPointsTermsReviewFlowProvider");
        Intrinsics.checkNotNullParameter(revolutPayCheckoutExtension, "revolutPayCheckoutExtension");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(cardOrderDestinationProvider, "cardOrderDestinationProvider");
        Intrinsics.checkNotNullParameter(checkoutErrorHandlerControllerExtension, "checkoutErrorHandlerControllerExtension");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        this.o = inputData;
        this.f93826p = checkoutPricingCalculator;
        this.f93827q = bookingAmendmentInteractor;
        this.f93828r = travelHotelsBookingInteractor;
        this.f93829s = travelHotelsPropertyInteractor;
        this.f93830t = revPointsOptInInteractor;
        this.u = userCompanyInteractor;
        this.v = revPointsTermsReviewFlowProvider;
        this.f93831w = revolutPayCheckoutExtension;
        this.f93832x = idempotencyKeyHolder;
        this.f93833y = cardOrderDestinationProvider;
        this.z = checkoutErrorHandlerControllerExtension;
        this.A = revPointsPillControllerModelExtension;
        this.B = new vii.b();
        this.C = new vii.b();
        boolean zB = ((v) travelHotelsFeatureInteractor).b();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, false, 7, null);
        Data data5 = new Data(null, null, false, 7, null);
        Data data6 = new Data(null, null, false, 7, null);
        od0.i.Companion.getClass();
        this.D = d.b(this, new j(data, data2, data3, data4, data5, data6, zB, null, new Data(od0.i.f224256b, null, false, 6, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
        this.E = hx7.e.a(this, new b7d.c(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a r4, com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck r5, cgi.f r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof bbg.w
            if (r0 == 0) goto L13
            r0 = r7
            bbg.w r0 = (bbg.w) r0
            int r1 = r0.f14304w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14304w = r1
            goto L18
        L13:
            bbg.w r0 = new bbg.w
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14304w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            qei.h r7 = new qei.h
            h93.f0 r5 = r5.f93666a
            java.lang.String r5 = r5.f150110a
            r7.<init>(r5)
            r0.f14304w = r3
            r5 = 0
            java.lang.Object r7 = r4.L2(r6, r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r7 = (com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus) r7
            r4.N2(r7)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a, com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck, cgi.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a r24, ecg.g r25, cgi.f r26, com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a, ecg.g, cgi.f, com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a r4, cgi.f r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof bbg.y
            if (r0 == 0) goto L13
            r0 = r6
            bbg.y r0 = (bbg.y) r0
            int r1 = r0.f14308w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14308w = r1
            goto L18
        L13:
            bbg.y r0 = new bbg.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14308w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            r0.f14308w = r3
            r6 = 0
            java.lang.Object r6 = r4.L2(r5, r6, r6, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r6 = (com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus) r6
            r4.N2(r6)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.K2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a, cgi.f, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        a0 a0Var = new a0(1, this, continuation);
        vii.b bVar = this.B;
        l lVarQ = q.Q(bVar, a0Var);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new e0(this, null), 3);
        int i = 0;
        yji.l.a1(this, q.Q(bVar, new a0(i, this, continuation)), null, null, new bbg.b0(i, this, continuation), 3);
        s sVar = (s) this.f93826p;
        j2 j2Var = sVar.f;
        j2 j2Var2 = sVar.f296200g;
        q0 q0Var = new q0(q.q(new v0b.b(new o(yh5.b.d(j2Var, j2Var2), 19), sVar, 19)), new wbg.i(sVar, continuation, 0), 1);
        int i2 = 1;
        yji.l.a1(this, xam.a.h(new wbg.i(sVar, continuation, i2), q0Var), null, null, new bbg.b0(i2, this, continuation), 3);
        yji.l.a1(this, nim.a.v(new v0b.b(new o(yh5.b.d(sVar.f, j2Var2), 19), sVar, 19), m.f), null, null, new bbg.b0(2, this, continuation), 3);
        yji.l.a1(this, q.h(sVar.f296202j), null, null, new bbg.b0(3, this, continuation), 3);
        if (((j) ((j2) this.D.f22677a).getValue()).f14285g) {
            yji.l.a1(this, nim.a.v(rd0.e.n(q.q(q.Q(this.C, new a0(2, this, continuation))), h0Var), new b96.a(28)), null, null, new bbg.b0(4, this, continuation), 3);
        }
        yji.l.a1(this, rd0.e.b(ue0.e.p(g.b(((ang.b) this.u).f7765a), h0Var)), null, null, new bbg.b0(6, this, continuation), 3);
        yji.l.a1(this, rd0.e.b(((lzb.a) this.A).Z2()), null, null, new bbg.b0(5, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    public final Object L2(cgi.f fVar, String str, k kVar, gim.c cVar) {
        return this.f93827q.a(this.o.f93814a, new qei.l(fVar.f23993b.f98088b, str, kVar), cVar);
    }

    public final void M2() {
        cgi.f fVar;
        cgi.g gVar;
        cgi.l lVar;
        RevPoints revPoints;
        cgi.e eVar;
        y yVar = this.D;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = (List) ((j) j2Var.getValue()).f14284c.getContent();
        if (list == null || (fVar = (cgi.f) d0.d0(list)) == null || (gVar = fVar.f23992a) == null || (lVar = gVar.f23996c) == null) {
            return;
        }
        TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost = lVar.f24000c;
        rei.g gVar2 = (rei.g) ((j) j2Var2.getValue()).f14283b.getContent();
        if (gVar2 == null) {
            return;
        }
        Pricing pricing = gVar2.f253607g;
        if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.NewPrice) {
            dj0.d dVar = ((TravelHotelsBookingAmendmentCost.NewPrice) travelHotelsBookingAmendmentCost).f97848a.f97864c;
            revPoints = dVar != null ? new RevPoints(dVar) : null;
        } else if (travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.AmountOwed) {
            HotelsPointsRedeemOption hotelsPointsRedeemOption = ((j) j2Var2.getValue()).f14286h;
            if (hotelsPointsRedeemOption == null || (revPoints = hotelsPointsRedeemOption.d) == null) {
                revPoints = ((TravelHotelsBookingAmendmentCost.AmountOwed) travelHotelsBookingAmendmentCost).f97845a.d;
            }
        } else {
            if (!(travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Refund) && !(travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Unchanged) && !(travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        HotelsPointsRedeemOption hotelsPointsRedeemOption2 = ((j) j2Var2.getValue()).f14286h;
        dj0.d dVar2 = hotelsPointsRedeemOption2 != null ? hotelsPointsRedeemOption2.f97977c : null;
        List listC = u.c(new TravelHotelsBookingAmendmentCostWithOldPricing(travelHotelsBookingAmendmentCost, pricing));
        int i = bbg.v.f14303a[gVar2.f253609j.f253613a.ordinal()];
        if (i == 1) {
            eVar = cgi.e.PAY_NOW;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = cgi.e.PAY_LATER;
        }
        cgi.e eVar2 = eVar;
        TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData = this.o;
        int iH = (int) oc.c.h(travelHotelsAmendmentConfirmationScreenContract$InputData.f93815b, travelHotelsAmendmentConfirmationScreenContract$InputData.f93816c);
        Points points = new Points(revPoints, dVar2);
        Object content = ((j) j2Var2.getValue()).d.getContent();
        ecg.g gVar3 = content instanceof ecg.g ? (ecg.g) content : null;
        PaymentMethod.Pocket pocket = gVar3 != null ? gVar3.f124732a : null;
        l71.d dVar3 = (l71.d) ((j) j2Var2.getValue()).f14287j.getContent();
        n6c.a aVarC = hb9.b.C(dVar3 != null ? dVar3.a() : null);
        HotelsProperty hotelsProperty = (HotelsProperty) ((j) j2Var2.getValue()).f14282a.getContent();
        C2(new bbg.m(new TravelHotelsPriceBreakdownScreenContract$InputData(listC, eVar2, iH, points, pocket, aVarC, hotelsProperty != null ? hotelsProperty.u : null)));
    }

    public final void N2(TravelHotelsBookingAmendmentStatus status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        qei.m[] elements = {qei.m.CONFIRMED, qei.m.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (kotlin.collections.d.y0(elements).contains(status.f97875c)) {
            C2(new bbg.k(status));
        } else {
            Intrinsics.checkNotNullParameter(status, "status");
            throw new TravelHotelsBookingAmendmentFailedException();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
