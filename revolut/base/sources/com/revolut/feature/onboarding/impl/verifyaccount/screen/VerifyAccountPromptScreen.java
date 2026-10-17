package com.revolut.feature.onboarding.impl.verifyaccount.screen;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.onboarding.impl.verifyaccount.screen.VerifyAccountPromptScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3g.c;
import md9.d;
import md9.f;
import md9.g;
import no.m;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/verifyaccount/screen/VerifyAccountPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lmd9/g;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerifyAccountPromptScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ int T = 0;
    public final VerifyAccountPromptScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final AnalyticsProduct Q;
    public final Object R;
    public final Object S;

    public VerifyAccountPromptScreen(VerifyAccountPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new c(25));
        this.M = w.y0(new c(26));
        this.N = w.y0(new c(27));
        this.O = R$layout.screen_recycler_view;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: md9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptScreen f204532b;

            {
                this.f204532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VerifyAccountPromptScreen verifyAccountPromptScreen = this.f204532b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        return (f) ((jd9.c) verifyAccountPromptScreen.R.getValue()).f173042b.get();
                    case 1:
                        qji.b bVarU2 = verifyAccountPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.verifyaccount.screen.di.VerifyAccountPromptScreenInjector");
                        jd9.a aVar = ((jd9.b) bVarU2).f173039b;
                        verifyAccountPromptScreen.K.getClass();
                        jd9.c cVar = new jd9.c();
                        int i6 = 28;
                        cVar.f173041a = e4m.b.b(new iwb.b(aVar, cVar, i3, i6));
                        cVar.f173042b = e4m.b.b(new iwb.b(aVar, cVar, i5, i6));
                        return cVar;
                    default:
                        VerifyAccountPromptScreen verifyAccountPromptScreen2 = this.f204532b;
                        return dli.f.a(verifyAccountPromptScreen2, (f) verifyAccountPromptScreen2.P.getValue(), v.k((FullScreenStateDelegate) verifyAccountPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) verifyAccountPromptScreen2.M.getValue(), (PromptMarketingContentLoadingDelegate) verifyAccountPromptScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = inputData.f78597a;
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: md9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptScreen f204532b;

            {
                this.f204532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VerifyAccountPromptScreen verifyAccountPromptScreen = this.f204532b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        return (f) ((jd9.c) verifyAccountPromptScreen.R.getValue()).f173042b.get();
                    case 1:
                        qji.b bVarU2 = verifyAccountPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.verifyaccount.screen.di.VerifyAccountPromptScreenInjector");
                        jd9.a aVar = ((jd9.b) bVarU2).f173039b;
                        verifyAccountPromptScreen.K.getClass();
                        jd9.c cVar = new jd9.c();
                        int i6 = 28;
                        cVar.f173041a = e4m.b.b(new iwb.b(aVar, cVar, i3, i6));
                        cVar.f173042b = e4m.b.b(new iwb.b(aVar, cVar, i5, i6));
                        return cVar;
                    default:
                        VerifyAccountPromptScreen verifyAccountPromptScreen2 = this.f204532b;
                        return dli.f.a(verifyAccountPromptScreen2, (f) verifyAccountPromptScreen2.P.getValue(), v.k((FullScreenStateDelegate) verifyAccountPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) verifyAccountPromptScreen2.M.getValue(), (PromptMarketingContentLoadingDelegate) verifyAccountPromptScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: md9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyAccountPromptScreen f204532b;

            {
                this.f204532b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                VerifyAccountPromptScreen verifyAccountPromptScreen = this.f204532b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        return (f) ((jd9.c) verifyAccountPromptScreen.R.getValue()).f173042b.get();
                    case 1:
                        qji.b bVarU2 = verifyAccountPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.verifyaccount.screen.di.VerifyAccountPromptScreenInjector");
                        jd9.a aVar = ((jd9.b) bVarU2).f173039b;
                        verifyAccountPromptScreen.K.getClass();
                        jd9.c cVar = new jd9.c();
                        int i6 = 28;
                        cVar.f173041a = e4m.b.b(new iwb.b(aVar, cVar, i32, i6));
                        cVar.f173042b = e4m.b.b(new iwb.b(aVar, cVar, i5, i6));
                        return cVar;
                    default:
                        VerifyAccountPromptScreen verifyAccountPromptScreen2 = this.f204532b;
                        return dli.f.a(verifyAccountPromptScreen2, (f) verifyAccountPromptScreen2.P.getValue(), v.k((FullScreenStateDelegate) verifyAccountPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) verifyAccountPromptScreen2.M.getValue(), (PromptMarketingContentLoadingDelegate) verifyAccountPromptScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jd9.c) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.L.getValue()).f52371h.f121375b), null, new md9.b(this, null), 3);
        ?? r56 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new md9.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
