package com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ht2.p;
import ht2.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ts2.e;
import vc.s;
import z92.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_with_incentive_overview/type/BigTileReferralWithIncentiveOverviewScreen;", "Lcom/revolut/feature/business/referrals/ui/screens/referral_with_incentive_overview/BaseReferralWithIncentiveOverviewScreen;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BigTileReferralWithIncentiveOverviewScreen extends BaseReferralWithIncentiveOverviewScreen {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(BigTileReferralWithIncentiveOverviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenReferralWithIncentiveOverviewBigTileBinding;", 0))};
    public final h X;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/business/referrals/databinding/ScreenReferralWithIncentiveOverviewBigTileBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.referralWithIncentiveOverview_button;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.referralWithIncentiveOverview_navBarBigTile;
                NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                if (navBarWithBigTile != null) {
                    i = R$id.referralWithIncentiveOverview_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new e(largeActionButton, navBarWithBigTile, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public BigTileReferralWithIncentiveOverviewScreen() {
        super(R$layout.screen_referral_with_incentive_overview_big_tile);
        this.X = s.t(this, a.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ht2.s uiState = (ht2.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = f3().f273955b;
        ht2.o oVar2 = uiState.f155242c;
        largeActionButton.setText(oVar2.f155234a);
        largeActionButton.setVisibility(oVar2.f155235b ? 0 : 8);
        r rVar = uiState.f155241b;
        p pVar = rVar instanceof p ? (p) rVar : null;
        if (pVar != null) {
            NavBarWithBigTile referralWithIncentiveOverviewNavBarBigTile = f3().f273956c;
            Intrinsics.checkNotNullExpressionValue(referralWithIncentiveOverviewNavBarBigTile, "referralWithIncentiveOverviewNavBarBigTile");
            f.u(referralWithIncentiveOverviewNavBarBigTile, pVar.f155236a);
            Unit unit = Unit.f186387a;
        }
    }

    @Override // com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f273956c.f59357t), null, new kt2.a(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f273955b.o), null, new kt2.a(this, null, 1), 3);
    }

    public final e f3() {
        ViewBinding value = this.X.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e) value;
    }
}
