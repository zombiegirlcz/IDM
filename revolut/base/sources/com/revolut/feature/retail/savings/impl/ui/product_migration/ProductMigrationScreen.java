package com.revolut.feature.retail.savings.impl.ui.product_migration;

import anb.j;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreen;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import efm.r;
import jii.u;
import kae.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpb.b;
import kpb.c;
import kpb.h;
import kpb.i;
import kpb.l;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/product_migration/ProductMigrationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkpb/h;", "Ldli/a;", "Lkpb/i;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductMigrationScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ProductMigrationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ProductMigrationScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ProductMigrationScreen(ProductMigrationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: kpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationScreen f188213b;

            {
                this.f188213b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductMigrationScreen productMigrationScreen = this.f188213b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationScreen.S;
                        ProductMigrationScreen productMigrationScreen2 = this.f188213b;
                        return dli.f.a(productMigrationScreen2, (l) productMigrationScreen2.R.getValue(), v.k(productMigrationScreen2.N, productMigrationScreen2.O, new RowLoadingDelegate(), new PlanTileDelegate(0), new ListSubheaderDelegate(), new PlanTileLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationScreen.S;
                        qji.b bVarU2 = productMigrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.product_migration.di.ProductMigrationScreenInjector");
                        anb.i iVar = (anb.i) bVarU2;
                        n nVar = iVar.f6647b;
                        anb.i iVar2 = iVar.f6648c;
                        ProductMigrationScreenContract$InputData productMigrationScreenContract$InputData = productMigrationScreen.K;
                        productMigrationScreenContract$InputData.getClass();
                        return new anb.j(nVar, iVar2, productMigrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationScreen.S;
                        return (l) ((anb.j) productMigrationScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationScreen f188213b;

            {
                this.f188213b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductMigrationScreen productMigrationScreen = this.f188213b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationScreen.S;
                        ProductMigrationScreen productMigrationScreen2 = this.f188213b;
                        return dli.f.a(productMigrationScreen2, (l) productMigrationScreen2.R.getValue(), v.k(productMigrationScreen2.N, productMigrationScreen2.O, new RowLoadingDelegate(), new PlanTileDelegate(0), new ListSubheaderDelegate(), new PlanTileLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationScreen.S;
                        qji.b bVarU2 = productMigrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.product_migration.di.ProductMigrationScreenInjector");
                        anb.i iVar = (anb.i) bVarU2;
                        n nVar = iVar.f6647b;
                        anb.i iVar2 = iVar.f6648c;
                        ProductMigrationScreenContract$InputData productMigrationScreenContract$InputData = productMigrationScreen.K;
                        productMigrationScreenContract$InputData.getClass();
                        return new anb.j(nVar, iVar2, productMigrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationScreen.S;
                        return (l) ((anb.j) productMigrationScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationScreen f188213b;

            {
                this.f188213b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductMigrationScreen productMigrationScreen = this.f188213b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationScreen.S;
                        ProductMigrationScreen productMigrationScreen2 = this.f188213b;
                        return dli.f.a(productMigrationScreen2, (l) productMigrationScreen2.R.getValue(), v.k(productMigrationScreen2.N, productMigrationScreen2.O, new RowLoadingDelegate(), new PlanTileDelegate(0), new ListSubheaderDelegate(), new PlanTileLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationScreen.S;
                        qji.b bVarU2 = productMigrationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.product_migration.di.ProductMigrationScreenInjector");
                        anb.i iVar = (anb.i) bVarU2;
                        n nVar = iVar.f6647b;
                        anb.i iVar2 = iVar.f6648c;
                        ProductMigrationScreenContract$InputData productMigrationScreenContract$InputData = productMigrationScreen.K;
                        productMigrationScreenContract$InputData.getClass();
                        return new anb.j(nVar, iVar2, productMigrationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationScreen.S;
                        return (l) ((anb.j) productMigrationScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f188219b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174563a.setBackground(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.savings_product_migration_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.savings_product_migration_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174564b.setLoadingButtonTag("SAVINGS_PRODUCT_MIGRATION_CTA_TAG");
        h30.l.A(R.string.common_action_accept, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        r rVarMergeArray = r.mergeArray(this.O.f53218h, this.N.f52371h.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new d(this, null, 25), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
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
        return (dli.c) this.P.getValue();
    }
}
