package com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.impl.budgeting.R$id;
import com.revolut.retail.feature.impl.budgeting.R$layout;
import com.revolut.retail.feature.impl.budgeting.R$string;
import efm.r;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tnb.g0;
import twl.o;
import tx0.t3;
import vc.s;
import wa3.d;
import wp0.b;
import wrj.c;
import wrj.g;
import wrj.m;
import wrj.n;
import wrj.p;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/goals/upcoming_payments/UpcomingPaymentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwrj/g;", "Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/goals/upcoming_payments/UpcomingPaymentsContract$InputData;", "Laii/q;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpcomingPaymentsScreen extends BaseRecyclerViewScreen<g, UpcomingPaymentsContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101528d0 = {o0.f186429a.j(new h0(UpcomingPaymentsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/impl/budgeting/databinding/ScreenUpcomingPaymentsBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public final FullScreenStateDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101529a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f101530b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingPaymentsScreen(UpcomingPaymentsContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_upcoming_payments;
        this.V = R$id.screenUpcomingPayments_recyclerView;
        this.W = true;
        this.X = s.t(this, n.f);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Y = fullScreenStateDelegate;
        this.Z = w.y0(new m(this, inputData, 0));
        this.f101529a0 = w.y0(new b(this, 6));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f101530b0 = rowDelegate;
        this.c0 = v.k(fullScreenStateDelegate, new RowLoadingDelegate(), rowDelegate, new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (erj.n) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (wrj.b) this.f101529a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        f fVar = h3().f108399b.f59410q;
        wpj.b bVar = new wpj.b(this, 5);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new g0(new p(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new o(5, bVar), new o(5, wrj.q.f299620a)), "subscribe(...)");
        a.g2(this, new d(e.b(this.Y.f52371h.f121375b), 22), null, new wrj.r(this, null), 3);
        a.g2(this, e.b(this.f101530b0.f53218h), null, new wrj.s(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        wrj.f fVar = uiState.f299598b;
        if (fVar instanceof wrj.d) {
            NavBarWithToolbar navBarWithToolbar = h3().f108399b;
            navBarWithToolbar.l0();
            MoneyClause moneyClause = ((wrj.d) fVar).f299595a;
            navBarWithToolbar.setTitle(moneyClause, null);
            navBarWithToolbar.setToolbarTitle(moneyClause);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            navBarWithToolbar.setEndIconImage(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_20_scheduled, R$attr.uikit_colorWhite, R$attr.uikit_colorGrey50));
            navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_budgeting_upcoming_title, null, null, 14));
            navBarWithToolbar.setSecondDescriptionVisible(true);
            return;
        }
        if (!(fVar instanceof wrj.e)) {
            if (!(fVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            h3().f108399b.setVisible(false);
        } else {
            NavBarWithToolbar screenUpcomingPaymentsNavBarWithToolbar = h3().f108399b;
            Intrinsics.checkNotNullExpressionValue(screenUpcomingPaymentsNavBarWithToolbar, "screenUpcomingPaymentsNavBarWithToolbar");
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            screenUpcomingPaymentsNavBarWithToolbar.I0(t3Var, false);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final crj.d h3() {
        ViewBinding value = this.X.getValue(this, f101528d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (crj.d) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
