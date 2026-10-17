package com.revolut.feature.pay_later.impl.ui.repaymentdetails;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ij9.b;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljd.e;
import ljl.n1;
import lk9.f;
import lk9.g;
import lk9.i;
import lk9.j;
import lk9.l;
import lk9.o;
import lk9.p;
import lk9.q;
import no.k;
import no.m;
import oi9.n;
import oj9.c;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/repaymentdetails/PayLaterRepaymentDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llk9/q;", "Lcom/revolut/feature/pay_later/impl/ui/repaymentdetails/PayLaterRepaymentDetailsScreenContract$InputData;", "Laii/q;", "Lno/m;", "Lno/k;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterRepaymentDetailsScreen extends BaseRecyclerViewScreen<q, PayLaterRepaymentDetailsScreenContract$InputData, aii.q> implements m, k {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f78910k0 = {o0.f186429a.j(new h0(PayLaterRepaymentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78911a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f78912b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f78913d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public AnalyticsContext f78914e0;
    public final int f0;
    public final boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f78915h0;
    public final Object i0;
    public final List j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayLaterRepaymentDetailsScreen(PayLaterRepaymentDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = b.f161739a;
        this.V = s.t(this, f.f);
        Lazy lazyY0 = w.y0(new lh9.b(11));
        this.W = lazyY0;
        Lazy lazyY02 = w.y0(new lh9.b(12));
        this.X = lazyY02;
        Lazy lazyY03 = w.y0(new lh9.b(13));
        this.Y = lazyY03;
        Lazy lazyY04 = w.y0(new lh9.b(14));
        this.Z = lazyY04;
        Lazy lazyY05 = w.y0(new lh9.b(15));
        this.f78911a0 = lazyY05;
        this.f78912b0 = w.y0(new lh9.b(16));
        Lazy lazyY06 = w.y0(new lh9.b(17));
        this.c0 = lazyY06;
        Lazy lazyY07 = w.y0(new lh9.b(18));
        this.f78913d0 = lazyY07;
        this.f0 = R$layout.screen_recycler_navbar;
        this.g0 = true;
        this.f78915h0 = w.y0(new lea.b(this, inputData, 9));
        this.i0 = w.y0(new e(this, 3));
        this.j0 = v.k((RowDelegate) lazyY0.getValue(), (CellDetailsActionDelegate) lazyY04.getValue(), (CellDetailsChevronDelegate) lazyY03.getValue(), (CellDetailsDelegate) lazyY02.getValue(), (PlainTextWarningDelegate) lazyY05.getValue(), (FullScreenStateDelegate) lazyY06.getValue(), new RowLoadingDelegate(), new PlaceholderRowDelegate(), (BannerDelegate) lazyY07.getValue());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f78914e0 = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        this.U.getClass();
        return b.f161740b;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF78914e0() {
        return this.f78914e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (n) this.f78915h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r map = ((PlainTextWarningDelegate) this.f78911a0.getValue()).d.f121375b.map(new lhi.v(20, new n1(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        a.g2(this, rd0.e.b(map), null, new g(2, 4, o.class, T2(), "onActionClicked", "onActionClicked(Lcom/revolut/core/ui_kit/views/ActionsView$Item;)V"), 3);
        a.g2(this, rd0.e.b(h3().f174539b.s0()), null, new lk9.h(2, 4, o.class, T2(), "onActionClicked", "onActionClicked(Lcom/revolut/core/ui_kit/views/ActionsView$Item;)V"), 3);
        a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f78912b0.getValue()).d.f121375b), null, new i(2, 4, o.class, T2(), "onLargeActionButtonDialogClicked", "onLargeActionButtonDialogClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new la8.h(this, null, 16), 3);
        a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.Y.getValue()).f51821c), null, new j(2, 4, o.class, T2(), "onCellDetailsChevronClicked", "onCellDetailsChevronClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsChevronDelegate$Model;)V"), 3);
        a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.Z.getValue()).d), null, new lk9.k(2, 4, o.class, T2(), "onCellDetailsActionClicked", "onCellDetailsActionClicked(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
        a.g2(this, rd0.e.b(((RowDelegate) this.W.getValue()).f53218h), null, new l(2, 4, o.class, T2(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        a.g2(this, c.a(T2(), (BannerDelegate) this.f78913d0.getValue()), null, null, 7);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((n) this.f78915h0.getValue()).e.get()).d(v.k((RowDelegate) this.W.getValue(), (LargeActionButtonDelegate) this.f78912b0.getValue()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getJ0() {
        return this.j0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(q uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        p pVar = uiState.f196321a;
        if (pVar != null) {
            MoneyClause moneyClause = pVar.f196318a;
            NavBarWithToolbar navBarWithToolbar = h3().f174539b;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.H0(false);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            navBarWithToolbar.setTitle(moneyClause, null);
            navBarWithToolbar.setToolbarTitle(moneyClause);
            navBarWithToolbar.setEndIconImage(pVar.e);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setDescriptionText(pVar.f196320c);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(pVar.d);
            navBarWithToolbar.setActions(pVar.f);
        } else {
            NavBarWithToolbar navBarWithToolbar2 = h3().f174539b;
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar2.j0(false);
            navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        }
        this.f78914e0 = uiState.f196323c;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.f0;
    }

    public final jii.m h3() {
        ViewBinding value = this.V.getValue(this, f78910k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final o T2() {
        return (o) this.i0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.g0);
    }
}
