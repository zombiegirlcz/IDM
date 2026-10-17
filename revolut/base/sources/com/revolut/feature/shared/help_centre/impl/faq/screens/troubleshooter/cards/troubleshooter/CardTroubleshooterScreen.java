package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import b9d.b;
import b9d.d;
import b9d.h;
import b9d.i;
import b9d.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
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
import l7d.a;
import no.k;
import ofm.q;
import r7d.c;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/troubleshooter/CardTroubleshooterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lb9d/j;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/cards/troubleshooter/CardTroubleshooterScreenContract$InputData;", "Lb9d/h;", "Lno/k;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardTroubleshooterScreen extends BaseRecyclerViewScreen<j, CardTroubleshooterScreenContract$InputData, h> implements k {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86318e0 = {o0.f186429a.j(new h0(CardTroubleshooterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final boolean W;
    public final boolean X;
    public AnalyticsContext Y;
    public final CellDetailsChevronDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f86319a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f86320b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f86321d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTroubleshooterScreen(CardTroubleshooterScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        this.W = true;
        this.X = true;
        this.Y = a.d(4, inputData.f86322a, inputData.f86324c);
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Z = cellDetailsChevronDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86319a0 = rowDelegate;
        this.f86320b0 = v.k(cellDetailsChevronDelegate, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), rowDelegate, new FullScreenStateDelegate());
        this.c0 = w.y0(new at4.b(this, inputData, 25));
        this.f86321d0 = w.y0(new aqe.a(this, 28));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Y = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f86321d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new az.i(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.o.f57403b), null, new b74.e(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f51821c), null, new b9d.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86319a0.f53218h), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        m mVarH3 = h3();
        mVarH3.f174539b.setTag("CardTroubleshooterScreen_navBarWithToolbar");
        mVarH3.f174540c.setTag("CardTroubleshooterScreen_recycler");
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f86320b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        this.Y = uiState.d;
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f13721b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setMenuItems(uiState.f13722c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.V.getValue(this, f86318e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
