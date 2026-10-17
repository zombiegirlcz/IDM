package com.revolut.feature.business.referrals.ui.screens.referral_invitee_details;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.a;
import com.revolut.kompot.navigable.vc.ViewController;
import fb6.j;
import ft2.c;
import ft2.f;
import grl.x0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import nz8.d;
import te0.w;
import tx0.t3;
import us2.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_invitee_details/ReferralInviteeDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lft2/h;", "Lno/m;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralInviteeDetailsScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ReferralInviteeDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenReferralInviteeDetailsBinding;", 0))};
    public final AnalyticsProduct.Business K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final FullScreenStateDelegate Q;
    public final RowDelegate R;
    public final NotificationCentreItemDelegate S;
    public final Object T;

    public ReferralInviteeDetailsScreen(ReferralInviteeDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.K = new AnalyticsProduct.Business(value);
        this.L = R$layout.screen_referral_invitee_details;
        final int i = 1;
        this.M = true;
        this.N = s.t(this, ft2.b.f);
        this.O = w.y0(new j(this, inputData, 24));
        final int i2 = 0;
        this.P = w.y0(new Function0(this) { // from class: ft2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralInviteeDetailsScreen f137782b;

            {
                this.f137782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralInviteeDetailsScreen.U;
                        return (g) ((us2.g) this.f137782b.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = ReferralInviteeDetailsScreen.U;
                        ReferralInviteeDetailsScreen referralInviteeDetailsScreen = this.f137782b;
                        return dli.f.a(referralInviteeDetailsScreen, (g) referralInviteeDetailsScreen.P.getValue(), v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), referralInviteeDetailsScreen.R, referralInviteeDetailsScreen.Q, new ListSubheaderDelegate(), new CounterTextDelegate(), new SimpleMediaDelegate(), referralInviteeDetailsScreen.S), R$id.referralInviteeDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new FullScreenStateDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new NotificationCentreItemDelegate();
        this.T = w.y0(new Function0(this) { // from class: ft2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralInviteeDetailsScreen f137782b;

            {
                this.f137782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralInviteeDetailsScreen.U;
                        return (g) ((us2.g) this.f137782b.O.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr2 = ReferralInviteeDetailsScreen.U;
                        ReferralInviteeDetailsScreen referralInviteeDetailsScreen = this.f137782b;
                        return dli.f.a(referralInviteeDetailsScreen, (g) referralInviteeDetailsScreen.P.getValue(), v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), referralInviteeDetailsScreen.R, referralInviteeDetailsScreen.Q, new ListSubheaderDelegate(), new CounterTextDelegate(), new SimpleMediaDelegate(), referralInviteeDetailsScreen.S), R$id.referralInviteeDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ft2.h uiState = (ft2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f273953b;
        a aVar = uiState.f137790b;
        if (aVar.equals(a.C0459a.f64364a)) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            if (!(aVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.l0();
            f fVar = (f) aVar;
            TextClause textClause = fVar.f137786a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setDescriptionText(fVar.f137787b);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setEndImage(d.L(fVar.f137788c));
            navBarWithToolbar.setEndIconBadgeImage(fVar.d);
            navBarWithToolbar.setEndProgress(fVar.e);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF94691d0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ft2.g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f273953b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f273953b.f59410q), null, new ft.d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53226s), null, new ft2.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52865c), null, new ft2.d(this, null, 1), 3);
    }

    public final ts2.d d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ts2.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
