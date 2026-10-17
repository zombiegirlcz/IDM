package k1i;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import g2e.t;
import jyk.g0;
import k1g.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends pri.c {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f180279h;
    public final npi.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f180280j;

    public j(b presentationModel, npi.a dialogView, c router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f180279h = presentationModel;
        this.i = dialogView;
        this.f180280j = router;
    }

    public final pfm.a N(g tense) {
        Intrinsics.checkNotNullParameter(tense, "tense");
        pfm.a aVar = new pfm.a(o70.a.i(this.f180279h.C()), new g0(new k1.a(tense, this, 2), 14), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = ((npi.c) this.i).f218223l.f256060c.filter(new g0(new n(2), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(o70.a.f(rVarFilter), new k0d.c(this, 6));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new t(new j2i.c(new BreadcrumbException(), 11), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        i function = i.f180278a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar.w(new f0(22, function1K), new a1l.c(10));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
