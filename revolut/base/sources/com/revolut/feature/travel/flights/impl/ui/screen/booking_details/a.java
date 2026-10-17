package com.revolut.feature.travel.flights.impl.ui.screen.booking_details;

import a5g.e;
import a5g.f;
import a5g.i;
import a5g.j;
import a5g.k;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import com.revolut.kompot.common.ModalDestination;
import j5g.b;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l7g.b0;
import l7g.u;
import mra.d;
import oki.h;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements f {
    public final b4g.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f93279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f93280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f93281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93282s;

    public a(n stateMapper, TravelFlightsBookingDetailsScreenContract$InputData inputData, b4g.f repository, b chatRedirectScreenFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(chatRedirectScreenFactory, "chatRedirectScreenFactory");
        this.o = repository;
        this.f93279p = chatRedirectScreenFactory;
        this.f93280q = new vii.b();
        this.f93281r = d.b(this, new e(inputData.f93269a, new Data(null, null, true, 3, null), h0.f322473a, null), stateMapper, null, false, 12);
        this.f93282s = hx7.e.a(this, new a09.b(this, 14));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f93280q, new j(0, this, continuation)), null, null, new k(0, this, continuation), 3);
        l.a1(this, q.Q(this.f93281r.B(new a5g.h(0)), new j(1, this, continuation)), null, null, new k(1, this, continuation), 3);
    }

    public final void I2(RowDelegate.Model model) {
        Integer num;
        l7g.k kVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj2 = model.u;
        boolean zF = Intrinsics.f(str, "BOOKING_DETAILS_STATUS");
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f93282s;
        y yVar = this.f93281r;
        if (zF) {
            BookingStatus bookingStatus = ((e) ((j2) yVar.f22677a).getValue()).d;
            if (bookingStatus != null) {
                Intrinsics.checkNotNullParameter(bookingStatus, "<this>");
                if (bookingStatus.f93458b != l7g.q.PENDING || bookingStatus.d.isEmpty()) {
                    return;
                }
                h.v2(aVar, new TravelFlightsBookingDetailsScreenContract$ModalStep.BookingStatusDetails(((e) ((j2) yVar.f22677a).getValue()).f1380a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
            return;
        }
        boolean zF2 = Intrinsics.f(str, "BOOKING_DETAILS_TICKET_RULES");
        ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
        if (zF2) {
            h.v2(aVar, new TravelFlightsBookingDetailsScreenContract$ModalStep.TicketRules(((e) ((j2) yVar.f22677a).getValue()).f1380a), fullscreen_slide_from_bottom);
            return;
        }
        if (Intrinsics.f(str, "BOOKING_DETAILS_BOOKING_CONTACT")) {
            b0 b0Var = (b0) ((e) ((j2) yVar.f22677a).getValue()).f1381b.getContent();
            if (b0Var == null || (kVar = b0Var.f192590j) == null) {
                return;
            }
            h.v2(aVar, new TravelFlightsBookingDetailsScreenContract$ModalStep.BookingContact(((e) ((j2) yVar.f22677a).getValue()).f1380a, kVar.f192615a, kVar.f192616b, b0Var.d), fullscreen_slide_from_bottom);
            return;
        }
        if (a0.H(str, "BOOKING_DETAILS_TRAVELLER_ROW_", false)) {
            num = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num != null) {
                H2(yVar, new i(num.intValue(), 0));
                return;
            }
            return;
        }
        if (a0.H(str, "BOOKING_DETAILS_BOUND_", false)) {
            num = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num != null) {
                int iIntValue = num.intValue();
                b0 b0Var2 = (b0) ((e) ((j2) yVar.f22677a).getValue()).f1381b.getContent();
                if (b0Var2 == null) {
                    return;
                }
                ArrayList arrayList = b0Var2.k;
                if (iIntValue < 0 || iIntValue >= arrayList.size()) {
                    return;
                }
                h.v2(aVar, new TravelFlightsBookingDetailsScreenContract$ModalStep.ItineraryPreview(arrayList, iIntValue, b0Var2.o.contains(u.ONE_WAY_COMBINATION)), ModalDestination.Style.POPUP.f98311a);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93282s;
    }

    @Override // yji.l
    public final void K1() {
        String bookingId = ((e) ((j2) this.f93281r.f22677a).getValue()).f1380a;
        b4g.f fVar = this.o;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        fVar.e.remove(bookingId);
    }

    @Override // cli.z
    public final g getState() {
        return this.f93281r;
    }
}
