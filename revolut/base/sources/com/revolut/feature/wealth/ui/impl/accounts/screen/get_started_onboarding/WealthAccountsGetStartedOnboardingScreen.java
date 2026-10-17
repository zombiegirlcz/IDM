package com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding;

import aii.q;
import ajh.b;
import ajh.c;
import ajh.d;
import ajh.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding.WealthAccountsGetStartedOnboardingScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/accounts/screen/get_started_onboarding/WealthAccountsGetStartedOnboardingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lajh/h;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAccountsGetStartedOnboardingScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WealthAccountsGetStartedOnboardingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, b.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final int N = R$layout.screen_recycler_navbar;
    public final Object O;
    public final Object P;
    public final Object Q;

    public WealthAccountsGetStartedOnboardingScreen(List list) {
        this.O = w.y0(new agh.b(this, list, 10));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ajh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAccountsGetStartedOnboardingScreen f5571b;

            {
                this.f5571b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = WealthAccountsGetStartedOnboardingScreen.R;
                        WealthAccountsGetStartedOnboardingScreen wealthAccountsGetStartedOnboardingScreen = this.f5571b;
                        return dli.f.a(wealthAccountsGetStartedOnboardingScreen, (g) wealthAccountsGetStartedOnboardingScreen.Q.getValue(), v.k(new RowLoadingDelegate(), wealthAccountsGetStartedOnboardingScreen.L, wealthAccountsGetStartedOnboardingScreen.M), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = WealthAccountsGetStartedOnboardingScreen.R;
                        return (g) ((mkh.q) this.f5571b.O.getValue()).f206396c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ajh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthAccountsGetStartedOnboardingScreen f5571b;

            {
                this.f5571b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthAccountsGetStartedOnboardingScreen.R;
                        WealthAccountsGetStartedOnboardingScreen wealthAccountsGetStartedOnboardingScreen = this.f5571b;
                        return dli.f.a(wealthAccountsGetStartedOnboardingScreen, (g) wealthAccountsGetStartedOnboardingScreen.Q.getValue(), v.k(new RowLoadingDelegate(), wealthAccountsGetStartedOnboardingScreen.L, wealthAccountsGetStartedOnboardingScreen.M), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr2 = WealthAccountsGetStartedOnboardingScreen.R;
                        return (g) ((mkh.q) this.f5571b.O.getValue()).f206396c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((ajh.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mkh.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_invest_get_started_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_invest_get_started_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new a01.e(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
