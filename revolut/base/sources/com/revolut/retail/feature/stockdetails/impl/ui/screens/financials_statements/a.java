package com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements;

import amh.w;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nt4.f;
import nuc.n;
import nvk.a0;
import nvk.j;
import nvk.k;
import nvk.o;
import nvk.r;
import nvk.s;
import oki.h;
import uqk.e;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;
import z0h.d;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements j {
    public final StockFinancialsStatementsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qrk.b f103969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f103970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f103971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f103972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f103973t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(StockFinancialsStatementsControllerContract$InputData inputData, a0 stateMapper, qrk.b stockFinancialsInteractor, ybl.b instrumentTickerInteractor, d wealthDisclaimersDataProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(stockFinancialsInteractor, "stockFinancialsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDataProvider, "wealthDisclaimersDataProvider");
        this.o = inputData;
        this.f103969p = stockFinancialsInteractor;
        this.f103970q = instrumentTickerInteractor;
        this.f103971r = wealthDisclaimersDataProvider;
        this.f103972s = q.b(1, 5, null);
        this.f103973t = q.b(1, 4, null);
        this.u = mra.d.b(this, new k(null, e.ANNUALLY, new StockFinancialsStatementPeriodState(null, null), new StockFinancialsStatementPeriodState(null, null), r0.g(), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null)), stateMapper, o.f219726a, false, 8);
        this.v = hx7.e.a(this, new nk4.o(this, 26));
    }

    public static StockFinancialsStatementPeriodState I2(a aVar, e eVar) {
        k kVar = (k) ((j2) aVar.u.f22677a).getValue();
        int i = nvk.q.f219729a[eVar.ordinal()];
        if (i == 1) {
            return kVar.f219716c;
        }
        if (i == 2) {
            return kVar.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.u;
        e eVar = ((k) ((j2) yVar.f22677a).getValue()).f219715b;
        z1 z1Var = this.f103973t;
        z1Var.k(eVar);
        Continuation continuation = null;
        n2(new f(this, continuation, 5), new whi.b(6));
        l.b1(this, new w(q.Q(z1Var, new s(1, this, continuation)), 20), null, new r(2, this, continuation), 3);
        l.b1(this, q.Q(yVar.B(new n(15)), new s(0, this, continuation)), null, new r(1, this, continuation), 3);
        l.b1(this, this.f103971r.w0(), null, new r(0, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
