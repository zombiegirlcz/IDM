package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.kompot.common.R$layout;
import dw3.i2;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import sw6.a;
import td4.d;
import td4.f;
import td4.h;
import td4.i;
import td4.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/options/DocumentOptionsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Ltd4/j;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/options/DocumentOptionsScreenContract$InputData;", "Ltd4/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentOptionsScreen extends PluginRecyclerViewScreen<j, DocumentOptionsScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DocumentOptionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int V;
    public final Object W;
    public final Object X;
    public final CellDetailsChevronDelegate Y;
    public final ListCellDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f67958a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ao.h f67959b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentOptionsScreen(DocumentOptionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = w.y0(new a(this, inputData, 16));
        this.X = w.y0(new sii.a(this, 27));
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Y = cellDetailsChevronDelegate;
        ListCellDelegate listCellDelegate = new ListCellDelegate();
        this.Z = listCellDelegate;
        this.f67958a0 = v.k(listCellDelegate, cellDetailsChevronDelegate);
        this.f67959b0 = s.t(this, d.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (i2) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new td4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new td4.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f51821c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.d), null, new t9h.b(this, null, 10), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF67958a0() {
        return this.f67958a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        u uVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = uVarH3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f269929b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        NavBarWithToolbar navBarWithToolbar2 = uVarH3.f174565c;
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar2.setSecondDescriptionText(uiState.f269930c);
        uVarH3.f174564b.setText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final u h3() {
        ViewBinding value = this.f67959b0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }
}
