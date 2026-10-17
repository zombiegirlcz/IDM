package com.revolut.feature.junior_graduation.impl.ui.screen.asset_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import bc1.a;
import bc1.b;
import bh8.c;
import bh8.d;
import bh8.g;
import bh8.i;
import bh8.j;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_graduation.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import rd0.e;
import sg8.f;
import te0.w;
import tx0.t3;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/ui/screen/asset_details/JuniorMigrationAssetDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lbh8/j;", "Lcom/revolut/feature/junior_graduation/impl/ui/screen/asset_details/JuniorMigrationAssetDetailsScreenContract$InputData;", "Laii/q;", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorMigrationAssetDetailsScreen extends BaseRecyclerViewScreen<j, JuniorMigrationAssetDetailsScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(JuniorMigrationAssetDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final int V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final CellDetailsChevronDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f76932a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f76933b0;
    public final PlainTextWarningDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f76934d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final h f76935e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuniorMigrationAssetDetailsScreen(JuniorMigrationAssetDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new a(this, inputData, 8));
        this.V = R$layout.screen_recycler_navbar;
        this.W = R$id.recyclerView;
        this.X = true;
        this.Y = w.y0(new b(this, 5));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Z = cellDetailsChevronDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f76932a0 = fullScreenStateDelegate;
        this.f76933b0 = new LargeActionButtonDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.c0 = plainTextWarningDelegate;
        this.f76934d0 = v.k(new CellDetailsLoadingDelegate(), new CellDetailsNoteDelegate(), plainTextWarningDelegate, new CellDetailsDelegate(), cellDetailsChevronDelegate, fullScreenStateDelegate);
        this.f76935e0 = s.t(this, bh8.a.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new bf5.a(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.s0()), null, new bh8.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f76933b0.d.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f76932a0.f52371h.f121375b), null, new bh8.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.d.f121375b), null, new b74.e(this, continuation, 26), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ?? r06 = this.U;
        ((f) r06.getValue()).getClass();
        m70.a.c(t0.f186434a);
        List args = u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        Intrinsics.checkNotNullParameter(args, "args");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_graduation_migration_asset_details_header_amount, args, null, 12), null);
        ((j60.a) ((f) r06.getValue()).d.get()).d(u.c(this.f76933b0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF76934d0() {
        return this.f76934d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVar = uiState.f15249b;
        if (gVar instanceof g.a) {
            h3().f174539b.l0();
            return;
        }
        if (!(gVar instanceof bh8.h)) {
            if (!(gVar instanceof g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar = h3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        NavBarWithToolbar navBarWithToolbar2 = h3().f174539b;
        navBarWithToolbar2.l0();
        bh8.h hVar = (bh8.h) gVar;
        navBarWithToolbar2.setTitle(hVar.f15245a, null);
        navBarWithToolbar2.setToolbarTitle(hVar.f15245a);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.setDescriptionText(hVar.f15246b);
        navBarWithToolbar2.setSecondDescriptionVisible(hVar.f15247c != null);
        navBarWithToolbar2.setSecondDescriptionText(hVar.f15247c);
        navBarWithToolbar2.setEndIconImage(hVar.d);
        navBarWithToolbar2.setEndIconBadge(hVar.e);
        navBarWithToolbar2.setActions(hVar.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.f76935e0.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
