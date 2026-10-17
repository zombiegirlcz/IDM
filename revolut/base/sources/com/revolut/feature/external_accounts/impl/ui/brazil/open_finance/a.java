package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance;

import bk6.g;
import bk6.i;
import bk6.q;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lf6.j;
import mra.d;
import oki.h;
import rd0.e;
import te0.w;
import tof.i7;
import tof.j9;
import tof.u9;
import whf.b;
import x4l.c;
import xg6.y;
import xg6.z;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements i {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a f72657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f72658q;

    public a(q stateMapper, y openFinanceTransactionsInteractor, com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(openFinanceTransactionsInteractor, "openFinanceTransactionsInteractor");
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        this.o = openFinanceTransactionsInteractor;
        this.f72657p = openBankingBrazilInteractor;
        this.f72658q = d.b(this, new g(bk6.h.TRANSACTIONS, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        b bVar = ((z) this.o).f305613a;
        i7.c cVar = i7.Companion;
        u9 u9Var = new u9(false);
        Intrinsics.checkNotNullParameter("OPEN_FINANCE", "externalRegulator");
        i7[] i7VarArr = {u9Var, new j9()};
        cVar.getClass();
        l.a1(this, e.b(b.a(bVar, w.h(i7.c.a(i7VarArr)), null, 100, null, 10)), null, null, new bk6.l(this, null, 2), 3);
        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b bVar2 = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) this.f72657p;
        bVar2.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = (j) bVar2.f72410a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c cVar2 = jVar.d;
        Unit unit = Unit.f186387a;
        l.a1(this, cVar2.b(unit, loadingStrategy), null, null, new bk6.l(this, null, 0), 3);
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar2 = (j) bVar2.f72410a;
        jVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, jVar2.e.b(unit, loadingStrategy), null, null, new bk6.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72658q;
    }
}
