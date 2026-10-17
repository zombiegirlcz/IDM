package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import dw3.c4;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qvf.a;
import rd4.c;
import rd4.e;
import rd4.g;
import rd4.h;
import rd4.i;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/intro/ManualUnderwritingIntroScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lrd4/h;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/intro/ManualUnderwritingIntroScreenContract$InputData;", "Lrd4/e;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualUnderwritingIntroScreen extends PluginRecyclerViewScreen<h, ManualUnderwritingIntroScreenContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67954b0 = {o0.f186429a.j(new h0(ManualUnderwritingIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int V;
    public final Object W;
    public final RowDelegate X;
    public final Object Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ao.h f67955a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualUnderwritingIntroScreen(ManualUnderwritingIntroScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = w.y0(new a(this, inputData, 26));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        this.Y = w.y0(new r1a.a(this, 10));
        this.Z = v.k(new PlainTextDelegate(), rowDelegate);
        this.f67955a0 = s.t(this, rd4.a.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((i) ((g) this.Y.getValue())).v2(e.a.f253335a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c4) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new rd4.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new rd4.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f53218h), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
        h3().f174564b.setText(new TextLocalisedClause(R$string.credit_manual_underwriting_intro_screen_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f253338a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(uiState.f253339b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final u h3() {
        ViewBinding value = this.f67955a0.getValue(this, f67954b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }
}
