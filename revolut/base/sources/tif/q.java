package tif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import e7l.g;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.j0;
import te0.w;
import th9.t;
import tof.i7;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements d {

    @NotNull
    public static final m Companion = new m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f271517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f271518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mif.o f271519c;
    public final mif.b d;
    public final uif.g e;
    public final Lazy f;

    public q(gte.a featureToggleInteractor, fk3.a configurationInteractor, mif.o transactionsDao, mif.b excludedTransactionsDao, uif.g queueDispatcher, kif.a timeoutReporter) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(transactionsDao, "transactionsDao");
        Intrinsics.checkNotNullParameter(excludedTransactionsDao, "excludedTransactionsDao");
        Intrinsics.checkNotNullParameter(queueDispatcher, "queueDispatcher");
        Intrinsics.checkNotNullParameter(timeoutReporter, "timeoutReporter");
        this.f271517a = featureToggleInteractor;
        this.f271518b = configurationInteractor;
        this.f271519c = transactionsDao;
        this.d = excludedTransactionsDao;
        this.e = queueDispatcher;
        this.f = yhm.j.b(new t(this, 3));
    }

    public final ifm.c b(BreadcrumbException breadcrumbException) {
        ifm.c cVarSubscribe = efm.r.interval(1500L, TimeUnit.MILLISECONDS, hhm.f.f152431c).take(3L).subscribe(new tid.a(new td1.f(this, breadcrumbException, 27), 12));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        return cVarSubscribe;
    }

    public final efm.r c(i7 i7Var, TransactionsSort sort, int i, TransactionContext context, BreadcrumbException breadcrumbException) {
        Intrinsics.checkNotNullParameter(sort, "sort");
        Intrinsics.checkNotNullParameter(context, "context");
        Priority priority = context.getF60265a();
        l observable = new l(this, i7Var, sort, i, context, breadcrumbException);
        uif.g gVar = this.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(observable, "observable");
        int i2 = 0;
        sfm.b bVar = new sfm.b(new ufm.c(new uif.b(gVar, priority, 1), i2), new uhl.b(new uif.d(observable, gVar, i2), 4), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return w.w0(bVar);
    }

    public final d0 d() {
        boolean zBooleanValue = ((Boolean) this.f.getValue()).booleanValue();
        n nVar = n.f271515a;
        if (!zBooleanValue) {
            return d0.m(nVar);
        }
        d0 d0VarFirstOrError = m70.a.g(((ik3.c) this.f271518b).l(g.b.f123407a, w4l.j.f294644c), null, new tc6.b(28), 1).firstOrError();
        tid.a aVar = new tid.a(new g(0), 3);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, nVar);
    }

    public final efm.r e() {
        dgm.e eVar = this.f271519c.f205817a;
        eVar.getClass();
        j01.b bVar = new j01.b(new j0(eVar), 7);
        Intrinsics.checkNotNullExpressionValue(bVar, "toObservable(...)");
        dgm.e eVar2 = this.d.f205789a;
        eVar2.getClass();
        j01.b bVar2 = new j01.b(new j0(eVar2), 7);
        Intrinsics.checkNotNullExpressionValue(bVar2, "toObservable(...)");
        efm.r rVarStartWith = efm.r.merge(bVar, bVar2).startWith(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final pfm.h f(efm.b bVar, BreadcrumbException breadcrumbException) {
        pfm.h hVar = new pfm.h(new a9j.k(this, 29, bVar, breadcrumbException), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return hVar;
    }
}
