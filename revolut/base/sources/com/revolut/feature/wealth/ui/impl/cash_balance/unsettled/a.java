package com.revolut.feature.wealth.ui.impl.cash_balance.unsettled;

import cli.y;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import fgj.g;
import fkh.d;
import fkh.f;
import fkh.i;
import fkh.l;
import gkh.b;
import hx7.e;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pih.j;
import vii.c;
import x8h.q;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements d {
    public final UnsettledDialogInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fkg.a f95982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f95983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gkh.a f95984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f95985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f95986t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public a(l stateMapper, UnsettledDialogInputData inputData, fkg.a investOrdersCommonProvider, q investTransactionsInteractor, gkh.a investOrdersFilterProvider, b investTransactionsFilterProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersCommonProvider, "investOrdersCommonProvider");
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        Intrinsics.checkNotNullParameter(investOrdersFilterProvider, "investOrdersFilterProvider");
        Intrinsics.checkNotNullParameter(investTransactionsFilterProvider, "investTransactionsFilterProvider");
        this.o = inputData;
        this.f95982p = investOrdersCommonProvider;
        this.f95983q = investTransactionsInteractor;
        this.f95984r = investOrdersFilterProvider;
        this.f95985s = investTransactionsFilterProvider;
        this.f95986t = new c();
        this.u = e.a(this, new g(this, 10));
        this.v = mra.d.b(this, new fkh.e(null, null, null, null), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        j jVar = j.UnsettledBuys;
        j jVar2 = j.AvailableToWithdraw;
        List listK = v.k(jVar, jVar2);
        UnsettledDialogInputData unsettledDialogInputData = this.o;
        boolean zContains = listK.contains(unsettledDialogInputData.f95928b);
        y yVar = this.v;
        c cVar = this.f95986t;
        Continuation continuation = null;
        if (zContains) {
            int i = 0;
            yji.l.b1(this, nim.a.v(vkm.q.Q(oi0.d.w(cVar), new fkh.g(i, this, continuation)), new f(i)), null, new i(0, this, null), 3);
        } else {
            H2(yVar, new f(1));
        }
        if (v.k(j.UnsettledSells, jVar2).contains(unsettledDialogInputData.f95928b)) {
            yji.l.b1(this, nim.a.v(vkm.q.Q(oi0.d.w(cVar), new fkh.g(1, this, continuation)), new fj5.e(26)), null, new i(1, this, null), 3);
        } else {
            H2(yVar, new fj5.e(27));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
