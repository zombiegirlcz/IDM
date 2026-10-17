package com.revolut.feature.credit.card.impl.ui.cancellation.checkout;

import al4.n;
import aq4.e;
import aq4.f;
import aq4.k;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.x2;
import w4l.i;
import w4l.j;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements f {
    public final CancellationCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f69111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f69112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69113s;

    public b(CancellationCheckoutScreenContract$InputData inputData, n creditCardInteractor, ang.f userInteractor, k stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69110p = creditCardInteractor;
        this.f69111q = userInteractor;
        this.f69112r = d.b(this, new e(inputData.f69102a, new Data(null, null, true, 3, null), inputData.f69104c, inputData.d, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f69113s = hx7.e.a(this, new anc.b(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        l.a1(this, rd0.e.d(yh5.b.d(((x2) this.f69110p).y(this.o.f69103b, i.f294643c), nim.a.v(this.f69111q.j(j.f294644c), aq4.h.f)), h0.f322473a), null, null, new ap7.k(this, null, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69113s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f69112r;
    }
}
