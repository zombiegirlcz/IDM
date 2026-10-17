package com.revolut.feature.onboarding.impl.onboarding.duplicate_account;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.duplicate_account.DuplicateAccountScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import ta9.j;
import te0.w;
import va9.c;
import va9.f;
import va9.g;
import va9.h;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/duplicate_account/DuplicateAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lva9/f;", "Ldli/a;", "Lva9/h;", "Lno/m;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DuplicateAccountScreen extends ViewController<f> implements a, m {
    public static final /* synthetic */ int R = 0;
    public final Object L;
    public final Object M;
    public final Object P;
    public final AnalyticsProduct.Retail Q;
    public final int K = R$layout.screen_recycler_view;
    public final Object N = w.y0(new v4a.a(10));
    public final Object O = w.y0(new v4a.a(11));

    public DuplicateAccountScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: va9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateAccountScreen f287175b;

            {
                this.f287175b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DuplicateAccountScreen duplicateAccountScreen = this.f287175b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = duplicateAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.duplicate_account.di.DuplicateAccountScreenInjector");
                        ta9.j jVar = new ta9.j();
                        jVar.f269231a = e4m.b.b(new r96.a(11));
                        return jVar;
                    case 1:
                        return (g) ((ta9.j) duplicateAccountScreen.L.getValue()).f269231a.get();
                    default:
                        DuplicateAccountScreen duplicateAccountScreen2 = this.f287175b;
                        return dli.f.a(duplicateAccountScreen2, (g) duplicateAccountScreen2.M.getValue(), v.k((PromptContentDelegate) duplicateAccountScreen2.N.getValue(), (PromptMarketingContentDelegate) duplicateAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: va9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateAccountScreen f287175b;

            {
                this.f287175b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DuplicateAccountScreen duplicateAccountScreen = this.f287175b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = duplicateAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.duplicate_account.di.DuplicateAccountScreenInjector");
                        ta9.j jVar = new ta9.j();
                        jVar.f269231a = e4m.b.b(new r96.a(11));
                        return jVar;
                    case 1:
                        return (g) ((ta9.j) duplicateAccountScreen.L.getValue()).f269231a.get();
                    default:
                        DuplicateAccountScreen duplicateAccountScreen2 = this.f287175b;
                        return dli.f.a(duplicateAccountScreen2, (g) duplicateAccountScreen2.M.getValue(), v.k((PromptContentDelegate) duplicateAccountScreen2.N.getValue(), (PromptMarketingContentDelegate) duplicateAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: va9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateAccountScreen f287175b;

            {
                this.f287175b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DuplicateAccountScreen duplicateAccountScreen = this.f287175b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = duplicateAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.duplicate_account.di.DuplicateAccountScreenInjector");
                        ta9.j jVar = new ta9.j();
                        jVar.f269231a = e4m.b.b(new r96.a(11));
                        return jVar;
                    case 1:
                        return (g) ((ta9.j) duplicateAccountScreen.L.getValue()).f269231a.get();
                    default:
                        DuplicateAccountScreen duplicateAccountScreen2 = this.f287175b;
                        return dli.f.a(duplicateAccountScreen2, (g) duplicateAccountScreen2.M.getValue(), v.k((PromptContentDelegate) duplicateAccountScreen2.N.getValue(), (PromptMarketingContentDelegate) duplicateAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((h) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new va9.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).d), new uwe.f(this, null, 15), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
