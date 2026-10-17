package com.revolut.feature.subaccount.impl.ui.bill.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import o10.c;
import o7e.a;
import o7e.d;
import o7e.i;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/bill/screen/BillAccountDetailScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lo7e/i;", "Lcom/revolut/feature/subaccount/impl/ui/bill/screen/BillAccountDetailScreenContract$InputData;", "Laii/q;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillAccountDetailScreen extends BaseRecyclerViewScreen<i, BillAccountDetailScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(BillAccountDetailScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ActionsDelegate f88998a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f88999b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f89000d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f89001e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillAccountDetailScreen(BillAccountDetailScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = w.y0(new e(this, inputData, 24));
        this.Z = w.y0(new c(this, 8));
        ActionsDelegate actionsDelegate = new ActionsDelegate();
        this.f88998a0 = actionsDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f88999b0 = rowDelegate;
        this.c0 = new RowDelegate(null, null, 7);
        this.f89000d0 = new TwinHorizontalButtonDelegate();
        this.f89001e0 = v.k(actionsDelegate, rowDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r6e.c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new o7e.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f88999b0.f53218h), null, new o7e.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f88998a0.f51611c.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.f53218h), null, new o7e.e(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f89000d0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new o7e.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.bill_accounts_bills_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.bill_accounts_bills_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((r6e.c) this.Y.getValue()).d.get()).d(v.k(this.c0, this.f89000d0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF89001e0() {
        return this.f89001e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setDescriptionVisible(uiState.f222776b != null);
        navBarWithToolbar.setDescriptionText(uiState.f222776b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final o7e.h T2() {
        return (o7e.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
