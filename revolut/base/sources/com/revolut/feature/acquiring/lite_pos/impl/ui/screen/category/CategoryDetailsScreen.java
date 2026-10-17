package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import je1.b;
import je1.c;
import je1.d;
import je1.g;
import je1.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/category/CategoryDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lje1/g;", "Ldli/a;", "Lje1/i;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryDetailsScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CategoryDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenCatalogueCategoryDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final InputTextDelegate O;
    public final IconSelectorDelegate P;
    public final Object Q;

    public CategoryDetailsScreen(CategoryDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_catalogue_category_details;
        this.L = s.t(this, b.f);
        this.M = w.y0(new j68.a(this, inputData, 18));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: je1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryDetailsScreen f173171b;

            {
                this.f173171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryDetailsScreen.R;
                        return (h) ((ld1.e) this.f173171b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CategoryDetailsScreen.R;
                        CategoryDetailsScreen categoryDetailsScreen = this.f173171b;
                        return dli.f.a(categoryDetailsScreen, categoryDetailsScreen.d(), v.k(categoryDetailsScreen.O, categoryDetailsScreen.P), R$id.catalogueCategoryDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new InputTextDelegate(null);
        this.P = new IconSelectorDelegate();
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: je1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryDetailsScreen f173171b;

            {
                this.f173171b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryDetailsScreen.R;
                        return (h) ((ld1.e) this.f173171b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = CategoryDetailsScreen.R;
                        CategoryDetailsScreen categoryDetailsScreen = this.f173171b;
                        return dli.f.a(categoryDetailsScreen, categoryDetailsScreen.d(), v.k(categoryDetailsScreen.O, categoryDetailsScreen.P), R$id.catalogueCategoryDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar catalogueCategoryDetailsScreenNavBar = d3().f172909c;
        Intrinsics.checkNotNullExpressionValue(catalogueCategoryDetailsScreenNavBar, "catalogueCategoryDetailsScreenNavBar");
        catalogueCategoryDetailsScreenNavBar.setTitle(uiState.f173177b, null);
        d3().f172909c.setMenuItems(uiState.f173178c);
        d3().f172908b.setEnabled(uiState.e);
        d3().f172908b.setText(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.e) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f172909c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f172908b.setText(new TextLocalisedClause(R$string.product_catalogue_common_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172909c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new j82.q(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(d3().f172908b.o), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52489c.d), new je1.e(this, null), 3);
    }

    public final jd1.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final je1.h d() {
        return (je1.h) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
