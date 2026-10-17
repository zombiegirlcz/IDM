package com.revolut.feature.security_hub.impl.ui.hidden_transactions;

import cli.g;
import cli.y;
import com.revolut.core.model.account.AccountId;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nk4.o;
import nuc.l;
import nuc.p;
import oki.h;
import tof.u9;
import whf.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements l {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f85584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g8i.a f85585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final puc.a f85586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.b f85587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f85588t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(b contentProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, g8i.a transactionDetailsModalNavigationChecker, puc.a dialogMapper, p stateMapper) {
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionDetailsModalNavigationChecker, "transactionDetailsModalNavigationChecker");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = contentProvider;
        this.f85584p = transactionsInteractor;
        this.f85585q = transactionDetailsModalNavigationChecker;
        this.f85586r = dialogMapper;
        ihm.b bVarE = ihm.b.e(new u9(true));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f85587s = bVarE;
        this.f85588t = d.b(this, new nuc.h(0), stateMapper, null, false, 12);
        this.u = e.a(this, new o(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(b.a(this.o, this.f85587s, null, null, AccountId.Personal.f51414a, 2)), null, null, new nn7.d(this, null, 22), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85588t;
    }
}
