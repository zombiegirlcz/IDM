package com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e0b.c;
import e58.d;
import e58.e;
import e8e.a;
import e8e.f;
import e8e.g;
import e8e.i;
import e8e.n;
import e8e.p;
import e8e.q;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6e.y;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/edit/billl/screen/edit/BillSelectorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Le8e/q;", "Lcom/revolut/feature/subaccount/impl/ui/edit/billl/screen/edit/BillSelectorScreenContract$InputData;", "Le8e/n;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillSelectorScreen extends BaseRecyclerViewScreen<q, BillSelectorScreenContract$InputData, n> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(BillSelectorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f89066a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f89067b0;
    public final SelectableDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ReferralContactDelegate f89068d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LargeActionButtonDelegate f89069e0;
    public final LargeActionButtonDelegate f0;
    public final ListSubheaderDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final List f89070h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillSelectorScreen(BillSelectorScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        int i = 5;
        this.Y = w.y0(new d(this, inputData, i));
        this.Z = w.y0(new e(this, i));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f89066a0 = rowDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f89067b0 = cellDetailsChevronDelegate;
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.c0 = selectableDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.f89068d0 = referralContactDelegate;
        this.f89069e0 = new LargeActionButtonDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f0 = largeActionButtonDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.g0 = listSubheaderDelegate;
        this.f89070h0 = v.k(new RowLoadingDelegate(), rowDelegate, cellDetailsChevronDelegate, listSubheaderDelegate, selectableDelegate, largeActionButtonDelegate, new FullScreenStateDelegate(), new ScrollerBoxDelegate(u.c(referralContactDelegate)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (y) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new e8e.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.r()), null, new e8e.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f89068d0.q()), null, new e8e.e(this, null), 3);
        RowDelegate rowDelegate = this.f89066a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f89067b0.f51821c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new c(this, continuation, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f0.d.f121375b), null, new e8e.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.g0.f52707c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new e8e.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f89069e0.d.f121375b), null, new e8e.c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bill_accounts_payments_picker_rev10_header_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.bill_accounts_payments_picker_rev10_header_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        y yVar = (y) this.Y.getValue();
        switch (yVar.f251819a) {
            case 0:
                aVar = (j60.a) yVar.f.get();
                break;
            default:
                aVar = (j60.a) yVar.f.get();
                break;
        }
        aVar.d(v.k(this.f89069e0, this.f89066a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f89070h0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f174564b;
        Intrinsics.h(largeActionButton);
        largeActionButton.setVisibility(uiState.f123647b != null ? 0 : 8);
        largeActionButton.setText(uiState.f123647b);
        largeActionButton.setLoadingButtonTag("SAVE_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final jii.u h3() {
        ViewBinding value = this.W.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final p T2() {
        return (p) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
