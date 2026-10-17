package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.WaitlistErrorScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.WaitlistErrorScreenContract$InputData;
import dli.a;
import jok.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uok.c;
import uok.e;
import uok.f;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/error/WaitlistErrorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luok/e;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistErrorScreen extends ViewController<q> implements a {
    public final WaitlistErrorScreenContract$InputData K;
    public final PromptMarketingContentDelegate L;
    public final int M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public WaitlistErrorScreen(WaitlistErrorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        this.M = R$layout.screen_prompt;
        this.N = R$style.UiKitTheme_Night;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: uok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistErrorScreen f281662b;

            {
                this.f281662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WaitlistErrorScreen waitlistErrorScreen = this.f281662b;
                        return dli.f.a(waitlistErrorScreen, (f) waitlistErrorScreen.Q.getValue(), u.c(waitlistErrorScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        WaitlistErrorScreen waitlistErrorScreen2 = this.f281662b;
                        qji.b bVarU2 = waitlistErrorScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.di.WaitlistErrorScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistErrorScreenContract$InputData waitlistErrorScreenContract$InputData = waitlistErrorScreen2.K;
                        waitlistErrorScreenContract$InputData.getClass();
                        return new jok.b(cVar, dVar2, waitlistErrorScreenContract$InputData);
                    default:
                        return (f) ((jok.b) this.f281662b.P.getValue()).f177150b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: uok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistErrorScreen f281662b;

            {
                this.f281662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WaitlistErrorScreen waitlistErrorScreen = this.f281662b;
                        return dli.f.a(waitlistErrorScreen, (f) waitlistErrorScreen.Q.getValue(), u.c(waitlistErrorScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        WaitlistErrorScreen waitlistErrorScreen2 = this.f281662b;
                        qji.b bVarU2 = waitlistErrorScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.di.WaitlistErrorScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistErrorScreenContract$InputData waitlistErrorScreenContract$InputData = waitlistErrorScreen2.K;
                        waitlistErrorScreenContract$InputData.getClass();
                        return new jok.b(cVar, dVar2, waitlistErrorScreenContract$InputData);
                    default:
                        return (f) ((jok.b) this.f281662b.P.getValue()).f177150b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: uok.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistErrorScreen f281662b;

            {
                this.f281662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WaitlistErrorScreen waitlistErrorScreen = this.f281662b;
                        return dli.f.a(waitlistErrorScreen, (f) waitlistErrorScreen.Q.getValue(), u.c(waitlistErrorScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        WaitlistErrorScreen waitlistErrorScreen2 = this.f281662b;
                        qji.b bVarU2 = waitlistErrorScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.di.WaitlistErrorScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistErrorScreenContract$InputData waitlistErrorScreenContract$InputData = waitlistErrorScreen2.K;
                        waitlistErrorScreenContract$InputData.getClass();
                        return new jok.b(cVar, dVar2, waitlistErrorScreenContract$InputData);
                    default:
                        return (f) ((jok.b) this.f281662b.P.getValue()).f177150b.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new uok.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
