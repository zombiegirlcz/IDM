package com.revolut.feature.external_accounts.impl.mandate.bottom_sheet;

import bh6.j;
import ch6.o;
import cli.n;
import cli.y;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.a;
import e7l.g;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import xg6.x;
import yji.l;
import zfd.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements zg6.b, zki.h {
    public final MandateSetupBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f72430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f72431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f72432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fk3.a f72433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f72434t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(n stateMapper, MandateSetupBottomSheetContract$InputData inputData, x mandateInteractor, o defaultLimitCalculator, j uriDestinationProvider, fk3.a configurationInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(defaultLimitCalculator, "defaultLimitCalculator");
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f72430p = mandateInteractor;
        this.f72431q = defaultLimitCalculator;
        this.f72432r = uriDestinationProvider;
        this.f72433s = configurationInteractor;
        this.f72434t = idempotencyKeyHolder;
        this.u = d.b(this, a.C0481a.f72429a, stateMapper, null, false, 12);
        this.v = e.a(this, new zba.a(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.P(rd0.e.b(m70.a.g(((ik3.c) this.f72433s).k(g.b.f123407a), null, null, 3)), 1), null, null, new s(this, (Continuation) null, 2), 3);
        this.f72434t.a("CREATE_MANDATE_IDEMPOTENCY_TAG");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
