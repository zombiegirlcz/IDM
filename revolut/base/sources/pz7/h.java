package pz7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ks0.n;
import kx7.y0;
import pjg.k;
import pth.l;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f240908j;
    public final vy7.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vy7.b f240909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qz7.a f240910m;

    public h(xpi.g navBarWithToolbarView, vy7.g presentationModel, vy7.b router, qz7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f240908j = navBarWithToolbarView;
        this.k = presentationModel;
        this.f240909l = router;
        this.f240910m = uiBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((xpi.c) this.f240908j).e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        this.f240910m.getClass();
        ((BaseLayoutBuilderFragment) view).setItems(qz7.a.a());
        efm.b bVarFlatMapCompletable = o70.a.f(m70.a.g(mo3.a.n(((y0) this.k.f293249b.f138760a).a().f(Unit.f186387a, true)), null, new pyb.g(6), 1)).retryWhen(new pz4.a(2, new f(this, view))).flatMapCompletable(new pz4.a(3, new l(this, 22)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        n nVar = new n(new k(new BreadcrumbException(), 29));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, nVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        g function = g.f240907a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new m3l.d(18, this.i), new a1l.c(14));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
