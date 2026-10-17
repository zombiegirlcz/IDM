package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import ink.b;
import ink.c;
import ink.d;
import kji.e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ngk.l;
import org.jetbrains.annotations.NotNull;
import qgk.b1;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_referrals_invite_video/PlanReferralsInviteVideoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Link/c;", "Lcli/w;", "Link/e;", "Lkji/e;", "Companion", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanReferralsInviteVideoScreen extends ViewController<c> implements w, e {
    public final PlanReferralsInviteVideoScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Lazy N;
    public final h O;
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PlanReferralsInviteVideoScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanReferralsInviteVideoBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public PlanReferralsInviteVideoScreen(PlanReferralsInviteVideoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = te0.w.y0(new ink.a(this, 0));
        this.M = te0.w.y0(new ink.a(this, 1));
        this.N = j.b(new ink.a(this, 2));
        this.O = s.t(this, b.f);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(R$style.UiKitTheme_TransparentSlider);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ink.e uiState = (ink.e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((l) value).f215215b.setVideo(uiState.f162978a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b1) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ZoomableFullScreenVideoView zoomableFullScreenVideoView = ((l) value).f215215b;
        zoomableFullScreenVideoView.setAutoDismissEnabled(false);
        zoomableFullScreenVideoView.setNestedScrollingEnabled(true);
        zoomableFullScreenVideoView.setOnError(new ink.a(this, 3));
        zoomableFullScreenVideoView.setOnDismiss(new ink.a(this, 4));
        zoomableFullScreenVideoView.setSkipButton(2000L, new TextLocalisedClause(R$string.common_action_skip, null, null, 14));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getR() {
        return R$layout.screen_plan_referrals_invite_video;
    }

    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
