package com.revolut.feature.onboarding.impl.onboarding.pep;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.pep.PoliticallyExposedPersonScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mb9.d;
import mb9.f;
import no.m;
import pki.b;
import ta9.v;
import te0.w;
import tki.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/pep/PoliticallyExposedPersonScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmb9/d;", "Ltki/c;", "Lmb9/f;", "Lno/m;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PoliticallyExposedPersonScreen extends ViewController<d> implements c, m {
    public final int K = R$layout.screen_recycler_view;
    public final Object L = w.y0(new m3g.c(16));
    public final k9 M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PoliticallyExposedPersonScreen() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.M = k9Var;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoliticallyExposedPersonScreen f204181b;

            {
                this.f204181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f204181b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.pep.di.PoliticallyExposedPersonScreenInjector");
                        v vVar = new v();
                        vVar.f269280a = e4m.b.b(new r96.a(12));
                        return vVar;
                    case 1:
                        return (e) ((v) this.f204181b.N.getValue()).f269280a.get();
                    default:
                        PoliticallyExposedPersonScreen politicallyExposedPersonScreen = this.f204181b;
                        return tki.g.a(politicallyExposedPersonScreen, (e) politicallyExposedPersonScreen.O.getValue(), u.c((PromptMarketingContentDelegate) politicallyExposedPersonScreen.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoliticallyExposedPersonScreen f204181b;

            {
                this.f204181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f204181b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.pep.di.PoliticallyExposedPersonScreenInjector");
                        v vVar = new v();
                        vVar.f269280a = e4m.b.b(new r96.a(12));
                        return vVar;
                    case 1:
                        return (e) ((v) this.f204181b.N.getValue()).f269280a.get();
                    default:
                        PoliticallyExposedPersonScreen politicallyExposedPersonScreen = this.f204181b;
                        return tki.g.a(politicallyExposedPersonScreen, (e) politicallyExposedPersonScreen.O.getValue(), u.c((PromptMarketingContentDelegate) politicallyExposedPersonScreen.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoliticallyExposedPersonScreen f204181b;

            {
                this.f204181b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f204181b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.pep.di.PoliticallyExposedPersonScreenInjector");
                        v vVar = new v();
                        vVar.f269280a = e4m.b.b(new r96.a(12));
                        return vVar;
                    case 1:
                        return (e) ((v) this.f204181b.N.getValue()).f269280a.get();
                    default:
                        PoliticallyExposedPersonScreen politicallyExposedPersonScreen = this.f204181b;
                        return tki.g.a(politicallyExposedPersonScreen, (e) politicallyExposedPersonScreen.O.getValue(), u.c((PromptMarketingContentDelegate) politicallyExposedPersonScreen.L.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((f) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (mb9.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new mb9.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new mb9.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
