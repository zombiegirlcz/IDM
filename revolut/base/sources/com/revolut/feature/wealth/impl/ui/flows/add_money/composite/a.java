package com.revolut.feature.wealth.impl.ui.flows.add_money.composite;

import hx7.e;
import i69.p;
import iah.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ozg.b;
import qki.d;
import tzg.k;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements c {
    public final CompositeAddMoneyFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m1h.a f95546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f95547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f95548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fah.c f95549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f95550t;
    public final yki.a u;

    public a(i90.b uuidUtils, CompositeAddMoneyFlowContract$Input input, m1h.a dialogProvider, k portfolioDepositInteractor, b resultHandler, fah.c networkConnectionErrorStatusDialogMapper) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(portfolioDepositInteractor, "portfolioDepositInteractor");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(networkConnectionErrorStatusDialogMapper, "networkConnectionErrorStatusDialogMapper");
        this.o = input;
        this.f95546p = dialogProvider;
        this.f95547q = portfolioDepositInteractor;
        this.f95548r = resultHandler;
        this.f95549s = networkConnectionErrorStatusDialogMapper;
        this.f95550t = e.b(this, new CompositeAddMoneyFlowContract$State(uuidUtils.a()));
        this.u = cp5.d.a(this, CompositeAddMoneyFlowContract$Step.COLLECT_DEPOSIT_INFO, f0.f322471a, new p(this, 7));
    }

    @Override // qki.e
    public final d getState() {
        return this.f95550t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
