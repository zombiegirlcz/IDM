package com.revolut.feature.cash_topup.impl.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.e0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mb3.m;
import rd0.e;
import ur2.a;
import uwe.f;
import v0c.b;
import vb3.c;
import vb3.d;
import vb3.l;
import vb3.n;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/details/CashTopUpDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvb3/n;", "Lcom/revolut/feature/cash_topup/impl/ui/details/CashTopUpDetailsScreenContract$InputData;", "Lvb3/l;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpDetailsScreen extends BaseRecyclerViewScreen<n, CashTopUpDetailsScreenContract$InputData, l> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65624b0 = {o0.f186429a.j(new h0(CashTopUpDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CellDetailsActionDelegate U;
    public final List V;
    public final Lazy W;
    public final Lazy X;
    public final boolean Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f65625a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpDetailsScreen(CashTopUpDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.U = cellDetailsActionDelegate;
        this.V = v.k(cellDetailsActionDelegate, new CellDetailsDelegate(), new MapPlainDelegate());
        this.W = j.b(new b(this, inputData, 24));
        this.X = j.b(new a(this, 28));
        this.Y = true;
        this.Z = R$layout.screen_recycler_navbar;
        this.f65625a0 = s.t(this, c.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new f(this, null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.s0()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.U.d), null, new vb3.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setSecondDescriptionTextStyle(e0.PRIMARY);
        navBarWithToolbar.setSecondDescriptionColor(R$attr.uikit_colorForeground);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        TextClause textClause = uiState.f287388a;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setActions(uiState.f287390c);
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setSecondDescriptionText(uiState.f287389b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Z;
    }

    public final jii.m h3() {
        ViewBinding value = this.f65625a0.getValue(this, f65624b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final vb3.m T2() {
        return (vb3.m) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
