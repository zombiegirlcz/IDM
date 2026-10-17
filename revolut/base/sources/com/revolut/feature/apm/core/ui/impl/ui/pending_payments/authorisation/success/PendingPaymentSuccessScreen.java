package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success.PendingPaymentSuccessScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e18.i;
import e32.c;
import e32.e;
import e32.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.s;
import p12.q0;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/authorisation/success/PendingPaymentSuccessScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le32/e;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentSuccessScreen extends ViewController<q> implements a {
    public final Object L;
    public final Object M;
    public final Object O;
    public final int K = R$layout.screen_prompt;
    public final Object N = w.y0(new i(4));

    public PendingPaymentSuccessScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: e32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentSuccessScreen f122187b;

            {
                this.f122187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f122187b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success.di.PendingPaymentSuccessScreenInjector");
                        q0 q0Var = new q0();
                        int i2 = 29;
                        q0Var.f231747a = e4m.b.b(new s(q0Var, 1, i2));
                        q0Var.f231748b = e4m.b.b(new s(q0Var, 0, i2));
                        return q0Var;
                    case 1:
                        return (f) ((q0) this.f122187b.L.getValue()).f231748b.get();
                    default:
                        PendingPaymentSuccessScreen pendingPaymentSuccessScreen = this.f122187b;
                        return dli.f.a(pendingPaymentSuccessScreen, (f) pendingPaymentSuccessScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentSuccessScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: e32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentSuccessScreen f122187b;

            {
                this.f122187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f122187b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success.di.PendingPaymentSuccessScreenInjector");
                        q0 q0Var = new q0();
                        int i22 = 29;
                        q0Var.f231747a = e4m.b.b(new s(q0Var, 1, i22));
                        q0Var.f231748b = e4m.b.b(new s(q0Var, 0, i22));
                        return q0Var;
                    case 1:
                        return (f) ((q0) this.f122187b.L.getValue()).f231748b.get();
                    default:
                        PendingPaymentSuccessScreen pendingPaymentSuccessScreen = this.f122187b;
                        return dli.f.a(pendingPaymentSuccessScreen, (f) pendingPaymentSuccessScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentSuccessScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: e32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentSuccessScreen f122187b;

            {
                this.f122187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f122187b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success.di.PendingPaymentSuccessScreenInjector");
                        q0 q0Var = new q0();
                        int i22 = 29;
                        q0Var.f231747a = e4m.b.b(new s(q0Var, 1, i22));
                        q0Var.f231748b = e4m.b.b(new s(q0Var, 0, i22));
                        return q0Var;
                    case 1:
                        return (f) ((q0) this.f122187b.L.getValue()).f231748b.get();
                    default:
                        PendingPaymentSuccessScreen pendingPaymentSuccessScreen = this.f122187b;
                        return dli.f.a(pendingPaymentSuccessScreen, (f) pendingPaymentSuccessScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentSuccessScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new e32.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
