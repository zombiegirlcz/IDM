package com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.f2;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.v0;
import au0.w0;
import au0.z0;
import aw0.d0;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$InputData;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;
import ytj.b;
import ytj.c;
import ytj.d;
import ytj.k;
import ytj.m;
import ytj.n;
import ytj.p;
import ytj.r;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/screen/challenge_details/ChallengeDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lytj/m;", "Ldli/a;", "Lytj/r;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeDetailsController extends ViewController<m> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ChallengeDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final ChallengeDetailsScreenContract$InputData K;
    public final h L;
    public final int M;
    public final RowDelegate N;
    public final RowLoadingDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ChallengeDetailsController(ChallengeDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.N = new RowDelegate(null, null, 7);
        this.O = new RowLoadingDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ytj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeDetailsController f316813b;

            {
                this.f316813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChallengeDetailsController challengeDetailsController = this.f316813b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeDetailsController.T;
                        qji.b bVarU2 = challengeDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.di.ChallengeDetailsControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        ChallengeDetailsScreenContract$InputData challengeDetailsScreenContract$InputData = challengeDetailsController.K;
                        challengeDetailsScreenContract$InputData.getClass();
                        return new rtj.a(gVar, hVar2, challengeDetailsController, challengeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeDetailsController.T;
                        ChallengeDetailsController challengeDetailsController2 = this.f316813b;
                        return dli.f.a(challengeDetailsController2, challengeDetailsController2.d(), zhm.v.k(challengeDetailsController2.N, challengeDetailsController2.O, challengeDetailsController2.P), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeDetailsController.T;
                        return (k) ((rtj.a) challengeDetailsController.Q.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ytj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeDetailsController f316813b;

            {
                this.f316813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChallengeDetailsController challengeDetailsController = this.f316813b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeDetailsController.T;
                        qji.b bVarU2 = challengeDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.di.ChallengeDetailsControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        ChallengeDetailsScreenContract$InputData challengeDetailsScreenContract$InputData = challengeDetailsController.K;
                        challengeDetailsScreenContract$InputData.getClass();
                        return new rtj.a(gVar, hVar2, challengeDetailsController, challengeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeDetailsController.T;
                        ChallengeDetailsController challengeDetailsController2 = this.f316813b;
                        return dli.f.a(challengeDetailsController2, challengeDetailsController2.d(), zhm.v.k(challengeDetailsController2.N, challengeDetailsController2.O, challengeDetailsController2.P), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeDetailsController.T;
                        return (k) ((rtj.a) challengeDetailsController.Q.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ytj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengeDetailsController f316813b;

            {
                this.f316813b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChallengeDetailsController challengeDetailsController = this.f316813b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChallengeDetailsController.T;
                        qji.b bVarU2 = challengeDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.di.ChallengeDetailsControllerInjector");
                        rtj.h hVar = (rtj.h) bVarU2;
                        rtj.g gVar = hVar.f257290b;
                        rtj.h hVar2 = hVar.f257291c;
                        ChallengeDetailsScreenContract$InputData challengeDetailsScreenContract$InputData = challengeDetailsController.K;
                        challengeDetailsScreenContract$InputData.getClass();
                        return new rtj.a(gVar, hVar2, challengeDetailsController, challengeDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ChallengeDetailsController.T;
                        ChallengeDetailsController challengeDetailsController2 = this.f316813b;
                        return dli.f.a(challengeDetailsController2, challengeDetailsController2.d(), zhm.v.k(challengeDetailsController2.N, challengeDetailsController2.O, challengeDetailsController2.P), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChallengeDetailsController.T;
                        return (k) ((rtj.a) challengeDetailsController.Q.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ytj.q qVar2 = uiState.f316826a;
        boolean zEquals = qVar2.equals(p.f316825a);
        d0 d0Var = d0.f10273c;
        if (zEquals) {
            NavBarWithBigTile navBarWithBigTile = d3().f174505c;
            d0.Companion.getClass();
            navBarWithBigTile.setHeightMode(new o2(d0Var));
            navBarWithBigTile.setLoadingState(true);
        } else if (qVar2 instanceof n) {
            NavBarWithBigTile navBarWithBigTile2 = d3().f174505c;
            d0.Companion.getClass();
            navBarWithBigTile2.setHeightMode(new o2(d0Var));
            navBarWithBigTile2.setLoadingState(false);
            n nVar = (n) qVar2;
            TextClause textClause = nVar.f316821a;
            navBarWithBigTile2.setToolbarTitle(textClause);
            navBarWithBigTile2.setPages(u.c(new u0(new NavBarWithContainerBackground.ImageBackground(new UrlImage(nVar.f316823c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), new z0(textClause, false), null, new w0(nVar.f316822b))), f2.LINE_INDICATOR, v0.NONE);
        } else {
            if (!qVar2.equals(ytj.o.f316824a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithBigTile navBarWithBigTile3 = d3().f174505c;
            navBarWithBigTile3.setHeightMode(new o2(0));
            navBarWithBigTile3.setLoadingState(false);
        }
        ActionFooterView actionFooterView = d3().f174504b;
        actionFooterView.setModel(uiState.f316827b);
        TwinVerticalButton twinVerticalButton = actionFooterView.getTwinVerticalButton();
        if (twinVerticalButton != null) {
            twinVerticalButton.setMainButtonVisible(uiState.f316828c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rtj.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.LEFT_ALIGNED);
        navBarWithBigTile.setTitleStyle(b1.MARKETING);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174505c.f59357t), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174504b.f), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174504b.e), new yk6.m(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new ytj.e(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
