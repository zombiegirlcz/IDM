package com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history;

import akl.e0;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au6.e2;
import auj.b;
import auj.c;
import auj.d;
import auj.f;
import auj.i;
import auj.j;
import auj.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreenContract$InputData;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/challenge_history/RewardsHubChallengeHistoryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lauj/i;", "Ldli/a;", "Lauj/k;", "Companion", "a", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHubChallengeHistoryScreen extends ViewController<i> implements a {
    public final RewardsHubChallengeHistoryScreenContract$InputData K;
    public final ChallengeMediumImageCardDelegate L;
    public final FullScreenStateDelegate M;
    public v N;
    public final int O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RewardsHubChallengeHistoryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RewardsHubChallengeHistoryScreen(RewardsHubChallengeHistoryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ChallengeMediumImageCardDelegate();
        this.M = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: auj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubChallengeHistoryScreen f9839b;

            {
                this.f9839b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen = this.f9839b;
                switch (i2) {
                    case 0:
                        RewardsHubChallengeHistoryScreen.Companion companion = RewardsHubChallengeHistoryScreen.INSTANCE;
                        RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen2 = this.f9839b;
                        return dli.f.a(rewardsHubChallengeHistoryScreen2, rewardsHubChallengeHistoryScreen2.R2(), zhm.v.k(new ChallengeMediumImageCardLoadingDelegate(), rewardsHubChallengeHistoryScreen2.L, rewardsHubChallengeHistoryScreen2.M), R$id.recyclerView, new e2(6), null, null, 48);
                    case 1:
                        RewardsHubChallengeHistoryScreen.Companion companion2 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubChallengeHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.di.RewardsHubChallengeHistoryScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        RewardsHubChallengeHistoryScreenContract$InputData rewardsHubChallengeHistoryScreenContract$InputData = rewardsHubChallengeHistoryScreen.K;
                        rewardsHubChallengeHistoryScreenContract$InputData.getClass();
                        return new rtj.c(gVar, hVar2, rewardsHubChallengeHistoryScreenContract$InputData);
                    default:
                        RewardsHubChallengeHistoryScreen.Companion companion3 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        return (j) ((rtj.c) rewardsHubChallengeHistoryScreen.R.getValue()).f257271c.get();
                }
            }
        });
        this.Q = s.t(this, c.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: auj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubChallengeHistoryScreen f9839b;

            {
                this.f9839b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen = this.f9839b;
                switch (i22) {
                    case 0:
                        RewardsHubChallengeHistoryScreen.Companion companion = RewardsHubChallengeHistoryScreen.INSTANCE;
                        RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen2 = this.f9839b;
                        return dli.f.a(rewardsHubChallengeHistoryScreen2, rewardsHubChallengeHistoryScreen2.R2(), zhm.v.k(new ChallengeMediumImageCardLoadingDelegate(), rewardsHubChallengeHistoryScreen2.L, rewardsHubChallengeHistoryScreen2.M), R$id.recyclerView, new e2(6), null, null, 48);
                    case 1:
                        RewardsHubChallengeHistoryScreen.Companion companion2 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubChallengeHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.di.RewardsHubChallengeHistoryScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        RewardsHubChallengeHistoryScreenContract$InputData rewardsHubChallengeHistoryScreenContract$InputData = rewardsHubChallengeHistoryScreen.K;
                        rewardsHubChallengeHistoryScreenContract$InputData.getClass();
                        return new rtj.c(gVar, hVar2, rewardsHubChallengeHistoryScreenContract$InputData);
                    default:
                        RewardsHubChallengeHistoryScreen.Companion companion3 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        return (j) ((rtj.c) rewardsHubChallengeHistoryScreen.R.getValue()).f257271c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: auj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubChallengeHistoryScreen f9839b;

            {
                this.f9839b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen = this.f9839b;
                switch (i22) {
                    case 0:
                        RewardsHubChallengeHistoryScreen.Companion companion = RewardsHubChallengeHistoryScreen.INSTANCE;
                        RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen2 = this.f9839b;
                        return dli.f.a(rewardsHubChallengeHistoryScreen2, rewardsHubChallengeHistoryScreen2.R2(), zhm.v.k(new ChallengeMediumImageCardLoadingDelegate(), rewardsHubChallengeHistoryScreen2.L, rewardsHubChallengeHistoryScreen2.M), R$id.recyclerView, new e2(6), null, null, 48);
                    case 1:
                        RewardsHubChallengeHistoryScreen.Companion companion2 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        qji.b bVarU2 = rewardsHubChallengeHistoryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.di.RewardsHubChallengeHistoryScreenInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        RewardsHubChallengeHistoryScreenContract$InputData rewardsHubChallengeHistoryScreenContract$InputData = rewardsHubChallengeHistoryScreen.K;
                        rewardsHubChallengeHistoryScreenContract$InputData.getClass();
                        return new rtj.c(gVar, hVar2, rewardsHubChallengeHistoryScreenContract$InputData);
                    default:
                        RewardsHubChallengeHistoryScreen.Companion companion3 = RewardsHubChallengeHistoryScreen.INSTANCE;
                        return (j) ((rtj.c) rewardsHubChallengeHistoryScreen.R.getValue()).f257271c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f9849b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rtj.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i2 = b.f9840a[this.K.f101584a.ordinal()];
        if (i2 == 1) {
            i = R$string.rewards_hub_all_challenges_title;
        } else if (i2 == 2) {
            i = R$string.rewards_hub_earned_rewards_title;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.rewards_hub_expired_challenges_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).setSpanSizeLookup(new d(recyclerView));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        v vVar = this.N;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("scrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.N = y.a(recyclerView, 5, false, new ar1.c(this, 29));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new e0(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new ap7.k(this, continuation, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52013c), null, new auj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
