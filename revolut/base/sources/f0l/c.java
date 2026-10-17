package f0l;

import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import ew2.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qfm.r0;
import te0.w;
import xpi.g;
import xzk.d;
import zjh.j;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xzk.b f131127h;
    public final tri.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f131128j;

    public c(xzk.b router, tri.c backButtonView, g toolbarView) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        this.f131127h = router;
        this.i = backButtonView;
        this.f131128j = toolbarView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ((nri.a) this.f131127h).init();
        r rVarMergeDelayError = r.mergeDelayError(this.i.f273801b, ((xpi.c) this.f131128j).Q());
        Intrinsics.checkNotNullExpressionValue(rVarMergeDelayError, "mergeDelayError(...)");
        r0 r0VarD = w.D(o70.a.f(rVarMergeDelayError), new eu7.c(this, 28));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new j(new q(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        b function = b.f131126a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new p0(10, function1K), new a1l.c(3));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
