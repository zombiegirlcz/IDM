package com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.f0;
import cli.o;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ht2.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kt2.b;
import rd0.e;
import ts2.f;
import tx0.j0;
import vc.s;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_with_incentive_overview/type/HeaderTitleReferralWithIncentiveOverviewScreen;", "Lcom/revolut/feature/business/referrals/ui/screens/referral_with_incentive_overview/BaseReferralWithIncentiveOverviewScreen;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeaderTitleReferralWithIncentiveOverviewScreen extends BaseReferralWithIncentiveOverviewScreen {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(HeaderTitleReferralWithIncentiveOverviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenReferralWithIncentiveOverviewHeaderTitleBinding;", 0))};
    public final boolean X;
    public final h Y;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/business/referrals/databinding/ScreenReferralWithIncentiveOverviewHeaderTitleBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.referralWithIncentiveOverview_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.referralWithIncentiveOverview_navBarHeader;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.referralWithIncentiveOverview_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new f(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public HeaderTitleReferralWithIncentiveOverviewScreen() {
        super(R$layout.screen_referral_with_incentive_overview_header_title);
        this.X = true;
        this.Y = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ht2.s uiState = (ht2.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = f3().f273958b;
        ht2.o oVar2 = uiState.f155242c;
        largeActionButton.setText(oVar2.f155234a);
        largeActionButton.setVisibility(oVar2.f155235b ? 0 : 8);
        r rVar = uiState.f155241b;
        ht2.q qVar2 = rVar instanceof ht2.q ? (ht2.q) rVar : null;
        if (qVar2 != null) {
            Clause clause = qVar2.f155238b;
            TextLocalisedClause textLocalisedClause = qVar2.f155237a;
            NavBarWithToolbar navBarWithToolbar = f3().f273959c;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(clause != null);
            f0.t(navBarWithToolbar, qVar2.f155239c, false, 6);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(f3().f273959c.f59410q), null, new b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(f3().f273958b.o), null, new b(this, null, 1), 3);
    }

    @Override // com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen
    /* JADX INFO: renamed from: e3 */
    public final List getV() {
        return d0.F0(new SimpleMediaDelegate(), this.V);
    }

    public final f f3() {
        ViewBinding value = this.Y.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
