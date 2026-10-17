package com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r10.r;
import s56.i;
import s6e.g;
import s6h.f;
import s6h.m;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements f {
    public final MarginStatusScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f95475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f95476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95477r;

    public a(MarginStatusScreenContract$InputData inputData, r wealthMarginStatusInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthMarginStatusInteractor, "wealthMarginStatusInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f95475p = wealthMarginStatusInteractor;
        this.f95476q = d.b(this, new s6h.d(null), stateMapper, null, false, 12);
        this.f95477r = e.a(this, new s6d.r(8));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95477r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, com.revolut.data.database.models.openbanking.d.x("MarginStatusScreenModel", "pollWealthMarginBorrowingStatus", nim.a.v(vzg.a.c(this.f95475p, this.o.f95473a, null, null, 14), new g(11))), null, new i(this, null, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95476q;
    }
}
