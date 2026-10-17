package com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iaf.d;
import iug.j;
import iv7.b;
import iv7.c;
import iv7.f;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.e0;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/documents/preview/InsuranceDocumentsPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Liv7/f;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceDocumentsPreviewScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InsuranceDocumentsPreviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InsuranceDocumentsPreviewScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public InsuranceDocumentsPreviewScreen(InsuranceDocumentsPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: iv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsPreviewScreen f168763b;

            {
                this.f168763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen = this.f168763b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsPreviewScreen.S;
                        InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen2 = this.f168763b;
                        return dli.f.a(insuranceDocumentsPreviewScreen2, (e) insuranceDocumentsPreviewScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), insuranceDocumentsPreviewScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new BannerDelegate(), insuranceDocumentsPreviewScreen2.N, new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsPreviewScreen.S;
                        qji.b bVarU2 = insuranceDocumentsPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.di.InsuranceDocumentsPreviewScreenInjector");
                        return (e0) ((jv7.a) ((jv7.b) bVarU2).j().mo3808a(insuranceDocumentsPreviewScreen)).i0(insuranceDocumentsPreviewScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsPreviewScreen.S;
                        e0 e0Var = (e0) insuranceDocumentsPreviewScreen.Q.getValue();
                        switch (e0Var.f200088a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsPreviewScreen f168763b;

            {
                this.f168763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen = this.f168763b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsPreviewScreen.S;
                        InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen2 = this.f168763b;
                        return dli.f.a(insuranceDocumentsPreviewScreen2, (e) insuranceDocumentsPreviewScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), insuranceDocumentsPreviewScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new BannerDelegate(), insuranceDocumentsPreviewScreen2.N, new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsPreviewScreen.S;
                        qji.b bVarU2 = insuranceDocumentsPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.di.InsuranceDocumentsPreviewScreenInjector");
                        return (e0) ((jv7.a) ((jv7.b) bVarU2).j().mo3808a(insuranceDocumentsPreviewScreen)).i0(insuranceDocumentsPreviewScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsPreviewScreen.S;
                        e0 e0Var = (e0) insuranceDocumentsPreviewScreen.Q.getValue();
                        switch (e0Var.f200088a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsPreviewScreen f168763b;

            {
                this.f168763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen = this.f168763b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsPreviewScreen.S;
                        InsuranceDocumentsPreviewScreen insuranceDocumentsPreviewScreen2 = this.f168763b;
                        return dli.f.a(insuranceDocumentsPreviewScreen2, (e) insuranceDocumentsPreviewScreen2.R.getValue(), v.k(new FullScreenStateDelegate(), insuranceDocumentsPreviewScreen2.M, new RowLoadingDelegate(), new ListSubheaderDelegate(), new BannerDelegate(), insuranceDocumentsPreviewScreen2.N, new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsPreviewScreen.S;
                        qji.b bVarU2 = insuranceDocumentsPreviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.di.InsuranceDocumentsPreviewScreenInjector");
                        return (e0) ((jv7.a) ((jv7.b) bVarU2).j().mo3808a(insuranceDocumentsPreviewScreen)).i0(insuranceDocumentsPreviewScreen.K).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsPreviewScreen.S;
                        e0 e0Var = (e0) insuranceDocumentsPreviewScreen.Q.getValue();
                        switch (e0Var.f200088a) {
                            case 0:
                                return (e) e0Var.d.get();
                            default:
                                return (e) e0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f168766a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iv7.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, continuation, 22), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new j(this, continuation, 5), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
