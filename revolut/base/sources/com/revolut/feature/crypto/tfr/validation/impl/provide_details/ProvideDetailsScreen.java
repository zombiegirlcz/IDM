package com.revolut.feature.crypto.tfr.validation.impl.provide_details;

import android.view.View;
import cli.o;
import cli.q;
import cn5.c;
import cn5.d;
import cn5.h;
import cn5.i;
import cn5.j;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.crypto.tfr.validation.impl.R$layout;
import com.revolut.feature.crypto.tfr.validation.impl.provide_details.ProvideDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import um5.g;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/provide_details/ProvideDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcn5/h;", "Ldli/a;", "Lcn5/j;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProvideDetailsScreen extends ViewController<h> implements a {
    public final int K;
    public final PromptMarketingContentDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ProvideDetailsScreen(ProvideDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_crypto_action_required;
        this.L = new PromptMarketingContentDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cn5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProvideDetailsScreen f25350b;

            {
                this.f25350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ProvideDetailsScreen provideDetailsScreen = this.f25350b;
                        return dli.f.a(provideDetailsScreen, (i) provideDetailsScreen.O.getValue(), u.c(provideDetailsScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((um5.g) this.f25350b.N.getValue()).f281253c.get();
                }
            }
        });
        this.N = w.y0(new cf6.a(this, inputData, 12));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cn5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProvideDetailsScreen f25350b;

            {
                this.f25350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProvideDetailsScreen provideDetailsScreen = this.f25350b;
                        return dli.f.a(provideDetailsScreen, (i) provideDetailsScreen.O.getValue(), u.c(provideDetailsScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (i) ((um5.g) this.f25350b.N.getValue()).f281253c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new cn5.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
