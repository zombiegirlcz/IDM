package com.revolut.feature.pay_later.impl.ui.plandetails;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import cyc.c;
import d8e.a;
import dcf.v0;
import dk9.e;
import dk9.i;
import dk9.j;
import dk9.l;
import dk9.n;
import dk9.r;
import dk9.s;
import ij9.b;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oi9.k;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/plandetails/PayLaterPlanDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ldk9/s;", "Lcom/revolut/feature/pay_later/impl/ui/plandetails/PayLaterPlanDetailsScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterPlanDetailsScreen extends BaseRecyclerViewScreen<s, PayLaterPlanDetailsScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(PayLaterPlanDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78893a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78894b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f78895d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f78896e0;
    public final boolean f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f78897h0;
    public final List i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayLaterPlanDetailsScreen(PayLaterPlanDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = b.f161739a;
        this.V = vc.s.t(this, e.f);
        Lazy lazyY0 = w.y0(new dce.b(21));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new dce.b(22));
        this.X = lazyY02;
        Lazy lazyY03 = w.y0(new dce.b(23));
        this.Y = lazyY03;
        Lazy lazyY04 = w.y0(new dce.b(24));
        this.Z = lazyY04;
        Lazy lazyY05 = w.y0(new dce.b(25));
        this.f78893a0 = lazyY05;
        Lazy lazyY06 = w.y0(new dce.b(26));
        this.f78894b0 = lazyY06;
        Lazy lazyY07 = w.y0(new dce.b(27));
        this.c0 = lazyY07;
        Lazy lazyY08 = w.y0(new dce.b(28));
        this.f78895d0 = lazyY08;
        this.f78896e0 = R$layout.screen_recycler_navbar;
        this.f0 = true;
        this.g0 = w.y0(new dgg.b(this, inputData, 3));
        this.f78897h0 = w.y0(new a(this, 6));
        this.i0 = v.k((RowDelegate) lazyY0.getValue(), (ListSubheaderDelegate) lazyY08.getValue(), (CellDetailsActionDelegate) lazyY04.getValue(), (CellDetailsChevronDelegate) lazyY03.getValue(), (PlainTextWarningDelegate) lazyY05.getValue(), (ProgressStepVerticalDelegate) lazyY06.getValue(), (CellDetailsDelegate) lazyY02.getValue(), new FullScreenStateDelegate(), new RowLoadingDelegate(), (LargeActionButtonDelegate) lazyY07.getValue());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        this.U.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.s0()), null, new i(2, 4, dk9.q.class, T2(), "onActionClicked", "onActionClicked(Lcom/revolut/core/ui_kit/views/ActionsView$Item;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b), null, new j(2, 4, dk9.q.class, T2(), "onLargeActionButtonDialogClicked", "onLargeActionButtonDialogClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new v0(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.Y.getValue()).f51821c), null, new dk9.k(2, 4, dk9.q.class, T2(), "onCellDetailsChevronClicked", "onCellDetailsChevronClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.Z.getValue()).d), null, new l(2, 4, dk9.q.class, T2(), "onCellDetailsActionClicked", "onCellDetailsActionClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, new d83.i(rd0.e.b(((PlainTextWarningDelegate) this.f78893a0.getValue()).d.f121375b), 24), null, new dk9.m(2, 4, dk9.q.class, T2(), "onActionClicked", "onActionClicked(Lcom/revolut/core/ui_kit/views/ActionsView$Item;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ProgressStepVerticalDelegate) this.f78894b0.getValue()).d), null, new c(2, T2(), dk9.q.class, "onProgressStepClicked", "onProgressStepClicked(Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalDelegate$Model;)V", 4, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.W.getValue()).f53218h), null, new n(2, 4, dk9.q.class, T2(), "onRowDelegateClicked", "onRowDelegateClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.f78895d0.getValue()).f52707c), null, new dk9.h(2, 4, dk9.q.class, T2(), "onListSubheaderClicked", "onListSubheaderClicked(Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((k) this.g0.getValue()).e.get()).d(v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.c0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getI0() {
        return this.i0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(s uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        r rVar = uiState.f115479a;
        if (rVar == null) {
            NavBarWithToolbar navBarWithToolbar = h3().f174539b;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.j0(false);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            return;
        }
        MoneyClause moneyClause = rVar.f115476a;
        NavBarWithToolbar navBarWithToolbar2 = h3().f174539b;
        NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar2.H0(false);
        navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar2.setTitle(moneyClause, null);
        navBarWithToolbar2.setToolbarTitle(moneyClause);
        navBarWithToolbar2.setEndIconImage(rVar.e);
        navBarWithToolbar2.setDescriptionVisible(true);
        navBarWithToolbar2.setDescriptionText(rVar.f115478c);
        navBarWithToolbar2.setSecondDescriptionVisible(true);
        navBarWithToolbar2.setSecondDescriptionText(rVar.d);
        navBarWithToolbar2.setActions(rVar.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.f78896e0;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final dk9.q T2() {
        return (dk9.q) this.f78897h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f0);
    }
}
