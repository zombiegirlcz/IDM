package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import hx7.e;
import i9g.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import p8g.c;
import q2e.i0;
import q5g.f0;
import qbg.f;
import qbg.g;
import qbg.l;
import ubg.k;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements g {
    public final TravelHotelsCancellationPolicyScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f93880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f93881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f93882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f93884t;

    public a(l stateMapper, TravelHotelsCancellationPolicyScreenContract$InputData inputData, n travelHotelsBookingInteractor, c travelHotelsFeatureInteractor, k pointsReversalDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsBookingInteractor, "travelHotelsBookingInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(pointsReversalDialogMapper, "pointsReversalDialogMapper");
        this.o = inputData;
        this.f93880p = travelHotelsBookingInteractor;
        this.f93881q = travelHotelsFeatureInteractor;
        this.f93882r = pointsReversalDialogMapper;
        this.f93883s = e.a(this, new f0(this, 12));
        this.f93884t = d.b(this, new qbg.e(new Data(null, null, false, 7, null), inputData.f93869a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        TravelHotelsCancellationPolicyScreenContract$Mode travelHotelsCancellationPolicyScreenContract$Mode = this.o.f93869a;
        boolean z = travelHotelsCancellationPolicyScreenContract$Mode instanceof TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation;
        n nVar = this.f93880p;
        Continuation continuation = null;
        if (z) {
            gVar = rd0.e.b(ue0.e.p(nim.a.w(nVar.a(((TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation) travelHotelsCancellationPolicyScreenContract$Mode).f93876a, false), new qb5.a(4)), h0.f322473a));
        } else if (travelHotelsCancellationPolicyScreenContract$Mode instanceof TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByBookingId) {
            gVar = rd0.e.b(ue0.e.p(nim.a.w(nVar.a(((TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByBookingId) travelHotelsCancellationPolicyScreenContract$Mode).f93877a, false), new qb5.a(4)), h0.f322473a));
        } else {
            if (!(travelHotelsCancellationPolicyScreenContract$Mode instanceof TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData = (TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData) travelHotelsCancellationPolicyScreenContract$Mode;
            gVar = new go.g(new Data(new f(travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData.f93878a, travelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData.f93879b, null), null, false, 6, null), 2);
        }
        yji.l.a1(this, gVar, null, null, new i0(this, continuation, 29), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93883s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93884t;
    }
}
