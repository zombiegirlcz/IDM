package com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow;

import com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.LocationEnforceFlowContract$Step;
import jsl.t0;
import jwj.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements jwj.b {

    @NotNull
    public static final d Companion = new d();
    public final s70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iwj.a f101685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w39.b f101686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f101687r;

    public b(s70.a intentProvider, iwj.a locationEnforceManager, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(locationEnforceManager, "locationEnforceManager");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.o = intentProvider;
        this.f101685p = locationEnforceManager;
        this.f101686q = locationInteractor;
        jnf.d dVar = new jnf.d(this, 20);
        this.f101687r = cp5.d.a(this, LocationEnforceFlowContract$Step.Permission.f101684a, f0.f322471a, dVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new t0(this, (Continuation) null, 9), new whi.b(6));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f101687r;
    }
}
