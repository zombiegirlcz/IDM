package com.revolut.feature.profile_card;

import aii.r;
import android.content.Context;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import cli.a0;
import cli.j;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.ProfileCardView;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dug.e;
import fp3.a;
import fpa.b;
import fpa.c;
import fpa.d;
import fpa.f;
import fpa.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lcli/j;", "Domain", "Laii/r;", "Out", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcli/w;", "Lfpa/g;", "<init>", "()V", "feature_profile_card_screen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseProfileCardScreen<Domain extends j, Out extends r> extends ViewController<Out> implements w {
    public ProfileCardView K;
    public CircleActionButtonsBarView L;
    public AnimatedBackgroundView M;
    public BasicNavBar N;
    public TiltGlowCardContainerView O;
    public final boolean P = true;
    public final Lazy Q = yhm.j.b(new a(this, 1));

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ProfileCardView profileCardView = this.K;
        if (profileCardView == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        profileCardView.setModel(uiState.f137076a);
        AnimatedBackgroundView animatedBackgroundView = this.M;
        if (animatedBackgroundView == null) {
            Intrinsics.r("backgroundView");
            throw null;
        }
        animatedBackgroundView.setBackgroundType(uiState.f137076a.getE());
        CircleActionButtonsBarView circleActionButtonsBarView = this.L;
        if (circleActionButtonsBarView == null) {
            Intrinsics.r("circleActionButtonsBarView");
            throw null;
        }
        circleActionButtonsBarView.setActions(uiState.f137077b);
        f fVar = uiState.f137078c;
        if (fVar != null) {
            BasicNavBar basicNavBar = this.N;
            if (basicNavBar == null) {
                Intrinsics.r("navBar");
                throw null;
            }
            basicNavBar.setTitle(fVar.f137074a);
            BasicNavBar basicNavBar2 = this.N;
            if (basicNavBar2 != null) {
                basicNavBar2.setMenuItems(fVar.f137075b);
            } else {
                Intrinsics.r("navBar");
                throw null;
            }
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R$id.screenProfileCard_profileCard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.K = (ProfileCardView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.screenProfileCard_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.M = (AnimatedBackgroundView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.screenProfileCard_circleActionButtonsBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.L = (CircleActionButtonsBarView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R$id.screenProfileCard_tiltContainer);
        TiltGlowCardContainerView tiltGlowCardContainerView = (TiltGlowCardContainerView) viewFindViewById4;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorForeground_10, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        tiltGlowCardContainerView.setChildDominantColor(ColorUtils.compositeColors(iS, kli.a.s(R$attr.uikit_colorBackground, context2)));
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "apply(...)");
        this.O = tiltGlowCardContainerView;
        View viewFindViewById5 = view.findViewById(R$id.screenProfileCard_navBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        BasicNavBar basicNavBar = (BasicNavBar) viewFindViewById5;
        this.N = basicNavBar;
        if (basicNavBar == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ViewCompat.setOnApplyWindowInsetsListener((ControllerContainerFrameLayout) view.findViewById(R$id.screenProfileCard_root), new e(21));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = this.N;
        if (basicNavBar == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(basicNavBar.f59211b), new fpa.a(this, null, 0), 3);
        BasicNavBar basicNavBar2 = this.N;
        if (basicNavBar2 == null) {
            Intrinsics.r("navBar");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(basicNavBar2.f59210a.f57403b), new b(this, null, 0), 3);
        ProfileCardView profileCardView = this.K;
        if (profileCardView == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(profileCardView.f()), new fpa.a(this, null, 1), 3);
        ProfileCardView profileCardView2 = this.K;
        if (profileCardView2 == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(profileCardView2.g()), new fpa.a(this, null, 2), 3);
        ProfileCardView profileCardView3 = this.K;
        if (profileCardView3 == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(profileCardView3.v), new b(this, null, 1), 3);
        ProfileCardView profileCardView4 = this.K;
        if (profileCardView4 == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(profileCardView4.f58839w), new b(this, null, 2), 3);
        ProfileCardView profileCardView5 = this.K;
        if (profileCardView5 == null) {
            Intrinsics.r("profileCardView");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(profileCardView5.e()), new c(this, null), 3);
        CircleActionButtonsBarView circleActionButtonsBarView = this.L;
        if (circleActionButtonsBarView != null) {
            ViewController.P2(this, rd0.e.b(circleActionButtonsBarView.a()), new d(this, null), 3);
        } else {
            Intrinsics.r("circleActionButtonsBarView");
            throw null;
        }
    }

    public abstract fpa.e d3();

    /* JADX INFO: renamed from: e3, reason: from getter */
    public boolean getP() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        TiltGlowCardContainerView tiltGlowCardContainerView = this.O;
        if (tiltGlowCardContainerView != null) {
            tiltGlowCardContainerView.setTiltEffectEnabled(getP());
        } else {
            Intrinsics.r("tiltGlowCardContainerView");
            throw null;
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getU() {
        return R$layout.screen_profile_card;
    }

    @Override // oki.f
    public pki.a k() {
        return (a0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        TiltGlowCardContainerView tiltGlowCardContainerView = this.O;
        if (tiltGlowCardContainerView != null) {
            tiltGlowCardContainerView.setTiltEffectEnabled(false);
        } else {
            Intrinsics.r("tiltGlowCardContainerView");
            throw null;
        }
    }
}
