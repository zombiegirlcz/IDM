package com.revolut.feature.structured_note.details.impl.ui.screens.about_note;

import ael.d0;
import ael.k;
import cli.g;
import cli.y;
import g5e.e;
import g5e.i;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import ybl.b;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements e {
    public final AboutNoteScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f88882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f88883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f88884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88885s;

    public a(AboutNoteScreenContract$InputData inputData, g5e.h mapper, d0 stocksInteractor, b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = inputData;
        this.f88882p = stocksInteractor;
        this.f88883q = instrumentTickerInteractor;
        this.f88884r = d.b(this, new g5e.d(null, null), mapper, null, false, 12);
        this.f88885s = hx7.e.a(this, new fv1.a(this, 26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88885s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        AboutNoteScreenContract$InputData aboutNoteScreenContract$InputData = this.o;
        l.b1(this, nim.a.v(rd0.e.b(this.f88882p.a(aboutNoteScreenContract$InputData.f88880a, false)), new g3e.h(25)), null, new i(this, null, 1), 3);
        l.b1(this, rd0.e.b(((k) this.f88883q).f(aboutNoteScreenContract$InputData.f88880a)), null, new i(this, null, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f88884r;
    }
}
