package com.revolut.feature.product_article.impl.ui.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductValuePropCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.product_article.impl.R$layout;
import com.revolut.feature.product_article.impl.R$string;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsController;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import gka.a;
import ika.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import pd.b;
import xka.d;
import xka.g;
import xka.s;
import xka.t;
import xka.u;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/product_article/impl/ui/screen/details/ProductArticleDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxka/s;", "Lcli/w;", "Lxka/u;", "Lno/m;", "Lno/k;", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductArticleDetailsController extends ViewController<s> implements w, m, k {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ProductArticleDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/product_article/impl/databinding/ProductArticleDetailsScreenBinding;", 0))};
    public final ProductArticleDetailsControllerContract$InputData K;
    public final PlainTextDelegate L;
    public final LightPromptDelegate M;
    public final TextDelegate N;
    public final FcaDisclaimerDelegate O;
    public final h P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final AnalyticsProduct U;
    public AnalyticsContext V;

    public ProductArticleDetailsController(ProductArticleDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PlainTextDelegate();
        this.M = new LightPromptDelegate(this);
        this.N = new TextDelegate();
        this.O = new FcaDisclaimerDelegate();
        this.P = vc.s.t(this, d.f);
        this.Q = R$layout.product_article_details_screen;
        final int i = 0;
        this.R = te0.w.y0(new Function0(this) { // from class: xka.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleDetailsController f306633b;

            {
                this.f306633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductArticleDetailsController productArticleDetailsController = this.f306633b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProductArticleDetailsController.W;
                        return (t) ((ika.c) productArticleDetailsController.T.getValue()).f161928c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProductArticleDetailsController.W;
                        return n14.e.a(productArticleDetailsController, productArticleDetailsController.k3());
                    default:
                        KProperty[] kPropertyArr3 = ProductArticleDetailsController.W;
                        qji.b bVarU2 = productArticleDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.product_article.impl.ui.screen.details.di.ProductArticleDetailsComponent.Injector");
                        ika.d dVar = (ika.d) bVarU2;
                        ika.b bVar = dVar.d;
                        ika.d dVar2 = dVar.e;
                        ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = productArticleDetailsController.K;
                        productArticleDetailsControllerContract$InputData.getClass();
                        return new ika.c(bVar, dVar2, productArticleDetailsControllerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.S = te0.w.y0(new Function0(this) { // from class: xka.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleDetailsController f306633b;

            {
                this.f306633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductArticleDetailsController productArticleDetailsController = this.f306633b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductArticleDetailsController.W;
                        return (t) ((ika.c) productArticleDetailsController.T.getValue()).f161928c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProductArticleDetailsController.W;
                        return n14.e.a(productArticleDetailsController, productArticleDetailsController.k3());
                    default:
                        KProperty[] kPropertyArr3 = ProductArticleDetailsController.W;
                        qji.b bVarU2 = productArticleDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.product_article.impl.ui.screen.details.di.ProductArticleDetailsComponent.Injector");
                        ika.d dVar = (ika.d) bVarU2;
                        ika.b bVar = dVar.d;
                        ika.d dVar2 = dVar.e;
                        ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = productArticleDetailsController.K;
                        productArticleDetailsControllerContract$InputData.getClass();
                        return new ika.c(bVar, dVar2, productArticleDetailsControllerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.T = te0.w.y0(new Function0(this) { // from class: xka.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleDetailsController f306633b;

            {
                this.f306633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductArticleDetailsController productArticleDetailsController = this.f306633b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductArticleDetailsController.W;
                        return (t) ((ika.c) productArticleDetailsController.T.getValue()).f161928c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProductArticleDetailsController.W;
                        return n14.e.a(productArticleDetailsController, productArticleDetailsController.k3());
                    default:
                        KProperty[] kPropertyArr3 = ProductArticleDetailsController.W;
                        qji.b bVarU2 = productArticleDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.product_article.impl.ui.screen.details.di.ProductArticleDetailsComponent.Injector");
                        ika.d dVar = (ika.d) bVarU2;
                        ika.b bVar = dVar.d;
                        ika.d dVar2 = dVar.e;
                        ProductArticleDetailsControllerContract$InputData productArticleDetailsControllerContract$InputData = productArticleDetailsController.K;
                        productArticleDetailsControllerContract$InputData.getClass();
                        return new ika.c(bVar, dVar2, productArticleDetailsControllerContract$InputData);
                }
            }
        });
        this.U = inputData.f81290c;
        this.V = inputData.d;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f144370b.setModel(uiState.f306648a);
        this.V = uiState.f306649b;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.V = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getP() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.T.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getC0() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f144370b.setDelegates(v.k(new ProductValuePropCardDelegate(0), new RowDelegate(null, null, 7), new SimpleMediaDelegate(), this.M, this.L, this.N, this.O));
        b.p(view, new TextLocalisedClause(R$string.product_article, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f144370b.k), new xka.h(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f144370b.f59155l), new xka.h(this, null, 1), 3);
        PlainTextDelegate plainTextDelegate = this.L;
        ViewController.P2(this, new wvl.b(rd0.e.b(plainTextDelegate.f.f121375b), 27), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(plainTextDelegate.d.f121375b), new g(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f144370b.f59156m), new xka.h(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f144370b.o), new g(this, null, 3), 3);
        ViewController.P2(this, new wvl.b(rd0.e.b(this.N.d), 28), new g(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52310c.f121375b), new g(this, null, 0), 3);
    }

    public final a d3() {
        ViewBinding value = this.P.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
