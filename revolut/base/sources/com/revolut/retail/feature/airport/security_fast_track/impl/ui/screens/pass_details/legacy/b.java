package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nk4.o;
import nui.i;
import oki.h;
import vkm.q;
import yji.l;
import zsi.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements i {
    public final AsftPassDetailsLegacyScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f98860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zsi.i f98861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rui.a f98862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f98863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f98864t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(n stateMapper, AsftPassDetailsLegacyScreenContract$InputData inputData, e passesInteractor, zsi.i termsInteractor, rui.a passCancelBookingSuccessDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(passCancelBookingSuccessDialogMapper, "passCancelBookingSuccessDialogMapper");
        this.o = inputData;
        this.f98860p = passesInteractor;
        this.f98861q = termsInteractor;
        this.f98862r = passCancelBookingSuccessDialogMapper;
        this.f98863s = new vii.b();
        this.f98864t = d.b(this, new nui.h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new o(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f98863s, new ns9.h(continuation, this, 2)), null, null, new nn7.d(this, continuation, 24), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f98864t;
    }
}
