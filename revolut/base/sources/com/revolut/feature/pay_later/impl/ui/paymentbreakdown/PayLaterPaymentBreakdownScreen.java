package com.revolut.feature.pay_later.impl.ui.paymentbreakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ij9.b;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.t3;
import vc.s;
import wj9.a;
import wj9.c;
import wj9.e;
import wj9.f;
import wj9.g;
import wj9.h;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/paymentbreakdown/PayLaterPaymentBreakdownScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwj9/h;", "Lcom/revolut/feature/pay_later/api/navigation/PayLaterKompotFeatureConfig$PaymentBreakdownNavigationDestination$InputData;", "Laii/q;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterPaymentBreakdownScreen extends BaseRecyclerViewScreen<h, PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData, q> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PayLaterPaymentBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b U;
    public final ao.h V;
    public final RowDelegate W;
    public final int X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78882a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f78883b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayLaterPaymentBreakdownScreen(PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = b.f161739a;
        this.V = s.t(this, a.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.W = rowDelegate;
        this.X = R$layout.screen_recycler_navbar_nextbutton;
        this.Y = true;
        this.Z = w.y0(new w83.a(this, inputData, 17));
        this.f78882a0 = w.y0(new vt3.a(this, 22));
        this.f78883b0 = v.k(rowDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        this.U.getClass();
        return b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (xj9.a) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f78882a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new wj9.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f53218h), null, new c(2, 4, e.class, (e) this.f78882a0.getValue(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new wj9.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f174564b.setText(new TextLocalisedClause(R$string.credit_common_go_to_payment, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78883b0() {
        return this.f78883b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g gVar = uiState.f298027a;
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        if (gVar instanceof f) {
            f fVar = (f) gVar;
            TextLocalisedClause textLocalisedClause = fVar.f298023a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setSecondDescriptionText(fVar.f298024b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.H0(false);
            navBarWithToolbar.l0();
        } else if (gVar instanceof g.a) {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            if (!(gVar instanceof g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            navBarWithToolbar.j0(false);
        }
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f298029c ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.X;
    }

    public final u h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
