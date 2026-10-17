package com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreenContract$InputData;
import dli.a;
import dli.c;
import gck.b;
import gck.g;
import gck.i;
import gck.j;
import gck.k;
import gck.p;
import gck.t;
import jii.m;
import kji.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pbk.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/screens/receiver/intro/PlanGiftingReceiverIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgck/p;", "Ldli/a;", "Lgck/t;", "Lkji/f;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanGiftingReceiverIntroScreen extends ViewController<p> implements a, f {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PlanGiftingReceiverIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PlanGiftingReceiverIntroScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final FullScreenStateDelegate O;
    public final LargeActionButtonDelegate P;
    public final PromptMarketingContentDelegate Q;
    public final PromptMarketingContentLoadingDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public PlanGiftingReceiverIntroScreen(PlanGiftingReceiverIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = R$style.UiKitTheme_Mono;
        this.N = s.t(this, b.f);
        this.O = new FullScreenStateDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new PromptMarketingContentDelegate();
        this.R = new PromptMarketingContentLoadingDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: gck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverIntroScreen f142495b;

            {
                this.f142495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.f142495b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen2 = this.f142495b;
                        return dli.f.a(planGiftingReceiverIntroScreen2, planGiftingReceiverIntroScreen2.d(), zhm.v.k(planGiftingReceiverIntroScreen2.O, planGiftingReceiverIntroScreen2.Q, planGiftingReceiverIntroScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen3 = this.f142495b;
                        qji.b bVarU2 = planGiftingReceiverIntroScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.di.PlanGiftingReceiverIntroScreenInjector");
                        pbk.c cVar = (pbk.c) bVarU2;
                        pbk.b bVar = cVar.f234724c;
                        pbk.c cVar2 = cVar.d;
                        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = planGiftingReceiverIntroScreen3.K;
                        planGiftingReceiverIntroScreenContract$InputData.getClass();
                        return new pbk.d(bVar, cVar2, new hck.a(), planGiftingReceiverIntroScreen3, planGiftingReceiverIntroScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverIntroScreen.W;
                        return (s) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).f234733j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftingReceiverIntroScreen.W;
                        return (j60.a) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: gck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverIntroScreen f142495b;

            {
                this.f142495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.f142495b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen2 = this.f142495b;
                        return dli.f.a(planGiftingReceiverIntroScreen2, planGiftingReceiverIntroScreen2.d(), zhm.v.k(planGiftingReceiverIntroScreen2.O, planGiftingReceiverIntroScreen2.Q, planGiftingReceiverIntroScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen3 = this.f142495b;
                        qji.b bVarU2 = planGiftingReceiverIntroScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.di.PlanGiftingReceiverIntroScreenInjector");
                        pbk.c cVar = (pbk.c) bVarU2;
                        pbk.b bVar = cVar.f234724c;
                        pbk.c cVar2 = cVar.d;
                        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = planGiftingReceiverIntroScreen3.K;
                        planGiftingReceiverIntroScreenContract$InputData.getClass();
                        return new pbk.d(bVar, cVar2, new hck.a(), planGiftingReceiverIntroScreen3, planGiftingReceiverIntroScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverIntroScreen.W;
                        return (s) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).f234733j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftingReceiverIntroScreen.W;
                        return (j60.a) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: gck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverIntroScreen f142495b;

            {
                this.f142495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.f142495b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen2 = this.f142495b;
                        return dli.f.a(planGiftingReceiverIntroScreen2, planGiftingReceiverIntroScreen2.d(), zhm.v.k(planGiftingReceiverIntroScreen2.O, planGiftingReceiverIntroScreen2.Q, planGiftingReceiverIntroScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen3 = this.f142495b;
                        qji.b bVarU2 = planGiftingReceiverIntroScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.di.PlanGiftingReceiverIntroScreenInjector");
                        pbk.c cVar = (pbk.c) bVarU2;
                        pbk.b bVar = cVar.f234724c;
                        pbk.c cVar2 = cVar.d;
                        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = planGiftingReceiverIntroScreen3.K;
                        planGiftingReceiverIntroScreenContract$InputData.getClass();
                        return new pbk.d(bVar, cVar2, new hck.a(), planGiftingReceiverIntroScreen3, planGiftingReceiverIntroScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverIntroScreen.W;
                        return (s) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).f234733j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftingReceiverIntroScreen.W;
                        return (j60.a) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: gck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverIntroScreen f142495b;

            {
                this.f142495b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.f142495b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen2 = this.f142495b;
                        return dli.f.a(planGiftingReceiverIntroScreen2, planGiftingReceiverIntroScreen2.d(), zhm.v.k(planGiftingReceiverIntroScreen2.O, planGiftingReceiverIntroScreen2.Q, planGiftingReceiverIntroScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverIntroScreen.W;
                        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen3 = this.f142495b;
                        qji.b bVarU2 = planGiftingReceiverIntroScreen3.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.di.PlanGiftingReceiverIntroScreenInjector");
                        pbk.c cVar = (pbk.c) bVarU2;
                        pbk.b bVar = cVar.f234724c;
                        pbk.c cVar2 = cVar.d;
                        PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData = planGiftingReceiverIntroScreen3.K;
                        planGiftingReceiverIntroScreenContract$InputData.getClass();
                        return new pbk.d(bVar, cVar2, new hck.a(), planGiftingReceiverIntroScreen3, planGiftingReceiverIntroScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverIntroScreen.W;
                        return (s) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).f234733j.get();
                    default:
                        KProperty[] kPropertyArr4 = PlanGiftingReceiverIntroScreen.W;
                        return (j60.a) ((pbk.d) planGiftingReceiverIntroScreen.T.getValue()).e.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(uiState.f142514a ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setVisibility(8);
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        ((j60.a) this.V.getValue()).d(v.k(this.P, new CellDetailsDelegate()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(this.R.p()), new gck.h(this, continuation, i), 3);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.Q;
        int i2 = 1;
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptMarketingContentDelegate.f53079c), rd0.e.b(d3().f174539b.f59410q)), new gck.h(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, new g9j.q(rd0.e.b(promptMarketingContentDelegate.d), 4), new j(this, null), 3);
        ViewController.P2(this, new g9j.q(rd0.e.b(promptMarketingContentDelegate.f.f121375b), 5), new k(this, continuation, i), 3);
        ViewController.P2(this, new g9j.q(rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), 6), new k(this, continuation, i2), 3);
        ViewController.P2(this, new g9j.q(rd0.e.b(this.P.d.f121375b), 3), new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gck.s d() {
        return (gck.s) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
