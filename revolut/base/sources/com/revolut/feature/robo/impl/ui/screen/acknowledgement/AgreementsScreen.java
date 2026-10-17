package com.revolut.feature.robo.impl.ui.screen.acknowledgement;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dmc.d;
import grl.k9;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import xmc.a;
import xmc.c;
import xmc.k;
import xmc.l;
import xmc.n;
import xmc.p;
import xmc.q;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/acknowledgement/AgreementsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lxmc/q;", "Lcom/revolut/feature/robo/impl/ui/screen/acknowledgement/AgreementsScreenContract$Input;", "Lxmc/k;", "Lno/m;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AgreementsScreen extends BaseRecyclerViewScreen<q, AgreementsScreenContract$Input, k> implements m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f85128b0 = {o0.f186429a.j(new h0(AgreementsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final k9 U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final InputChecklistDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f85129a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgreementsScreen(AgreementsScreenContract$Input input) {
        super(input);
        Intrinsics.checkNotNullParameter(input, "input");
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.U = value;
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new xfj.a(this, input, 6));
        this.Z = new InputChecklistDelegate();
        this.f85129a0 = new FullScreenStateDelegate();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.U);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new xmc.b(this, null, 0), 3);
        InputChecklistDelegate inputChecklistDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(inputChecklistDelegate.f52518c, new xlj.h(4))), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(inputChecklistDelegate.p(), new xlj.h(5))), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f85129a0.f52371h.f121375b), null, new xmc.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new xmc.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75674a0() {
        return v.k(this.Z, this.f85129a0, new RowLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        xmc.m mVar = uiState.f307149c;
        largeActionButton.setText(mVar.f307143b);
        h3().f174564b.setEnabled(mVar.f307142a);
        p pVar = uiState.f307148b;
        if (!(pVar instanceof n)) {
            if (!(pVar instanceof xmc.o)) {
                throw new NoWhenBranchMatchedException();
            }
            h3().f174565c.setLoadingVisible(true);
            return;
        }
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setLoadingVisible(false);
        n nVar = (n) pVar;
        TextLocalisedClause textLocalisedClause = nVar.f307145b;
        TextLocalisedClause textLocalisedClause2 = nVar.f307144a;
        navBarWithToolbar.setTitle(textLocalisedClause2, null);
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause2, textLocalisedClause, null, 4, null);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, f85128b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) ((d) this.Y.getValue()).d.get();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
