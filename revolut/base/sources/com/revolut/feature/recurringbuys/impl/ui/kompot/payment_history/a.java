package com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import pu5.e;
import rt4.o;
import rva.b;
import te0.w;
import tof.q7;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final PaymentHistoryContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final anf.b f81667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f81668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f81669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nva.a f81670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f81671t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(PaymentHistoryContract$InputData inputData, rva.h stateMapper, anf.b transactionSumCalculator, whf.b transactionsListContentProvider, e cryptoTransactionDetailsNavigator, nva.a filterBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionSumCalculator, "transactionSumCalculator");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(filterBuilder, "filterBuilder");
        this.o = inputData;
        this.f81667p = transactionSumCalculator;
        this.f81668q = transactionsListContentProvider;
        this.f81669r = cryptoTransactionDetailsNavigator;
        this.f81670s = filterBuilder;
        this.f81671t = d.b(this, new rva.a(new Data(null, null, true, 3, null), inputData.f81662a), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new rl8.d(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        PaymentHistoryContract$InputData paymentHistoryContract$InputData = this.o;
        String str = paymentHistoryContract$InputData.f81663b;
        String str2 = paymentHistoryContract$InputData.f81664c;
        nva.a aVar = this.f81670s;
        q7 q7VarB = aVar.b(str, str2);
        q7 q7VarA = aVar.a(str, str2);
        l.b1(this, rd0.e.b(nim.a.w(kli.a.h(whf.b.a(this.f81668q, w.h(q7VarB), null, null, null, 14), whf.b.a(this.f81668q, w.h(q7VarA), null, null, null, 14)), new rrd.l(this, 14))), null, new o(this, null, 6), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f81671t;
    }
}
