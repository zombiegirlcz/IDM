package com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement;

import ael.t;
import c1g.f0;
import cli.y;
import fmc.z;
import i6h.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pkf.x;
import q56.o;
import q6h.b;
import q6h.g;
import q6h.j;
import vii.c;
import vkm.q;
import vkm.z1;
import x8h.k;
import yji.l;
import yk0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final WealthMarginMinimumRequirementContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f95468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f95469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f95470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f95471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f95472t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public a(WealthMarginMinimumRequirementContract$InputData inputData, z pagingInteractorFactory, t portfolioBalanceInteractor, k displayCurrencyInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagingInteractorFactory, "pagingInteractorFactory");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f95468p = portfolioBalanceInteractor;
        this.f95469q = displayCurrencyInteractor;
        this.f95470r = q.b(0, 7, null);
        this.f95471s = new c();
        pyc.a getPagedData = new pyc.a(this, 22);
        o storePagedData = new o(this, 8);
        e initialParams = new e(inputData.f95466a, null);
        Intrinsics.checkNotNullParameter(getPagedData, "getPagedData");
        Intrinsics.checkNotNullParameter(storePagedData, "storePagedData");
        Intrinsics.checkNotNullParameter(initialParams, "initialParams");
        c6h.a repository = (c6h.a) pagingInteractorFactory.f136369b;
        wfm.j scheduler = d.a();
        Intrinsics.checkNotNullParameter(getPagedData, "getPagedData");
        Intrinsics.checkNotNullParameter(storePagedData, "storePagedData");
        Intrinsics.checkNotNullParameter(initialParams, "initialParams");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f95472t = new f0(new h1c.c(repository, 13), getPagedData, storePagedData, initialParams, new h5i.b(17), new h5i.b(18), scheduler);
        this.u = hx7.e.a(this, new q34.a(13));
        this.v = mra.d.b(this, new q6h.a(null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f95471s.a(Unit.f186387a, w4l.h.f294642c), new x(null, this, 28)), null, null, null, 7);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, rd0.e.n(xam.a.h(new g(this, continuation, 0), this.f95469q.b()), h0.f322473a), null, new g(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
