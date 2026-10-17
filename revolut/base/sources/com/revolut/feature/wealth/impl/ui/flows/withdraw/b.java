package com.revolut.feature.wealth.impl.ui.flows.withdraw;

import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import t1h.j;
import t1h.k;
import vah.c;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements c {
    public final WithdrawFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f95570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1h.a f95571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f95572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f95573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f95574t;

    public b(WithdrawFlowContract$Step initialStep, WithdrawFlowContract$State initialState, WithdrawFlowContract$Input inputData, j withdrawRequestDelegate, t1h.a withdrawDialogsProvider, k resultHandler) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(withdrawRequestDelegate, "withdrawRequestDelegate");
        Intrinsics.checkNotNullParameter(withdrawDialogsProvider, "withdrawDialogsProvider");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.o = inputData;
        this.f95570p = withdrawRequestDelegate;
        this.f95571q = withdrawDialogsProvider;
        this.f95572r = resultHandler;
        this.f95573s = e.b(this, initialState);
        this.f95574t = cp5.d.a(this, initialStep, f0.f322471a, new v48.d(this, 11));
    }

    @Override // qki.e
    public final d getState() {
        return this.f95573s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f95574t;
    }
}
