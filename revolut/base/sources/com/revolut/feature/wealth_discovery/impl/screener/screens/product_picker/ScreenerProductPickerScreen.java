package com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.ScreenerProductPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kae.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kqh.b;
import kqh.h;
import kqh.i;
import kqh.k;
import kqh.m;
import kqh.u;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/product_picker/ScreenerProductPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkqh/k;", "", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerProductPickerScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ScreenerProductPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final ao.h L;
    public final ProductSelectionDelegate M;
    public final ProductSelectionLoadingDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;

    public ScreenerProductPickerScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new ProductSelectionDelegate();
        this.N = new ProductSelectionLoadingDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: kqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerProductPickerScreen f188407b;

            {
                this.f188407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerProductPickerScreen screenerProductPickerScreen = this.f188407b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerProductPickerScreen.T;
                        qji.b bVarU2 = screenerProductPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.di.ScreenerProductPickerScreenComponent.Injector");
                        joh.p pVar = (joh.p) bVarU2;
                        joh.w wVar = pVar.f177038b;
                        joh.p pVar2 = pVar.f177039c;
                        h hVar = screenerProductPickerScreen.K;
                        hVar.getClass();
                        return new joh.s(wVar, pVar2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerProductPickerScreen.T;
                        return (e) ((joh.s) screenerProductPickerScreen.P.getValue()).f177057c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerProductPickerScreen.T;
                        ScreenerProductPickerScreen screenerProductPickerScreen2 = this.f188407b;
                        return dli.f.a(screenerProductPickerScreen2, screenerProductPickerScreen2.R2(), v.k(screenerProductPickerScreen2.M, screenerProductPickerScreen2.N, screenerProductPickerScreen2.O), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerProductPickerScreen f188407b;

            {
                this.f188407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerProductPickerScreen screenerProductPickerScreen = this.f188407b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerProductPickerScreen.T;
                        qji.b bVarU2 = screenerProductPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.di.ScreenerProductPickerScreenComponent.Injector");
                        joh.p pVar = (joh.p) bVarU2;
                        joh.w wVar = pVar.f177038b;
                        joh.p pVar2 = pVar.f177039c;
                        h hVar = screenerProductPickerScreen.K;
                        hVar.getClass();
                        return new joh.s(wVar, pVar2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerProductPickerScreen.T;
                        return (e) ((joh.s) screenerProductPickerScreen.P.getValue()).f177057c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerProductPickerScreen.T;
                        ScreenerProductPickerScreen screenerProductPickerScreen2 = this.f188407b;
                        return dli.f.a(screenerProductPickerScreen2, screenerProductPickerScreen2.R2(), v.k(screenerProductPickerScreen2.M, screenerProductPickerScreen2.N, screenerProductPickerScreen2.O), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: kqh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerProductPickerScreen f188407b;

            {
                this.f188407b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerProductPickerScreen screenerProductPickerScreen = this.f188407b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerProductPickerScreen.T;
                        qji.b bVarU2 = screenerProductPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth_discovery.impl.screener.screens.product_picker.di.ScreenerProductPickerScreenComponent.Injector");
                        joh.p pVar = (joh.p) bVarU2;
                        joh.w wVar = pVar.f177038b;
                        joh.p pVar2 = pVar.f177039c;
                        h hVar = screenerProductPickerScreen.K;
                        hVar.getClass();
                        return new joh.s(wVar, pVar2, hVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerProductPickerScreen.T;
                        return (e) ((joh.s) screenerProductPickerScreen.P.getValue()).f177057c.get();
                    default:
                        KProperty[] kPropertyArr3 = ScreenerProductPickerScreen.T;
                        ScreenerProductPickerScreen screenerProductPickerScreen2 = this.f188407b;
                        return dli.f.a(screenerProductPickerScreen2, screenerProductPickerScreen2.R2(), v.k(screenerProductPickerScreen2.M, screenerProductPickerScreen2.N, screenerProductPickerScreen2.O), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f188416a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((u) R2()).C2(i.f188413a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (joh.s) this.P.getValue();
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
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ko2.b(this, continuation, 2), 3);
        ViewController.P2(this, new kge.b(rd0.e.b(this.M.p()), 19), new d(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new kqh.d(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final kqh.e R2() {
        return (kqh.e) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
