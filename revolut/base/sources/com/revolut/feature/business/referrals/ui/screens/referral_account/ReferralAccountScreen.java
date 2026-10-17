package com.revolut.feature.business.referrals.ui.screens.referral_account;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bi2.n;
import bt2.b;
import bt2.c;
import bt2.d;
import bt2.g;
import bt2.i;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.R$layout;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.x0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import vu.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_account/ReferralAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbt2/g;", "Ldli/a;", "Lbt2/i;", "Lno/m;", "Companion", "a", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralAccountScreen extends ViewController<g> implements a, m {
    public final int K;
    public final AnalyticsProduct.Business L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ReferralAccountScreen.class, "binding", "getBinding()Lcom/revolut/feature/business/referrals/databinding/ScreenReferralAccountBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ReferralAccountScreen(ReferralAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_referral_account;
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.L = new AnalyticsProduct.Business(value);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralAccountScreen f18258b;

            {
                this.f18258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReferralAccountScreen.Companion companion = ReferralAccountScreen.INSTANCE;
                        ReferralAccountScreen referralAccountScreen = this.f18258b;
                        return dli.f.a(referralAccountScreen, referralAccountScreen.R2(), v.k(new RowLoadingDelegate(), referralAccountScreen.M, new ListSubheaderDelegate(), referralAccountScreen.N), R$id.referralAccountScreen_recyclerView, null, null, null, 56);
                    default:
                        ReferralAccountScreen.Companion companion2 = ReferralAccountScreen.INSTANCE;
                        return (h) ((us2.e) this.f18258b.Q.getValue()).d.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        this.Q = w.y0(new bc1.a(this, inputData, 27));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralAccountScreen f18258b;

            {
                this.f18258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReferralAccountScreen.Companion companion = ReferralAccountScreen.INSTANCE;
                        ReferralAccountScreen referralAccountScreen = this.f18258b;
                        return dli.f.a(referralAccountScreen, referralAccountScreen.R2(), v.k(new RowLoadingDelegate(), referralAccountScreen.M, new ListSubheaderDelegate(), referralAccountScreen.N), R$id.referralAccountScreen_recyclerView, null, null, null, 56);
                    default:
                        ReferralAccountScreen.Companion companion2 = ReferralAccountScreen.INSTANCE;
                        return (h) ((us2.e) this.f18258b.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us2.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.Q;
        vu.g gVarA = ((us2.e) r06.getValue()).f282394b.f282408a.a();
        s.j(gVarA);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(((n5j.b) gVarA).b(f.business_referrals_referral_account_title), null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f273949b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        vu.g gVarA2 = ((us2.e) r06.getValue()).f282394b.f282408a.a();
        s.j(gVarA2);
        navBarWithToolbar.setHint(new TextLocalisedClause(((n5j.b) gVarA2).b(f.business_referrals_referral_account_search_hint), null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f273949b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new brc.h(this, null, 5), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new n(this, navBarWithToolbar, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(searchView.f57337m), 300L), null, new n(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new d(this, null), 3);
    }

    public final ts2.b d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ts2.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bt2.h R2() {
        return (bt2.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
