package g9i;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_pdf_view.ui.PdfViewFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends bsi.a implements l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f9b.f f141896j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f141897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f141898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sri.m f141899n;

    public t(f9b.f errorView, k presentationModel, m router, j mapper, sri.m navigator) {
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f141896j = errorView;
        this.k = presentationModel;
        this.f141897l = router;
        this.f141898m = mapper;
        this.f141899n = navigator;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        o view = (o) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.k;
        ((nri.a) obj2).init();
        ihm.f fVar = ((PdfViewFragment) view).f0.f52371h.f121375b;
        g4k.e eVar = new g4k.e(this, 13);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new f0(16, new g0d.m(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        a08.s sVar = new a08.s(14, eVar);
        akl.s sVar2 = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(sVar, new a08.s(14, sVar2), new ea9.c(14, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarF = o70.a.f(((u) ((com.revolut.feature_pdf_view.ui.b) obj2).f97467c).k.c(te0.s.f270018a));
        g48.j jVar = new g48.j(view, this, 18);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new f0(16, new g0d.m(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.s(14, jVar), new a08.s(14, sVar2), new ea9.c(14, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
