package i08;

import a08.r;
import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.profile.dochistory.PetDocumentHistoryActivity;
import f08.j;
import f08.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pfm.m;
import te0.w;
import tx0.j0;
import yx7.q;
import zw7.n;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f157315j;
    public final f08.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f08.a f157316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f9b.f f157317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j08.a f157318n;
    public final q o;

    public h(xpi.g navBar, f08.d router, f08.a presentationModel, f9b.f errorView, j08.a uiBuilder, q documentLabelBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(documentLabelBuilder, "documentLabelBuilder");
        this.f157315j = navBar;
        this.k = router;
        this.f157316l = presentationModel;
        this.f157317m = errorView;
        this.f157318n = uiBuilder;
        this.o = documentLabelBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        f08.h hVar = (f08.h) this.f157316l;
        n nVar = (n) ((k) hVar.f131015h).w0().get();
        this.o.getClass();
        TextLocalisedClause textLocalisedClauseA = q.a(nVar);
        xpi.c cVar = (xpi.c) this.f157315j;
        final int i = 1;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClauseA);
        cVar.p0(textLocalisedClauseA);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new Function1(this) { // from class: i08.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f157312b;

            {
                this.f157312b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        if (!a0.H(model.f53228a, "DOCUMENT_HISTORY_ACTIVE_DOC_ROW_ID_PREFIX_", false) && !a0.H(model.f53228a, "DOCUMENT_HISTORY_NOT_ACTIVE_DOC_ROW_ID_PREFIX_", false)) {
                            m mVar = m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        f08.d dVar = this.f157312b.k;
                        Object obj3 = model.u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                        PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj3;
                        j jVar = (j) dVar;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return ey7.d.a(document, jVar.e, jVar.f131019b);
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((j) this.f157312b.k).a();
                }
            }
        }), new s(18, new h2i.b(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar2 = new ea9.c(23, f.f157313a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new r(23, sVar), cVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        final int i2 = 0;
        pfm.a aVar3 = new pfm.a(w.D(((RowDelegate) ((PetDocumentHistoryActivity) view).u0.getValue()).f53218h, new Function1(this) { // from class: i08.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f157312b;

            {
                this.f157312b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        RowDelegate.Model model = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model, "model");
                        if (!a0.H(model.f53228a, "DOCUMENT_HISTORY_ACTIVE_DOC_ROW_ID_PREFIX_", false) && !a0.H(model.f53228a, "DOCUMENT_HISTORY_NOT_ACTIVE_DOC_ROW_ID_PREFIX_", false)) {
                            m mVar = m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        f08.d dVar = this.f157312b.k;
                        Object obj3 = model.u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                        PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj3;
                        j jVar = (j) dVar;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return ey7.d.a(document, jVar.e, jVar.f131019b);
                    default:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((j) this.f157312b.k).a();
                }
            }
        }), new s(18, new h2i.b(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new r(23, sVar), new ea9.c(23, g.f157314a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        fx7.j jVar = hVar.d;
        k kVar = (k) hVar.f131015h;
        efm.r rVarN = hx7.a.N(o70.a.f(m70.a.f(nim.a.w(fx7.j.a(jVar, (String) kVar.y0().get(), ((n) kVar.w0().get()).name()), new f08.f(hVar, 5)), new hnc.a(this, 7), new hw9.b(this, 12), new hy2.b(17))), this.f157317m, false, false);
        hie.b bVar2 = new hie.b(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 25);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new s(18, new h2i.b(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new r(23, bVar2), new r(23, sVar), new ea9.c(23, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
