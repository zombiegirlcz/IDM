package com.revolut.feature.statements.impl.ui.documents_hub.product_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.b0;
import eyd.r;
import f0e.b;
import f0e.c;
import f0e.d;
import f0e.f;
import f0e.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/documents_hub/product_selector/DocumentsHubProductSelectorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf0e/b;", "Ldli/a;", "Lf0e/c;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsHubProductSelectorScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DocumentsHubProductSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DocumentsHubProductSelectorContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DocumentsHubProductSelectorScreen(DocumentsHubProductSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: f0e.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubProductSelectorScreen f131114b;

            {
                this.f131114b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen = this.f131114b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubProductSelectorScreen.S;
                        qji.b bVarU2 = documentsHubProductSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.product_selector.di.DocumentsHubProductSelectorScreenInjector");
                        b0 b0Var = ((r) bVarU2).f130819b;
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData = documentsHubProductSelectorScreen.K;
                        documentsHubProductSelectorContract$InputData.getClass();
                        return new eyd.s(b0Var, documentsHubProductSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubProductSelectorScreen.S;
                        eyd.s sVar = (eyd.s) documentsHubProductSelectorScreen.P.getValue();
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData2 = sVar.f130822a;
                        b0 b0Var2 = sVar.f130823b;
                        eyd.b bVar = (eyd.b) b0Var2.f130699c;
                        return new d(documentsHubProductSelectorContract$InputData2, new jyd.b((nyd.a) bVar.f130694w.get(), bVar.d.e()), b0Var2.e.e(), new j(b0Var2.f.g()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubProductSelectorScreen.S;
                        DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen2 = this.f131114b;
                        return dli.f.a(documentsHubProductSelectorScreen2, (d) documentsHubProductSelectorScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), documentsHubProductSelectorScreen2.M, documentsHubProductSelectorScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: f0e.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubProductSelectorScreen f131114b;

            {
                this.f131114b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen = this.f131114b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubProductSelectorScreen.S;
                        qji.b bVarU2 = documentsHubProductSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.product_selector.di.DocumentsHubProductSelectorScreenInjector");
                        b0 b0Var = ((r) bVarU2).f130819b;
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData = documentsHubProductSelectorScreen.K;
                        documentsHubProductSelectorContract$InputData.getClass();
                        return new eyd.s(b0Var, documentsHubProductSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubProductSelectorScreen.S;
                        eyd.s sVar = (eyd.s) documentsHubProductSelectorScreen.P.getValue();
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData2 = sVar.f130822a;
                        b0 b0Var2 = sVar.f130823b;
                        eyd.b bVar = (eyd.b) b0Var2.f130699c;
                        return new d(documentsHubProductSelectorContract$InputData2, new jyd.b((nyd.a) bVar.f130694w.get(), bVar.d.e()), b0Var2.e.e(), new j(b0Var2.f.g()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubProductSelectorScreen.S;
                        DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen2 = this.f131114b;
                        return dli.f.a(documentsHubProductSelectorScreen2, (d) documentsHubProductSelectorScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), documentsHubProductSelectorScreen2.M, documentsHubProductSelectorScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: f0e.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsHubProductSelectorScreen f131114b;

            {
                this.f131114b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen = this.f131114b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsHubProductSelectorScreen.S;
                        qji.b bVarU2 = documentsHubProductSelectorScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.documents_hub.product_selector.di.DocumentsHubProductSelectorScreenInjector");
                        b0 b0Var = ((r) bVarU2).f130819b;
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData = documentsHubProductSelectorScreen.K;
                        documentsHubProductSelectorContract$InputData.getClass();
                        return new eyd.s(b0Var, documentsHubProductSelectorContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsHubProductSelectorScreen.S;
                        eyd.s sVar = (eyd.s) documentsHubProductSelectorScreen.P.getValue();
                        DocumentsHubProductSelectorContract$InputData documentsHubProductSelectorContract$InputData2 = sVar.f130822a;
                        b0 b0Var2 = sVar.f130823b;
                        eyd.b bVar = (eyd.b) b0Var2.f130699c;
                        return new d(documentsHubProductSelectorContract$InputData2, new jyd.b((nyd.a) bVar.f130694w.get(), bVar.d.e()), b0Var2.e.e(), new j(b0Var2.f.g()));
                    default:
                        KProperty[] kPropertyArr3 = DocumentsHubProductSelectorScreen.S;
                        DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen2 = this.f131114b;
                        return dli.f.a(documentsHubProductSelectorScreen2, (d) documentsHubProductSelectorScreen2.Q.getValue(), v.k(new RowLoadingDelegate(), documentsHubProductSelectorScreen2.M, documentsHubProductSelectorScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        Clause clause = uiState.f131107a;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eyd.s) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ev7.b(this, null, 10), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new f0e.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
