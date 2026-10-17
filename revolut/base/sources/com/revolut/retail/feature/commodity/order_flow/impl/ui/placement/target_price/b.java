package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import hx7.e;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o7j.a0;
import o7j.j;
import o7j.r;
import o7j.x;
import oki.h;
import ppk.f;
import q7j.g;
import te0.w;
import u80.t;
import vkm.j2;
import vkm.q;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements r {
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7j.a f99924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f99925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f99926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.a f99927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f99928t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(CommodityTargetPriceScreenContract$InputData inputData, g stateMapper, a0 saveStateDelegate, l4i.a amountConverter, o7j.a inputValueValidator, t ratesFormatter, f ratesInteractor, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(inputValueValidator, "inputValueValidator");
        Intrinsics.checkNotNullParameter(ratesFormatter, "ratesFormatter");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        this.o = amountConverter;
        this.f99924p = inputValueValidator;
        this.f99925q = ratesFormatter;
        this.f99926r = ratesInteractor;
        this.f99927s = keyboardControllerExtension;
        this.f99928t = w.y0(new bib.b(this, inputData, stateMapper, saveStateDelegate, 23));
        this.u = e.a(this, new nx2.f(this, 26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        j jVar = (j) ((j2) getState().f22677a).getValue();
        l.b1(this, rd0.e.b(nim.a.w(this.f99926r.c(u.c(new Pair(jVar.f222865c, jVar.d)), n9l.b.SEC_3), new o3k.a(jVar, 17))), null, new x(this, null, 0), 3);
        l.b1(this, nim.a.v(u0.m(new dr2.l(q.s(getState().B(new o69.b(19)), new o69.b(20), q.f290100b), 4), getState().B(new o69.b(21))), new o3k.a(this, 16)), null, new x(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f99928t.getValue();
    }
}
