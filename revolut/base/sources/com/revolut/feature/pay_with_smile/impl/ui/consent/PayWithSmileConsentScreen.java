package com.revolut.feature.pay_with_smile.impl.ui.consent;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f2;
import au0.m0;
import au0.s0;
import au0.u0;
import au0.v0;
import au0.z0;
import aw0.d0;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.feature.pay_with_smile.impl.ui.consent.PayWithSmileConsentScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tl9.d;
import tx0.o2;
import vc.s;
import xjl.g;
import xki.e;
import xl9.b;
import xl9.c;
import xl9.i;
import xl9.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/consent/PayWithSmileConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxl9/i;", "Ldli/a;", "Lxl9/k;", "Lno/k;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithSmileConsentScreen extends ViewController<i> implements a, k {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayWithSmileConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final InputChecklistDelegate K;
    public final TextDelegate L;
    public final h M;
    public final int N;
    public AnalyticsContext O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PayWithSmileConsentScreen(PayWithSmileConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new InputChecklistDelegate();
        this.L = new TextDelegate();
        this.M = s.t(this, b.f);
        this.N = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        this.O = inputData.f78957b;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: xl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileConsentScreen f306956b;

            {
                this.f306956b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithSmileConsentScreen.S;
                        PayWithSmileConsentScreen payWithSmileConsentScreen = this.f306956b;
                        return dli.f.a(payWithSmileConsentScreen, (j) payWithSmileConsentScreen.R.getValue(), v.k(new HighlightTileDelegate(), new HighlightTileLoadingDelegate(), new RowDelegate(null, null, 7), new FooterTextLoadingDelegate(), payWithSmileConsentScreen.K, payWithSmileConsentScreen.L), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayWithSmileConsentScreen.S;
                        return (j) ((tl9.d) this.f306956b.Q.getValue()).f272035b.get();
                }
            }
        });
        this.Q = w.y0(new xfj.a(this, inputData, 3));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: xl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileConsentScreen f306956b;

            {
                this.f306956b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithSmileConsentScreen.S;
                        PayWithSmileConsentScreen payWithSmileConsentScreen = this.f306956b;
                        return dli.f.a(payWithSmileConsentScreen, (j) payWithSmileConsentScreen.R.getValue(), v.k(new HighlightTileDelegate(), new HighlightTileLoadingDelegate(), new RowDelegate(null, null, 7), new FooterTextLoadingDelegate(), payWithSmileConsentScreen.K, payWithSmileConsentScreen.L), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayWithSmileConsentScreen.S;
                        return (j) ((tl9.d) this.f306956b.Q.getValue()).f272035b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        xl9.k uiState = (xl9.k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        TextLocalisedClause textLocalisedClause = uiState.f306963a;
        navBarWithBigTile.setToolbarTitle(textLocalisedClause);
        navBarWithBigTile.setPages(u.c(new u0(new NavBarWithContainerBackground.VideoBackground(uiState.f306965c, (Image) null, (VideoShutter) null, (s8) null, 30), new z0(textLocalisedClause, false), new au0.o0(uiState.f306964b), null)), f2.LINE_INDICATOR, v0.NONE);
        d3().f174504b.setModel(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c3(xl9.h.f306962a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.O = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174505c.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        NavBarWithBigTile navBarWithBigTile = d3().f174505c;
        navBarWithBigTile.setHeightMode(new o2(new d0(375, 400)));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174505c.f59357t), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174504b.f), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.d), new g(this, (Continuation) null, 5), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52518c), new xl9.d(this, null), 3);
    }

    public final c0 d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
