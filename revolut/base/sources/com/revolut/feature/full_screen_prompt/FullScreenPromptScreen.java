package com.revolut.feature.full_screen_prompt;

import android.view.View;
import android.view.ViewConfiguration;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.R$id;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.j;
import d67.i;
import efm.r;
import in0.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import no.m;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/FullScreenPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/full_screen_prompt/c;", "Ldli/a;", "Ld67/i;", "Lno/m;", "Lno/k;", "Lin0/g;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullScreenPromptScreen extends ViewController<c> implements dli.a, m, k, g {
    public final d67.g K;
    public final int L;
    public final boolean M;
    public AnalyticsContext N;
    public final Object O;
    public final Object P;
    public final PromptContentDelegate Q;
    public final Object R;

    public FullScreenPromptScreen(d67.g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_full_screen_prompt;
        this.M = inputData.getO();
        this.N = inputData.getF74497t();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: d67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FullScreenPromptScreen f111453b;

            {
                this.f111453b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                g67.a aVar;
                b60.a aVar2;
                switch (i) {
                    case 0:
                        FullScreenPromptScreen fullScreenPromptScreen = this.f111453b;
                        try {
                            phm.a aVar3 = (phm.a) ue0.e.j(fullScreenPromptScreen.m2()).a().get(g67.c.class);
                            aVar2 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        } catch (Exception unused) {
                            Object objC = g67.f.Companion.c();
                            Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.feature.full_screen_prompt.di.FullScreenPromptFeatureComponent");
                            aVar = (g67.a) objC;
                        }
                        if (aVar2 == null) {
                            throw new IllegalStateException("Api " + g67.c.class + " is not found");
                        }
                        aVar = (g67.a) aVar2.b();
                        g67.a aVar4 = aVar.f140882a;
                        g gVar = fullScreenPromptScreen.K;
                        gVar.getClass();
                        return new g67.b(aVar4, gVar);
                    case 1:
                        return (com.revolut.feature.full_screen_prompt.d) ((g67.b) this.f111453b.O.getValue()).f140885c.get();
                    default:
                        FullScreenPromptScreen fullScreenPromptScreen2 = this.f111453b;
                        return dli.f.a(fullScreenPromptScreen2, fullScreenPromptScreen2.R2(), zhm.u.c(fullScreenPromptScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: d67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FullScreenPromptScreen f111453b;

            {
                this.f111453b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                g67.a aVar;
                b60.a aVar2;
                switch (i2) {
                    case 0:
                        FullScreenPromptScreen fullScreenPromptScreen = this.f111453b;
                        try {
                            phm.a aVar3 = (phm.a) ue0.e.j(fullScreenPromptScreen.m2()).a().get(g67.c.class);
                            aVar2 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        } catch (Exception unused) {
                            Object objC = g67.f.Companion.c();
                            Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.feature.full_screen_prompt.di.FullScreenPromptFeatureComponent");
                            aVar = (g67.a) objC;
                        }
                        if (aVar2 == null) {
                            throw new IllegalStateException("Api " + g67.c.class + " is not found");
                        }
                        aVar = (g67.a) aVar2.b();
                        g67.a aVar4 = aVar.f140882a;
                        g gVar = fullScreenPromptScreen.K;
                        gVar.getClass();
                        return new g67.b(aVar4, gVar);
                    case 1:
                        return (com.revolut.feature.full_screen_prompt.d) ((g67.b) this.f111453b.O.getValue()).f140885c.get();
                    default:
                        FullScreenPromptScreen fullScreenPromptScreen2 = this.f111453b;
                        return dli.f.a(fullScreenPromptScreen2, fullScreenPromptScreen2.R2(), zhm.u.c(fullScreenPromptScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new PromptContentDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: d67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FullScreenPromptScreen f111453b;

            {
                this.f111453b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                g67.a aVar;
                b60.a aVar2;
                switch (i3) {
                    case 0:
                        FullScreenPromptScreen fullScreenPromptScreen = this.f111453b;
                        try {
                            phm.a aVar3 = (phm.a) ue0.e.j(fullScreenPromptScreen.m2()).a().get(g67.c.class);
                            aVar2 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        } catch (Exception unused) {
                            Object objC = g67.f.Companion.c();
                            Intrinsics.i(objC, "null cannot be cast to non-null type com.revolut.feature.full_screen_prompt.di.FullScreenPromptFeatureComponent");
                            aVar = (g67.a) objC;
                        }
                        if (aVar2 == null) {
                            throw new IllegalStateException("Api " + g67.c.class + " is not found");
                        }
                        aVar = (g67.a) aVar2.b();
                        g67.a aVar4 = aVar.f140882a;
                        g gVar = fullScreenPromptScreen.K;
                        gVar.getClass();
                        return new g67.b(aVar4, gVar);
                    case 1:
                        return (com.revolut.feature.full_screen_prompt.d) ((g67.b) this.f111453b.O.getValue()).f140885c.get();
                    default:
                        FullScreenPromptScreen fullScreenPromptScreen2 = this.f111453b;
                        return dli.f.a(fullScreenPromptScreen2, fullScreenPromptScreen2.R2(), zhm.u.c(fullScreenPromptScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!this.K.getF74493p()) {
            return super.F2();
        }
        d dVarR2 = R2();
        b source = b.NAVIGATION;
        e eVar = (e) dVarR2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        eVar.C2(new c.a(source));
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        AnalyticsProduct f74500y = this.K.getF74500y();
        return f74500y == null ? AnalyticsProduct.Shared.RevolutUIKit.f : f74500y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g67.b) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, this.K.getZ().f53057b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptContentDelegate promptContentDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(promptContentDelegate.q()), new a(this, null), 3);
        r rVarThrottleFirst = promptContentDelegate.f53054h.f121375b.throttleFirst(ViewConfiguration.getDoubleTapTimeout(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleFirst, "throttleFirst(...)");
        ViewController.P2(this, rd0.e.b(rVarThrottleFirst), new d67.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptContentDelegate.i.f121375b), new d67.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptContentDelegate.r()), new d67.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptContentDelegate.p()), new j(this, (Continuation) null, 18), 3);
        pd.b.p(view, this.K.getZ().f53057b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.getF74498w();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
