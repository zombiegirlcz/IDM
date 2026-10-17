package com.revolut.feature.card_screen.impl.prompts.merchant_redirect;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import t83.d;
import te0.w;
import w5b.b6;
import w83.c;
import w83.f;
import w83.h;
import w83.i;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/prompts/merchant_redirect/MerchantRedirectPromptController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw83/h;", "Ldli/a;", "Lw83/i;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MerchantRedirectPromptController extends ViewController<h> implements a {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public MerchantRedirectPromptController(MerchantRedirectPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new w83.a(this, inputData, 0));
        this.L = R$layout.screen_prompt;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: w83.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantRedirectPromptController f295581b;

            {
                this.f295581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (f) ((t83.d) this.f295581b.K.getValue()).f268823c.get();
                    default:
                        MerchantRedirectPromptController merchantRedirectPromptController = this.f295581b;
                        return dli.f.a(merchantRedirectPromptController, (f) merchantRedirectPromptController.M.getValue(), u.c((PromptMarketingContentDelegate) merchantRedirectPromptController.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new b6(20));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: w83.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantRedirectPromptController f295581b;

            {
                this.f295581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (f) ((t83.d) this.f295581b.K.getValue()).f268823c.get();
                    default:
                        MerchantRedirectPromptController merchantRedirectPromptController = this.f295581b;
                        return dli.f.a(merchantRedirectPromptController, (f) merchantRedirectPromptController.M.getValue(), u.c((PromptMarketingContentDelegate) merchantRedirectPromptController.N.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new w83.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
