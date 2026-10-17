package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import ip0.md;
import ip4.m;
import is2.d;
import is2.g;
import is2.i;
import is2.j;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tr2.q;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/select_payment/SelectPaymentToBlockScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lis2/j;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/select_payment/SelectPaymentToBlockScreenContract$InputData;", "Lis2/g;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectPaymentToBlockScreen extends BaseRecyclerViewScreen<j, SelectPaymentToBlockScreenContract$InputData, g> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f64258d0 = {o0.f186429a.j(new h0(SelectPaymentToBlockScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SelectableDelegate f64259a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f64260b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentToBlockScreen(SelectPaymentToBlockScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, is2.a.f);
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = R$id.recyclerView;
        this.X = w.y0(new md(this, inputData, 13));
        this.Y = w.y0(new ie7.a(this, 26));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.f64259a0 = selectableDelegate;
        this.f64260b0 = new LargeActionButtonDelegate();
        this.c0 = v.k(rowDelegate, new RowLoadingDelegate(), new ListSubheaderDelegate(), new SwipeToActionDelegate(rowDelegate, false), selectableDelegate, new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new is2.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59409p.f57337m), null, new is2.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new is2.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(this.f64259a0.r(), new m(15))), null, new is2.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f64260b0.d.f121375b), null, new is2.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        TextLocalisedClause textLocalisedClause;
        Pair pair;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        SelectPaymentToBlockScreenContract$InputData selectPaymentToBlockScreenContract$InputData = (SelectPaymentToBlockScreenContract$InputData) this.G;
        SelectPaymentToBlockScreenContract$ScreenType selectPaymentToBlockScreenContract$ScreenType = selectPaymentToBlockScreenContract$InputData.f64262b;
        boolean zF = Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a);
        ContentUser.Self self = ContentUser.Self.f64237b;
        if (zF) {
            ContentUser contentUser = selectPaymentToBlockScreenContract$InputData.f64261a;
            if (contentUser instanceof ContentUser.Junior) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.blocked_payments_merchant_transaction_list_subtitle_kid, null, null, 14);
            } else {
                if (!Intrinsics.f(contentUser, self)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = new TextLocalisedClause(R$string.blocked_payments_merchant_transaction_list_subtitle, null, null, 14);
            }
            pair = new Pair(new TextLocalisedClause(R$string.blocked_payments_merchant_transaction_list_title, null, null, 14), textLocalisedClause2);
        } else if (Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchantOld.f64264a)) {
            pair = new Pair(new TextLocalisedClause(R$string.merchants_transaction_list_title, null, null, 14), new TextLocalisedClause(R$string.merchants_transaction_list_subtitle, null, null, 14));
        } else {
            if (!Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a)) {
                throw new NoWhenBranchMatchedException();
            }
            ContentUser contentUser2 = selectPaymentToBlockScreenContract$InputData.f64261a;
            if (contentUser2 instanceof ContentUser.Junior) {
                textLocalisedClause = new TextLocalisedClause(R$string.blocked_payments_subscription_transaction_list_subtitle_kid, null, null, 14);
            } else {
                if (!Intrinsics.f(contentUser2, self)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.blocked_payments_subscription_transaction_list_subtitle, null, null, 14);
            }
            pair = new Pair(new TextLocalisedClause(R$string.blocked_payments_subscription_transaction_list_title, null, null, 14), textLocalisedClause);
        }
        TextLocalisedClause textLocalisedClause3 = (TextLocalisedClause) pair.f186385a;
        TextLocalisedClause textLocalisedClause4 = (TextLocalisedClause) pair.f186386b;
        navBarWithToolbar.setTitle(textLocalisedClause3, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause3);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause4);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.merchants_transaction_list_search, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        l.A(R.string.common_action_continue, null, null, 14, h3().f174564b);
        ((j60.a) ((q) this.X.getValue()).f.get()).d(v.k(this.f64260b0, this.Z, new RowLoadingDelegate()));
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
        super.Z2(uiState, oVar);
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f168087b ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final u h3() {
        ViewBinding value = this.U.getValue(this, f64258d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }
}
