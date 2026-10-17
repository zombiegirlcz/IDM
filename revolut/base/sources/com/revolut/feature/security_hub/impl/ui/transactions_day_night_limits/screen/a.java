package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen;

import ang.f;
import cli.y;
import cvi.i;
import dt4.p;
import dwc.g;
import dwc.j;
import ewc.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mt8.d;
import oki.h;
import vkm.q;
import wli.x;
import wtc.k;
import wtc.q0;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements g {
    public final TransactionsDayNightLimitsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f85727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fwc.a f85728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f85729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f85730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f85731t;
    public final d u;
    public final x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f85732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85733x;

    public a(j stateMapper, TransactionsDayNightLimitsScreenContract$InputData inputData, k outboundTransactionLimitsInteractor, fwc.a transactionsLimitsDialogFactory, f userInteractor, q0 userCountryInteractor, e transactionDayNightLimitsDialogFactory, d kycInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(outboundTransactionLimitsInteractor, "outboundTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(transactionsLimitsDialogFactory, "transactionsLimitsDialogFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        Intrinsics.checkNotNullParameter(transactionDayNightLimitsDialogFactory, "transactionDayNightLimitsDialogFactory");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f85727p = outboundTransactionLimitsInteractor;
        this.f85728q = transactionsLimitsDialogFactory;
        this.f85729r = userInteractor;
        this.f85730s = userCountryInteractor;
        this.f85731t = transactionDayNightLimitsDialogFactory;
        this.u = kycInteractor;
        this.v = deeplinkHandler;
        this.f85732w = mra.d.b(this, new dwc.e(0), stateMapper, null, false, 12);
        this.f85733x = hx7.e.a(this, new p(this, 8));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85733x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.Q(mo3.a.g(this.f85729r.j(w4l.h.f294642c), null, null, 3), new i((Continuation) null, this, 27)), null, new dwc.l(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85732w;
    }
}
