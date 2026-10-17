package com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreen;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cu1.k;
import cu1.q;
import cu1.t;
import dli.a;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vu1.b;
import vu1.c;
import vu1.e;
import vu1.f;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/impl/ui/terms_acceptance/terms/TermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvu1/e;", "Ldli/a;", "Lvu1/f;", "feature_apm_blik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TermsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TermsScreen(TermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new vo8.b(6));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vu1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsScreen f292190b;

            {
                this.f292190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TermsScreen termsScreen = this.f292190b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TermsScreen.R;
                        TermsScreen termsScreen2 = this.f292190b;
                        return dli.f.a(termsScreen2, (h) termsScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) termsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsScreen.R;
                        qji.b bVarU2 = termsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.di.TermsScreenInjector");
                        q qVar = (q) bVarU2;
                        k kVar = qVar.f108775b;
                        q qVar2 = qVar.f108776c;
                        TermsScreenContract$InputData termsScreenContract$InputData = termsScreen.K;
                        termsScreenContract$InputData.getClass();
                        return new t(kVar, qVar2, termsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TermsScreen.R;
                        return (h) ((t) termsScreen.P.getValue()).f108783c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vu1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsScreen f292190b;

            {
                this.f292190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TermsScreen termsScreen = this.f292190b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsScreen.R;
                        TermsScreen termsScreen2 = this.f292190b;
                        return dli.f.a(termsScreen2, (h) termsScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) termsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsScreen.R;
                        qji.b bVarU2 = termsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.di.TermsScreenInjector");
                        q qVar = (q) bVarU2;
                        k kVar = qVar.f108775b;
                        q qVar2 = qVar.f108776c;
                        TermsScreenContract$InputData termsScreenContract$InputData = termsScreen.K;
                        termsScreenContract$InputData.getClass();
                        return new t(kVar, qVar2, termsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TermsScreen.R;
                        return (h) ((t) termsScreen.P.getValue()).f108783c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vu1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsScreen f292190b;

            {
                this.f292190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TermsScreen termsScreen = this.f292190b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TermsScreen.R;
                        TermsScreen termsScreen2 = this.f292190b;
                        return dli.f.a(termsScreen2, (h) termsScreen2.Q.getValue(), v.k(new PlainTextLoadingDelegate(), new WebViewDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) termsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TermsScreen.R;
                        qji.b bVarU2 = termsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.di.TermsScreenInjector");
                        q qVar = (q) bVarU2;
                        k kVar = qVar.f108775b;
                        q qVar2 = qVar.f108776c;
                        TermsScreenContract$InputData termsScreenContract$InputData = termsScreen.K;
                        termsScreenContract$InputData.getClass();
                        return new t(kVar, qVar2, termsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TermsScreen.R;
                        return (h) ((t) termsScreen.P.getValue()).f108783c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextClause(uiState.f292196b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        String str = uiState.f292197c;
        if (str != null) {
            navBarWithToolbar.setDescriptionText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        navBarWithToolbar.setDescriptionVisible(str != null);
        d3().f174564b.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vu1.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.blik_registration_terms_action, null, null, 14));
        d3().f174564b.setLoadingButtonTag("SIGN_TERMS_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
