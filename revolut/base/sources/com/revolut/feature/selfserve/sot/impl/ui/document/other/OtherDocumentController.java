package com.revolut.feature.selfserve.sot.impl.ui.document.other;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.document.other.OtherDocumentController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jyc.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import tyc.b;
import tyc.c;
import tyc.d;
import tyc.h;
import tyc.i;
import tyc.j;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/document/other/OtherDocumentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltyc/h;", "Ldli/a;", "Ltyc/i;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtherDocumentController extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(OtherDocumentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final String K;
    public final int L;
    public final ao.h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public OtherDocumentController(String userDefinedType) {
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        this.K = userDefinedType;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDocumentController f275542b;

            {
                this.f275542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OtherDocumentController otherDocumentController = this.f275542b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OtherDocumentController.R;
                        phm.a aVar = (phm.a) ue0.e.j(otherDocumentController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.f fVarH = ((jyc.r) aVar2.b()).h();
                        String str = otherDocumentController.K;
                        str.getClass();
                        fVarH.c = str;
                        fVarH.b = otherDocumentController;
                        return (jyc.g) fVarH.build();
                    case 1:
                        KProperty[] kPropertyArr2 = OtherDocumentController.R;
                        return new j(((jyc.g) otherDocumentController.O.getValue()).f179381a, new l(new k()));
                    default:
                        KProperty[] kPropertyArr3 = OtherDocumentController.R;
                        OtherDocumentController otherDocumentController2 = this.f275542b;
                        return dli.f.a(otherDocumentController2, (j) otherDocumentController2.P.getValue(), u.c(otherDocumentController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDocumentController f275542b;

            {
                this.f275542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OtherDocumentController otherDocumentController = this.f275542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtherDocumentController.R;
                        phm.a aVar = (phm.a) ue0.e.j(otherDocumentController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.f fVarH = ((jyc.r) aVar2.b()).h();
                        String str = otherDocumentController.K;
                        str.getClass();
                        fVarH.c = str;
                        fVarH.b = otherDocumentController;
                        return (jyc.g) fVarH.build();
                    case 1:
                        KProperty[] kPropertyArr2 = OtherDocumentController.R;
                        return new j(((jyc.g) otherDocumentController.O.getValue()).f179381a, new l(new k()));
                    default:
                        KProperty[] kPropertyArr3 = OtherDocumentController.R;
                        OtherDocumentController otherDocumentController2 = this.f275542b;
                        return dli.f.a(otherDocumentController2, (j) otherDocumentController2.P.getValue(), u.c(otherDocumentController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: tyc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDocumentController f275542b;

            {
                this.f275542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OtherDocumentController otherDocumentController = this.f275542b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OtherDocumentController.R;
                        phm.a aVar = (phm.a) ue0.e.j(otherDocumentController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.f fVarH = ((jyc.r) aVar2.b()).h();
                        String str = otherDocumentController.K;
                        str.getClass();
                        fVarH.c = str;
                        fVarH.b = otherDocumentController;
                        return (jyc.g) fVarH.build();
                    case 1:
                        KProperty[] kPropertyArr2 = OtherDocumentController.R;
                        return new j(((jyc.g) otherDocumentController.O.getValue()).f179381a, new l(new k()));
                    default:
                        KProperty[] kPropertyArr3 = OtherDocumentController.R;
                        OtherDocumentController otherDocumentController2 = this.f275542b;
                        return dli.f.a(otherDocumentController2, (j) otherDocumentController2.P.getValue(), u.c(otherDocumentController2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f275547b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.document_selection_other_header_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.document_selection_other_header_caption, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    public OtherDocumentController() {
        this("");
    }
}
