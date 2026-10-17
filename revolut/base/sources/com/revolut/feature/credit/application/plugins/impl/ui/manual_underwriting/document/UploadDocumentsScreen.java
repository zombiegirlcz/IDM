package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.z6;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import pd4.f;
import pd4.g;
import pd4.k;
import pd4.l;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/UploadDocumentsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/a;", "Ltki/c;", "Lpd4/l;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadDocumentsScreen extends PluginScreenController<a> implements tki.c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UploadDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final TextDelegate P;
    public final Object Q;
    public final h R;

    public UploadDocumentsScreen(UploadDocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new p(this, inputData, 28));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pd4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsScreen f235070b;

            {
                this.f235070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = UploadDocumentsScreen.S;
                        return (k) ((z6) this.f235070b.M.getValue()).f120316w.get();
                    default:
                        KProperty[] kPropertyArr2 = UploadDocumentsScreen.S;
                        UploadDocumentsScreen uploadDocumentsScreen = this.f235070b;
                        return tki.g.a(uploadDocumentsScreen, uploadDocumentsScreen.R2(), zhm.v.k(uploadDocumentsScreen.O, uploadDocumentsScreen.P, new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new RowDelegate(null, null, 7);
        this.P = new TextDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pd4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsScreen f235070b;

            {
                this.f235070b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UploadDocumentsScreen.S;
                        return (k) ((z6) this.f235070b.M.getValue()).f120316w.get();
                    default:
                        KProperty[] kPropertyArr2 = UploadDocumentsScreen.S;
                        UploadDocumentsScreen uploadDocumentsScreen = this.f235070b;
                        return tki.g.a(uploadDocumentsScreen, uploadDocumentsScreen.R2(), zhm.v.k(uploadDocumentsScreen.O, uploadDocumentsScreen.P, new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, pd4.d.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f235077b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        NavBarWithToolbar navBarWithToolbar2 = uVarD3.f174565c;
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar2.setSecondDescriptionText(uiState.f235078c);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setEnabled(uiState.e);
        largeActionButton.setText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((d) R2()).C2(a.C0473a.f67927a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z6) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new pd4.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new pd4.e(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new pd4.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new pd4.h(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
