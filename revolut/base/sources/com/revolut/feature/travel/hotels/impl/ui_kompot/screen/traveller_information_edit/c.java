package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreenContract$InputData;
import dfg.e;
import dfg.g;
import i9g.l;
import i9g.n;
import i9g.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends h implements g {
    public final TravelHotelsTravellerInformationEditScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f94073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f94074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0 f94075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f94076s;

    public c(cli.n stateMapper, TravelHotelsTravellerInformationEditScreenContract$InputData inputData, l draftInteractor, n travelHotelsBookingInteractor, n0 travellerInfoProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(draftInteractor, "draftInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(travellerInfoProvider, "travellerInfoProvider");
        this.o = inputData;
        this.f94073p = draftInteractor;
        this.f94074q = travelHotelsBookingInteractor;
        this.f94075r = travellerInfoProvider;
        this.f94076s = d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        TravelHotelsTravellerInformationEditScreenContract$InputData travelHotelsTravellerInformationEditScreenContract$InputData = this.o;
        if (travelHotelsTravellerInformationEditScreenContract$InputData instanceof TravelHotelsTravellerInformationEditScreenContract$InputData.Booking) {
            yji.l.a1(this, rd0.e.b(ue0.e.p(this.f94074q.a(((TravelHotelsTravellerInformationEditScreenContract$InputData.Booking) travelHotelsTravellerInformationEditScreenContract$InputData).f94070a, false), h0.f322473a)), null, null, new a(this, null), 3);
        } else {
            if (!(travelHotelsTravellerInformationEditScreenContract$InputData instanceof TravelHotelsTravellerInformationEditScreenContract$InputData.Draft)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new b(this, (TravelHotelsTravellerInformationEditScreenContract$InputData.Draft) travelHotelsTravellerInformationEditScreenContract$InputData, null), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94076s;
    }
}
