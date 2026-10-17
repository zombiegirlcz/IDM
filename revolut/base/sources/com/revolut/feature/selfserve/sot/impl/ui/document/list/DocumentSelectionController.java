package com.revolut.feature.selfserve.sot.impl.ui.document.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.DocumentSelectionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import jyc.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import syc.b;
import syc.g;
import syc.i;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/document/list/DocumentSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsyc/g;", "Ldli/a;", "Lsyc/h;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentSelectionController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DocumentSelectionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final IncomeSource K;
    public final List L;
    public final int M;
    public final h N;
    public final SelectableDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DocumentSelectionController(IncomeSource incomeSource, List list) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        this.K = incomeSource;
        this.L = list;
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, b.f);
        this.O = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: syc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f266650b;

            {
                this.f266650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentSelectionController documentSelectionController = this.f266650b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentSelectionController.S;
                        phm.a aVar = (phm.a) ue0.e.j(documentSelectionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jpc.e eVarE = ((jyc.r) aVar2.b()).e();
                        IncomeSource incomeSource2 = documentSelectionController.K;
                        incomeSource2.getClass();
                        eVarE.f177257c = incomeSource2;
                        eVarE.d = documentSelectionController.L;
                        eVarE.f177256b = documentSelectionController;
                        return (jyc.c) eVarE.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentSelectionController.S;
                        jyc.c cVar = (jyc.c) documentSelectionController.P.getValue();
                        return new i(cVar.f179364a, cVar.f179365b, new at.r(new j()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentSelectionController.S;
                        DocumentSelectionController documentSelectionController2 = this.f266650b;
                        return dli.f.a(documentSelectionController2, (i) documentSelectionController2.Q.getValue(), v.k(new ListSubheaderDelegate(), documentSelectionController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: syc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f266650b;

            {
                this.f266650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentSelectionController documentSelectionController = this.f266650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentSelectionController.S;
                        phm.a aVar = (phm.a) ue0.e.j(documentSelectionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jpc.e eVarE = ((jyc.r) aVar2.b()).e();
                        IncomeSource incomeSource2 = documentSelectionController.K;
                        incomeSource2.getClass();
                        eVarE.f177257c = incomeSource2;
                        eVarE.d = documentSelectionController.L;
                        eVarE.f177256b = documentSelectionController;
                        return (jyc.c) eVarE.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentSelectionController.S;
                        jyc.c cVar = (jyc.c) documentSelectionController.P.getValue();
                        return new i(cVar.f179364a, cVar.f179365b, new at.r(new j()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentSelectionController.S;
                        DocumentSelectionController documentSelectionController2 = this.f266650b;
                        return dli.f.a(documentSelectionController2, (i) documentSelectionController2.Q.getValue(), v.k(new ListSubheaderDelegate(), documentSelectionController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: syc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentSelectionController f266650b;

            {
                this.f266650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentSelectionController documentSelectionController = this.f266650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentSelectionController.S;
                        phm.a aVar = (phm.a) ue0.e.j(documentSelectionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        jpc.e eVarE = ((jyc.r) aVar2.b()).e();
                        IncomeSource incomeSource2 = documentSelectionController.K;
                        incomeSource2.getClass();
                        eVarE.f177257c = incomeSource2;
                        eVarE.d = documentSelectionController.L;
                        eVarE.f177256b = documentSelectionController;
                        return (jyc.c) eVarE.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentSelectionController.S;
                        jyc.c cVar = (jyc.c) documentSelectionController.P.getValue();
                        return new i(cVar.f179364a, cVar.f179365b, new at.r(new j()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentSelectionController.S;
                        DocumentSelectionController documentSelectionController2 = this.f266650b;
                        return dli.f.a(documentSelectionController2, (i) documentSelectionController2.Q.getValue(), v.k(new ListSubheaderDelegate(), documentSelectionController2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((syc.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.document_selection_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.document_selection_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.document_selection_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new se4.c(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(this.O.r()), new syc.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
