package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw3.k;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.core.R$string;
import dw3.i9;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import rd0.e;
import rgf.b;
import ri4.a;
import ri4.c;
import ri4.d;
import ri4.h;
import ri4.i;
import ri4.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/give_consent/GiveConsentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lri4/j;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_partner/give_consent/GiveConsentScreenContract$InputData;", "Lri4/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiveConsentScreen extends PluginRecyclerViewScreen<j, GiveConsentScreenContract$InputData, h> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f68473d0 = {o0.f186429a.j(new h0(GiveConsentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};
    public final int V;
    public final int W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f68474a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ListCellDelegate f68475b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiveConsentScreen(GiveConsentScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_credit_recycler_navbar_twinbuttons;
        this.W = R$id.creditApplication_recyclerView;
        this.X = s.t(this, a.f);
        this.Y = w.y0(new b(this, inputData, 3));
        this.Z = w.y0(new r1a.a(this, 14));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f68474a0 = fullScreenStateDelegate;
        ListCellDelegate listCellDelegate = new ListCellDelegate();
        this.f68475b0 = listCellDelegate;
        this.c0 = v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CellDetailsDelegate(), new TextDelegate(), listCellDelegate, fullScreenStateDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i9) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, f68473d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(creditApplicationNavBarWithToolbar.f59410q), null, new ri4.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f68474a0.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f68475b0.d), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().o0()), null, new ri4.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().p0()), null, new ri4.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().n0()), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(i3().m0()), null, new ri4.b(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h().setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        ViewBinding value = this.X.getValue(this, f68473d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        creditApplicationNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        creditApplicationNavBarWithToolbar.setDescriptionVisible(true);
        TwinVerticalButton twinVerticalButtonI3 = i3();
        twinVerticalButtonI3.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        twinVerticalButtonI3.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButtonI3.setSecondaryButtonVisible(false);
        twinVerticalButtonI3.setMainButtonEnabled(true);
        twinVerticalButtonI3.setCollapsed(true, false);
        twinVerticalButtonI3.setCollapsible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
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
        i3().setCollapsible(uiState.f);
        super.Z2(uiState, oVar);
        ViewBinding value = this.X.getValue(this, f68473d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar creditApplicationNavBarWithToolbar = ((k) value).f10698b;
        Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
        Clause clause = uiState.f254543b;
        creditApplicationNavBarWithToolbar.setTitle(clause, null);
        creditApplicationNavBarWithToolbar.setToolbarTitle(clause);
        creditApplicationNavBarWithToolbar.setDescriptionText(uiState.f254544c);
        TwinVerticalButton twinVerticalButtonI3 = i3();
        twinVerticalButtonI3.setFabEnabled(uiState.f254545g);
        twinVerticalButtonI3.setMainButtonText(uiState.d);
        twinVerticalButtonI3.setSecondaryButtonText(uiState.e);
        boolean zA = twinVerticalButtonI3.A();
        TwinVerticalButton twinVerticalButtonI32 = i3();
        boolean z = !zA;
        twinVerticalButtonI32.setSecondaryButtonVisible(z);
        twinVerticalButtonI32.setSecondaryButtonEnabled(z);
        twinVerticalButtonI32.setMainButtonEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Z.getValue();
    }

    public final TwinVerticalButton i3() {
        ViewBinding value = this.X.getValue(this, f68473d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TwinVerticalButton creditApplicationTwinVerticalButton = ((k) value).d;
        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
        return creditApplicationTwinVerticalButton;
    }
}
