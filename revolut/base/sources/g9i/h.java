package g9i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_pdf_view.ui.PdfViewActivity;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import efm.d0;
import f2i.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends bsi.a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f141885j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f141886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sri.m f141887m;

    public h(k presentationModel, m router, f9b.f errorView, sri.m navigator) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f141885j = presentationModel;
        this.k = router;
        this.f141886l = errorView;
        this.f141887m = navigator;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        p.Companion.getClass();
        this.f141887m.c(new FragmentNavigateCommand(i.f141890c, null, false, 2046));
        u uVar = (u) ((com.revolut.feature_pdf_view.ui.b) this.f141885j).f97467c;
        efm.r rVarF = o70.a.f(uVar.e.getValue(uVar, u.f141900l[3]).c(te0.s.f270018a));
        g4k.e eVar = new g4k.e(view, 12);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.r(18, new g0d.m(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        a0d.g gVar = new a0d.g(14, eVar);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(gVar, new a0d.g(14, sVar), new ea9.c(13, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        PdfViewActivity pdfViewActivity = (PdfViewActivity) view;
        efm.r rVarF2 = o70.a.f(pdfViewActivity.c1().f59211b);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: g9i.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f141884b;

            {
                this.f141884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f141884b.f141887m);
                        break;
                    default:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        h hVar = this.f141884b;
                        com.revolut.feature_pdf_view.ui.a aVar2 = (com.revolut.feature_pdf_view.ui.a) hVar.k;
                        com.revolut.feature_pdf_view.ui.b bVar2 = (com.revolut.feature_pdf_view.ui.b) aVar2.f97463a;
                        bVar2.getClass();
                        ufm.c cVar = new ufm.c(new a31.l(bVar2, 28), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        ufm.i iVar = new ufm.i(cVar, new g48.k(19, new c(aVar2, 1)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        d0 d0VarO = hx7.a.O(iVar, hVar.f141886l, false, null, 24);
                        x xVar = new x(1, hVar.f141887m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 29);
                        akl.s sVar2 = hVar.i;
                        ufm.i iVar2 = new ufm.i(d0VarO, new a08.r(18, new g0d.m(new BreadcrumbException(), 15)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        ofm.i iVar3 = new ofm.i(new a0d.g(14, xVar), new a0d.g(14, sVar2), 0);
                        iVar2.q(iVar3);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
                        w.j0(hVar.f239031a, iVar3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a08.r(18, new g0d.m(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(14, function1), new a0d.g(14, sVar), new ea9.c(13, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarF3 = o70.a.f(pdfViewActivity.c1().f59210a.f57403b);
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: g9i.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f141884b;

            {
                this.f141884b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f141884b.f141887m);
                        break;
                    default:
                        String it9 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        h hVar = this.f141884b;
                        com.revolut.feature_pdf_view.ui.a aVar2 = (com.revolut.feature_pdf_view.ui.a) hVar.k;
                        com.revolut.feature_pdf_view.ui.b bVar2 = (com.revolut.feature_pdf_view.ui.b) aVar2.f97463a;
                        bVar2.getClass();
                        ufm.c cVar = new ufm.c(new a31.l(bVar2, 28), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        ufm.i iVar = new ufm.i(cVar, new g48.k(19, new c(aVar2, 1)), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        d0 d0VarO = hx7.a.O(iVar, hVar.f141886l, false, null, 24);
                        x xVar = new x(1, hVar.f141887m, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 29);
                        akl.s sVar2 = hVar.i;
                        ufm.i iVar2 = new ufm.i(d0VarO, new a08.r(18, new g0d.m(new BreadcrumbException(), 15)), 2);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
                        ofm.i iVar3 = new ofm.i(new a0d.g(14, xVar), new a0d.g(14, sVar2), 0);
                        iVar2.q(iVar3);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
                        w.j0(hVar.f239031a, iVar3);
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new a08.r(18, new g0d.m(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0d.g(14, function12), new a0d.g(14, sVar), new ea9.c(13, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
