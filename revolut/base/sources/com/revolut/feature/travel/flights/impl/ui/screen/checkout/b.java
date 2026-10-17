package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import ax9.o;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchResultItem;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pkf.x;
import q5g.b0;
import q5g.f0;
import q5g.k0;
import q5g.s;
import s5g.f;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements b0 {
    public boolean A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final q5g.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f93310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a6c.f f93311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mub.b f93312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h4g.b f93313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f93314t;
    public final j4g.c u;
    public final j4g.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mre.c f93315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f93316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Pair f93317y;
    public BookingPreview z;

    public b(c stateMapper, TravelFlightsCheckoutScreenContract$InputData inputData, q5g.h pricingCalculator, f pointsOptionsProvider, a6c.f revolutPayCheckoutExtension, mub.b revPointsPillControllerModelExtension, h4g.b checkoutInteractor, sf0.h serverErrorParser, j4g.c priceChangeDialogFactory, j4g.a flightUnavailableDialogExtension, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingCalculator, "pricingCalculator");
        Intrinsics.checkNotNullParameter(pointsOptionsProvider, "pointsOptionsProvider");
        Intrinsics.checkNotNullParameter(revolutPayCheckoutExtension, "revolutPayCheckoutExtension");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(priceChangeDialogFactory, "priceChangeDialogFactory");
        Intrinsics.checkNotNullParameter(flightUnavailableDialogExtension, "flightUnavailableDialogExtension");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = pricingCalculator;
        this.f93310p = pointsOptionsProvider;
        this.f93311q = revolutPayCheckoutExtension;
        this.f93312r = revPointsPillControllerModelExtension;
        this.f93313s = checkoutInteractor;
        this.f93314t = serverErrorParser;
        this.u = priceChangeDialogFactory;
        this.v = flightUnavailableDialogExtension;
        this.f93315w = termsNavigationFactory;
        this.f93316x = new vii.b();
        this.B = d.b(this, new s(inputData.f93297a, inputData.f93298b, new Data(null, null, false, 6, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, h0.f322473a), stateMapper, null, false, 12);
        this.C = e.a(this, new f0(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.flights.impl.ui.screen.checkout.b r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof q5g.j0
            if (r0 == 0) goto L13
            r0 = r5
            q5g.j0 r0 = (q5g.j0) r0
            int r1 = r0.f242383w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242383w = r1
            goto L18
        L13:
            q5g.j0 r0 = new q5g.j0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242383w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            goto L58
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            h4g.b r4 = r4.f93313s     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            r0.f242383w = r3     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            b4g.j r4 = r4.f149355c     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            x4l.c r4 = r4.d     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            java.lang.Object r4 = r4.e(r5, r0)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5b
            if (r4 != r1) goto L43
            goto L44
        L43:
            r4 = r5
        L44:
            if (r4 != r1) goto L47
            r5 = r4
        L47:
            if (r5 != r1) goto L58
            return r1
        L4a:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Failed to invalidate flight bookings cache after successful payment"
            java.lang.String r2 = "TravelFlightsCheckoutScreenModel"
            rd0.d.a(r0, r2, r1, r4, r5)
        L58:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L5b:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.flights.impl.ui.screen.checkout.b.I2(com.revolut.feature.travel.flights.impl.ui.screen.checkout.b, gim.c):java.lang.Object");
    }

    public final void J2(int i) {
        TravelFlightsItinerary travelFlightsItinerary = ((s) ((j2) this.B.f22677a).getValue()).f242387b;
        if (travelFlightsItinerary == null) {
            return;
        }
        FlightSearchResultItem flightSearchResultItem = travelFlightsItinerary.f93598b;
        ArrayList arrayList = flightSearchResultItem.f93590b;
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        h.v2(this.C, new TravelFlightsCheckoutScreenContract$ModalStep.ItineraryPreview(arrayList, i, flightSearchResultItem.f.contains(r7g.f.ONE_WAY_COMBINATION)), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f93316x, new x(continuation, this, 26)), null, new k0(this, continuation, 0), 3);
        q5g.h hVar = this.o;
        l.b1(this, new pkg.e(new o(yh5.b.d(hVar.f242373b, hVar.f242374c), 11), hVar, 10), null, new k0(this, continuation, 1), 3);
        l.b1(this, rd0.e.n(q.Q(hVar.e, new x(continuation, hVar, 25)), h0.f322473a), null, new k0(this, continuation, 2), 3);
        l.b1(this, rd0.e.b(((lzb.a) this.f93312r).Z2()), null, new k0(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }
}
