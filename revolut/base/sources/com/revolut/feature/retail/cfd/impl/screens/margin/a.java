package com.revolut.feature.retail.cfd.impl.screens.margin;

import cli.g;
import cli.y;
import kge.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t2b.f;
import w3b.b;
import w3b.e;
import w3b.k;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.b f82229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f82230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f82231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f82232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f82233t;
    public final y u;

    public a(l4i.a amountConverter, o7.b cfdOpenPositionsDelegate, d cfdPositionsInteractor, e inputData, ybl.b instrumentTickerInteractor, f marginQuoteProvider, k stateMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cfdOpenPositionsDelegate, "cfdOpenPositionsDelegate");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(marginQuoteProvider, "marginQuoteProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountConverter;
        this.f82229p = cfdOpenPositionsDelegate;
        this.f82230q = cfdPositionsInteractor;
        this.f82231r = inputData;
        this.f82232s = instrumentTickerInteractor;
        this.f82233t = marginQuoteProvider;
        this.u = mra.d.b(this, new w3b.d(null, null, inputData.f.getF82228b()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, boh.f.e(rd0.e.b(((ael.k) this.f82232s).f(this.f82231r.f294258a)), new vx9.b(this, 28)), null, new vrl.d(this, null, 24), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
