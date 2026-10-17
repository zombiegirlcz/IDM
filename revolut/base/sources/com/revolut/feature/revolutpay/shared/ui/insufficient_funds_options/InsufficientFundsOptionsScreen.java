package com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wdc.e;
import wdc.f;
import wdc.h;
import wdc.j;
import xdc.b;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/insufficient_funds_options/InsufficientFundsOptionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwdc/e;", "Ldli/a;", "Lwdc/f;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsufficientFundsOptionsScreen extends ViewController<e> implements a {
    public final InsufficientFundsOptionsContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public InsufficientFundsOptionsScreen(InsufficientFundsOptionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wdc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsufficientFundsOptionsScreen f296548b;

            {
                this.f296548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen = this.f296548b;
                        qji.b bVarU2 = insufficientFundsOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.di.InsufficientFundsOptionsScreenInjector");
                        return (xdc.b) ((xdc.a) ((xdc.c) bVarU2).c().mo3808a(insufficientFundsOptionsScreen)).p0(insufficientFundsOptionsScreen.K).mo3783build();
                    case 1:
                        return ((xdc.b) this.f296548b.N.getValue()).a();
                    default:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen2 = this.f296548b;
                        return dli.f.a(insufficientFundsOptionsScreen2, (j) insufficientFundsOptionsScreen2.O.getValue(), u.c(insufficientFundsOptionsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wdc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsufficientFundsOptionsScreen f296548b;

            {
                this.f296548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen = this.f296548b;
                        qji.b bVarU2 = insufficientFundsOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.di.InsufficientFundsOptionsScreenInjector");
                        return (xdc.b) ((xdc.a) ((xdc.c) bVarU2).c().mo3808a(insufficientFundsOptionsScreen)).p0(insufficientFundsOptionsScreen.K).mo3783build();
                    case 1:
                        return ((xdc.b) this.f296548b.N.getValue()).a();
                    default:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen2 = this.f296548b;
                        return dli.f.a(insufficientFundsOptionsScreen2, (j) insufficientFundsOptionsScreen2.O.getValue(), u.c(insufficientFundsOptionsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: wdc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsufficientFundsOptionsScreen f296548b;

            {
                this.f296548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen = this.f296548b;
                        qji.b bVarU2 = insufficientFundsOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.di.InsufficientFundsOptionsScreenInjector");
                        return (xdc.b) ((xdc.a) ((xdc.c) bVarU2).c().mo3808a(insufficientFundsOptionsScreen)).p0(insufficientFundsOptionsScreen.K).mo3783build();
                    case 1:
                        return ((xdc.b) this.f296548b.N.getValue()).a();
                    default:
                        InsufficientFundsOptionsScreen insufficientFundsOptionsScreen2 = this.f296548b;
                        return dli.f.a(insufficientFundsOptionsScreen2, (j) insufficientFundsOptionsScreen2.O.getValue(), u.c(insufficientFundsOptionsScreen2.M), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new h(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
