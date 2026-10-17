package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking;

import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlowContract$Step;
import cu8.r0;
import hx7.e;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import mti.c;
import oki.h;
import qki.d;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements vti.b {
    public final r0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f98790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f98791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f98792r;

    public b(r0 kycRequiredActionTransformer, c idempotencyInteractor) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(idempotencyInteractor, "idempotencyInteractor");
        this.o = kycRequiredActionTransformer;
        this.f98790p = idempotencyInteractor;
        this.f98791q = e.b(this, new AsftPassBookingFlowContract$State(null, null, null, null));
        this.f98792r = d8l.d.a(this, new vh9.b(this, 24));
    }

    public final AsftPassBookingFlowContract$Step.Checkout I2() {
        d dVar = this.f98791q;
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = ((AsftPassBookingFlowContract$State) ((j2) dVar.f22677a).getValue()).f98773a;
        j2 j2Var = (j2) dVar.f22677a;
        String str = ((AsftPassBookingFlowContract$State) j2Var.getValue()).f98774b;
        String str2 = ((AsftPassBookingFlowContract$State) j2Var.getValue()).f98775c;
        String str3 = ((AsftPassBookingFlowContract$State) j2Var.getValue()).d;
        if (asftPassBookingFlowContract$UserBookingDetails != null && str != null && str2 != null && str3 != null) {
            return new AsftPassBookingFlowContract$Step.Checkout(asftPassBookingFlowContract$UserBookingDetails, str, str2, str3);
        }
        J2("buildCheckoutStep failed");
        return null;
    }

    public final void J2(String str) {
        d dVar = this.f98791q;
        j2 j2Var = (j2) dVar.f22677a;
        j2 j2Var2 = (j2) dVar.f22677a;
        boolean z = ((AsftPassBookingFlowContract$State) j2Var.getValue()).f98773a == null;
        AsftPassBookingFlowContract$UserBookingDetails asftPassBookingFlowContract$UserBookingDetails = ((AsftPassBookingFlowContract$State) j2Var2.getValue()).f98773a;
        String str2 = ((AsftPassBookingFlowContract$State) j2Var2.getValue()).f98774b;
        String str3 = ((AsftPassBookingFlowContract$State) j2Var2.getValue()).f98775c;
        String str4 = ((AsftPassBookingFlowContract$State) j2Var2.getValue()).d;
        String str5 = asftPassBookingFlowContract$UserBookingDetails != null ? asftPassBookingFlowContract$UserBookingDetails.d : null;
        Integer numValueOf = asftPassBookingFlowContract$UserBookingDetails != null ? Integer.valueOf(asftPassBookingFlowContract$UserBookingDetails.f98787a) : null;
        LocalDate localDate = asftPassBookingFlowContract$UserBookingDetails != null ? asftPassBookingFlowContract$UserBookingDetails.f98788b : null;
        AsftTimeSlot asftTimeSlot = asftPassBookingFlowContract$UserBookingDetails != null ? asftPassBookingFlowContract$UserBookingDetails.f98789c : null;
        String strS = asftTimeSlot != null ? j6.a.s("AsftTimeSlot(openTime=", asftTimeSlot.f98749a, ", closeTime=", asftTimeSlot.f98750b, ")") : null;
        StringBuilder sbT = p.a.t(str, " selectedAirportIataCode:", str2, " selectedAirportTerminalId:", str3);
        sbT.append(" userBookingDetailsNull:");
        sbT.append(z);
        sbT.append(" prebookedSlotId:");
        sbT.append(str4);
        sbT.append(" flightNumber:");
        sbT.append(str5);
        sbT.append(" totalNumberOfTravelers:");
        sbT.append(numValueOf);
        sbT.append(" selectedFlightDate:");
        sbT.append(localDate);
        sbT.append(" selectedTimeSlot:");
        sbT.append(strS);
        sbT.toString();
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new vti.e(this, 0));
    }

    @Override // qki.e
    public final d getState() {
        return this.f98791q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98792r;
    }
}
