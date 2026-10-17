package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary;

import avj.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreenContract$ModalStep;
import hx7.e;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p8g.c;
import q06.l;
import rp0.f1;
import rp0.l0;
import vii.b;
import vkm.j2;
import vkm.q;
import ys.i;
import z6e.g;
import zr5.k;
import zuj.d0;
import zuj.n;
import zuj.t;
import zuj.u;
import zuj.z;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements u {

    @NotNull
    public static final z Companion = new z();
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yuj.a f101609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f101610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f101611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hyf.a f101612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mti.h f101613t;
    public final gte.a u;
    public final zuj.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l0 f101614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f101615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101616y;
    public final y z;

    public a(t inputData, yuj.a travelTripsInteractor, l deeplinkRouter, c hotelsFeatureInteractor, hyf.a experiencesFeatureInteractor, mti.h asftProductAvailabilityInteractor, gte.a featureToggleInteractor, zuj.a addBookingMapper, l0 popupMenuDialogDisplayer, d0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelTripsInteractor, "travelTripsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(hotelsFeatureInteractor, "hotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(asftProductAvailabilityInteractor, "asftProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(addBookingMapper, "addBookingMapper");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f101609p = travelTripsInteractor;
        this.f101610q = deeplinkRouter;
        this.f101611r = hotelsFeatureInteractor;
        this.f101612s = experiencesFeatureInteractor;
        this.f101613t = asftProductAvailabilityInteractor;
        this.u = featureToggleInteractor;
        this.v = addBookingMapper;
        this.f101614w = popupMenuDialogDisplayer;
        this.f101615x = new b();
        this.f101616y = e.a(this, new zo2.h(this, 16));
        this.z = d.b(this, new n(0), stateMapper, null, false, 12);
    }

    public static final void I2(a aVar, f fVar) {
        aVar.getClass();
        if (Intrinsics.f(fVar, avj.b.f10049a)) {
            aVar.K2(new TextLocalisedClause(R$string.travel_trip_itinerary_edit_event_success, null, null, 14), "TRAVEL_ITINERARY_ADD_EVENT_SUCCESS_DIALOG_ID");
            return;
        }
        if (Intrinsics.f(fVar, avj.c.f10050a)) {
            aVar.K2(new TextLocalisedClause(R$string.travel_trip_itinerary_edit_event_success, null, null, 14), "TRAVEL_ITINERARY_EDIT_EVENT_SUCCESS_DIALOG_ID");
        } else if (Intrinsics.f(fVar, avj.d.f10051a)) {
            aVar.K2(new TextLocalisedClause(R$string.travel_trip_itinerary_remove_event_success, null, null, 14), "TRAVEL_ITINERARY_REMOVE_EVENT_SUCCESS_DIALOG_ID");
        } else {
            if (!Intrinsics.f(fVar, avj.e.f10052a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.K2(new TextLocalisedClause(R$string.travel_trip_itinerary_remove_suggestion_success, null, null, 14), "TRAVEL_ITINERARY_REMOVE_PROPOSAL_SUCCESS_DIALOG_ID");
        }
    }

    @Override // yji.l
    public final void I1() {
        H2(this.z, new zuj.y(this, 0));
    }

    public final void J2(puj.b bVar) {
        puj.e eVar;
        String str = bVar.i;
        LocalDateTime localDateTime = bVar.k;
        boolean z = bVar.f239907b;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f101616y;
        y yVar = this.z;
        if (!z && bVar.f239911j == puj.c.CUSTOM) {
            puj.e eVar2 = (puj.e) ((n) ((j2) yVar.f22677a).getValue()).f325497a.getContent();
            if (eVar2 == null) {
                return;
            }
            String str2 = bVar.f239906a;
            LocalDate localDate = eVar2.d.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
            LocalDate localDate2 = eVar2.e.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
            String str3 = eVar2.f239914c;
            String str4 = bVar.d;
            LocalDate localDate3 = localDateTime.toLocalDate();
            Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
            LocalTime localTime = localDateTime.toLocalTime();
            Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
            h.v2(aVar, new TravelItineraryScreenContract$ModalStep.EditEvent(str2, localDate, localDate2, str3, str4, localDate3, localTime, bVar.f239910h), popup);
            return;
        }
        if (str != null) {
            n2(new k(this, str, null, 8), new whi.b(6));
            return;
        }
        if (!z || (eVar = (puj.e) ((n) ((j2) yVar.f22677a).getValue()).f325497a.getContent()) == null) {
            return;
        }
        String str5 = bVar.f239906a;
        LocalDate localDate4 = eVar.d.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate4, "toLocalDate(...)");
        LocalDate localDate5 = eVar.e.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate5, "toLocalDate(...)");
        String str6 = eVar.f239914c;
        String str7 = bVar.d;
        LocalDate localDate6 = localDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate6, "toLocalDate(...)");
        LocalTime localTime2 = localDateTime.toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
        h.v2(aVar, new TravelItineraryScreenContract$ModalStep.AddProposal(str5, localDate4, localDate5, str6, str7, localDate6, localTime2, bVar.f239910h), popup);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101616y;
    }

    public final void K2(TextLocalisedClause textLocalisedClause, String str) {
        yji.l.b1(this, X1(new mii.e(str, textLocalisedClause, f1.BOTTOM, 12)), null, null, 7);
    }

    @Override // yji.l
    public final void P1() {
        this.f101614w.a();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f101615x, new g(continuation, this, 23)), null, new zt4.l(this, continuation, 6), 3);
        yji.l.b1(this, rd0.e.b(this.f101614w.f256113c), null, new i(2, this, a.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;)V", 4, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
