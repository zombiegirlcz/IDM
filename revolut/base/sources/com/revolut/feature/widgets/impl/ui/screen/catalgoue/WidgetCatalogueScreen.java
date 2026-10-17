package com.revolut.feature.widgets.impl.ui.screen.catalgoue;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewGridLayoutManager;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ofm.q;
import qsh.f;
import te0.w;
import tw0.b1;
import tw0.g1;
import tw0.l0;
import tw0.t0;
import tw0.y0;
import vc.s;
import vge.z1;
import vqd.b;
import vsh.a;
import vsh.e;
import vsh.g;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/widgets/impl/ui/screen/catalgoue/WidgetCatalogueScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvsh/g;", "Lcom/revolut/feature/widgets/impl/ui/screen/catalgoue/WidgetsCatalogueScreenContract$InputData;", "Lvsh/e;", "Lno/m;", "feature_widgets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetCatalogueScreen extends BaseRecyclerViewScreen<g, WidgetsCatalogueScreenContract$InputData, e> implements m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96382a0 = {o0.f186429a.j(new h0(WidgetCatalogueScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final l0 U;
    public final h V;
    public final Object W;
    public final Object X;
    public final int Y;
    public final f0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetCatalogueScreen(WidgetsCatalogueScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new l0();
        this.V = s.t(this, a.f);
        this.W = w.y0(new b(this, inputData, 8));
        this.X = w.y0(new vch.a(this, 28));
        this.Y = R$layout.screen_recycler_navbar;
        this.Z = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        f fVar = (f) this.W.getValue();
        switch (fVar.f248854a) {
            case 0:
                return ((qsh.b) fVar.f248856c).d.l();
            default:
                return ((ush.b) fVar.f248856c).f282926c.l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (vsh.f) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f96382a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new z1(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.g()), null, new vsh.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, f96382a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.widgets_catalogue_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.widgets_catalogue_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.bar_button_accessibility_label_dismiss, null, null, 14), 126));
        h().setTag("WIDGET_CATALOGUE_SCREEN_RECYCLER_TAG");
        koi.h adapter = d3();
        h().setClipChildren(false);
        h().addItemDecoration(new t0(adapter, false));
        RecyclerView.LayoutManager layoutManager = h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).setSpanSizeLookup(new y0(adapter, h(), null));
        h().setItemAnimator(new DefaultItemAnimator());
        RecyclerView recyclerView = h();
        l0 l0Var = this.U;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        l0Var.j(adapter, recyclerView, null, true, false, null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final RecyclerView.LayoutManager a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b1 b1Var = g1.Companion;
        Activity activityM2 = m2();
        b1Var.getClass();
        return new BaseRecyclerViewGridLayoutManager(context, b1.a(activityM2).getColumnCount());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF67958a0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.Y;
    }
}
