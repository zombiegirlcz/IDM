package com.revolut.feature.address.common.impl.flow.field_search.manual;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ci1.b;
import ci1.c;
import ci1.d;
import ci1.f;
import ci1.g;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreen;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/field_search/manual/AddManuallyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lci1/f;", "Ldli/a;", "Lci1/g;", "Lno/m;", "Lno/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddManuallyScreen extends ViewController<f> implements a, m, k {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AddManuallyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final AddManuallyScreenContract$InputData K;
    public final int L;
    public final h M;
    public final AnalyticsProduct N;
    public AnalyticsContext O;
    public final Object P;
    public final Object Q;
    public final InputTextDelegate R;
    public final Object S;

    public AddManuallyScreen(AddManuallyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, b.f);
        this.N = inputData.f60973c;
        this.O = inputData.d;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ci1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddManuallyScreen f24342b;

            {
                this.f24342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddManuallyScreen addManuallyScreen = this.f24342b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddManuallyScreen.T;
                        qji.b bVarU2 = addManuallyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.manual.di.AddManuallyScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        AddManuallyScreenContract$InputData addManuallyScreenContract$InputData = addManuallyScreen.K;
                        addManuallyScreenContract$InputData.getClass();
                        return new yh1.b(eVar, cVar2, addManuallyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddManuallyScreen.T;
                        return (h) ((yh1.b) addManuallyScreen.P.getValue()).f313698c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddManuallyScreen.T;
                        AddManuallyScreen addManuallyScreen2 = this.f24342b;
                        return dli.f.a(addManuallyScreen2, (h) addManuallyScreen2.Q.getValue(), u.c(addManuallyScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ci1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddManuallyScreen f24342b;

            {
                this.f24342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddManuallyScreen addManuallyScreen = this.f24342b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddManuallyScreen.T;
                        qji.b bVarU2 = addManuallyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.manual.di.AddManuallyScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        AddManuallyScreenContract$InputData addManuallyScreenContract$InputData = addManuallyScreen.K;
                        addManuallyScreenContract$InputData.getClass();
                        return new yh1.b(eVar, cVar2, addManuallyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddManuallyScreen.T;
                        return (h) ((yh1.b) addManuallyScreen.P.getValue()).f313698c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddManuallyScreen.T;
                        AddManuallyScreen addManuallyScreen2 = this.f24342b;
                        return dli.f.a(addManuallyScreen2, (h) addManuallyScreen2.Q.getValue(), u.c(addManuallyScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        this.R = new InputTextDelegate(null);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ci1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddManuallyScreen f24342b;

            {
                this.f24342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddManuallyScreen addManuallyScreen = this.f24342b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddManuallyScreen.T;
                        qji.b bVarU2 = addManuallyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.address.common.impl.flow.field_search.manual.di.AddManuallyScreenInjector");
                        yh1.c cVar = (yh1.c) bVarU2;
                        yh1.e eVar = cVar.f313700b;
                        yh1.c cVar2 = cVar.f313701c;
                        AddManuallyScreenContract$InputData addManuallyScreenContract$InputData = addManuallyScreen.K;
                        addManuallyScreenContract$InputData.getClass();
                        return new yh1.b(eVar, cVar2, addManuallyScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddManuallyScreen.T;
                        return (h) ((yh1.b) addManuallyScreen.P.getValue()).f313698c.get();
                    default:
                        KProperty[] kPropertyArr3 = AddManuallyScreen.T;
                        AddManuallyScreen addManuallyScreen2 = this.f24342b;
                        return dli.f.a(addManuallyScreen2, (h) addManuallyScreen2.Q.getValue(), u.c(addManuallyScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174551b.setEnabled(uiState.f24346b);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yh1.b) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ci1.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.address_component_search_add_manually_title, null, null, 14), null);
        d3().f174551b.setLargeButtonText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new c(this, null, 1), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
