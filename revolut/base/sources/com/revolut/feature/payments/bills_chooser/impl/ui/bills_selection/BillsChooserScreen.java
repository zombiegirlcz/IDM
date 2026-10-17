package com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import com.revolut.feature.payments.bills_chooser.impl.R$id;
import com.revolut.feature.payments.bills_chooser.impl.R$layout;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import gp9.e;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qqj.g;
import r1a.a;
import rgf.b;
import rp0.n0;
import rp9.c;
import rp9.f;
import rp9.i;
import rp9.j;
import rp9.m;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_selection/BillsChooserScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrp9/c;", "Lcom/revolut/feature/payments/bills_chooser/api/navigation/BillsChooserInputData;", "Lbp9/c;", "", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillsChooserScreen extends BaseRecyclerViewScreen<c, BillsChooserInputData, bp9.c> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(BillsChooserScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/bills_chooser/impl/databinding/ScreenBillsSelectionBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f79234a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f79235b0;
    public final SelectableDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ReferralContactDelegate f79236d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RowDelegate f79237e0;
    public final List f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillsChooserScreen(BillsChooserInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_bills_selection;
        this.V = R$id.billsSelection_recyclerView;
        this.W = s.t(this, f.f);
        this.X = w.y0(new b(this, inputData, 14));
        this.Y = w.y0(new a(this, 23));
        this.Z = true;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f79234a0 = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f79235b0 = rowDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.c0 = selectableDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.f79236d0 = referralContactDelegate;
        ScrollerBoxDelegate scrollerBoxDelegate = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        this.f79237e0 = new RowDelegate(null, null, 7);
        this.f0 = v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new TextDelegate(), fullScreenStateDelegate, rowDelegate, selectableDelegate, scrollerBoxDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((m) T2()).v2(bp9.a.f17562a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ep9.a aVarH3 = h3();
        Continuation continuation = null;
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarH3.f128120c.f59410q), null, new rp9.h(this, continuation, i), 3);
        NavBarWithToolbar navBarWithToolbar = aVarH3.f128120c;
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new rlh.c(aVarH3, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new g(aVarH3, this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57337m), null, new i(this, continuation, i), 3);
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarH3.f128119b.o), null, new rp9.h(this, continuation, i2), 3);
        r rVarMergeArray = r.mergeArray(this.c0.r().map(new rof.e(25, new n0(11))), this.f79235b0.f53218h.map(new rof.e(26, new n0(12))), this.f79236d0.q().map(new rof.e(27, new n0(13))));
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new i(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.f79237e0.f53218h, new n0(14))), null, new i(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f79234a0.f52371h.f121375b), null, new j(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ep9.a aVarH3 = h3();
        NavBarWithToolbar navBarWithToolbar = aVarH3.f128120c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_groups_split_bill_select_bill_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_groups_split_bill_select_bill_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        aVarH3.f128119b.o(LargeActionButton.ButtonStyle.f58725a);
        h().addOnScrollListener(new rp9.g(m2()));
        ((j60.a) ((e) this.X.getValue()).e.get()).d(u.c(this.f79237e0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getG0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF94773e0() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f256292a);
        ep9.a aVarH3 = h3();
        aVarH3.f128120c.setMenuItems(uiState.f256293b);
        LargeActionButton billsSelectionContinueButton = aVarH3.f128119b;
        Clause clause = uiState.f256294c;
        billsSelectionContinueButton.setText(clause);
        Intrinsics.checkNotNullExpressionValue(billsSelectionContinueButton, "billsSelectionContinueButton");
        knm.b.z(billsSelectionContinueButton, clause != null, null, 14);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final ep9.a h3() {
        ViewBinding value = this.W.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final rp9.b T2() {
        return (rp9.b) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
