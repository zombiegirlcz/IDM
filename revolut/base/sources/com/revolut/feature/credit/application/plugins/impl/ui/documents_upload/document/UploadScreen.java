package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ba4.b;
import ba4.c;
import ba4.d;
import ba4.g;
import ba4.q;
import ba4.r;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.a7;
import dw3.c1;
import dw3.l2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/document/UploadScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lba4/q;", "Ldli/a;", "Lba4/s;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadScreen extends PluginScreenController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UploadScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final UploadScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final RowDelegate Q;
    public final Object R;

    public UploadScreen(UploadScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ba4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadScreen f13896b;

            {
                this.f13896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UploadScreen uploadScreen = this.f13896b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UploadScreen.S;
                        qji.b bVarU2 = uploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.di.UploadScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        UploadScreenContract$InputData uploadScreenContract$InputData = uploadScreen.L;
                        uploadScreenContract$InputData.getClass();
                        return new a7(c1Var, l2Var2, uploadScreen, uploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadScreen.S;
                        return (r) ((a7) uploadScreen.N.getValue()).f118293t.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadScreen.S;
                        UploadScreen uploadScreen2 = this.f13896b;
                        return dli.f.a(uploadScreen2, uploadScreen2.R2(), zhm.u.c(uploadScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ba4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadScreen f13896b;

            {
                this.f13896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UploadScreen uploadScreen = this.f13896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UploadScreen.S;
                        qji.b bVarU2 = uploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.di.UploadScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        UploadScreenContract$InputData uploadScreenContract$InputData = uploadScreen.L;
                        uploadScreenContract$InputData.getClass();
                        return new a7(c1Var, l2Var2, uploadScreen, uploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadScreen.S;
                        return (r) ((a7) uploadScreen.N.getValue()).f118293t.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadScreen.S;
                        UploadScreen uploadScreen2 = this.f13896b;
                        return dli.f.a(uploadScreen2, uploadScreen2.R2(), zhm.u.c(uploadScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: ba4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadScreen f13896b;

            {
                this.f13896b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UploadScreen uploadScreen = this.f13896b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UploadScreen.S;
                        qji.b bVarU2 = uploadScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.di.UploadScreenInjector");
                        l2 l2Var = (l2) bVarU2;
                        c1 c1Var = l2Var.f119174c;
                        l2 l2Var2 = l2Var.d;
                        UploadScreenContract$InputData uploadScreenContract$InputData = uploadScreen.L;
                        uploadScreenContract$InputData.getClass();
                        return new a7(c1Var, l2Var2, uploadScreen, uploadScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadScreen.S;
                        return (r) ((a7) uploadScreen.N.getValue()).f118293t.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadScreen.S;
                        UploadScreen uploadScreen2 = this.f13896b;
                        return dli.f.a(uploadScreen2, uploadScreen2.R2(), zhm.u.c(uploadScreen2.Q), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ba4.s uiState = (ba4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(uiState.f13909b);
        TextLocalisedClause textLocalisedClause = uiState.f13910c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        FooterTextView footerTextView = d3().f174558c;
        Clause clause = uiState.f;
        footerTextView.setTextClause(clause);
        footerTextView.setVisibility(clause != null ? 0 : 8);
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(uiState.e);
        largeActionButton.setEnabled(uiState.f13911g);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).I2(g.f13899a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a7) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().e.setHeaderTitleMode(j0.MULTILINE);
        d3().e.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.x0()), null, new b74.e(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new c(this, null, 1), 3);
        RowDelegate rowDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new ba4.e(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
