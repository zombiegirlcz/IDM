package com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest;

import cli.y;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mx5.g;
import n33.l0;
import n6h.e;
import n6h.f;
import oki.h;
import r10.r;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements e {
    public final n6h.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f95462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WealthMarginBorrowingInterestScreenContract$InputData f95463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f95464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95465s;

    public a(f stateMapper, n6h.a marginBorrowingInterestRateMapperDialogMapper, r wealthMarginInteractor, WealthMarginBorrowingInterestScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(marginBorrowingInterestRateMapperDialogMapper, "marginBorrowingInterestRateMapperDialogMapper");
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = marginBorrowingInterestRateMapperDialogMapper;
        this.f95462p = wealthMarginInteractor;
        this.f95463q = inputData;
        this.f95464r = d.b(this, new n6h.d(inputData.f95458b), stateMapper, null, false, 12);
        this.f95465s = hx7.e.a(this, new mz3.r(this, 21));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95465s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, mo3.a.e(v7.y("WealthMarginBorrowingInterestScreenModel", "interest widget observe borrowing limit", vzg.a.e(this.f95462p, this.f95463q.f95457a)), new l0(18), new l0(19)), null, new g(this, null, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95464r;
    }
}
