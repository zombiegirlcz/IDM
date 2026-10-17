package mjf;

import ahe.m0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import klf.l1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import tof.a3;
import tof.ba;
import tof.i7;
import tof.q6;

/* JADX INFO: loaded from: classes13.dex */
public final class b0 implements com.revolut.domain.interactors.transactions.a {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x71.e f205982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gif.a f205983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x71.d f205984c;
    public final ang.f d;
    public final pe0.q e;
    public final phm.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f205985g;

    public b0(x71.e transactionsRepository, gif.a transactionsLoaderRepository, x71.d transactionsDetailsRepository, ang.f userInteractor, pe0.q offlineQueueHandler, phm.a transactionsSearchIndexInteractor) {
        Intrinsics.checkNotNullParameter(transactionsRepository, "transactionsRepository");
        Intrinsics.checkNotNullParameter(transactionsLoaderRepository, "transactionsLoaderRepository");
        Intrinsics.checkNotNullParameter(transactionsDetailsRepository, "transactionsDetailsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(offlineQueueHandler, "offlineQueueHandler");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f205982a = transactionsRepository;
        this.f205983b = transactionsLoaderRepository;
        this.f205984c = transactionsDetailsRepository;
        this.d = userInteractor;
        this.e = offlineQueueHandler;
        this.f = transactionsSearchIndexInteractor;
        this.f205985g = new AtomicBoolean(false);
    }

    public final pfm.a e(String legId) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        h(Priority.STANDARD.f60263b);
        BreadcrumbException breadcrumbException = new BreadcrumbException();
        ba baVar = new ba(legId);
        TransactionContext.INSTANCE.getClass();
        TransactionContext transactionContextA = TransactionContext.Companion.a();
        efm.d0 d0VarA = ((xif.s) this.f205982a).a(baVar, zhm.f0.f322471a, 1, TransactionsSort.DEFAULT, transactionContextA, breadcrumbException);
        mhd.c cVar = new mhd.c(new ma2.s(this, breadcrumbException, 29), 13);
        d0VarA.getClass();
        pfm.a aVar = new pfm.a(d0VarA, cVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final Object f(i7 i7Var, gim.i iVar) throws Throwable {
        h(Priority.STANDARD.f60263b);
        BreadcrumbException breadcrumbException = new BreadcrumbException();
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        xge.f fVar = new xge.f(sVar, i7Var, breadcrumbException, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, fVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final pfm.r g(q6... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        return ((xif.s) this.f205982a).b((q6[]) Arrays.copyOf(scopes, scopes.length));
    }

    public final void h(Priority priority) {
        if (!this.f205985g.compareAndSet(false, true) || (priority instanceof Priority.HIGH)) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.h(stackTrace);
        int length = stackTrace.length;
        if (length > 6) {
            length = 6;
        }
        IntRange indices = new IntRange(3, length, 1);
        Intrinsics.checkNotNullParameter(stackTrace, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        String strK0 = zhm.d0.k0(indices.isEmpty() ? zhm.f0.f322471a : zhm.p.c(zhm.p.n(3, indices.f186449b + 1, stackTrace)), ";", null, null, 0, new mh4.x(24), 30);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "TransactionsInteractor", j6.a.q("Not prioritised request happened first: ", strK0), null, null, 16);
    }

    public final efm.r i() {
        KClass entryType = o0.f186429a.b(pe0.e.class);
        pe0.q qVar = this.e;
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        m0 m0Var = new m0(rd0.e.e(new pe0.l(qVar.f235314h, entryType, 0), zhm.h0.f322473a, new l1()), 13);
        p0 p0Var = p0.f264001a;
        return rd0.e.c(m0Var, qk.d.h());
    }

    public final efm.r j(i7 filter, TransactionContext context) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(context, "context");
        h(context.getF60265a());
        BreadcrumbException timeoutBreadcrumb = new BreadcrumbException();
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        fif.m mVar = (fif.m) sVar.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        efm.r rVarSwitchMapSingle = te0.w.w0(((tif.q) mVar.f135410a).e()).switchMapSingle(new fg8.e0(15, new fif.d(mVar, filter, context, timeoutBreadcrumb)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return te0.w.f0(rVarSwitchMapSingle);
    }

    public final efm.r k(i7 i7Var, TransactionsSort sort) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        Priority.STANDARD priority = Priority.STANDARD.f60263b;
        h(priority);
        BreadcrumbException timeoutBreadcrumb = new BreadcrumbException();
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        fif.m mVar = (fif.m) sVar.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        efm.r rVarSwitchMapSingle = te0.w.w0(((tif.q) mVar.f135410a).e()).switchMapSingle(new fg8.e0(24, new a5b.a((Object) mVar, (Object) i7Var, (Object) sort, (Object) priority, (Object) timeoutBreadcrumb, 13)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        return rVarSwitchMapSingle;
    }

    public final efm.r l(i7 i7Var, List updates, Integer num, TransactionsSort sort, TransactionContext context) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        h(context.getF60265a());
        return nim.a.w(mif.a.d(((xif.s) this.f205982a).d(i7Var, updates, num, sort, context, new BreadcrumbException()), i()), new mh4.x(21));
    }

    public final efm.r m(q6... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        q6[] scopes2 = (q6[]) Arrays.copyOf(scopes, scopes.length);
        gif.a aVar = this.f205983b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scopes2, "scopes");
        efm.r rVarDefer = efm.r.defer(new fag.g(scopes2, aVar, 5));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }

    public final Object n(String str, q6 q6Var, gim.c cVar) {
        xif.o oVar = (xif.o) this.f205984c;
        oVar.getClass();
        Object objD = oVar.i.d(new wif.b(str, q6Var), true, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = Unit.f186387a;
        }
        return objD == aVar ? objD : Unit.f186387a;
    }

    public final Object o(ArrayList arrayList, gim.c cVar) throws Throwable {
        h(Priority.STANDARD.f60263b);
        BreadcrumbException breadcrumbException = new BreadcrumbException();
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        xge.f fVar = new xge.f(sVar, arrayList, breadcrumbException, null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, fVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object p(List list, gim.i iVar) throws Throwable {
        h(Priority.STANDARD.f60263b);
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        xec.c0 c0Var = new xec.c0(list, sVar, null, 16);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, c0Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (((mjf.k0) r13).g(r12, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[LOOP:0: B:30:0x00a8->B:32:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.List r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.b0.q(java.util.List, gim.c):java.lang.Object");
    }

    public final pfm.a r(String groupId, String comment) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Priority.STANDARD standard = Priority.STANDARD.f60263b;
        h(standard);
        BreadcrumbException timeoutBreadcrumb = new BreadcrumbException();
        xif.s sVar = (xif.s) this.f205982a;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        efm.b bVarSaveComment = sVar.f306377a.saveComment(groupId, new jif.b(comment));
        fif.m mVar = (fif.m) sVar.d;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(timeoutBreadcrumb, "timeoutBreadcrumb");
        tif.q qVar = (tif.q) mVar.f135410a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        pfm.a aVarE = bVarSaveComment.e(qVar.e.d(standard, new tif.f(qVar, groupId, comment, timeoutBreadcrumb, 0)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        pfm.a aVarE2 = te0.w.g0(aVarE).e(pd.b.n(p0.f264003c, new mhd.p0(this, groupId, null, 2)));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return aVarE2;
    }

    public final pfm.r s(a3 transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        h(Priority.STANDARD.f60263b);
        return ((xif.s) this.f205982a).f(transaction.r(), z, new BreadcrumbException());
    }

    public final void t(q6... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        q6[] scopes2 = (q6[]) Arrays.copyOf(scopes, scopes.length);
        gif.a aVar = this.f205983b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scopes2, "scopes");
        for (q6 q6Var : scopes2) {
            aVar.a(q6Var).c();
        }
    }
}
