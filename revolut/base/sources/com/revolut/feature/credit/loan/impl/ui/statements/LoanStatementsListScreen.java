package com.revolut.feature.credit.loan.impl.ui.statements;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import u45.n0;
import vc.s;
import vkm.d;
import w5b.b6;
import w65.c;
import w85.a;
import w85.e;
import w85.f;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/statements/LoanStatementsListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lw85/f;", "Lcom/revolut/feature/credit/loan/impl/ui/statements/LoanStatementsListScreenContract$InputData;", "Laii/q;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanStatementsListScreen extends BaseRecyclerViewScreen<f, LoanStatementsListScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f70611d0 = {o0.f186429a.j(new h0(LoanStatementsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final int Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70612a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f70613b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanStatementsListScreen(LoanStatementsListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        Lazy lazyY0 = w.y0(new b6(21));
        this.V = lazyY0;
        Lazy lazyY02 = w.y0(new b6(22));
        this.W = lazyY02;
        Lazy lazyY03 = w.y0(new b6(23));
        this.X = lazyY03;
        this.Y = R$layout.screen_recycler_navbar;
        this.Z = true;
        this.f70612a0 = w.y0(new w83.a(this, inputData, 1));
        this.f70613b0 = w.y0(new vt3.a(this, 13));
        this.c0 = v.k((RowDelegate) lazyY0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue(), (LargeActionButtonDelegate) lazyY03.getValue(), new CellDetailsLoadingDelegate(), new PlaceholderRowDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (n0) this.f70612a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f70613b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, f70611d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, null, 7), 3);
        d dVarB = rd0.e.b(((RowDelegate) this.V.getValue()).f53218h);
        ?? r110 = this.f70613b0;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new w85.b(2, 4, e.class, (e) r110.getValue(), "onItemClicked", "onItemClicked(Lcom/revolut/recyclerkit/delegates/ListItem;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.W.getValue()).f52371h.f121375b)), null, new w85.c(2, 4, e.class, (e) r110.getValue(), "onItemClicked", "onItemClicked(Lcom/revolut/recyclerkit/delegates/ListItem;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, f70611d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_loan_management_statement_list_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
