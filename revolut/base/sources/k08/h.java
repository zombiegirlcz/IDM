package k08;

import a08.p0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.profile.dochistory.PetDocumentHistoryContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.profile.document.PetPolicyDocumentActivity;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import efm.r;
import ewh.y;
import f08.k;
import g08.i;
import ip0.yc0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import pfm.m;
import te0.w;
import tpi.j;
import zhm.d0;
import zw7.n;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f179982j;
    public final f08.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f08.a f179983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f9b.f f179984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f179985n;
    public final i o;

    public h(xpi.g navBar, f08.d router, f08.a presentationModel, f9b.f errorView, j progressView, i uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f179982j = navBar;
        this.k = router;
        this.f179983l = presentationModel;
        this.f179984m = errorView;
        this.f179985n = progressView;
        this.o = uiBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_all_documents_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f179982j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        final int i = 0;
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new Function1(this) { // from class: k08.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f179979b;

            {
                this.f179979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((f08.j) this.f179979b.k).a();
                    default:
                        h hVar = this.f179979b;
                        f08.d dVar = hVar.k;
                        RowDelegate.Model row = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(row, "row");
                        String str = row.f53228a;
                        Object obj3 = row.u;
                        if (!a0.H(str, "POLICY_REMOTE_DOCUMENT_ROW_ID_PREFIX_", false)) {
                            if (a0.H(row.f53228a, "POLICY_LOCAL_DOCUMENT_ROW_ID_PREFIX_", false)) {
                                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Text");
                                return ((f08.j) dVar).c((PolicyDocument.Text) obj3);
                            }
                            m mVar = m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        String policyId = (String) ((k) ((f08.h) hVar.f179983l).f131015h).y0().get();
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                        PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj3;
                        Intrinsics.checkNotNullParameter(document, "<this>");
                        Integer num = document.e;
                        if (num == null || num.intValue() < 2) {
                            f08.j jVar = (f08.j) dVar;
                            jVar.getClass();
                            Intrinsics.checkNotNullParameter(document, "document");
                            return ey7.d.a(document, jVar.e, jVar.f131019b);
                        }
                        n type = document.d;
                        f08.j jVar2 = (f08.j) dVar;
                        jVar2.getClass();
                        Intrinsics.checkNotNullParameter(policyId, "policyId");
                        Intrinsics.checkNotNullParameter(type, "type");
                        ln.a aVar3 = jVar2.f131019b;
                        i08.d.Companion.getClass();
                        return aVar3.a(new ActivityNavigateCommand(i08.a.f157310b, new PetDocumentHistoryContract$Configuration(policyId, type), null, null, 0, null, null, null, null, false, 1020));
                }
            }
        }), new a0d.g(20, new j2i.c(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(1, f.f179980a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new p0(20, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        final int i2 = 1;
        pfm.a aVar3 = new pfm.a(w.D(((RowDelegate) ((PetPolicyDocumentActivity) view).u0.getValue()).f53218h, new Function1(this) { // from class: k08.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f179979b;

            {
                this.f179979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((f08.j) this.f179979b.k).a();
                    default:
                        h hVar = this.f179979b;
                        f08.d dVar = hVar.k;
                        RowDelegate.Model row = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(row, "row");
                        String str = row.f53228a;
                        Object obj3 = row.u;
                        if (!a0.H(str, "POLICY_REMOTE_DOCUMENT_ROW_ID_PREFIX_", false)) {
                            if (a0.H(row.f53228a, "POLICY_LOCAL_DOCUMENT_ROW_ID_PREFIX_", false)) {
                                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Text");
                                return ((f08.j) dVar).c((PolicyDocument.Text) obj3);
                            }
                            m mVar = m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        String policyId = (String) ((k) ((f08.h) hVar.f179983l).f131015h).y0().get();
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                        PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj3;
                        Intrinsics.checkNotNullParameter(document, "<this>");
                        Integer num = document.e;
                        if (num == null || num.intValue() < 2) {
                            f08.j jVar2 = (f08.j) dVar;
                            jVar2.getClass();
                            Intrinsics.checkNotNullParameter(document, "document");
                            return ey7.d.a(document, jVar2.e, jVar2.f131019b);
                        }
                        n type = document.d;
                        f08.j jVar22 = (f08.j) dVar;
                        jVar22.getClass();
                        Intrinsics.checkNotNullParameter(policyId, "policyId");
                        Intrinsics.checkNotNullParameter(type, "type");
                        ln.a aVar32 = jVar22.f131019b;
                        i08.d.Companion.getClass();
                        return aVar32.a(new ActivityNavigateCommand(i08.a.f157310b, new PetDocumentHistoryContract$Configuration(policyId, type), null, null, 0, null, null, null, null, false, 1020));
                }
            }
        }), new a0d.g(20, new j2i.c(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new p0(20, sVar), new j7a.j(1, g.f179981a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        f08.h hVar = (f08.h) this.f179983l;
        r rVarR = mo3.a.r(o70.a.a(w.v(nim.a.w(pd.b.r(hVar.m3(), new f08.f(hVar, 6)), new f08.f(hVar, 7)), w.h(d0.d1(((Map) hVar.i.f191187a.getValue()).values())), new y(11))), this.f179985n);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        r rVarN = hx7.a.N(m70.a.h(rVarR, new j75.i(this, 24), null, new jul.c(24), 2), this.f179984m, false, false);
        yc0 yc0Var = new yc0(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 24);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new a0d.g(20, new j2i.c(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(20, yc0Var), new p0(20, sVar), new j7a.j(1, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
