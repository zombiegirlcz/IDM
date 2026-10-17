package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep;
import fcg.d;
import i9g.n;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import oki.h;
import vim.i;
import vkm.j2;
import yji.l;
import yz4.b;
import zag.j;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements j {
    public final TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f93809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f93810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9g.h f93811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g81.a f93812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f93813t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(e dateProvider, cli.n stateMapper, TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData inputData, d dialogProvider, n travelHotelsBookingInteractor, i9g.h bookingAmendmentInteractor, g81.a errorHandler, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(bookingAmendmentInteractor, "bookingAmendmentInteractor");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f93809p = dialogProvider;
        this.f93810q = travelHotelsBookingInteractor;
        this.f93811r = bookingAmendmentInteractor;
        this.f93812s = errorHandler;
        this.f93813t = idempotencyKeyHolder;
        LocalDate localDateE = ((f) dateProvider).e();
        LocalDate localDatePlusYears = localDateE.plusYears(2L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
        this.u = mra.d.b(this, new zag.d(new Data(null, null, true, 3, null), i.b(localDateE, localDatePlusYears), null, localDateE), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new b(this, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a r6, vim.d r7, qei.e r8, gim.c r9) {
        /*
            com.revolut.kompot.navigable.vc.modal.a r0 = r6.v
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData r1 = r6.o
            boolean r2 = r9 instanceof zag.l
            if (r2 == 0) goto L17
            r2 = r9
            zag.l r2 = (zag.l) r2
            int r3 = r2.f320702w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f320702w = r3
            goto L1c
        L17:
            zag.l r2 = new zag.l
            r2.<init>(r6, r9)
        L1c:
            java.lang.Object r9 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f320702w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r9)
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof qei.d
            if (r9 == 0) goto L60
            i9g.h r7 = r6.f93811r
            java.lang.String r9 = r1.f93799a
            qei.l r0 = new qei.l
            qei.d r8 = (qei.d) r8
            cgi.f r8 = r8.f245165a
            com.revolut.feature_travel_hotels_models.property.room.BedOption r8 = r8.f23993b
            java.lang.String r8 = r8.f98088b
            r1 = 0
            r0.<init>(r8, r1, r1)
            r2.f320702w = r5
            java.lang.Object r9 = r7.a(r9, r0, r2)
            if (r9 != r3) goto L55
            return r3
        L55:
            com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus r9 = (com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentStatus) r9
            zag.e r7 = new zag.e
            r7.<init>(r9)
            r6.C2(r7)
            goto La6
        L60:
            boolean r9 = r8 instanceof qei.c
            if (r9 == 0) goto L87
            zag.g r9 = new zag.g
            java.lang.String r0 = r1.f93799a
            java.lang.Comparable r1 = r7.getStart()
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            java.lang.Comparable r7 = r7.b()
            java.time.LocalDate r7 = (java.time.LocalDate) r7
            qei.c r8 = (qei.c) r8
            cgi.f r8 = r8.f245164a
            com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation r8 = vc.o.H(r8)
            java.util.List r8 = zhm.u.c(r8)
            r9.<init>(r0, r1, r7, r8)
            r6.C2(r9)
            goto La6
        L87:
            boolean r6 = r8 instanceof qei.a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            if (r6 == 0) goto L98
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking r6 = new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$AlternativeRoomsAvailable r8 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract.ModalStep.ManageBooking.DialogScenario.AlternativeRoomsAvailable.f93807g
            r6.<init>(r8)
            oki.h.v2(r0, r6, r7)
            goto La6
        L98:
            boolean r6 = r8 instanceof qei.b
            if (r6 == 0) goto La9
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking r6 = new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep$ManageBooking$DialogScenario$NoRoomsAvailable r8 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract.ModalStep.ManageBooking.DialogScenario.NoRoomsAvailable.f93808g
            r6.<init>(r8)
            oki.h.v2(r0, r6, r7)
        La6:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        La9:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a, vim.d, qei.e, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(rd0.e.b(this.f93810q.a(this.o.f93799a, false)), h0.f322473a), null, null, new yy6.f(this, continuation, 22), 3);
        l.a1(this, this.u.B(new z8h.b(21)), null, null, new z3f.b(this, continuation, 6), 3);
    }

    public final void J2(TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogAction dialogAction) {
        boolean zF = Intrinsics.f(dialogAction, TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogAction.CancelBooking.f93801a);
        TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData travelHotelsBookingAmendmentDatesPickerScreenContract$InputData = this.o;
        if (zF) {
            C2(new zag.f(travelHotelsBookingAmendmentDatesPickerScreenContract$InputData.f93799a));
            return;
        }
        if (!Intrinsics.f(dialogAction, TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogAction.ChangeRoom.f93803a)) {
            if (!Intrinsics.f(dialogAction, TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogAction.ChangeDates.f93802a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            vim.d dVar = ((zag.d) ((j2) this.u.f22677a).getValue()).f320689c;
            if (dVar != null) {
                C2(new zag.h(travelHotelsBookingAmendmentDatesPickerScreenContract$InputData.f93799a, (LocalDate) dVar.getStart(), (LocalDate) dVar.b()));
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
