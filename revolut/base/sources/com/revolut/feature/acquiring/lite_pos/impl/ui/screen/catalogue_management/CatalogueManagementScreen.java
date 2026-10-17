package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import he1.c;
import he1.d;
import he1.g;
import he1.j;
import he1.k;
import ihm.f;
import java.util.List;
import jd1.b;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ld1.y;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue_management/CatalogueManagementScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lhe1/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lhe1/g;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CatalogueManagementScreen extends BaseRecyclerViewScreen<k, IOData$EmptyInput, g> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60782e0 = {o0.f186429a.j(new h0(CatalogueManagementScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenCatalogueManagementBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public ud1.a X;
    public final FullScreenStateDelegate Y;
    public final ListSubheaderDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ExpandableCellDelegate f60783a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f60784b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f60785d0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenCatalogueManagementBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.catalogueManagementScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.catalogueManagementScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new b((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CatalogueManagementScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_catalogue_management;
        this.V = R$id.catalogueManagementScreen_recyclerView;
        this.W = s.t(this, a.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.Z = listSubheaderDelegate;
        ExpandableCellDelegate expandableCellDelegate = new ExpandableCellDelegate();
        this.f60783a0 = expandableCellDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f60784b0 = rowDelegate;
        this.c0 = v.k(new ExpandableCellLoadingDelegate(), new RowLoadingDelegate(), rowDelegate, fullScreenStateDelegate, expandableCellDelegate, listSubheaderDelegate);
        this.f60785d0 = w.y0(new h1g.a(this, 10));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172911b.setMenuItems(uiState.f151520b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (y) this.f60785d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f52371h.f121375b), null, new he1.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f52707c), null, new he1.b(this, null), 3);
        ExpandableCellDelegate expandableCellDelegate = this.f60783a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(expandableCellDelegate.f52255c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b((f) expandableCellDelegate.d.getValue()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f60784b0.f53218h), null, new he1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f172911b.o.f57403b), null, new hba.k(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f172911b.f59410q), null, new hbg.h(this, continuation, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ud1.a aVar = (ud1.a) ((y) this.f60785d0.getValue()).f194011a.d.get();
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.X = aVar;
        NavBarWithToolbar navBarWithToolbar = g3().f172911b;
        if (this.X == null) {
            Intrinsics.r("uiConfig");
            throw null;
        }
        navBarWithToolbar.setVisible(true);
        NavBarWithToolbar catalogueManagementScreenNavBar = g3().f172911b;
        Intrinsics.checkNotNullExpressionValue(catalogueManagementScreenNavBar, "catalogueManagementScreenNavBar");
        catalogueManagementScreenNavBar.setTitle(new TextLocalisedClause(R$string.product_catalogue_common_title_catalogue, null, null, 14), null);
        g3().f172911b.setToolbarTitle(new TextLocalisedClause(R$string.product_catalogue_common_title_catalogue, null, null, 14));
        g3().f172911b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_navigation_back));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        k uiState = (k) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172911b.setMenuItems(uiState.f151520b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final b g3() {
        ViewBinding value = this.W.getValue(this, f60782e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) ((y) this.f60785d0.getValue()).f194013c.get();
    }
}
