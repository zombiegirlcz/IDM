package com.revolut.feature.travel.miles.impl.ui.flow.airline_details;

import cli.g;
import cli.y;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlowContract$Step;
import e54.r;
import egg.c;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rul.e;
import tig.b;
import vkm.j2;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f94202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2c.e f94203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f94204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f94205s;

    public a(TravelMilesAirlineDetailsFlowContract$InputData inputData, b topUpDialogMapper, e revPointsSpareChangeInteractor, a2c.e spareChangeNavigationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpDialogMapper, "topUpDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        this.o = topUpDialogMapper;
        this.f94202p = revPointsSpareChangeInteractor;
        this.f94203q = spareChangeNavigationResolver;
        this.f94204r = d.b(this, new egg.b(0), new a54.b(6), null, false, 12);
        this.f94205s = cp5.d.a(this, new TravelMilesAirlineDetailsFlowContract$Step.AirlineDetails(inputData.f94195a), f0.f322471a, new r(this, 28));
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (((egg.b) ((j2) this.f94204r.f22677a).getValue()).f125637a.getContent() == null) {
            l.b1(this, rd0.e.b(this.f94202p.o()), null, new ea4.d(this, null, 10), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f94204r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94205s;
    }
}
