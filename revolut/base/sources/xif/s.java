package xif;

import ael.u0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.transactions.impl.data.network.TransactionsService;
import efm.d0;
import fg8.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import tof.q6;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements x71.e {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsService f306377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y71.c f306378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eif.e f306379c;
    public final fif.b d;
    public final tif.d e;
    public final tif.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue0.c f306380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mjf.q f306381h;
    public final ao.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f306382j;

    public s(TransactionsService transactionsService, y71.c transfersRepository, eif.e cacheInflaterFactory, fif.b transactionsCacheProvider, tif.d transactionsDaoWrapper, tif.r transactionsMapperWrapper, ue0.c storage, mjf.q calculatedBalanceInteractor) {
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        Intrinsics.checkNotNullParameter(transfersRepository, "transfersRepository");
        Intrinsics.checkNotNullParameter(cacheInflaterFactory, "cacheInflaterFactory");
        Intrinsics.checkNotNullParameter(transactionsCacheProvider, "transactionsCacheProvider");
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        this.f306377a = transactionsService;
        this.f306378b = transfersRepository;
        this.f306379c = cacheInflaterFactory;
        this.d = transactionsCacheProvider;
        this.e = transactionsDaoWrapper;
        this.f = transactionsMapperWrapper;
        this.f306380g = storage;
        this.f306381h = calculatedBalanceInteractor;
        this.i = new ao.h(20, new xe7.a(this, 10));
        this.f306382j = v0.a.d("create(...)");
    }

    public final d0 a(i7 i7Var, List updates, Integer num, TransactionsSort sort, TransactionContext context, BreadcrumbException timeoutBreadcrumb) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        efm.r rVarSkip = !updates.isEmpty() ? d(i7Var, updates, num, sort, context, timeoutBreadcrumb).skip(1L) : d(i7Var, f0.f322471a, num, sort, context, timeoutBreadcrumb);
        Intrinsics.h(rVarSkip);
        d0 d0VarFirstOrError = m70.a.g(rVarSkip, null, new xce.d(15), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final pfm.r b(q6... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        d0 d0VarK = this.i.k(new q(kotlin.collections.d.v0(scopes)));
        d0VarK.getClass();
        pfm.h hVar = new pfm.h(d0VarK, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return te0.w.g0(hVar);
    }

    public final efm.r c(i7 i7Var, boolean z, TransactionsSort sort, Integer num, TransactionContext context, BreadcrumbException timeoutBreadcrumb) {
        int iIntValue = num != null ? num.intValue() : -1;
        fif.m mVar = (fif.m) this.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        mVar.f135420q.init();
        fif.a aVar = new fif.a(i7Var, sort, iIntValue, context, timeoutBreadcrumb);
        gpk.c cVar = mVar.f135419p;
        cVar.getClass();
        efm.r rVarDefer = efm.r.defer(new m1i.t(cVar, aVar, 7));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        efm.r map = rVarDefer.map(new xg6.k(new v2e.x(z, 18), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.H(map, h0.f322473a, new c(3));
    }

    public final efm.r d(i7 i7Var, List updates, Integer num, TransactionsSort sort, TransactionContext context, BreadcrumbException timeoutBreadcrumb) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        if (updates.isEmpty()) {
            return c(i7Var, false, sort, num, context, timeoutBreadcrumb);
        }
        efm.r rVarTake = c(i7Var, true, sort, num, context, timeoutBreadcrumb).take(1L);
        d0 d0VarK = this.i.k(new q(updates));
        d0VarK.getClass();
        sfm.b bVarG = new pfm.h(d0VarK, 4).g(c(i7Var, false, sort, num, context, timeoutBreadcrumb));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        efm.r rVarConcatWith = rVarTake.concatWith(ue0.e.y(bVarG, h0.f322473a, new u0(this, i7Var, sort, num, context, timeoutBreadcrumb, 20)));
        Intrinsics.h(rVarConcatWith);
        return rVarConcatWith;
    }

    public final efm.r e(i7 i7Var, Priority priority, BreadcrumbException timeoutBreadcrumb) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        fif.m mVar = (fif.m) this.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        efm.r rVarSwitchMapSingle = te0.w.w0(((tif.q) mVar.f135410a).e()).switchMapSingle(new e0(16, new fif.e(mVar, i7Var, priority, timeoutBreadcrumb, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return te0.w.f0(rVarSwitchMapSingle);
    }

    public final pfm.r f(String legId, boolean z, BreadcrumbException timeoutBreadcrumb) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        fif.m mVar = (fif.m) this.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        tif.q qVar = (tif.q) mVar.f135410a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(legId, "legId");
        pfm.t tVarL = qVar.e.d(Priority.STANDARD.f60263b, new kul.b(qVar, legId, z, timeoutBreadcrumb, 6)).l(new ty7.b(this, 24));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return te0.w.g0(tVarL);
    }
}
