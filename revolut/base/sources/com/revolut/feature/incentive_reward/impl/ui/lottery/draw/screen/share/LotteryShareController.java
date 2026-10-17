package com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share;

import aii.q;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cf7.j;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.incentive_reward.impl.R$layout;
import com.revolut.feature.incentive_reward.impl.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.ArrayList;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.l;
import mx0.t;
import no.m;
import ty0.c;
import vc.s;
import vg7.b;
import vg7.f;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/lottery/draw/screen/share/LotteryShareController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lvg7/f;", "Lno/m;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LotteryShareController extends ViewController<q> implements w, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(LotteryShareController.class, "binding", "getBinding()Lcom/revolut/feature/incentive_reward/impl/databinding/ScreenShareLotteryBinding;", 0))};
    public final LotteryShareControllerContract$InputData K;
    public final h L;
    public final AnalyticsProduct.Retail M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public LotteryShareController(LotteryShareControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        k9 k9Var = k9.Salary;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = a.h(k9Var, "value", k9Var);
        this.N = R$layout.screen_share_lottery;
        this.O = te0.w.y0(new vg7.a(this, 0));
        this.P = te0.w.y0(new vg7.a(this, 1));
        this.Q = te0.w.y0(new vg7.a(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Context context = d3().e.getContext();
        Intrinsics.h(context);
        yy0.f fVarQ = d.f(context).Q();
        UrlImage urlImage = uiState.f288786b;
        UIKitImageView lotteryShareCardBackground = d3().d;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardBackground, "lotteryShareCardBackground");
        yy0.f.e(fVarQ, urlImage, lotteryShareCardBackground, null, null, 12);
        ResourceImage resourceImage = uiState.e;
        UIKitImageView lotteryShareCardIcon = d3().f3934g;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardIcon, "lotteryShareCardIcon");
        yy0.f.e(fVarQ, resourceImage, lotteryShareCardIcon, null, null, 12);
        ResourceImage resourceImage2 = uiState.f;
        UIKitImageView lotteryShareCardRevolutLogo = d3().i;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardRevolutLogo, "lotteryShareCardRevolutLogo");
        yy0.f.e(fVarQ, resourceImage2, lotteryShareCardRevolutLogo, null, null, 12);
        UrlImage urlImage2 = uiState.f288788g;
        UIKitImageView lotteryShareBackground = d3().f3933c;
        Intrinsics.checkNotNullExpressionValue(lotteryShareBackground, "lotteryShareBackground");
        yy0.f.e(fVarQ, urlImage2, lotteryShareBackground, null, null, 12);
        c cVarB0 = d.f(context).b0();
        TextClause textClause = uiState.f288785a;
        UIKitTextView lotteryShareCardTitle = d3().f3936j;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardTitle, "lotteryShareCardTitle");
        c.b(cVarB0, textClause, lotteryShareCardTitle, null, null, 12);
        TextClause textClause2 = uiState.f288787c;
        UIKitTextView lotteryShareCardPayday = d3().f3935h;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardPayday, "lotteryShareCardPayday");
        c.b(cVarB0, textClause2, lotteryShareCardPayday, null, null, 12);
        TimeClause timeClause = uiState.d;
        UIKitTextView lotteryShareCardDate = d3().f;
        Intrinsics.checkNotNullExpressionValue(lotteryShareCardDate, "lotteryShareCardDate");
        c.b(cVarB0, timeClause, lotteryShareCardDate, null, null, 12);
        ActionsView lotteryShareActionsView = d3().f3932b;
        Intrinsics.checkNotNullExpressionValue(lotteryShareActionsView, "lotteryShareActionsView");
        ArrayList arrayList = uiState.f288789h;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        lotteryShareActionsView.k(arrayList, t.f210002a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vg7.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.lottery_draw_share, null, null, 14));
        d3().f3932b.setLayoutType(l.HEADER_STYLED_CIRCLE_ACTIONS);
        if (this.K.f74879b) {
            d3().k.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        } else {
            d3().k.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().k.f59410q), new uwe.f(this, null, 29), 3);
        ViewController.P2(this, rd0.e.b(d3().f3932b.f58296a.f121375b), new vg7.c(this, null), 3);
    }

    public final af7.b d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (af7.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
