package com.revolut.feature.robo.impl.ui.screen.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.wealth.resources.R$string;
import dlc.d;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import s86.a;
import se4.c;
import sji.b;
import snc.f;
import snc.g;
import snc.i;
import snc.k;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/settings/SettingsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lsnc/i;", "Lcom/revolut/feature/robo/impl/ui/screen/settings/SettingsScreenContract$Input;", "Laii/q;", "Ldlc/d;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsScreen extends BaseRecyclerViewScreen<i, SettingsScreenContract$Input, q> implements d {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f85199d0 = {o0.f186429a.j(new h0(SettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final int V;
    public final boolean W;
    public final CellDetailsChevronDelegate X;
    public final CellDetailsDelegate Y;
    public final PlainTextWarningDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f85200a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f85201b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsScreen(SettingsScreenContract$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, snc.d.f);
        this.V = R$layout.screen_recycler_navbar;
        this.W = true;
        this.X = new CellDetailsChevronDelegate();
        this.Y = new CellDetailsDelegate();
        this.Z = new PlainTextWarningDelegate();
        this.f85200a0 = new RowDelegate(null, null, 7);
        this.f85201b0 = new LargeActionButtonDelegate();
        this.c0 = w.y0(new a(this, inputData, 20));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (dmc.s) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) ((dmc.s) this.c0.getValue()).o.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new c(this, null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        m mVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = mVarH3.f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_settings_title, null, null, 14), null);
        mVarH3.f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((dmc.s) this.c0.getValue()).f.get()).d(u.c(this.f85201b0));
    }

    @Override // dlc.d
    public final dlc.c Y1() {
        return new dlc.c(this.f85200a0, this.X, this.f85201b0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return v.k(this.X, this.Y, this.Z, this.f85200a0, new RowLoadingDelegate(), new CellDetailsNoteDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f174539b.setEndIconImage(uiState.f264507a);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        snc.h hVar = uiState.f264508b;
        navBarWithToolbar.setLoadingVisible(Intrinsics.f(hVar, g.f264506a));
        h3().f174539b.setDescriptionVisible(hVar instanceof f);
        if ((hVar instanceof f ? (f) hVar : null) != null) {
            h3().f174539b.setDescriptionText(((f) hVar).f264505a);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.V;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, f85199d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
