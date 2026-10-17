package com.revolut.feature.onboarding.countries.restriction.impl.disclaimer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.k;
import k16.d;
import k99.a;
import k99.f;
import k99.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ofm.q;
import pki.b;
import tx0.j0;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/countries/restriction/impl/disclaimer/CountryOfResidenceRevolutXDisclaimerScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lk99/f;", "Lno/m;", "Lkji/f;", "feature_onboarding_countries_restriction_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountryOfResidenceRevolutXDisclaimerScreen extends SimpleViewController<f> implements m, kji.f {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CountryOfResidenceRevolutXDisclaimerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CountryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput N;
    public final h O;
    public final Lazy P;
    public final Lazy Q;
    public final int R;

    public CountryOfResidenceRevolutXDisclaimerScreen(CountryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = s.t(this, a.f);
        this.P = j.b(new d(28));
        this.Q = j.b(new k98.a(this, 1));
        this.R = R$layout.screen_recycler_navbar_action_footer;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return (AnalyticsProduct) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setDescriptionVisible(true);
        CountryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput = this.N;
        navBarWithToolbar.setTitle(countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput.f78252a, null);
        navBarWithToolbar.setToolbarTitle(countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput.f78252a);
        navBarWithToolbar.setDescriptionText(countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput.f78253b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        d3().f174533b.setModel(new e(false, countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput.d, null, m6.c(n6.Companion, countryOfResidenceRevolutXDisclaimerScreenContract$CountryResidenceDisclaimerInput.f78254c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new k99.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new k99.b(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }
}
