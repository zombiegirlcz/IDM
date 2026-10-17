package com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.AsftMainFlowContract$Step;
import d8l.d;
import jvi.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pti.k;
import umd.n;
import yki.i;
import zsi.e;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements uti.b {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rui.a f98768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f98769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f98770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r39.a f98771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f98772t;
    public final i u;

    public b(gte.a featureToggleInteractor, rui.a passCancelBookingSuccessDialogMapper, c passAvailabilityMapper, e passesInteractor, r39.a purchaseResultDialogsMapper, k configRepository) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(passCancelBookingSuccessDialogMapper, "passCancelBookingSuccessDialogMapper");
        Intrinsics.checkNotNullParameter(passAvailabilityMapper, "passAvailabilityMapper");
        Intrinsics.checkNotNullParameter(passesInteractor, "passesInteractor");
        Intrinsics.checkNotNullParameter(purchaseResultDialogsMapper, "purchaseResultDialogsMapper");
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        this.o = featureToggleInteractor;
        this.f98768p = passCancelBookingSuccessDialogMapper;
        this.f98769q = passAvailabilityMapper;
        this.f98770r = passesInteractor;
        this.f98771s = purchaseResultDialogsMapper;
        this.f98772t = configRepository;
        this.u = d.a(this, new n(this, 11));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.u, new AsftMainFlowContract$Step.Home(null), false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
