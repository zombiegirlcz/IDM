package com.revolut.feature_account_widget.impl.configuration;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import th9.t;
import tk5.c;
import tml.a;
import tvh.d;
import tvh.g;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_account_widget/impl/configuration/AccountWidgetConfigScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltvh/d;", "Lcom/revolut/feature_account_widget/impl/configuration/WidgetIdInputData;", "Laii/q;", "feature_account_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountWidgetConfigScreen extends BaseRecyclerViewScreen<d, WidgetIdInputData, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96617a0 = {o0.f186429a.j(new h0(AccountWidgetConfigScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AccountCellItemDelegate U;
    public final Lazy V;
    public final Lazy W;
    public final List X;
    public final int Y;
    public final h Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountWidgetConfigScreen(WidgetIdInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        this.U = accountCellItemDelegate;
        this.V = j.b(new a(this, inputData, 20));
        this.W = j.b(new t(this, 22));
        this.X = v.k(new ListSubheaderDelegate(), accountCellItemDelegate, new SwipeToActionDelegate(accountCellItemDelegate, false), new RowLoadingDelegate(), new FullScreenStateDelegate());
        this.Y = R$layout.screen_recycler_navbar;
        this.Z = s.t(this, tvh.a.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (uvh.d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Z.getValue(this, f96617a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new c(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.U.f51551c.f53218h), null, new tvh.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Z.getValue(this, f96617a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.menu_account_new, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Y;
    }
}
