package com.revolut.feature.transaction_list.impl.ui.list.flow;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$Step;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.List;
import jkh.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import mjf.f;
import mra.d;
import oki.h;
import qg7.v;
import qgf.i;
import qgf.k;
import qgf.r;
import r70.c;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yi5.b;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements i {
    public final TransactionListFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f91915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f91916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f91917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f91918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f91919t;
    public final y u;
    public final yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f91920w;

    public a(TransactionListFlowContract$InputData inputData, f calculatedBalanceAvailabilityInteractor, c hapticEngine, qgf.y mapper) {
        Clause clauseK2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(calculatedBalanceAvailabilityInteractor, "calculatedBalanceAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f91915p = calculatedBalanceAvailabilityInteractor;
        this.f91916q = hapticEngine;
        this.f91917r = ta6.a.a(0);
        this.f91918s = ta6.a.a(0);
        this.f91919t = q.c(inputData.f);
        f0 f0Var = f0.f322471a;
        boolean z = !d0.W(inputData.f);
        TransactionsListFilterType.ConfigurableFilter configurableFilterL2 = L2(inputData);
        TransactionsListFilterType transactionsListFilterType = inputData.e;
        if (calculatedBalanceAvailabilityInteractor.a(transactionsListFilterType)) {
            m70.a.c(t0.f186434a);
            clauseK2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            clauseK2 = K2(inputData);
        }
        this.u = d.b(this, new qgf.h(f0Var, null, z, configurableFilterL2, false, clauseK2, calculatedBalanceAvailabilityInteractor.a(transactionsListFilterType) ? null : inputData.f91902b, calculatedBalanceAvailabilityInteractor.a(transactionsListFilterType) ? k.ANIMATED : k.STATIC), mapper, null, false, 12);
        this.v = cp5.d.a(this, TransactionListFlowContract$Step.Past.f91913a, f0Var, new q5g.f0(this, 20));
    }

    public static final qgf.h I2(a aVar, qgf.h hVar, boolean z, TransactionListFlowContract$InputData transactionListFlowContract$InputData) {
        return qgf.h.a(hVar, null, null, false, null, false, z ? hVar.f : K2(transactionListFlowContract$InputData), z ? hVar.f245802g : transactionListFlowContract$InputData.f91902b, z ? k.ANIMATED : k.STATIC, 31);
    }

    public static Clause K2(TransactionListFlowContract$InputData transactionListFlowContract$InputData) {
        return transactionListFlowContract$InputData.f91910p ? new TextLocalisedClause(R$string.transactions_list_screen_pending_transactions_title, null, null, 14) : transactionListFlowContract$InputData.f91901a;
    }

    public static TransactionsListFilterType.ConfigurableFilter L2(TransactionListFlowContract$InputData transactionListFlowContract$InputData) {
        TransactionsListFilterType transactionsListFilterType = transactionListFlowContract$InputData.e;
        if (transactionsListFilterType instanceof TransactionsListFilterType.ByAccounts) {
            return ((TransactionsListFilterType.ByAccounts) transactionsListFilterType).f92007a;
        }
        if (transactionsListFilterType instanceof TransactionsListFilterType.ByTransactionsFilter) {
            return new TransactionsListFilterType.ConfigurableFilter.SelectableFilters(((TransactionsListFilterType.ByTransactionsFilter) transactionsListFilterType).f92011c);
        }
        if (transactionsListFilterType instanceof TransactionsListFilterType.NoFilters) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        l2(new qgf.q(this, null), new b(26));
        l.a1(this, q.H(new r(this, null), this.u.B(new v(1))), null, null, new g(this, (Continuation) null, 28), 3);
    }

    public final void J2(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        y yVar = this.u;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (((qgf.h) j2Var.getValue()).f245803h == k.ANIMATED && !((qgf.h) j2Var2.getValue()).f245801c && clause != null && ((qgf.h) j2Var2.getValue()).f245802g != null && !Intrinsics.f(((qgf.h) j2Var2.getValue()).f245802g, clause)) {
            c.b(this.f91916q, 3);
        }
        H2(yVar, new qce.a(title, clause, 10));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
