package com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen;

import a3l.c;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import aw0.na;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_rewards.impl.R$layout;
import fdk.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import pnh.a0;
import u7k.f0;
import udk.b;
import udk.h;
import udk.p;
import udk.r;
import udk.t;
import udk.u;
import udk.v;
import udk.z;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/screen/PlanRewardsRevealScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ludk/h;", "Lcli/w;", "Ludk/v;", "Companion", "a", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanRewardsRevealScreen extends ViewController<h> implements w {
    public final PlanRewardsRevealScreenContract$InputData K;
    public u L;
    public final int M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanRewardsRevealScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenPlanRewardsRevealBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public static final DecelerateInterpolator S = new DecelerateInterpolator();
    public static final AccelerateDecelerateInterpolator T = new AccelerateDecelerateInterpolator();

    public static final class a {
        private a() {
        }
    }

    public PlanRewardsRevealScreen(PlanRewardsRevealScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = R$layout.screen_plan_rewards_reveal;
        this.N = s.t(this, b.f);
        this.O = te0.w.y0(new udk.a(this, 1));
        this.P = te0.w.y0(new udk.a(this, 2));
        this.Q = te0.w.y0(new udk.a(this, 3));
    }

    public static void f3(ViewGroup viewGroup, float f, long j2, TimeInterpolator timeInterpolator, long j3, Function0 function0) {
        ViewPropertyAnimator interpolator = viewGroup.animate().alpha(f).setDuration(j2).setStartDelay(j3).setInterpolator(timeInterpolator);
        if (function0 != null) {
            interpolator.withEndAction(new c(12, function0));
        }
        interpolator.start();
    }

    public static /* synthetic */ void g3(ViewGroup viewGroup, float f, long j2, BaseInterpolator baseInterpolator, udk.a aVar, int i) {
        if ((i & 16) != 0) {
            aVar = null;
        }
        f3(viewGroup, f, j2, baseInterpolator, 0L, aVar);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v uiState = (v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.f279274b != null) {
            d3().f23275g.setVisibility(0);
            d3().f23275g.setBackgroundType(uiState.f279274b);
        } else {
            d3().f23275g.setVisibility(4);
        }
        u uVar = uiState.f279273a;
        if (uVar.equals(this.L)) {
            return;
        }
        this.L = uVar;
        if (uVar.equals(udk.q.f279265a)) {
            d3().f23274c.setVisibility(8);
            d3().d.setVisibility(4);
            d3().e.setVisibility(8);
            return;
        }
        if (uVar.equals(udk.o.f279263a)) {
            d3().f23274c.setVisibility(8);
            d3().d.setVisibility(4);
            d3().e.setVisibility(0);
            return;
        }
        boolean z = uVar instanceof p;
        DecelerateInterpolator decelerateInterpolator = S;
        if (z) {
            na naVar = ((p) uVar).f279264a;
            d3().e.setVisibility(8);
            d3().f23276h.setModel(naVar);
            d3().d.setVisibility(0);
            LinearLayout planRewardsRevealContent = d3().d;
            Intrinsics.checkNotNullExpressionValue(planRewardsRevealContent, "planRewardsRevealContent");
            f3(planRewardsRevealContent, 1.0f, CapturePresenter.CONFIRMATION_VIEW_ANIM_DELAY, decelerateInterpolator, 100L, new udk.a(this, 0));
            return;
        }
        if (uVar.equals(t.f279272a)) {
            return;
        }
        if (uVar instanceof udk.s) {
            udk.s sVar = (udk.s) uVar;
            int visibility = d3().d.getVisibility();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = T;
            if (visibility == 0) {
                LinearLayout planRewardsRevealContent2 = d3().d;
                Intrinsics.checkNotNullExpressionValue(planRewardsRevealContent2, "planRewardsRevealContent");
                g3(planRewardsRevealContent2, BitmapDescriptorFactory.HUE_RED, 600L, accelerateDecelerateInterpolator, new udk.a(this, 4), 8);
            }
            VideoBackgroundView videoBackgroundView = d3().f23274c;
            videoBackgroundView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            videoBackgroundView.setVisibility(0);
            videoBackgroundView.setVideoBackground(sVar.f279269a, sVar.f279270b, false, sVar.f279271c);
            g3(videoBackgroundView, 1.0f, 1600L, accelerateDecelerateInterpolator, null, 24);
            return;
        }
        if (!(uVar instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        r rVar = (r) uVar;
        if (!rVar.f279268c) {
            d3().f23274c.setVisibility(8);
            UiKitPlayerView uiKitPlayerView = d3().f23274c.f51502a;
            uiKitPlayerView.h();
            VideoBackgroundView.a(uiKitPlayerView, false);
        }
        d3().f23276h.setModel(rVar.f279266a);
        d3().f23273b.setModel(rVar.f279267b);
        d3().f23273b.setVisibility(0);
        d3().d.setGravity(81);
        d3().d.setVisibility(0);
        LinearLayout planRewardsRevealContent3 = d3().d;
        Intrinsics.checkNotNullExpressionValue(planRewardsRevealContent3, "planRewardsRevealContent");
        g3(planRewardsRevealContent3, 1.0f, 1000L, decelerateInterpolator, null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        FullScreenStateView fullScreenStateView = d3().e;
        FullScreenStateView.setImage$default(fullScreenStateView, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_104_status_error, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, 2, null);
        fullScreenStateView.setTitleText(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14));
        FullScreenStateView.setCaptionText$default(fullScreenStateView, new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, 2, null);
        fullScreenStateView.setMainAction(new l6(12, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, h4.ACCENT));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.L = null;
        d3().d.animate().cancel();
        d3().f23274c.animate().cancel();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f.f59211b), new udk.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f23273b.f), new udk.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f23273b.e), new f0(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(d3().e.getSmallActionButton().f56386h), new udk.c(this, null, 2), 3);
        efm.r map = d3().f23274c.f51502a.f57715r.filter(new pjg.i(new a0(3), 18)).map(new pjg.i(new a0(4), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new udk.c(this, null, 3), 3);
        efm.r map2 = d3().f23274c.f51502a.f57715r.filter(new pjg.i(new a0(5), 20)).map(new pjg.i(new a0(6), 21));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ViewController.P2(this, rd0.e.b(map2), new udk.c(this, null, 4), 3);
    }

    public final cdk.c d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cdk.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final z d() {
        return (z) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (cli.a0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
