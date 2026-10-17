package com.revolut.feature.apm.multibanco.impl.ui.enrollment.card;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.card.MultibancoExternalEnrollmentCardScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import i72.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import t72.c;
import t72.d;
import t72.j;
import t72.k;
import t72.m;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/enrollment/card/MultibancoExternalEnrollmentCardScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt72/j;", "Ldli/a;", "Lt72/k;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoExternalEnrollmentCardScreen extends ViewController<j> implements a {
    public final int K;
    public final Object L;
    public final Object M;
    public final PromptMarketingContentDelegate N;
    public final Object O;

    public MultibancoExternalEnrollmentCardScreen(MultibancoExternalEnrollmentCardScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_prompt;
        this.L = w.y0(new sw6.a(this, inputData, 7));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: t72.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoExternalEnrollmentCardScreen f268409b;

            {
                this.f268409b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (m) ((i72.n) this.f268409b.L.getValue()).f159144h.get();
                    default:
                        MultibancoExternalEnrollmentCardScreen multibancoExternalEnrollmentCardScreen = this.f268409b;
                        return dli.f.a(multibancoExternalEnrollmentCardScreen, (m) multibancoExternalEnrollmentCardScreen.M.getValue(), v.k(multibancoExternalEnrollmentCardScreen.N, new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new PromptMarketingContentDelegate();
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: t72.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoExternalEnrollmentCardScreen f268409b;

            {
                this.f268409b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (m) ((i72.n) this.f268409b.L.getValue()).f159144h.get();
                    default:
                        MultibancoExternalEnrollmentCardScreen multibancoExternalEnrollmentCardScreen = this.f268409b;
                        return dli.f.a(multibancoExternalEnrollmentCardScreen, (m) multibancoExternalEnrollmentCardScreen.M.getValue(), v.k(multibancoExternalEnrollmentCardScreen.N, new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (m) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new t72.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new d(this, null), 3);
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
