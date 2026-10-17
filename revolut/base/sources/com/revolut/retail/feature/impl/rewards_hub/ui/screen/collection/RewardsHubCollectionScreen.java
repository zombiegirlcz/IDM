package com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.s0;
import aw0.d0;
import cli.o;
import cli.q;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.StreakStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import cuj.d;
import cuj.f;
import cuj.g;
import cuj.j;
import cuj.k;
import cuj.n;
import cuj.p;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/collection/RewardsHubCollectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcuj/n;", "Ldli/a;", "Lcuj/p;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHubCollectionScreen extends ViewController<n> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RewardsHubCollectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final StreakStepVerticalDelegate L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RewardsHubCollectionScreen(RewardsHubCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new StreakStepVerticalDelegate();
        this.M = R$layout.screen_recycler_navbarwithbigtile;
        this.N = s.t(this, d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cuj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubCollectionScreen f109035b;

            {
                this.f109035b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHubCollectionScreen.R;
                        RewardsHubCollectionScreen rewardsHubCollectionScreen = this.f109035b;
                        return dli.f.a(rewardsHubCollectionScreen, rewardsHubCollectionScreen.d(), zhm.v.k(rewardsHubCollectionScreen.K, rewardsHubCollectionScreen.L, new StreakStepVerticalLoadingDelegate()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RewardsHubCollectionScreen.R;
                        return (o) ((rtj.d) this.f109035b.P.getValue()).e.get();
                }
            }
        });
        this.P = w.y0(new cf6.a(this, inputData, 26));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: cuj.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubCollectionScreen f109035b;

            {
                this.f109035b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RewardsHubCollectionScreen.R;
                        RewardsHubCollectionScreen rewardsHubCollectionScreen = this.f109035b;
                        return dli.f.a(rewardsHubCollectionScreen, rewardsHubCollectionScreen.d(), zhm.v.k(rewardsHubCollectionScreen.K, rewardsHubCollectionScreen.L, new StreakStepVerticalLoadingDelegate()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RewardsHubCollectionScreen.R;
                        return (o) ((rtj.d) this.f109035b.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        k kVar = uiState.f109051a;
        if (kVar instanceof k.b) {
            d3().f174510b.setLoadingState(true);
            return;
        }
        if (kVar instanceof k.a) {
            d3().f174510b.setLoadingState(false);
            return;
        }
        if (!(kVar instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        d3().f174510b.setLoadingState(false);
        j jVar = (j) kVar;
        d3().f174510b.setTitle(jVar.f109041a);
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = d3().f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        c1.S(screenRecyclerNavBarWithBigTileNavBarWithBigTile, jVar.f109043c, null, null, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rtj.d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        d0.Companion.getClass();
        navBarWithBigTile.setHeightMode(new o2(d0.f10273c));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174510b.f59357t), new c(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new cuj.e(this, null), 3);
        StreakStepVerticalDelegate streakStepVerticalDelegate = this.L;
        ViewController.P2(this, rd0.e.b(streakStepVerticalDelegate.f53467c), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(streakStepVerticalDelegate.d.f121375b), new g(this, null), 3);
    }

    public final jii.d0 d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cuj.o d() {
        return (cuj.o) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
