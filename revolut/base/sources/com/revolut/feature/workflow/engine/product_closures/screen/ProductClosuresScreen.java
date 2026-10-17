package com.revolut.feature.workflow.engine.product_closures.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreen;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreenContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import wth.b;
import wth.c;
import wth.d;
import wth.h;
import wth.i;
import wth.j;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/product_closures/screen/ProductClosuresScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwth/h;", "Ldli/a;", "Lwth/j;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductClosuresScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ProductClosuresScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ProductClosuresScreenContract$Input K;
    public final ao.h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ProductClosuresScreen(ProductClosuresScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = w.y0(new wq1.a(17));
        this.O = w.y0(new wq1.a(18));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductClosuresScreen f299985b;

            {
                this.f299985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductClosuresScreen productClosuresScreen = this.f299985b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProductClosuresScreen.S;
                        qji.b bVarU2 = productClosuresScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.product_closures.screen.di.ProductClosuresScreenInjector");
                        qth.i iVar = (qth.i) bVarU2;
                        qth.g gVar = iVar.f249151b;
                        qth.i iVar2 = iVar.f249152c;
                        ProductClosuresScreenContract$Input productClosuresScreenContract$Input = productClosuresScreen.K;
                        productClosuresScreenContract$Input.getClass();
                        return new qth.e(gVar, iVar2, productClosuresScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductClosuresScreen.S;
                        return (i) ((qth.e) productClosuresScreen.P.getValue()).f249128c.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductClosuresScreen.S;
                        ProductClosuresScreen productClosuresScreen2 = this.f299985b;
                        return dli.f.a(productClosuresScreen2, (i) productClosuresScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) productClosuresScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) productClosuresScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: wth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductClosuresScreen f299985b;

            {
                this.f299985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductClosuresScreen productClosuresScreen = this.f299985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductClosuresScreen.S;
                        qji.b bVarU2 = productClosuresScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.product_closures.screen.di.ProductClosuresScreenInjector");
                        qth.i iVar = (qth.i) bVarU2;
                        qth.g gVar = iVar.f249151b;
                        qth.i iVar2 = iVar.f249152c;
                        ProductClosuresScreenContract$Input productClosuresScreenContract$Input = productClosuresScreen.K;
                        productClosuresScreenContract$Input.getClass();
                        return new qth.e(gVar, iVar2, productClosuresScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductClosuresScreen.S;
                        return (i) ((qth.e) productClosuresScreen.P.getValue()).f249128c.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductClosuresScreen.S;
                        ProductClosuresScreen productClosuresScreen2 = this.f299985b;
                        return dli.f.a(productClosuresScreen2, (i) productClosuresScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) productClosuresScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) productClosuresScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductClosuresScreen f299985b;

            {
                this.f299985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductClosuresScreen productClosuresScreen = this.f299985b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductClosuresScreen.S;
                        qji.b bVarU2 = productClosuresScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.product_closures.screen.di.ProductClosuresScreenInjector");
                        qth.i iVar = (qth.i) bVarU2;
                        qth.g gVar = iVar.f249151b;
                        qth.i iVar2 = iVar.f249152c;
                        ProductClosuresScreenContract$Input productClosuresScreenContract$Input = productClosuresScreen.K;
                        productClosuresScreenContract$Input.getClass();
                        return new qth.e(gVar, iVar2, productClosuresScreenContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductClosuresScreen.S;
                        return (i) ((qth.e) productClosuresScreen.P.getValue()).f249128c.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductClosuresScreen.S;
                        ProductClosuresScreen productClosuresScreen2 = this.f299985b;
                        return dli.f.a(productClosuresScreen2, (i) productClosuresScreen2.Q.getValue(), v.k(new ListSubheaderDelegate(), (RowDelegate) productClosuresScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) productClosuresScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qth.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        int i = R$string.product_obstacles_list_title;
        ProductClosuresScreenContract$Input productClosuresScreenContract$Input = this.K;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(productClosuresScreenContract$Input.f96504a), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new HtmlClause(0, 30, (Integer) null, (Object) null, productClosuresScreenContract$Input.f96505b));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new c(this, null), 3);
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new wkg.e(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
