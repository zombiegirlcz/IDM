package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nz8.d;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import y8a.g;
import ye1.b;
import ye1.c;
import ye1.f;
import ye1.j;
import ye1.k;
import ye1.l;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/product/CatalogueProductDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lye1/j;", "Ldli/a;", "Lye1/l;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueProductDetailsScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CatalogueProductDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenCatalogueProductDetailsBinding;", 0))};
    public final ProductDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final LargeActionButtonDelegate Q;
    public final RowDelegate R;
    public final AmountEditDelegate S;
    public final InputTextDelegate T;
    public final IconSelectorDelegate U;
    public final Object V;

    public CatalogueProductDetailsScreen(ProductDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_catalogue_product_details;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ye1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueProductDetailsScreen f312744b;

            {
                this.f312744b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CatalogueProductDetailsScreen catalogueProductDetailsScreen = this.f312744b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CatalogueProductDetailsScreen.W;
                        qji.b bVarU2 = catalogueProductDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.di.ProductDetailsScreenInjector");
                        ld1.c cVar = (ld1.c) bVarU2;
                        ld1.l lVar = cVar.f193928b;
                        ld1.c cVar2 = cVar.f193929c;
                        ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = catalogueProductDetailsScreen.K;
                        productDetailsScreenContract$InputData.getClass();
                        return new ld1.s(lVar, cVar2, productDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CatalogueProductDetailsScreen.W;
                        return (k) ((ld1.s) catalogueProductDetailsScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CatalogueProductDetailsScreen.W;
                        CatalogueProductDetailsScreen catalogueProductDetailsScreen2 = this.f312744b;
                        return dli.f.a(catalogueProductDetailsScreen2, catalogueProductDetailsScreen2.R2(), v.k(catalogueProductDetailsScreen2.S, catalogueProductDetailsScreen2.T, catalogueProductDetailsScreen2.U, catalogueProductDetailsScreen2.Q, catalogueProductDetailsScreen2.R, catalogueProductDetailsScreen2.P), R$id.catalogueProductDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ye1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueProductDetailsScreen f312744b;

            {
                this.f312744b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CatalogueProductDetailsScreen catalogueProductDetailsScreen = this.f312744b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CatalogueProductDetailsScreen.W;
                        qji.b bVarU2 = catalogueProductDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.di.ProductDetailsScreenInjector");
                        ld1.c cVar = (ld1.c) bVarU2;
                        ld1.l lVar = cVar.f193928b;
                        ld1.c cVar2 = cVar.f193929c;
                        ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = catalogueProductDetailsScreen.K;
                        productDetailsScreenContract$InputData.getClass();
                        return new ld1.s(lVar, cVar2, productDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CatalogueProductDetailsScreen.W;
                        return (k) ((ld1.s) catalogueProductDetailsScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CatalogueProductDetailsScreen.W;
                        CatalogueProductDetailsScreen catalogueProductDetailsScreen2 = this.f312744b;
                        return dli.f.a(catalogueProductDetailsScreen2, catalogueProductDetailsScreen2.R2(), v.k(catalogueProductDetailsScreen2.S, catalogueProductDetailsScreen2.T, catalogueProductDetailsScreen2.U, catalogueProductDetailsScreen2.Q, catalogueProductDetailsScreen2.R, catalogueProductDetailsScreen2.P), R$id.catalogueProductDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new AmountEditDelegate(new g(this, 15));
        this.T = new InputTextDelegate(null);
        this.U = new IconSelectorDelegate();
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ye1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueProductDetailsScreen f312744b;

            {
                this.f312744b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CatalogueProductDetailsScreen catalogueProductDetailsScreen = this.f312744b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CatalogueProductDetailsScreen.W;
                        qji.b bVarU2 = catalogueProductDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.di.ProductDetailsScreenInjector");
                        ld1.c cVar = (ld1.c) bVarU2;
                        ld1.l lVar = cVar.f193928b;
                        ld1.c cVar2 = cVar.f193929c;
                        ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = catalogueProductDetailsScreen.K;
                        productDetailsScreenContract$InputData.getClass();
                        return new ld1.s(lVar, cVar2, productDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CatalogueProductDetailsScreen.W;
                        return (k) ((ld1.s) catalogueProductDetailsScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CatalogueProductDetailsScreen.W;
                        CatalogueProductDetailsScreen catalogueProductDetailsScreen2 = this.f312744b;
                        return dli.f.a(catalogueProductDetailsScreen2, catalogueProductDetailsScreen2.R2(), v.k(catalogueProductDetailsScreen2.S, catalogueProductDetailsScreen2.T, catalogueProductDetailsScreen2.U, catalogueProductDetailsScreen2.Q, catalogueProductDetailsScreen2.R, catalogueProductDetailsScreen2.P), R$id.catalogueProductDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar catalogueProductDetailsScreenNavBar = d3().f172916c;
        Intrinsics.checkNotNullExpressionValue(catalogueProductDetailsScreenNavBar, "catalogueProductDetailsScreenNavBar");
        catalogueProductDetailsScreenNavBar.setTitle(uiState.f312754b, null);
        d3().f172916c.setEndImage(d.L(uiState.f312755c));
        d3().f172915b.setEnabled(uiState.e);
        d3().f172915b.setText(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.s) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f172916c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f172916c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f172915b.o), new c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.T;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new ye1.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52489c.d), new ye1.e(this, null), 3);
        ViewController.P2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new ye1.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new ye1.h(this, null), 3);
    }

    public final jd1.d d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
