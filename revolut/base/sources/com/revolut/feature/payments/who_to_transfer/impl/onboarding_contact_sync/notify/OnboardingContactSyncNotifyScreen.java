package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wrj.m;
import x3a.c;
import x3a.d;
import x3a.h;
import x3a.i;
import x3a.k;
import x3a.l;
import xki.e;
import yi5.b;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/notify/OnboardingContactSyncNotifyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx3a/h;", "Ldli/a;", "Lx3a/i;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingContactSyncNotifyScreen extends ViewController<h> implements a {
    public final PromptMarketingContentDelegate K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnboardingContactSyncNotifyScreen(OnboardingContactSyncNotifyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new PromptMarketingContentDelegate();
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: x3a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingContactSyncNotifyScreen f302716b;

            {
                this.f302716b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingContactSyncNotifyScreen onboardingContactSyncNotifyScreen = this.f302716b;
                        return dli.f.a(onboardingContactSyncNotifyScreen, (l) onboardingContactSyncNotifyScreen.N.getValue(), u.c(onboardingContactSyncNotifyScreen.K), 0, null, null, null, 60);
                    default:
                        return (l) ((s3a.e) this.f302716b.M.getValue()).f259506c.get();
                }
            }
        });
        this.M = w.y0(new m(this, inputData, 17));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: x3a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingContactSyncNotifyScreen f302716b;

            {
                this.f302716b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingContactSyncNotifyScreen onboardingContactSyncNotifyScreen = this.f302716b;
                        return dli.f.a(onboardingContactSyncNotifyScreen, (l) onboardingContactSyncNotifyScreen.N.getValue(), u.c(onboardingContactSyncNotifyScreen.K), 0, null, null, null, 60);
                    default:
                        return (l) ((s3a.e) this.f302716b.M.getValue()).f259506c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        l lVar = (l) this.N.getValue();
        if (!lVar.f302722p.f80112c) {
            return super.F2();
        }
        lVar.l2(new k(lVar, null, 1), new b(26));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s3a.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.K;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new x3a.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_prompt;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
