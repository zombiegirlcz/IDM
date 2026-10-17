package com.revolut.feature.security_hub.impl.ui.street_mode.trusted_locations_list;

import au.c0;
import cli.g;
import cli.y;
import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import wtc.g0;
import xif.k;
import xvc.f;
import xvc.l;
import xvc.n;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements l {
    public final g0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f85696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f85697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85698r;

    public a(n stateMapper, g0 streetModeInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = streetModeInteractor;
        this.f85696p = featureToggleInteractor;
        this.f85697q = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f85698r = e.a(this, new k(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        boolean zC = ((jte.d) this.f85696p).c(SecurityHubApi$Toggles.StreetModeWifi.f85371c);
        yji.l.a1(this, rd0.e.n(this.o.e(), h0.f322473a), null, null, new c0(zC, this, (Continuation) null, 28), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85698r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85697q;
    }
}
