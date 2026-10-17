package com.revolut.feature.credit.autopay.ui.screen.amount.input;

import boh.f;
import cli.y;
import com.revolut.data.model.Data;
import dj0.d;
import hx7.e;
import java.util.ArrayList;
import jch.p;
import jk4.g;
import jk4.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import opf.c0;
import vkm.q;
import wsg.n;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements j {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f68609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InputAmountScreenContract$InputData f68610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i1j.a f68611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lb5.b f68612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f68613t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(n walletInteractor, w80.b amountFormatter, InputAmountScreenContract$InputData inputData, cli.n stateMapper, c0 transferSuggestedAmountsInteractor, i1j.a balancesFilterInteractor, lb5.b autopayInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        this.o = walletInteractor;
        this.f68609p = amountFormatter;
        this.f68610q = inputData;
        this.f68611r = balancesFilterInteractor;
        this.f68612s = autopayInteractor;
        Data data = new Data(null, null, false, 7, null);
        d dVar = inputData.f68604b;
        ArrayList arrayListA = transferSuggestedAmountsInteractor.a(dVar);
        InputAmountScreenContract$RepaymentInfo inputAmountScreenContract$RepaymentInfo = inputData.d;
        this.f68613t = mra.d.b(this, new g(data, dVar, arrayListA, inputAmountScreenContract$RepaymentInfo != null ? inputAmountScreenContract$RepaymentInfo.f68607a : false, null), stateMapper, null, false, 12);
        this.u = e.a(this, new p(this, 23));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(f.e(q.Q(q.q(this.f68613t.B(new jj3.a(12))), new iw6.l(continuation, this, 19)), new jk4.n(this, 0)), h0.f322473a), null, null, new jij.h(this, continuation, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f68613t;
    }
}
