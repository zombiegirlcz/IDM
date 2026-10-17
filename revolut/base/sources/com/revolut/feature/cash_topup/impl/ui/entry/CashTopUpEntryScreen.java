package com.revolut.feature.cash_topup.impl.ui.entry;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ihm.f;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mb3.n;
import sji.b;
import u36.g;
import vc.s;
import w83.a;
import wb3.c;
import wb3.e;
import wb3.i;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/entry/CashTopUpEntryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwb3/i;", "Lcom/revolut/feature/cash_topup/impl/ui/entry/CashTopUpEntryScreenContract$InputData;", "Laii/q;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpEntryScreen extends BaseRecyclerViewScreen<i, CashTopUpEntryScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65628b0 = {o0.f186429a.j(new h0(CashTopUpEntryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final TextDelegate U;
    public final List V;
    public final Lazy W;
    public final Lazy X;
    public final boolean Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f65629a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashTopUpEntryScreen(CashTopUpEntryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        TextDelegate textDelegate = new TextDelegate();
        this.U = textDelegate;
        this.V = v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate(), textDelegate);
        this.W = j.b(new a(this, inputData, 6));
        this.X = j.b(new vt3.a(this, 16));
        this.Y = true;
        this.Z = R$layout.screen_recycler_navbar_nextbutton;
        this.f65629a0 = s.t(this, wb3.a.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (n) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new wb3.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new wb3.b(this, null, 1), 3);
        f fVar = this.U.d;
        c cVar = c.f;
        r map = fVar.map(new vf0.q(20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new g(2, (e) this.X.getValue(), e.class, "onTermsAndConditionsClicked", "onTermsAndConditionsClicked(Ljava/lang/String;)V", 4, 23), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174564b.o(LargeActionButton.ButtonStyle.f58725a);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f296004b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        h3().f174564b.setText(uiState.f296005c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final u h3() {
        ViewBinding value = this.f65629a0.getValue(this, f65628b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
