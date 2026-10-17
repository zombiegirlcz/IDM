package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details;

import aw0.o9;
import c1g.m;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.model.points.Points;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByBookingId;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyBrief;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyContactDetails;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import efm.r;
import exe.j;
import fag.t0;
import hae.k;
import hb6.g;
import hbg.e0;
import hbg.j0;
import hbg.l;
import hbg.p;
import hbg.t;
import hbg.z;
import i9g.b0;
import i9g.l0;
import i9g.n;
import i9g.v;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd.o;
import nii.c0;
import nii.y0;
import nyb.m0;
import oki.h;
import p8g.c;
import pfm.f;
import qfm.d1;
import qv0.i;
import r10.w;
import skm.a2;
import tof.i7;
import tof.s9;
import tof.v9;
import tqi.e;
import vkm.j2;
import vkm.q;
import wli.x;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements t {
    public final j60.a A;
    public final n8g.a B;
    public final b0 C;
    public final x D;
    public final o E;
    public final com.revolut.feature.rev_points.api.navigation.a F;
    public final w G;
    public final e H;
    public final sf0.h I;
    public final v60.e J;
    public final i9g.h K;
    public final f80.a L;
    public final vii.b M;
    public a2 N;
    public Set O;
    public final y P;
    public final com.revolut.kompot.navigable.vc.modal.a Q;
    public a2 R;
    public final TravelHotelsBookingDetailsParams o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f93849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f93850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f93851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9g.y f93852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final whf.b f93853t;
    public final l0 u;
    public final hyf.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j61.b f93854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l80.e f93855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hbg.m0 f93856y;
    public final hag.c z;

    public b(j0 stateMapper, TravelHotelsBookingDetailsParams inputData, n travelHotelsBookingInteractor, c featureInteractor, m0 revPointsTransactionsInteractor, i9g.y travelHotelsInventoryProviderInteractor, whf.b transactionsContentProvider, l0 suggestedExperiencesInteractor, hyf.a travelExperiencesFeatureInteractor, j61.b transactionsInteractor, l80.e dateProvider, hbg.m0 travelHotelsBookingDialogFactory, hag.c itemFactory, j60.a expandableDialogControllerExtension, n8g.a travelHotelsCalendarInteractor, b0 travelHotelsPropertyInteractor, x deeplinkHandler, o chooserIntentNavigationCommandFactory, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, w bookingConfirmationRepository, e shareExternalDestinationFactory, sf0.h serverErrorParser, v60.e serverErrorsProvider, i9g.h bookingAmendmentInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsInventoryProviderInteractor, "travelHotelsInventoryProviderInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(suggestedExperiencesInteractor, "suggestedExperiencesInteractor");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(travelHotelsBookingDialogFactory, "travelHotelsBookingDialogFactory");
        Intrinsics.checkNotNullParameter(itemFactory, "itemFactory");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(travelHotelsCalendarInteractor, "travelHotelsCalendarInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(bookingConfirmationRepository, "bookingConfirmationRepository");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(bookingAmendmentInteractor, "bookingAmendmentInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f93849p = travelHotelsBookingInteractor;
        this.f93850q = featureInteractor;
        this.f93851r = revPointsTransactionsInteractor;
        this.f93852s = travelHotelsInventoryProviderInteractor;
        this.f93853t = transactionsContentProvider;
        this.u = suggestedExperiencesInteractor;
        this.v = travelExperiencesFeatureInteractor;
        this.f93854w = transactionsInteractor;
        this.f93855x = dateProvider;
        this.f93856y = travelHotelsBookingDialogFactory;
        this.z = itemFactory;
        this.A = expandableDialogControllerExtension;
        this.B = travelHotelsCalendarInteractor;
        this.C = travelHotelsPropertyInteractor;
        this.D = deeplinkHandler;
        this.E = chooserIntentNavigationCommandFactory;
        this.F = revPointsNavigationFactory;
        this.G = bookingConfirmationRepository;
        this.H = shareExternalDestinationFactory;
        this.I = serverErrorParser;
        this.J = serverErrorsProvider;
        this.K = bookingAmendmentInteractor;
        this.L = uriHelper;
        this.M = new vii.b();
        this.P = d.b(this, new l(0), stateMapper, null, false, 12);
        this.Q = hx7.e.a(this, new g(5));
    }

    public static final pfm.a I2(b bVar) {
        aim.e eVarB = u.b();
        eVarB.add(j61.b.b(bVar.f93854w));
        if (((v) bVar.f93850q).b()) {
            eVarB.add(new d1(bVar.f93851r.f220812a.g()));
        }
        f fVarR = efm.b.r(u.a(eVarB));
        Intrinsics.checkNotNullExpressionValue(fVarR, "let(...)");
        return ue0.e.v(fVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b r25, hbg.k0 r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b.J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b, hbg.k0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        hbg.w wVar = new hbg.w(this, 0);
        y yVar = this.P;
        H2(yVar, wVar);
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.M, new g6f.l(continuation, this, 29)), null, null, new e0(this, continuation, 1), 3);
        TravelHotelsBookingDetailsParams travelHotelsBookingDetailsParams = this.o;
        String id10 = travelHotelsBookingDetailsParams.f93646a;
        n nVar = this.f93849p;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        t0 t0Var = nVar.f159820a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        r rVarSwitchMap = zi0.c.J(t0Var.K.f(id10, true)).distinctUntilChanged().switchMap(new k(new hbg.w(this, 1), 2));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new e0(this, continuation, 2), 3);
        yji.l.a1(this, rd0.e.b(i9g.y.b(this.f93852s, 3)), null, null, new e0(this, continuation, 3), 3);
        r rVarSwitchMap2 = ((m) this.v).b().switchMap(new k(new hbg.w(this, 2), 3));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        yji.l.a1(this, rd0.e.b(rVarSwitchMap2), null, null, new e0(this, continuation, 4), 3);
        l2(new z(this, continuation, 5), new yi5.b(26));
        l2(new z(this, continuation, 6), new yi5.b(26));
        if (((l) ((j2) yVar.f22677a).getValue()).i) {
            String bookingId = travelHotelsBookingDetailsParams.f93646a;
            i9g.h hVar = this.K;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(bookingId, "bookingId");
            yji.l.a1(this, new j(new ahd.c(hVar.d, bookingId, 4), 22), null, null, new e0(this, continuation, 0), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.Q;
    }

    public final void K2(boolean z) {
        TravelHotelsBookingDetailsParams travelHotelsBookingDetailsParams = this.o;
        C2(new hbg.m(new TravelHotelsCancellationPolicyScreenContract$InputData(z ? new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(travelHotelsBookingDetailsParams.f93646a) : new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByBookingId(travelHotelsBookingDetailsParams.f93646a))));
        j60.a.v(this.A, false, null, 3);
    }

    public final void L2() {
        rei.g gVar = (rei.g) ((l) ((j2) this.P.f22677a).getValue()).f150703a.getContent();
        if (gVar == null) {
            return;
        }
        Pricing pricing = gVar.f253607g;
        List listC = u.c(pricing);
        cgi.e eVar = pricing.f98066a;
        rei.e eVar2 = gVar.e;
        int iBetween = (int) ChronoUnit.DAYS.between(eVar2.f253602a, eVar2.f253603b);
        HotelsPointsRedeemOption hotelsPointsRedeemOption = pricing.f98070h;
        C2(new p(new TravelHotelsPriceBreakdownScreenContract$InputData(listC, eVar, iBetween, new Points(pricing.f98069g, hotelsPointsRedeemOption != null ? hotelsPointsRedeemOption.f97977c : null), null, null, gVar.f.f98009h)));
    }

    public final void M2() {
        rei.g gVar = (rei.g) ((l) ((j2) this.P.f22677a).getValue()).f150703a.getContent();
        if (gVar != null) {
            HotelsPropertyBrief hotelsPropertyBrief = gVar.f;
            Intrinsics.checkNotNullParameter(hotelsPropertyBrief, "<this>");
            C2(new hbg.q(new HotelsPropertyInputData.BookedProperty(new HotelsProperty(hotelsPropertyBrief.f98005a, hotelsPropertyBrief.f98006b, null, null, hotelsPropertyBrief.f98007c, null, null, null, null, null, null, hotelsPropertyBrief.d, null, null, hotelsPropertyBrief.e, hotelsPropertyBrief.f, null, null, null, null, hotelsPropertyBrief.f98009h, null, null, null, null, null, null, null))));
            j60.a.v(this.A, false, null, 3);
        }
    }

    public final void N2() {
        y0 y0Var = new y0(null, new c0(new TextLocalisedClause(R$string.hotels_booking_details_downloading, null, null, 14), null, null, false, null, false, false, null, 2046), false, 5);
        a2 a2VarL2 = l2(new h54.o(this, y0Var, null, 17), new yi5.b(26));
        if (a2VarL2.d()) {
            yji.l.a1(this, X1(y0Var), null, null, new hbg.c0(a2VarL2, null, 0), 3);
        }
    }

    public final r O2(rei.g gVar) {
        i7.c cVar = i7.Companion;
        ArrayList arrayList = gVar.f253611m;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((rei.p) obj2).f253629b == rei.n.CORE) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((rei.p) it8.next()).d);
        }
        i7[] i7VarArr = {new s9(d0.i1(arrayList3)), new v9(this.o.f93646a)};
        cVar.getClass();
        r rVarJust = r.just(i7.c.b(i7VarArr));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return whf.b.a(this.f93853t, rVarJust, null, null, null, 14);
    }

    public final void P2(rei.g gVar) {
        hag.c cVar;
        RowDelegate.Model model;
        rp0.l lVar = rp0.l.WINDOW;
        String str = ((rei.k) d0.b0(gVar.i)).f253622l;
        HotelsPropertyContactDetails hotelsPropertyContactDetails = gVar.f.f98008g;
        String str2 = hotelsPropertyContactDetails != null ? hotelsPropertyContactDetails.f98019a : null;
        hag.c cVar2 = this.z;
        cVar2.getClass();
        if (str != null) {
            cVar = cVar2;
            model = new RowDelegate.Model("CONTACT_PROPERTY_MESSAGE_ITEM_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_envelope, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_booking_details_contact_property_section_send_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, str, null, 0, 0, 0, 0, 1056964588);
        } else {
            cVar = cVar2;
            model = null;
        }
        i[] elements = {model, str2 != null ? new RowDelegate.Model("CONTACT_PROPERTY_CALL_ITEM_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_call, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.hotels_booking_details_contact_property_section_call_phone, u.c(new TextClause(z80.b.b(cVar.f150503a, str2, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), null, null, null, 0, null, false, false, null, null, null, null, null, str2, null, 0, 0, 0, 0, 1056964588) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        this.A.x(new rp0.y(listL, null, lVar, 0, null, null, "CONTACT_PROPERTY_DIALOG_VIEW", null, null, null, 3800));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.P;
    }
}
