package com.revolut.feature.apm.multibanco.impl.ui.pending.prompt;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.apm.multibanco.impl.ui.pending.prompt.PendingPaymentPromptScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import i72.j;
import i72.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3g.c;
import m82.e;
import m82.f;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pending/prompt/PendingPaymentPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm82/e;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentPromptScreen extends ViewController<q> implements a {
    public final Object L;
    public final Object M;
    public final Object O;
    public final int K = R$layout.screen_prompt;
    public final Object N = w.y0(new c(11));

    public PendingPaymentPromptScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: m82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentPromptScreen f203419b;

            {
                this.f203419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f203419b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pending.prompt.di.PendingPaymentPromptScreenInjector");
                        z zVar = new z();
                        int i2 = 5;
                        zVar.f159181a = e4m.b.b(new j(zVar, 1, i2));
                        zVar.f159182b = e4m.b.b(new j(zVar, 0, i2));
                        return zVar;
                    case 1:
                        return (f) ((z) this.f203419b.L.getValue()).f159182b.get();
                    default:
                        PendingPaymentPromptScreen pendingPaymentPromptScreen = this.f203419b;
                        return dli.f.a(pendingPaymentPromptScreen, (f) pendingPaymentPromptScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentPromptScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: m82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentPromptScreen f203419b;

            {
                this.f203419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f203419b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pending.prompt.di.PendingPaymentPromptScreenInjector");
                        z zVar = new z();
                        int i22 = 5;
                        zVar.f159181a = e4m.b.b(new j(zVar, 1, i22));
                        zVar.f159182b = e4m.b.b(new j(zVar, 0, i22));
                        return zVar;
                    case 1:
                        return (f) ((z) this.f203419b.L.getValue()).f159182b.get();
                    default:
                        PendingPaymentPromptScreen pendingPaymentPromptScreen = this.f203419b;
                        return dli.f.a(pendingPaymentPromptScreen, (f) pendingPaymentPromptScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentPromptScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: m82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentPromptScreen f203419b;

            {
                this.f203419b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f203419b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pending.prompt.di.PendingPaymentPromptScreenInjector");
                        z zVar = new z();
                        int i22 = 5;
                        zVar.f159181a = e4m.b.b(new j(zVar, 1, i22));
                        zVar.f159182b = e4m.b.b(new j(zVar, 0, i22));
                        return zVar;
                    case 1:
                        return (f) ((z) this.f203419b.L.getValue()).f159182b.get();
                    default:
                        PendingPaymentPromptScreen pendingPaymentPromptScreen = this.f203419b;
                        return dli.f.a(pendingPaymentPromptScreen, (f) pendingPaymentPromptScreen.M.getValue(), u.c((PromptMarketingContentDelegate) pendingPaymentPromptScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
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
        return (z) this.L.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new m82.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new m82.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
