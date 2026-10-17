package com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreen;
import dli.a;
import enb.f;
import euj.b;
import euj.c;
import euj.d;
import euj.j;
import euj.k;
import euj.l;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/direct_reward/RewardsHubDirectRewardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leuj/j;", "Ldli/a;", "Leuj/l;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHubDirectRewardScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RewardsHubDirectRewardScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final PromptMarketingContentLoadingDelegate N;
    public final PromptMarketingContentDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public RewardsHubDirectRewardScreen(RewardsHubDirectRewardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_basic_navbar;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new PromptMarketingContentLoadingDelegate();
        this.O = new PromptMarketingContentDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: euj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubDirectRewardScreen f129619b;

            {
                this.f129619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHubDirectRewardScreen.S;
                        RewardsHubDirectRewardScreen rewardsHubDirectRewardScreen = this.f129619b;
                        return dli.f.a(rewardsHubDirectRewardScreen, rewardsHubDirectRewardScreen.R2(), v.k(rewardsHubDirectRewardScreen.M, rewardsHubDirectRewardScreen.N, rewardsHubDirectRewardScreen.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RewardsHubDirectRewardScreen.S;
                        return (k) ((rtj.e) this.f129619b.Q.getValue()).d.get();
                }
            }
        });
        this.Q = w.y0(new eq8.b(this, inputData, 10));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: euj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubDirectRewardScreen f129619b;

            {
                this.f129619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHubDirectRewardScreen.S;
                        RewardsHubDirectRewardScreen rewardsHubDirectRewardScreen = this.f129619b;
                        return dli.f.a(rewardsHubDirectRewardScreen, rewardsHubDirectRewardScreen.R2(), v.k(rewardsHubDirectRewardScreen.M, rewardsHubDirectRewardScreen.N, rewardsHubDirectRewardScreen.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RewardsHubDirectRewardScreen.S;
                        return (k) ((rtj.e) this.f129619b.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        BasicNavBar basicNavbar = d3().f174530b;
        Intrinsics.checkNotNullExpressionValue(basicNavbar, "basicNavbar");
        basicNavbar.setVisibility(uiState.f129625b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rtj.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174530b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174530b.f59211b), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.p()), new d(this, null, 1), 3);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.O;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new euj.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new f(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new euj.f(this, null), 3);
    }

    public final jii.j d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
