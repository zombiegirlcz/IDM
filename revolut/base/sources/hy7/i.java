package hy7;

import a08.g0;
import a08.o0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import hy2.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f156750j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f156751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f156752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iy7.a f156753n;

    public i(xpi.g navBarView, f9b.f errorView, g presentationModel, b router, iy7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f156750j = navBarView;
        this.k = errorView;
        this.f156751l = presentationModel;
        this.f156752m = router;
        this.f156753n = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        xpi.c cVar = (xpi.c) this.f156750j;
        cVar.e0(numValueOf);
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new hw9.a(this, 11)), new o0(22, new h2i.b(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar2 = new ea9.c(22, h.f156749a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new g0(20, sVar), cVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        k kVar = (k) this.f156751l.f156748b;
        te0.j jVar = kVar.f156755b;
        KProperty[] kPropertyArr = k.d;
        te0.e value = jVar.getValue(kVar, kPropertyArr[0]);
        te0.s sVar2 = te0.s.f270018a;
        r map = w.l(value.c(sVar2), kVar.f156756c.getValue(kVar, kPropertyArr[1]).c(sVar2)).map(new l(new hy2.k(2), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        int i = 0;
        r map2 = o70.a.a(map).doOnNext(new l(new hie.b(1, this, i.class, "renderNavBar", "renderNavBar(Lcom/revolut/feature/insurance_pet/impl/ui/common/document/TextDocumentContract$TextDocument;)V", i, 14), 2)).map(new l(new hie.b(1, this.f156753n, iy7.a.class, "build", "build(Lcom/revolut/feature/insurance_pet/impl/ui/common/document/TextDocumentContract$TextDocument;)Ljava/util/List;", 0, 15), 3));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarN = hx7.a.N(map2, this.k, false, false);
        hie.b bVar2 = new hie.b(1, view, e.class, "setItems", "setItems(Ljava/util/List;)V", i, 16);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new o0(22, new h2i.b(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(20, bVar2), new g0(20, sVar), new ea9.c(22, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
