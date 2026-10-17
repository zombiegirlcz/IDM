package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import s3a.f;
import te0.w;
import xki.e;
import z3a.c;
import z3a.d;
import z3a.h;
import z3a.i;
import z3a.j;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/onboarding_contact_sync/permission/OnboardingContactSyncPermissionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lz3a/h;", "Ldli/a;", "Lz3a/j;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingContactSyncPermissionScreen extends ViewController<h> implements dli.a {
    public final OnboardingContactSyncPermissionScreenContract$InputData K;
    public final PromptMarketingContentDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;

    public OnboardingContactSyncPermissionScreen(OnboardingContactSyncPermissionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z3a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingContactSyncPermissionScreen f319230b;

            {
                this.f319230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen = this.f319230b;
                        return dli.f.a(onboardingContactSyncPermissionScreen, (i) onboardingContactSyncPermissionScreen.O.getValue(), u.c(onboardingContactSyncPermissionScreen.L), 0, null, null, null, 60);
                    case 1:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen2 = this.f319230b;
                        qji.b bVarU2 = onboardingContactSyncPermissionScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.di.OnboardingContactSyncPermissionScreenInjector");
                        s3a.d dVar = (s3a.d) bVarU2;
                        s3a.k kVar = dVar.f259502b;
                        s3a.d dVar2 = dVar.f259503c;
                        OnboardingContactSyncPermissionScreenContract$InputData onboardingContactSyncPermissionScreenContract$InputData = onboardingContactSyncPermissionScreen2.K;
                        onboardingContactSyncPermissionScreenContract$InputData.getClass();
                        return new s3a.f(kVar, dVar2, onboardingContactSyncPermissionScreenContract$InputData);
                    default:
                        return (i) ((s3a.f) this.f319230b.N.getValue()).f259509c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z3a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingContactSyncPermissionScreen f319230b;

            {
                this.f319230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen = this.f319230b;
                        return dli.f.a(onboardingContactSyncPermissionScreen, (i) onboardingContactSyncPermissionScreen.O.getValue(), u.c(onboardingContactSyncPermissionScreen.L), 0, null, null, null, 60);
                    case 1:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen2 = this.f319230b;
                        qji.b bVarU2 = onboardingContactSyncPermissionScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.di.OnboardingContactSyncPermissionScreenInjector");
                        s3a.d dVar = (s3a.d) bVarU2;
                        s3a.k kVar = dVar.f259502b;
                        s3a.d dVar2 = dVar.f259503c;
                        OnboardingContactSyncPermissionScreenContract$InputData onboardingContactSyncPermissionScreenContract$InputData = onboardingContactSyncPermissionScreen2.K;
                        onboardingContactSyncPermissionScreenContract$InputData.getClass();
                        return new s3a.f(kVar, dVar2, onboardingContactSyncPermissionScreenContract$InputData);
                    default:
                        return (i) ((s3a.f) this.f319230b.N.getValue()).f259509c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z3a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnboardingContactSyncPermissionScreen f319230b;

            {
                this.f319230b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen = this.f319230b;
                        return dli.f.a(onboardingContactSyncPermissionScreen, (i) onboardingContactSyncPermissionScreen.O.getValue(), u.c(onboardingContactSyncPermissionScreen.L), 0, null, null, null, 60);
                    case 1:
                        OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen2 = this.f319230b;
                        qji.b bVarU2 = onboardingContactSyncPermissionScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.di.OnboardingContactSyncPermissionScreenInjector");
                        s3a.d dVar = (s3a.d) bVarU2;
                        s3a.k kVar = dVar.f259502b;
                        s3a.d dVar2 = dVar.f259503c;
                        OnboardingContactSyncPermissionScreenContract$InputData onboardingContactSyncPermissionScreenContract$InputData = onboardingContactSyncPermissionScreen2.K;
                        onboardingContactSyncPermissionScreenContract$InputData.getClass();
                        return new s3a.f(kVar, dVar2, onboardingContactSyncPermissionScreenContract$InputData);
                    default:
                        return (i) ((s3a.f) this.f319230b.N.getValue()).f259509c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.contact_syncing_prompt_title, null, null, 14));
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new z3a.b(this, null), 3);
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
        return (dli.c) this.M.getValue();
    }
}
