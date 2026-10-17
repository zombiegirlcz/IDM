package com.revolut.feature.onboarding.impl.onboarding.can_not_open_account;

import android.view.View;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.CanNotOpenAccountScreen;
import com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.CanNotOpenAccountScreenContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import ka9.b;
import ka9.d;
import ka9.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import ta9.o;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/can_not_open_account/CanNotOpenAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lka9/d;", "Ldli/a;", "Lka9/f;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CanNotOpenAccountScreen extends ViewController<d> implements a, m {
    public final CanNotOpenAccountScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final AnalyticsProduct.Retail Q;

    public CanNotOpenAccountScreen(CanNotOpenAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ka9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CanNotOpenAccountScreen f182445b;

            {
                this.f182445b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CanNotOpenAccountScreen canNotOpenAccountScreen = this.f182445b;
                        qji.b bVarU2 = canNotOpenAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.di.CanNotOpenAccountScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        CanNotOpenAccountScreenContract$InputData canNotOpenAccountScreenContract$InputData = canNotOpenAccountScreen.K;
                        canNotOpenAccountScreenContract$InputData.getClass();
                        return new ta9.b(mVar, oVar2, canNotOpenAccountScreenContract$InputData);
                    case 1:
                        return (e) ((ta9.b) this.f182445b.M.getValue()).f269172b.get();
                    default:
                        CanNotOpenAccountScreen canNotOpenAccountScreen2 = this.f182445b;
                        return dli.f.a(canNotOpenAccountScreen2, (e) canNotOpenAccountScreen2.N.getValue(), u.c((PromptMarketingContentDelegate) canNotOpenAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ka9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CanNotOpenAccountScreen f182445b;

            {
                this.f182445b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CanNotOpenAccountScreen canNotOpenAccountScreen = this.f182445b;
                        qji.b bVarU2 = canNotOpenAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.di.CanNotOpenAccountScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        CanNotOpenAccountScreenContract$InputData canNotOpenAccountScreenContract$InputData = canNotOpenAccountScreen.K;
                        canNotOpenAccountScreenContract$InputData.getClass();
                        return new ta9.b(mVar, oVar2, canNotOpenAccountScreenContract$InputData);
                    case 1:
                        return (e) ((ta9.b) this.f182445b.M.getValue()).f269172b.get();
                    default:
                        CanNotOpenAccountScreen canNotOpenAccountScreen2 = this.f182445b;
                        return dli.f.a(canNotOpenAccountScreen2, (e) canNotOpenAccountScreen2.N.getValue(), u.c((PromptMarketingContentDelegate) canNotOpenAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = w.y0(new b(0));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ka9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CanNotOpenAccountScreen f182445b;

            {
                this.f182445b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CanNotOpenAccountScreen canNotOpenAccountScreen = this.f182445b;
                        qji.b bVarU2 = canNotOpenAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.can_not_open_account.di.CanNotOpenAccountScreenInjector");
                        o oVar = (o) bVarU2;
                        ta9.m mVar = oVar.f269260b;
                        o oVar2 = oVar.f269261c;
                        CanNotOpenAccountScreenContract$InputData canNotOpenAccountScreenContract$InputData = canNotOpenAccountScreen.K;
                        canNotOpenAccountScreenContract$InputData.getClass();
                        return new ta9.b(mVar, oVar2, canNotOpenAccountScreenContract$InputData);
                    case 1:
                        return (e) ((ta9.b) this.f182445b.M.getValue()).f269172b.get();
                    default:
                        CanNotOpenAccountScreen canNotOpenAccountScreen2 = this.f182445b;
                        return dli.f.a(canNotOpenAccountScreen2, (e) canNotOpenAccountScreen2.N.getValue(), u.c((PromptMarketingContentDelegate) canNotOpenAccountScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        a.z0((f) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getC0() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ta9.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ka9.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r110 = this.O;
        vkm.d dVarB = rd0.e.b(((PromptMarketingContentDelegate) r110.getValue()).f.f121375b);
        ?? r112 = this.N;
        ViewController.P2(this, dVarB, new jl6.b(2, (ka9.e) r112.getValue(), ka9.e.class, "onPrimaryActionClick", "onPrimaryActionClick(Lcom/revolut/recyclerkit/delegates/ListItem;)V", 4, 9), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r110.getValue()).f53079c), new jl6.b(2, (ka9.e) r112.getValue(), ka9.e.class, "onCloseClick", "onCloseClick(Lcom/revolut/recyclerkit/delegates/ListItem;)V", 4, 10), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
