package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mti.n;
import nyb.k;
import oki.h;
import prk.o;
import sui.j;
import sui.l;
import sui.m;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements j {
    public final AsftTerminalSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mti.b f98875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f98876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f98877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uui.a f98878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f98879t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(AsftTerminalSelectionScreenContract$InputData inputData, cli.n stateMapper, mti.b configInteractor, k revPointsInteractor, n terminalsInteractor, gte.a featureToggleInteractor, uui.a modalControllersBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(terminalsInteractor, "terminalsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(modalControllersBuilder, "modalControllersBuilder");
        this.o = inputData;
        this.f98875p = configInteractor;
        this.f98876q = revPointsInteractor;
        this.f98877r = terminalsInteractor;
        this.f98878s = modalControllersBuilder;
        this.f98879t = new vii.b();
        this.u = d.b(this, new sui.h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new suf.a(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l lVar = new l(0, this, continuation);
        vii.b bVar = this.f98879t;
        yji.l.a1(this, o.w("AsftTerminalSelectionScreenModel", "loadConfigTillFinish", q.Q(bVar, lVar)), null, null, new m(0, this, continuation), 3);
        yji.l.a1(this, o.w("AsftTerminalSelectionScreenModel", "loadTerminalsTillFinish", q.Q(bVar, new l(2, this, continuation))), null, null, new m(2, this, continuation), 3);
        yji.l.a1(this, o.w("AsftTerminalSelectionScreenModel", "loadRevPointsAccountStatusTillFinish", q.Q(bVar, new l(1, this, continuation))), null, null, new m(1, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
