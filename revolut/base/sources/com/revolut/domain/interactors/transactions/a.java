package com.revolut.domain.interactors.transactions;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import efm.d0;
import efm.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mh4.x;
import mhd.c;
import mif.e0;
import mjf.b0;
import qk.d;
import rd0.e;
import skm.p0;
import te0.w;
import tof.i1;
import tof.i7;
import tof.r9;
import ufm.i;
import vkm.v1;
import w4l.h;
import xif.o;
import xif.s;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    static i b(a aVar, i7 i7Var, List list, Integer num, TransactionsSort transactionsSort, TransactionContext transactionContext, int i) {
        if ((i & 2) != 0) {
            list = f0.f322471a;
        }
        List updates = list;
        if ((i & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            transactionsSort = TransactionsSort.DEFAULT;
        }
        TransactionsSort sort = transactionsSort;
        if ((i & 16) != 0) {
            TransactionContext.INSTANCE.getClass();
            transactionContext = TransactionContext.Companion.a();
        }
        TransactionContext context = transactionContext;
        b0 b0Var = (b0) aVar;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        b0Var.h(context.getF60265a());
        d0 d0VarA = ((s) b0Var.f205982a).a(i7Var, updates, num2, sort, context, new BreadcrumbException());
        d0 d0VarFirstOrError = b0Var.i().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        i iVar = new i(w.H0(d0VarA, d0VarFirstOrError), new c(new x(23), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    static r c(a aVar, String groupId, TransactionContext transactionContext, boolean z, int i) {
        i1 i1Var = (i & 2) != 0 ? null : i1.f272794a;
        if ((i & 4) != 0) {
            TransactionContext.INSTANCE.getClass();
            transactionContext = TransactionContext.Companion.a();
        }
        TransactionContext context = transactionContext;
        b0 b0Var = (b0) aVar;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(context, "context");
        b0Var.h(Priority.STANDARD.f60263b);
        r rVarD = ((s) b0Var.f205982a).d(new r9(groupId), f0.f322471a, null, TransactionsSort.DEFAULT, context, new BreadcrumbException());
        Object loadingStrategy = z ? w4l.i.f294643c : h.f294642c;
        o oVar = (o) b0Var.f205984c;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        v1 v1Var = new v1(new s56.d0(28, groupId, i1Var, oVar, loadingStrategy, (Continuation) null));
        p0 p0Var = p0.f264001a;
        r rVarDistinctUntilChanged = e0.h(nim.a.w(mif.a.e(rVarD, e.c(v1Var, d.h()), b0Var.i()), new x(22))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    static r d(a aVar, i7 i7Var, List list, Integer num, TransactionsSort transactionsSort, TransactionContext transactionContext, int i) {
        if ((i & 2) != 0) {
            list = f0.f322471a;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            transactionsSort = TransactionsSort.DEFAULT;
        }
        TransactionsSort transactionsSort2 = transactionsSort;
        if ((i & 16) != 0) {
            TransactionContext.INSTANCE.getClass();
            transactionContext = TransactionContext.Companion.a();
        }
        return ((b0) aVar).l(i7Var, list2, num2, transactionsSort2, transactionContext);
    }
}
