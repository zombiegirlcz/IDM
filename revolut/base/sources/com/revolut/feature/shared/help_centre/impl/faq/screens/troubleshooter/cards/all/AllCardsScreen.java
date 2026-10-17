package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import ofm.q;
import te0.w;
import tx0.j0;
import vc.s;
import yq0.e;
import ywi.b;
import z8d.a;
import z8d.f;
import z8d.g;
import z8d.j;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/all/AllCardsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lz8d/g;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/all/AllCardsScreenContract$InputData;", "Lz8d/f;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllCardsScreen extends BaseRecyclerViewScreen<g, AllCardsScreenContract$InputData, f> implements k {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86307d0 = {o0.f186429a.j(new h0(AllCardsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final boolean X;
    public AnalyticsContext Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86308a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f86309b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllCardsScreen(AllCardsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        this.W = true;
        this.X = true;
        this.Y = l7d.a.b(inputData.f86310a);
        this.Z = w.y0(new b(this, inputData, 17));
        this.f86308a0 = w.y0(new e(this, 20));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86309b0 = rowDelegate;
        this.c0 = v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), rowDelegate);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Y = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r7d.a) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.f86308a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new z3f.b(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.o.f57403b), null, new yy6.f(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f86309b0.f53218h), null, new z8d.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        m mVarH3 = h3();
        mVarH3.f174539b.setTag("AllCardsScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("AllCardsScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.help_center_screen_all_cards_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.help_center_screen_all_cards_title, null, null, 14), null);
        navBarWithToolbar.setMenuItems(uiState.f320075b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, f86307d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
