package b4b;

import aw0.o9;
import b4g.h0;
import b4g.i0;
import b8d.k0;
import b8e.d;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$State;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$Page;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.support.api.SupportApi$Toggles$HelpCenterRevampLoading;
import com.revolut.feature.travel.flights.models.domain.offer_details.TravelFlightsOfferDetails;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchResult;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import d7d.e;
import ip0.p10;
import ip0.q10;
import ip0.s7;
import ip0.t10;
import ip0.v7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import s7g.h2;
import skm.p0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12261b;

    public /* synthetic */ z(Object obj2, int i) {
        this.f12260a = i;
        this.f12261b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        hdh.e eVar;
        Flow gVar;
        int i = this.f12260a;
        w4l.h hVar = w4l.h.f294642c;
        int i2 = 2;
        int i3 = 1;
        Continuation continuation = null;
        int i5 = 0;
        Object obj3 = this.f12261b;
        switch (i) {
            case 0:
                CfdOrderData it8 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return CfdOrderData.a(it8, null, null, null, null, (ExpiryDate) obj3, 31);
            case 1:
                return CfdOrderData.a((CfdOrderData) obj2, null, null, (CfdOpenPositionsDelegate$OpenPositions) obj3, null, null, 55);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((g0) obj3).f12223g.getClass();
                return zhm.u.c(new s7("ID_LEVERAGE", 0, 0, 0, 0, false, null, 126));
            case 3:
                String bookingId = (String) obj2;
                Intrinsics.checkNotNullParameter(bookingId, "bookingId");
                return (s7g.f0) v7.r("KEY_BOOKING_DETAILS_", bookingId, ((b4g.f) obj3).f12330b);
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (h2) ((b4g.j) obj3).f12339b.get("TRAVEL_FLIGHTS_BOOKINGS");
            case 5:
                b4g.s params = (b4g.s) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (u7g.f) ((b4g.u) obj3).f12365c.get(b4g.u.a(params));
            case 6:
                b4g.x params2 = (b4g.x) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (List) ((b4g.y) obj3).f12370b.get("FLIGHTS_FARES_" + params2.f12367a + "_" + params2.f12368b);
            case 7:
                String query = (String) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                return (List) v7.r("FLIGHTS_LOCATIONS_", query, ((b4g.a0) obj3).f12315b);
            case 8:
                b4g.c0 params3 = (b4g.c0) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (TravelFlightsOfferDetails) ((b4g.d0) obj3).f12323b.get("FLIGHTS_OFFER_DETAILS_" + params3.f12320a + "_" + params3.f12321b);
            case 9:
                h0 request = (h0) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return (FlightSearchResult) ((i0) obj3).f12336b.get(i0.a(request));
            case 10:
                r10.t tVar = (r10.t) obj3;
                Boolean remittanceAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(remittanceAvailable, "remittanceAvailable");
                int i6 = 3;
                if (remittanceAvailable.booleanValue()) {
                    efm.r rVarDistinctUntilChanged = nim.a.z(nim.a.w(rd0.e.c(((g3k.a) tVar.f250857a).a(), kotlin.coroutines.g.f186406a), new b4g.f0(i2)), new b4g.f0(i6)).distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                    return rVarDistinctUntilChanged;
                }
                efm.r rVarJust = efm.r.just(zi0.c.P(zhm.f0.f322471a, false, null, 3));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return rVarJust;
            case 11:
                b4k.d dVar = (b4k.d) obj3;
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                if (items.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                o97.f0 f0Var = new o97.f0(new TextLocalisedClause(R$string.remittance_send_header_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.RemittanceVendorsTitle");
                o97.r sourceIdentifier = dVar.f12418b;
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
                List<b4k.a> list = items;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (b4k.a aVar : list) {
                    PaymentVendor paymentVendor = aVar.f12416a;
                    arrayList.add(new RowDelegate.Model(j6.a.q("remittance_vendor_", paymentVendor.f64079a), new RowDelegate.Model.MainImage.Image40(new UrlImage(paymentVendor.f64081c, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorAccentNeutral)), null, null, null, null, 123), null, null, false, false, 507390), null, null, false, null, false, 62), new TextClause(paymentVendor.f64080b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, w2k.a.a(paymentVendor), null, null, 0, null, false, null, false, null, null, null, null, null, null, new o97.y(sourceIdentifier, aVar, null, 60), new AnalyticsContext(o97.h.a(sourceIdentifier, paymentVendor.f64079a)), 0, 0, 0, 0, 524287960));
                    i5 = i5;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                o97.e0 e0Var = new o97.e0(arrayList);
                o97.d0[] d0VarArr = new o97.d0[2];
                d0VarArr[i5] = f0Var;
                d0VarArr[1] = e0Var;
                return zhm.v.k(d0VarArr);
            case 12:
                InviteFlowContract$State update = (InviteFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return InviteFlowContract$State.a(update, null, ((i58.b) obj3).f158783a, 1);
            case 13:
                List refs = (List) obj2;
                Intrinsics.checkNotNullParameter(refs, "refs");
                return rd0.e.b(((ael.k) ((b5b.a) obj3).f12481l).n(refs, hVar));
            case 14:
                b5e.i update2 = (b5e.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return b5e.i.a(update2, ((NoteDetailsFlowControllerContract$Page) obj3).getF94249a(), null, null, null, 30);
            case 15:
                com.revolut.feature.structured_note.details.impl.ui.note_details.a aVar2 = (com.revolut.feature.structured_note.details.impl.ui.note_details.a) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof dii.f) && (data = ((b5e.i) ((j2) aVar2.f88874w.f22677a).getValue()).e) != null && (eVar = (hdh.e) data.getContent()) != null) {
                    aVar2.f88872s.b3(bfl.g.SELL, eVar, false);
                }
                return Unit.f186387a;
            case 16:
                String it9 = (String) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((b6d.r) obj3).f12732a.c(it9);
            case 17:
                b6i.h update3 = (b6i.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return b6i.h.a(update3, null, (b6i.j) obj3, null, null, false, false, null, null, 0, 509);
            case 18:
                b6i.x xVar = (b6i.x) obj3;
                return b6i.h.a((b6i.h) obj2, null, null, null, xVar.f12835a, xVar.f12836b, false, null, null, 0, 487);
            case 19:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                ((b6j.b) obj3).L2(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_order_error_sell, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                return Boolean.TRUE;
            case 20:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                b6k.h hVar2 = (b6k.h) pair.f186385a;
                b6k.h hVar3 = (b6k.h) pair.f186386b;
                b6k.d dVar2 = (b6k.d) ((r10.a) obj3).f250812b;
                return new b6k.e(dVar2.a(hVar2), dVar2.a(hVar3));
            case 21:
                com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.a) obj3;
                hii.a outputData = (hii.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                aVar3.H2(aVar3.f67279p, new b58.f(aVar3.I2(outputData.f152606a), aVar3, 13));
                return Unit.f186387a;
            case 22:
                return (b77.h) obj3;
            case 23:
                com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.a aVar4 = (com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.a) obj3;
                d7d.e it10 = (d7d.e) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!Intrinsics.f(it10, e.a.f111923a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar4.o.f86098c) {
                    aVar4.C2(w6d.a.f295420a);
                } else {
                    oki.h.D2(aVar4.f86100p);
                }
                return Unit.f186387a;
            case 24:
                k0 k0Var = (k0) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                if (((jte.d) k0Var.d.f194089a).c(SupportApi$Toggles$HelpCenterRevampLoading.f89338c)) {
                    ArrayList arrayList2 = new ArrayList(2);
                    while (i5 < 2) {
                        eVarB.add(new t10("FAQ_CONTENT_ITEM_ID", q10.f165912a));
                        arrayList2.add(Boolean.TRUE);
                        i5++;
                    }
                } else {
                    eVarB.add(new t10("FAQ_CONTENT_ITEM_ID", p10.f165755a));
                    eVarB.addAll(k0Var.f13173c.f112219a.c());
                }
                aim.e eVarA = zhm.u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 25:
                b8e.m mVar = (b8e.m) obj3;
                Subaccount subaccount = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                vkm.d dVarB = rd0.e.b(mVar.f13220q.k(false));
                boolean z = subaccount instanceof Subaccount.Group;
                d.a aVar5 = d.a.f13205a;
                if (z || (subaccount instanceof Subaccount.Personal) || (subaccount instanceof Subaccount.Pro) || (subaccount instanceof Subaccount.ProTax) || (subaccount instanceof Subaccount.Joint)) {
                    gVar = new go.g(new Data(aVar5, null, false, 6, null), 2);
                } else if (subaccount instanceof Subaccount.Junior) {
                    gVar = nim.a.A(nim.a.v(hj8.a.a(mVar.f13221r, ((Subaccount.Junior) subaccount).f88955a.f, hVar), new b73.h(20)), new b73.h(21));
                } else {
                    if (!(subaccount instanceof Subaccount.Teen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xqe.b bVar = mVar.f13222s;
                    String value = ((Subaccount.Teen) subaccount).f88959a.f;
                    Intrinsics.checkNotNullParameter(value, "value");
                    gVar = nim.a.A(nim.a.v(bVar.a(value, hVar), new b73.h(22)), new b73.h(23));
                }
                return nim.a.v(u0.m(dVarB, gVar), new b8e.k(subaccount, i5));
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((b8f.k) obj3).f13237a;
            case 27:
                b8l.b orderQuoteParams = (b8l.b) obj2;
                Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
                return te0.w.o0(p0.f264003c, new b8l.c((b8l.f) obj3, orderQuoteParams, continuation, i3));
            case 28:
                b94.h update4 = (b94.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return b94.h.a(update4, (DetailsInputForm) obj3, null, null, 239);
            default:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ((a80.h) ((b96.h) obj3).f).i(new File(it11));
        }
    }
}
