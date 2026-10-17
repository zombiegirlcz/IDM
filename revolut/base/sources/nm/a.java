package nm;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import ecm.q;
import efm.r;
import fsi.b;
import fsi.c;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qm.d;
import qm.e;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f217149h;
    public final s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e dispatcherFactory, b id10) {
        super(id10);
        Intrinsics.checkNotNullParameter(dispatcherFactory, "dispatcherFactory");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f217149h = dispatcherFactory;
        this.i = new s(this, 29);
    }

    public Function1 N() {
        return this.i;
    }

    public abstract List O();

    public abstract r Q();

    @Override // fsi.a
    public void onStart() {
        r resultObservable = Q();
        List handlers = O();
        Function1 defaultHandler = N();
        e eVar = this.f217149h;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(resultObservable, "resultObservable");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        um.c errorsDispatcher = (um.c) eVar.f247740b;
        Intrinsics.checkNotNullParameter(resultObservable, "resultObservable");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(errorsDispatcher, "errorsDispatcher");
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        gpk.c cVar = new gpk.c();
        cVar.f145463a = handlers;
        cVar.f145464b = errorsDispatcher;
        cVar.f145465c = defaultHandler;
        ifm.b compositeDisposable = this.f137706c;
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        efm.b bVarFlatMapCompletable = resultObservable.concatMapSingle(new pv9.b(new qm.b(cVar, 0), 8)).flatMapCompletable(new pv9.b(new qm.b(cVar, 1), 9));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        q qVar = new q(new bo.c(new BreadcrumbException(), 27), (char) 0);
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, qVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        h hVarW = aVar.w(new gn.b(7, d.f247738a), qm.c.f247737a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(compositeDisposable, hVarW);
    }
}
