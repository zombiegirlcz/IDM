package com.revolut.feature.backend_driven_limits.impl.v2.ui.list;

import cli.g;
import cli.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sek.q;
import sl2.i;
import sl2.j;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends h implements j {
    public final hl2.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f63216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sl2.b f63217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RestrictionsScreenContract$InputData f63218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f63219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f63220t;

    public d(e stateMapper, hl2.a interactor, x deeplinkHandler, sl2.b modalsProvider, RestrictionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(modalsProvider, "modalsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f63216p = deeplinkHandler;
        this.f63217q = modalsProvider;
        this.f63218r = inputData;
        this.f63219s = hx7.e.a(this, new scl.h(this, 14));
        this.f63220t = mra.d.b(this, new i(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        nl2.c cVar = (nl2.c) this.o;
        cVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        rl2.d dVar = cVar.f216987a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, dVar.e.b(Unit.f186387a, loadingStrategy), null, null, new q(this, null, 6), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f63219s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f63220t;
    }
}
