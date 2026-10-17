package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker;

import cli.y;
import gr6.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx5.g;
import mz3.r;
import n47.l;
import n47.t;
import oki.h;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements l {
    public final l80.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q47.c f74418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f74419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o47.b f74420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zxd.c f74421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f74422t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74423w;

    public f(l80.e dateProvider, q47.c dialogFactory, m freelancerPocketsInteractor, o47.b periodCalculator, zxd.c statementsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, t stateMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(periodCalculator, "periodCalculator");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dateProvider;
        this.f74418p = dialogFactory;
        this.f74419q = freelancerPocketsInteractor;
        this.f74420r = periodCalculator;
        this.f74421s = statementsInteractor;
        this.f74422t = transactionsInteractor;
        this.u = new vii.b();
        this.v = mra.d.b(this, new TaxHubTransactionExportPeriodPickerScreenContract$DomainState(0), stateMapper, null, false, 12);
        this.f74423w = hx7.e.a(this, new r(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new mk0.f(continuation, this, 15)), null, null, new g(this, continuation, 17), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74423w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
