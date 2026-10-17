package com.revolut.feature.onboarding.impl.revolut_card_ready.screen;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import y7k.h;
import yc9.c;
import yc9.f;
import yc9.g;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/revolut_card_ready/screen/RevolutCardReadyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyc9/c;", "Ldli/a;", "Lyc9/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutCardReadyScreen extends ViewController<c> implements a {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public RevolutCardReadyScreen(RevolutCardReadyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new h(19));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutCardReadyScreen f312568b;

            {
                this.f312568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RevolutCardReadyScreen revolutCardReadyScreen = this.f312568b;
                        return dli.f.a(revolutCardReadyScreen, (g) revolutCardReadyScreen.O.getValue(), u.c((PromptMarketingContentDelegate) revolutCardReadyScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (g) ((uc9.c) this.f312568b.N.getValue()).f279011g.get();
                }
            }
        });
        this.M = R$layout.screen_prompt;
        this.N = w.y0(new y1a.a(this, inputData, 18));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yc9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutCardReadyScreen f312568b;

            {
                this.f312568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RevolutCardReadyScreen revolutCardReadyScreen = this.f312568b;
                        return dli.f.a(revolutCardReadyScreen, (g) revolutCardReadyScreen.O.getValue(), u.c((PromptMarketingContentDelegate) revolutCardReadyScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (g) ((uc9.c) this.f312568b.N.getValue()).f279011g.get();
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
    public final e R1() {
        return (uc9.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r4 = this.K;
        com.revolut.kompot.navigable.a.g2(this, l.y(((PromptMarketingContentDelegate) r4.getValue()).f53079c, ((PromptMarketingContentDelegate) r4.getValue()).f.f121375b, "merge(...)"), null, new yc9.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
