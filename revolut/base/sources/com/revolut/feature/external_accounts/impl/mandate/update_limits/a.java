package com.revolut.feature.external_accounts.impl.mandate.update_limits;

import bh6.j;
import cli.n;
import cli.y;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import dj0.d;
import e7l.g;
import ik3.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lh6.i;
import oki.h;
import rd0.e;
import vkm.q;
import xg6.x;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements i {
    public final UpdateLimitsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f72471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f72472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fk3.a f72473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f72474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f72475t;

    public a(n stateMapper, UpdateLimitsScreenContract$InputData inputData, x mandateInteractor, j uriDestinationProvider, fk3.a configurationInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(uriDestinationProvider, "uriDestinationProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f72471p = mandateInteractor;
        this.f72472q = uriDestinationProvider;
        this.f72473r = configurationInteractor;
        this.f72474s = idempotencyKeyHolder;
        d dVar = inputData.f72469b;
        d dVar2 = inputData.f72470c;
        d dVar3 = inputData.d;
        boolean z = inputData.f72468a instanceof UpdateLimitsMode.UpdateMandate;
        this.f72475t = mra.d.b(this, new lh6.h(dVar, dVar2, dVar3, z, z, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.P(e.b(m70.a.g(((c) this.f72473r).k(g.b.f123407a), null, null, 3)), 1), null, null, new le8.d(this, (Continuation) null, 5), 3);
        this.f72474s.a("CREATE_MANDATE_IDEMPOTENCY_TAG");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72475t;
    }
}
