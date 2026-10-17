package com.revolut.feature.business.referrals.ui.screens.referral_campaign_state;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dt2.c;
import dt2.d;
import dt2.f;
import dt2.g;
import grl.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldt2/f;", "Ldli/a;", "Ldt2/h;", "Lno/m;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralCampaignStateScreen extends ViewController<f> implements dli.a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ReferralCampaignStateScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenReferralCampaignStateBinding;", 0))};
    public final AnalyticsProduct.Business K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public ReferralCampaignStateScreen(ReferralCampaignStateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.K = new AnalyticsProduct.Business(value);
        this.L = R$layout.screen_referral_campaign_state;
        final int i = 1;
        this.M = true;
        this.N = s.t(this, dt2.b.f);
        this.O = w.y0(new dgg.b(this, inputData, 16));
        final int i2 = 0;
        this.P = w.y0(new Function0(this) { // from class: dt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCampaignStateScreen f117346b;

            {
                this.f117346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralCampaignStateScreen.T;
                        return (g) ((us2.f) this.f117346b.O.getValue()).f282398c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReferralCampaignStateScreen.T;
                        ReferralCampaignStateScreen referralCampaignStateScreen = this.f117346b;
                        return dli.f.a(referralCampaignStateScreen, (g) referralCampaignStateScreen.P.getValue(), v.k(referralCampaignStateScreen.Q, new RowLoadingDelegate(), new CounterTextDelegate(), referralCampaignStateScreen.R), R$id.referralCampaignState_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new FullScreenStateDelegate();
        this.S = w.y0(new Function0(this) { // from class: dt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralCampaignStateScreen f117346b;

            {
                this.f117346b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralCampaignStateScreen.T;
                        return (g) ((us2.f) this.f117346b.O.getValue()).f282398c.get();
                    default:
                        KProperty[] kPropertyArr2 = ReferralCampaignStateScreen.T;
                        ReferralCampaignStateScreen referralCampaignStateScreen = this.f117346b;
                        return dli.f.a(referralCampaignStateScreen, (g) referralCampaignStateScreen.P.getValue(), v.k(referralCampaignStateScreen.Q, new RowLoadingDelegate(), new CounterTextDelegate(), referralCampaignStateScreen.R), R$id.referralCampaignState_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        dt2.h uiState = (dt2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f273951b;
        TextLocalisedClause textLocalisedClause = uiState.f117350b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us2.f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f273951b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f273951b.f59410q), null, new v0(this, null, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final ts2.c d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ts2.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
