package com.revolut.feature.junior_settings.impl.ui_kompot.coparents;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hl6.b;
import ho8.a;
import ho8.d;
import ho8.f;
import ho8.g;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.c;
import rd0.e;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/coparents/CoparentsSettingsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lho8/g;", "Lcom/revolut/feature/junior_settings/impl/ui_kompot/coparents/CoparentsSettingsScreenContract$InputData;", "Laii/q;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoparentsSettingsScreen extends BaseRecyclerViewScreen<g, CoparentsSettingsScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f77295d0 = {o0.f186429a.j(new h0(CoparentsSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f77296a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f77297b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoparentsSettingsScreen(CoparentsSettingsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, a.f);
        this.X = w.y0(new b(this, inputData, 3));
        this.Y = w.y0(new h1g.a(this, 25));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f77296a0 = new TwinHorizontalButtonDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f77297b0 = fullScreenStateDelegate;
        this.c0 = v.k(rowDelegate, fullScreenStateDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new hbg.h(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new ho8.b(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f77296a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new ho8.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new ho8.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f77297b0.f52371h.f121375b), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_u18_account_settings_coparent_list_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_u18_account_settings_coparent_list_screen_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((c) this.X.getValue()).d.get()).d(u.c(this.f77296a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setDescriptionText(uiState.f154246a);
        navBarWithToolbar.setDescriptionVisible(uiState.f154246a != null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f77295d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
