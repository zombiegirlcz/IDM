package com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.WaitingListActivationReadyScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ta9.o;
import ta9.y;
import te0.w;
import vb9.b;
import vb9.c;
import vb9.d;
import vb9.e;
import vb9.f;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/waiting_list/activation_ready/WaitingListActivationReadyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvb9/d;", "Ldli/a;", "Lvb9/e;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListActivationReadyScreen extends ViewController<d> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WaitingListActivationReadyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenPromptBinding;", 0))};
    public final WaitingListActivationReadyScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final PromptMarketingContentDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final AnalyticsProduct.Retail S;

    public WaitingListActivationReadyScreen(WaitingListActivationReadyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        this.M = R$style.UiKitTheme_Night;
        this.N = s.t(this, b.f);
        this.O = new PromptMarketingContentDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListActivationReadyScreen f287449b;

            {
                this.f287449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitingListActivationReadyScreen waitingListActivationReadyScreen = this.f287449b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListActivationReadyScreen.T;
                        qji.b bVarU2 = waitingListActivationReadyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.di.WaitingListActivationReadyScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        waitingListActivationReadyScreen.K.getClass();
                        return new y(mVar, oVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListActivationReadyScreen.T;
                        return (f) ((y) waitingListActivationReadyScreen.P.getValue()).f269288b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListActivationReadyScreen.T;
                        WaitingListActivationReadyScreen waitingListActivationReadyScreen2 = this.f287449b;
                        return dli.f.a(waitingListActivationReadyScreen2, (f) waitingListActivationReadyScreen2.Q.getValue(), u.c(waitingListActivationReadyScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListActivationReadyScreen f287449b;

            {
                this.f287449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitingListActivationReadyScreen waitingListActivationReadyScreen = this.f287449b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListActivationReadyScreen.T;
                        qji.b bVarU2 = waitingListActivationReadyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.di.WaitingListActivationReadyScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        waitingListActivationReadyScreen.K.getClass();
                        return new y(mVar, oVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListActivationReadyScreen.T;
                        return (f) ((y) waitingListActivationReadyScreen.P.getValue()).f269288b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListActivationReadyScreen.T;
                        WaitingListActivationReadyScreen waitingListActivationReadyScreen2 = this.f287449b;
                        return dli.f.a(waitingListActivationReadyScreen2, (f) waitingListActivationReadyScreen2.Q.getValue(), u.c(waitingListActivationReadyScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListActivationReadyScreen f287449b;

            {
                this.f287449b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitingListActivationReadyScreen waitingListActivationReadyScreen = this.f287449b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitingListActivationReadyScreen.T;
                        qji.b bVarU2 = waitingListActivationReadyScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.waiting_list.activation_ready.di.WaitingListActivationReadyScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        waitingListActivationReadyScreen.K.getClass();
                        return new y(mVar, oVar2);
                    case 1:
                        KProperty[] kPropertyArr2 = WaitingListActivationReadyScreen.T;
                        return (f) ((y) waitingListActivationReadyScreen.P.getValue()).f269288b.get();
                    default:
                        KProperty[] kPropertyArr3 = WaitingListActivationReadyScreen.T;
                        WaitingListActivationReadyScreen waitingListActivationReadyScreen2 = this.f287449b;
                        return dli.f.a(waitingListActivationReadyScreen2, (f) waitingListActivationReadyScreen2.Q.getValue(), u.c(waitingListActivationReadyScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.S = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((e) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.h) value).f174525b.setInsetsAdjustmentsEnabled(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
