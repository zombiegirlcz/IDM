package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$id;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreenContract$InputData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oz0.c;
import te0.w;
import vc.s;
import wa3.d;
import wnc.x;
import wok.b;
import wok.f;
import wok.j;
import wok.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwok/f;", "Ldli/a;", "Lwok/k;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistInvitationScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WaitlistInvitationScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/databinding/WaitlistBinding;", 0))};
    public final WaitlistInvitationScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public WaitlistInvitationScreen(WaitlistInvitationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.waitlist;
        this.M = R$style.UiKitTheme_Night;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationScreen f298938b;

            {
                this.f298938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitlistInvitationScreen waitlistInvitationScreen = this.f298938b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationScreen.R;
                        WaitlistInvitationScreen waitlistInvitationScreen2 = this.f298938b;
                        return dli.f.a(waitlistInvitationScreen2, waitlistInvitationScreen2.d(), v.k(new TextDelegate(), new RowLoadingDelegate(), new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.waitlist_recycler, new x(18), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationScreen.R;
                        qji.b bVarU2 = waitlistInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.di.WaitlistInvitationScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistInvitationScreenContract$InputData waitlistInvitationScreenContract$InputData = waitlistInvitationScreen.K;
                        waitlistInvitationScreenContract$InputData.getClass();
                        return new jok.f(cVar, dVar2, waitlistInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationScreen.R;
                        return (h) ((jok.f) waitlistInvitationScreen.P.getValue()).f177163b.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationScreen f298938b;

            {
                this.f298938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitlistInvitationScreen waitlistInvitationScreen = this.f298938b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationScreen.R;
                        WaitlistInvitationScreen waitlistInvitationScreen2 = this.f298938b;
                        return dli.f.a(waitlistInvitationScreen2, waitlistInvitationScreen2.d(), v.k(new TextDelegate(), new RowLoadingDelegate(), new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.waitlist_recycler, new x(18), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationScreen.R;
                        qji.b bVarU2 = waitlistInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.di.WaitlistInvitationScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistInvitationScreenContract$InputData waitlistInvitationScreenContract$InputData = waitlistInvitationScreen.K;
                        waitlistInvitationScreenContract$InputData.getClass();
                        return new jok.f(cVar, dVar2, waitlistInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationScreen.R;
                        return (h) ((jok.f) waitlistInvitationScreen.P.getValue()).f177163b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistInvitationScreen f298938b;

            {
                this.f298938b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitlistInvitationScreen waitlistInvitationScreen = this.f298938b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistInvitationScreen.R;
                        WaitlistInvitationScreen waitlistInvitationScreen2 = this.f298938b;
                        return dli.f.a(waitlistInvitationScreen2, waitlistInvitationScreen2.d(), v.k(new TextDelegate(), new RowLoadingDelegate(), new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.waitlist_recycler, new x(18), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistInvitationScreen.R;
                        qji.b bVarU2 = waitlistInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.di.WaitlistInvitationScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistInvitationScreenContract$InputData waitlistInvitationScreenContract$InputData = waitlistInvitationScreen.K;
                        waitlistInvitationScreenContract$InputData.getClass();
                        return new jok.f(cVar, dVar2, waitlistInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistInvitationScreen.R;
                        return (h) ((jok.f) waitlistInvitationScreen.P.getValue()).f177163b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j jVar;
        i iVar;
        UrlVideo urlVideo;
        WallpaperAssetSwitcher wallpaperAssetSwitcher;
        Function1 function1;
        UrlImage urlImage;
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j jVar2 = uiState.f298951a;
        if (jVar2 != null) {
            wok.i iVar2 = jVar2.f298949a;
            String str = iVar2.f298946a;
            if (iVar2.f298947b == null || !iVar2.f298948c) {
                jVar = jVar2;
                if (str != null) {
                    WallpaperAssetSwitcher waitlistBackground = d3().f163343b;
                    Intrinsics.checkNotNullExpressionValue(waitlistBackground, "waitlistBackground");
                    waitlistBackground.setBackground(new NavBarWithContainerBackground.ImageBackground(new UrlImage(iVar2.f298946a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (s8) null, (Color.SolidRes) null, 14), null);
                } else {
                    WallpaperAssetSwitcher waitlistBackground2 = d3().f163343b;
                    Intrinsics.checkNotNullExpressionValue(waitlistBackground2, "waitlistBackground");
                    waitlistBackground2.setBackground(NavBarWithContainerBackground.TransparentBackground.f57882a, null);
                }
            } else {
                WallpaperAssetSwitcher waitlistBackground3 = d3().f163343b;
                Intrinsics.checkNotNullExpressionValue(waitlistBackground3, "waitlistBackground");
                UrlVideo urlVideo2 = new UrlVideo(iVar2.f298947b, (String) null, false, (oz0.b) null, false, (c) null, 122);
                if (str != null) {
                    jVar = jVar2;
                    urlVideo = urlVideo2;
                    wallpaperAssetSwitcher = waitlistBackground3;
                    function1 = null;
                    urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                } else {
                    jVar = jVar2;
                    urlVideo = urlVideo2;
                    wallpaperAssetSwitcher = waitlistBackground3;
                    function1 = null;
                    urlImage = null;
                }
                wallpaperAssetSwitcher.setBackground(new NavBarWithContainerBackground.VideoBackground(urlVideo, urlImage, (VideoShutter) null, (s8) null, 28), function1);
            }
        } else {
            jVar = jVar2;
        }
        if (jVar == null || (iVar = jVar.f298950b) == null) {
            return;
        }
        d3().f163344c.setModel(iVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jok.f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f59410q), new wkg.e(this, continuation, 9), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f163344c.f), 17), new wok.d(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(d3().f163344c.f58955g), 17), new wok.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f163344c.e), new wka.e(this, continuation, 11), 3);
    }

    public final iok.b d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iok.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wok.h d() {
        return (wok.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
