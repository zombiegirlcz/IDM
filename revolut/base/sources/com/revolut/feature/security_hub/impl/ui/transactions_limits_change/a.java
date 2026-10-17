package com.revolut.feature.security_hub.impl.ui.transactions_limits_change;

import ang.f;
import cli.g;
import cli.y;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import hx7.e;
import ix6.l0;
import ji1.m;
import jwc.k;
import jwc.n;
import jwc.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lwc.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import smd.s;
import vkm.j2;
import w80.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements k {

    @NotNull
    public static final p Companion = new p();
    public final wtc.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransactionsLimitsChangeScreenContract$InputData f85765p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jwc.a f85767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f85768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f85769t;
    public final d u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85770w;

    public a(wtc.k outboundTransactionLimitsInteractor, TransactionsLimitsChangeScreenContract$InputData inputData, b amountFormatter, jwc.a transactionLimitsChangeMessageProvider, f userInteractor, s countryTransactionLimitsInteractor, d transactionsLimitsChangeScreenDialogMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(outboundTransactionLimitsInteractor, "outboundTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(transactionLimitsChangeMessageProvider, "transactionLimitsChangeMessageProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(countryTransactionLimitsInteractor, "countryTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(transactionsLimitsChangeScreenDialogMapper, "transactionsLimitsChangeScreenDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = outboundTransactionLimitsInteractor;
        this.f85765p = inputData;
        this.f85766q = amountFormatter;
        this.f85767r = transactionLimitsChangeMessageProvider;
        this.f85768s = userInteractor;
        this.f85769t = countryTransactionLimitsInteractor;
        this.u = transactionsLimitsChangeScreenDialogMapper;
        OutboundTransactionLimit outboundTransactionLimit = inputData.f85758a;
        this.v = mra.d.b(this, new jwc.f(outboundTransactionLimit, outboundTransactionLimit, inputData.f85759b, null), stateMapper, null, false, 12);
        this.f85770w = e.a(this, new jnf.d(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 16), new yi5.b(26));
    }

    public final void I2() {
        y yVar = this.v;
        OutboundTransactionLimit outboundTransactionLimit = ((jwc.f) ((j2) yVar.f22677a).getValue()).f178956b;
        if (outboundTransactionLimit == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LimitValue limitValue = ((jwc.f) ((j2) yVar.f22677a).getValue()).f178956b.f85476b;
        if (limitValue == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        l2(new l0(this, limitValue, outboundTransactionLimit, (Continuation) null, 25), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85770w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
