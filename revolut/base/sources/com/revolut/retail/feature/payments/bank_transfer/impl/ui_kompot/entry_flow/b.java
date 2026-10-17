package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import d8l.d;
import efm.r;
import k3k.k;
import k4k.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements k4k.b {
    public final BankTransferFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f102094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f102095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.i f102096r;

    public b(BankTransferFlowInputData inputData, i balancesFilterInteractor, e interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f102094p = balancesFilterInteractor;
        this.f102095q = interactor;
        this.f102096r = d.a(this, new k(this, 3));
    }

    @Override // yki.j
    public final void M0() {
        e eVar = this.f102095q;
        eVar.getClass();
        BankTransferFlowInputData inputData = this.o;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        r rVarN = eVar.f180935c.d.c().n();
        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
        l.a1(this, q.H(new k0g.b(eVar, inputData, (Continuation) null, 8), rd0.e.b(rVarN)), null, null, new a(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102096r;
    }
}
