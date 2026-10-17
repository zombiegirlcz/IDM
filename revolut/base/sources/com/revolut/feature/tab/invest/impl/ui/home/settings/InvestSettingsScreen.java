package com.revolut.feature.tab.invest.impl.ui.home.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.wealth.resources.R$string;
import dlc.d;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m9d.y0;
import maa.r;
import mc9.n;
import mhd.b;
import mle.a;
import mle.c;
import mle.f;
import mle.g;
import mle.i;
import mle.o;
import rd0.e;
import te0.w;
import vc.s;
import vkm.q0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/ui/home/settings/InvestSettingsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lmle/o;", "Lcom/revolut/feature/tab/invest/impl/ui/home/settings/InvestSettingsScreenContract$InputData;", "Laii/q;", "Ldlc/d;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestSettingsScreen extends BaseRecyclerViewScreen<o, InvestSettingsScreenContract$InputData, q> implements d {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(InvestSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f89892a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsDelegate f89893b0;
    public final AccountCellItemDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LargeActionButtonDelegate f89894d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f89895e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestSettingsScreen(InvestSettingsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_recycler_navbar;
        this.W = s.t(this, a.f);
        this.X = w.y0(new b(this, inputData, 3));
        this.Y = w.y0(new r(this, 9));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f89892a0 = cellDetailsChevronDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.f89893b0 = cellDetailsDelegate;
        this.c0 = new AccountCellItemDelegate();
        this.f89894d0 = new LargeActionButtonDelegate();
        this.f89895e0 = v.k(rowDelegate, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), cellDetailsChevronDelegate, cellDetailsDelegate, new PlainTextWarningDelegate(), new CellDetailsLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ske.b) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new y0(this, null, 19), 3);
        ?? r122 = this.X;
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(((r60.d) ((r60.b) ((ske.b) r122.getValue()).f263851n.get())).d.d()), new mle.b(2, 4, i.class, T2(), "onDialogPrimaryActionClick", "onDialogPrimaryActionClick(Lcom/revolut/core/ui_kit/dialogs/PromptDialogDisplayer$ClickData;)V"), 1), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(((r60.d) ((r60.b) ((ske.b) r122.getValue()).f263851n.get())).d.f()), new c(2, 4, i.class, T2(), "onDialogSecondaryActionClick", "onDialogSecondaryActionClick(Lcom/revolut/core/ui_kit/dialogs/PromptDialogDisplayer$ClickData;)V"), 1), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(this.f89894d0.d.f121375b), new mle.d(this, null), 1), null, null, 7);
        RowDelegate rowDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(rowDelegate.f53218h), new mle.e(2, 4, i.class, T2(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 1), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(rowDelegate.f53226s), new n(2, T2(), i.class, "onRowDelegateClauseClick", "onRowDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 11), 1), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(rowDelegate.f53225r), new f(2, 4, i.class, T2(), "onRowDelegateValueActionClick", "onRowDelegateValueActionClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 1), null, null, 7);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(this.f89892a0.f51821c), new g(2, 4, i.class, T2(), "onCellDetailsChevronDelegateClick", "onCellDetailsChevronDelegateClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 1), null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_trading_settings_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((ske.b) this.X.getValue()).f263846g.get()).d(v.k(this.c0, this.f89894d0));
    }

    @Override // dlc.d
    public final dlc.c Y1() {
        return new dlc.c(this.Z, this.f89892a0, this.f89894d0);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF89895e0() {
        return this.f89895e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
