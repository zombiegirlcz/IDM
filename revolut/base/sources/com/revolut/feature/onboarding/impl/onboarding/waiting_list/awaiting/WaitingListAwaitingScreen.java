package com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.onboarding.impl.R$layout;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreen;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import ta9.z;
import te0.w;
import tki.c;
import vc.s;
import x5a.d;
import xb9.b;
import xb9.f;
import xb9.i;
import xb9.j;
import xb9.k;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/awaiting/WaitingListAwaitingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxb9/i;", "Ltki/c;", "Lxb9/k;", "Lno/m;", "Companion", "a", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListAwaitingScreen extends ViewController<i> implements c, m {
    public final WaitingListAwaitingScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final AnalyticsProduct.Retail Q;
    public final h R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WaitingListAwaitingScreen.class, "binding", "getBinding()Lcom/revolut/feature/onboarding/impl/databinding/ScreenWaitingListAwaitingBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WaitingListAwaitingScreen(WaitingListAwaitingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_waiting_list_awaiting;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListAwaitingScreen f304022b;

            {
                this.f304022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitingListAwaitingScreen waitingListAwaitingScreen = this.f304022b;
                switch (i2) {
                    case 0:
                        WaitingListAwaitingScreen.Companion companion = WaitingListAwaitingScreen.INSTANCE;
                        qji.b bVarU2 = waitingListAwaitingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.di.WaitingListAwaitingScreenInjector");
                        ta9.o oVar = (ta9.o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        ta9.o oVar2 = oVar.f269261c;
                        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = waitingListAwaitingScreen.K;
                        waitingListAwaitingScreenContract$InputData.getClass();
                        return new z(mVar, oVar2, waitingListAwaitingScreenContract$InputData);
                    case 1:
                        WaitingListAwaitingScreen.Companion companion2 = WaitingListAwaitingScreen.INSTANCE;
                        return (j) ((z) waitingListAwaitingScreen.M.getValue()).f269291c.get();
                    default:
                        WaitingListAwaitingScreen.Companion companion3 = WaitingListAwaitingScreen.INSTANCE;
                        WaitingListAwaitingScreen waitingListAwaitingScreen2 = this.f304022b;
                        return tki.g.a(waitingListAwaitingScreen2, waitingListAwaitingScreen2.d(), u.c((PromptMarketingContentDelegate) waitingListAwaitingScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListAwaitingScreen f304022b;

            {
                this.f304022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitingListAwaitingScreen waitingListAwaitingScreen = this.f304022b;
                switch (i22) {
                    case 0:
                        WaitingListAwaitingScreen.Companion companion = WaitingListAwaitingScreen.INSTANCE;
                        qji.b bVarU2 = waitingListAwaitingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.di.WaitingListAwaitingScreenInjector");
                        ta9.o oVar = (ta9.o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        ta9.o oVar2 = oVar.f269261c;
                        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = waitingListAwaitingScreen.K;
                        waitingListAwaitingScreenContract$InputData.getClass();
                        return new z(mVar, oVar2, waitingListAwaitingScreenContract$InputData);
                    case 1:
                        WaitingListAwaitingScreen.Companion companion2 = WaitingListAwaitingScreen.INSTANCE;
                        return (j) ((z) waitingListAwaitingScreen.M.getValue()).f269291c.get();
                    default:
                        WaitingListAwaitingScreen.Companion companion3 = WaitingListAwaitingScreen.INSTANCE;
                        WaitingListAwaitingScreen waitingListAwaitingScreen2 = this.f304022b;
                        return tki.g.a(waitingListAwaitingScreen2, waitingListAwaitingScreen2.d(), u.c((PromptMarketingContentDelegate) waitingListAwaitingScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = w.y0(new d(18));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListAwaitingScreen f304022b;

            {
                this.f304022b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitingListAwaitingScreen waitingListAwaitingScreen = this.f304022b;
                switch (i22) {
                    case 0:
                        WaitingListAwaitingScreen.Companion companion = WaitingListAwaitingScreen.INSTANCE;
                        qji.b bVarU2 = waitingListAwaitingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.di.WaitingListAwaitingScreenInjector");
                        ta9.o oVar = (ta9.o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        ta9.o oVar2 = oVar.f269261c;
                        WaitingListAwaitingScreenContract$InputData waitingListAwaitingScreenContract$InputData = waitingListAwaitingScreen.K;
                        waitingListAwaitingScreenContract$InputData.getClass();
                        return new z(mVar, oVar2, waitingListAwaitingScreenContract$InputData);
                    case 1:
                        WaitingListAwaitingScreen.Companion companion2 = WaitingListAwaitingScreen.INSTANCE;
                        return (j) ((z) waitingListAwaitingScreen.M.getValue()).f269291c.get();
                    default:
                        WaitingListAwaitingScreen.Companion companion3 = WaitingListAwaitingScreen.INSTANCE;
                        WaitingListAwaitingScreen waitingListAwaitingScreen2 = this.f304022b;
                        return tki.g.a(waitingListAwaitingScreen2, waitingListAwaitingScreen2.d(), u.c((PromptMarketingContentDelegate) waitingListAwaitingScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = d3().f213615b.findViewById(R$id.navBarLayout);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            }
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            layoutParams2.setScrollFlags(0);
            viewFindViewById.setLayoutParams(layoutParams2);
        }
        Integer numA = this.K.f78500b.a();
        if (numA != null) {
            d3().f213615b.setNavigationButtonIcon(Integer.valueOf(numA.intValue()));
        }
        d3().f213615b.setMenuItems(u.c(new TextNavBarMenuItem("LOG_OUT_MENU_ITEM_ID", new TextLocalisedClause(R$string.common_action_log_out, null, null, 14), null, null, 12)));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.waiting_list_awaiting_title_v3, null, null, 14));
        if (this.K.f78500b.b()) {
            ViewController.P2(this, rd0.e.b(d3().f213615b.f59410q), new xb9.c(this, null, 0), 3);
        }
        ViewController.P2(this, rd0.e.b(d3().f213615b.o.f57403b), new xb9.c(this, null, 1), 3);
        ?? r56 = this.O;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new xb9.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new xb9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).e), new f(this, null), 3);
    }

    public final n99.d d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n99.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
