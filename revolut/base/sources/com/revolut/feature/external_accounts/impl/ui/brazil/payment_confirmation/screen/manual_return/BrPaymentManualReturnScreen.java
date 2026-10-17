package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return.BrPaymentManualReturnScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jk6.c;
import jk6.d;
import jk6.e;
import jk6.f;
import jk6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xf6.d2;
import xf6.u2;
import xf6.w2;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/screen/manual_return/BrPaymentManualReturnScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljk6/e;", "Ldli/a;", "Ljk6/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrPaymentManualReturnScreen extends ViewController<e> implements a {
    public final d K;
    public final PromptMarketingContentDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public BrPaymentManualReturnScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        this.M = R$layout.screen_recycler_view;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentManualReturnScreen f175105b;

            {
                this.f175105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen = this.f175105b;
                        qji.b bVarU2 = brPaymentManualReturnScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return.di.BrPaymentManualReturnScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        w2 w2Var = u2Var.f305110b;
                        u2 u2Var2 = u2Var.f305111c;
                        d dVar = brPaymentManualReturnScreen.K;
                        dVar.getClass();
                        return new d2(w2Var, u2Var2, dVar);
                    case 1:
                        return (f) ((d2) this.f175105b.N.getValue()).f304823b.get();
                    default:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen2 = this.f175105b;
                        return dli.f.a(brPaymentManualReturnScreen2, (f) brPaymentManualReturnScreen2.O.getValue(), u.c(brPaymentManualReturnScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentManualReturnScreen f175105b;

            {
                this.f175105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen = this.f175105b;
                        qji.b bVarU2 = brPaymentManualReturnScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return.di.BrPaymentManualReturnScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        w2 w2Var = u2Var.f305110b;
                        u2 u2Var2 = u2Var.f305111c;
                        d dVar = brPaymentManualReturnScreen.K;
                        dVar.getClass();
                        return new d2(w2Var, u2Var2, dVar);
                    case 1:
                        return (f) ((d2) this.f175105b.N.getValue()).f304823b.get();
                    default:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen2 = this.f175105b;
                        return dli.f.a(brPaymentManualReturnScreen2, (f) brPaymentManualReturnScreen2.O.getValue(), u.c(brPaymentManualReturnScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentManualReturnScreen f175105b;

            {
                this.f175105b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen = this.f175105b;
                        qji.b bVarU2 = brPaymentManualReturnScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.manual_return.di.BrPaymentManualReturnScreenInjector");
                        u2 u2Var = (u2) bVarU2;
                        w2 w2Var = u2Var.f305110b;
                        u2 u2Var2 = u2Var.f305111c;
                        d dVar = brPaymentManualReturnScreen.K;
                        dVar.getClass();
                        return new d2(w2Var, u2Var2, dVar);
                    case 1:
                        return (f) ((d2) this.f175105b.N.getValue()).f304823b.get();
                    default:
                        BrPaymentManualReturnScreen brPaymentManualReturnScreen2 = this.f175105b;
                        return dli.f.a(brPaymentManualReturnScreen2, (f) brPaymentManualReturnScreen2.O.getValue(), u.c(brPaymentManualReturnScreen2.L), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new jk6.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
