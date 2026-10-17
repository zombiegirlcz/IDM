package com.revolut.feature.spending_analytics.impl.ui.rev10.settings;

import bw4.s;
import ck7.j;
import cli.g;
import cli.n;
import cli.y;
import cnc.t;
import com.revolut.data.model.Data;
import crd.b;
import crd.i;
import eqj.d;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {

    @NotNull
    public static final i Companion = new i();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final erd.a f87902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f87903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f87904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f87905s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87906t;

    public a(n stateMapper, d analyticsCustomPeriodInteractor, erd.a analyticsFrequencySheetProvider, j60.a bottomDialog, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(analyticsCustomPeriodInteractor, "analyticsCustomPeriodInteractor");
        Intrinsics.checkNotNullParameter(analyticsFrequencySheetProvider, "analyticsFrequencySheetProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = analyticsCustomPeriodInteractor;
        this.f87902p = analyticsFrequencySheetProvider;
        this.f87903q = bottomDialog;
        this.f87904r = mra.d.b(this, new crd.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f87905s = z1VarB;
        this.f87906t = e.a(this, new t(this, 12));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87906t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f87905s, new s(continuation, this, 24)), null, new j(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f87904r;
    }
}
