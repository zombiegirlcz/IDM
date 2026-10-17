package com.revolut.feature.apm.payto.impl.screen.topup.status;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.apm.payto.impl.screen.topup.status.PayToTopupStatusScreen;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nb2.f;
import pki.b;
import te0.w;
import yb2.c;
import yb2.e;
import yb2.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/topup/status/PayToTopupStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyb2/j;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayToTopupStatusScreen extends ViewController<q> implements a {
    public final e K;
    public final int L;
    public final Object M;
    public final Object N;
    public final PromptMarketingContentDelegate O;
    public final Object P;

    public PayToTopupStatusScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupStatusScreen f312160b;

            {
                this.f312160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayToTopupStatusScreen payToTopupStatusScreen = this.f312160b;
                switch (i2) {
                    case 0:
                        return (f) ((nb2.f) payToTopupStatusScreen.N.getValue()).f213977b.get();
                    case 1:
                        qji.b bVarU2 = payToTopupStatusScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.status.di.PayToTopupStatusScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        nb2.b bVar = dVar.f213971b;
                        nb2.d dVar2 = dVar.f213972c;
                        e eVar = payToTopupStatusScreen.K;
                        eVar.getClass();
                        return new nb2.f(bVar, dVar2, eVar);
                    default:
                        PayToTopupStatusScreen payToTopupStatusScreen2 = this.f312160b;
                        return dli.f.a(payToTopupStatusScreen2, (f) payToTopupStatusScreen2.M.getValue(), v.k(payToTopupStatusScreen2.O, new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupStatusScreen f312160b;

            {
                this.f312160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayToTopupStatusScreen payToTopupStatusScreen = this.f312160b;
                switch (i22) {
                    case 0:
                        return (f) ((nb2.f) payToTopupStatusScreen.N.getValue()).f213977b.get();
                    case 1:
                        qji.b bVarU2 = payToTopupStatusScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.status.di.PayToTopupStatusScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        nb2.b bVar = dVar.f213971b;
                        nb2.d dVar2 = dVar.f213972c;
                        e eVar = payToTopupStatusScreen.K;
                        eVar.getClass();
                        return new nb2.f(bVar, dVar2, eVar);
                    default:
                        PayToTopupStatusScreen payToTopupStatusScreen2 = this.f312160b;
                        return dli.f.a(payToTopupStatusScreen2, (f) payToTopupStatusScreen2.M.getValue(), v.k(payToTopupStatusScreen2.O, new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new PromptMarketingContentDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupStatusScreen f312160b;

            {
                this.f312160b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayToTopupStatusScreen payToTopupStatusScreen = this.f312160b;
                switch (i22) {
                    case 0:
                        return (f) ((nb2.f) payToTopupStatusScreen.N.getValue()).f213977b.get();
                    case 1:
                        qji.b bVarU2 = payToTopupStatusScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.status.di.PayToTopupStatusScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        nb2.b bVar = dVar.f213971b;
                        nb2.d dVar2 = dVar.f213972c;
                        e eVar = payToTopupStatusScreen.K;
                        eVar.getClass();
                        return new nb2.f(bVar, dVar2, eVar);
                    default:
                        PayToTopupStatusScreen payToTopupStatusScreen2 = this.f312160b;
                        return dli.f.a(payToTopupStatusScreen2, (f) payToTopupStatusScreen2.M.getValue(), v.k(payToTopupStatusScreen2.O, new PromptMarketingContentLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (yb2.f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new yb2.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
