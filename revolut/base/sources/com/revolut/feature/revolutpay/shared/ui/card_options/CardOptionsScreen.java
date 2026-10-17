package com.revolut.feature.revolutpay.shared.ui.card_options;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.card_options.CardOptionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pdc.a;
import pdc.b;
import pdc.d;
import pdc.f;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/card_options/CardOptionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpdc/a;", "Ldli/a;", "Lpdc/b;", "<init>", "()V", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardOptionsScreen extends ViewController<a> implements dli.a {
    public final int K = R$layout.screen_prompt;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final Object M;
    public final Object N;
    public final Object O;

    public CardOptionsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pdc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOptionsScreen f235131b;

            {
                this.f235131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardOptionsScreen cardOptionsScreen = this.f235131b;
                        qji.b bVarU2 = cardOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.card_options.di.CardOptionsScreenInjector");
                        return (qdc.b) ((qdc.a) ((qdc.c) bVarU2).b().mo3808a(cardOptionsScreen)).mo3783build();
                    case 1:
                        return ((qdc.b) this.f235131b.M.getValue()).a();
                    default:
                        CardOptionsScreen cardOptionsScreen2 = this.f235131b;
                        return dli.f.a(cardOptionsScreen2, (f) cardOptionsScreen2.N.getValue(), u.c(cardOptionsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pdc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOptionsScreen f235131b;

            {
                this.f235131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardOptionsScreen cardOptionsScreen = this.f235131b;
                        qji.b bVarU2 = cardOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.card_options.di.CardOptionsScreenInjector");
                        return (qdc.b) ((qdc.a) ((qdc.c) bVarU2).b().mo3808a(cardOptionsScreen)).mo3783build();
                    case 1:
                        return ((qdc.b) this.f235131b.M.getValue()).a();
                    default:
                        CardOptionsScreen cardOptionsScreen2 = this.f235131b;
                        return dli.f.a(cardOptionsScreen2, (f) cardOptionsScreen2.N.getValue(), u.c(cardOptionsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pdc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOptionsScreen f235131b;

            {
                this.f235131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardOptionsScreen cardOptionsScreen = this.f235131b;
                        qji.b bVarU2 = cardOptionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.card_options.di.CardOptionsScreenInjector");
                        return (qdc.b) ((qdc.a) ((qdc.c) bVarU2).b().mo3808a(cardOptionsScreen)).mo3783build();
                    case 1:
                        return ((qdc.b) this.f235131b.M.getValue()).a();
                    default:
                        CardOptionsScreen cardOptionsScreen2 = this.f235131b;
                        return dli.f.a(cardOptionsScreen2, (f) cardOptionsScreen2.N.getValue(), u.c(cardOptionsScreen2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qdc.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
