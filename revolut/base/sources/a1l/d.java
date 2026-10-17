package a1l;

import a08.g0;
import a08.p;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.screen.StartActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import pfm.t;
import te0.w;
import ue0.e;
import y0l.f;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0l.b f649h;
    public final StartContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f650j;

    public d(y0l.b router, StartContract$Configuration configuration, f presentationModel) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f649h = router;
        this.i = configuration;
        this.f650j = presentationModel;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        y0l.d view = (y0l.d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.b bVarFlatMapCompletable = ((StartActivity) view).f104283s0.flatMapSingle(new a05.a(new a(this, 0), 19)).flatMapCompletable(new a05.a(new a(this, 1), 20));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        t tVarR = e.r(bVarFlatMapCompletable, h0.f322473a);
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(tVarR, new zjh.f(new p(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        b function = b.f647a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new g0(1, function1K), new c(0));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
