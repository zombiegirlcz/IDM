package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements lui.h {
    public final AsftCancelBookingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f98853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f98854q;

    public a(AsftCancelBookingScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f98853p = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f98854q = e.a(this, new c(this, 11));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f98854q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f98853p;
    }
}
