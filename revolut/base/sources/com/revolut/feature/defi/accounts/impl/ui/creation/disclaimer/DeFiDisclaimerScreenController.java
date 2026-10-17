package com.revolut.feature.defi.accounts.impl.ui.creation.disclaimer;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.defi.accounts.impl.ui.creation.disclaimer.DeFiDisclaimerScreenController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u16.a;
import u16.b;
import u16.c;
import u16.f;
import vkm.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/defi/accounts/impl/ui/creation/disclaimer/DeFiDisclaimerScreenController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu16/a;", "Ldli/a;", "Lu16/b;", "<init>", "()V", "feature_defi_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiDisclaimerScreenController extends ViewController<a> implements dli.a {
    public final Object K;
    public final Object L;
    public final int M = R$layout.screen_prompt;
    public final PromptMarketingContentDelegate N = new PromptMarketingContentDelegate();
    public final Object O;

    public DeFiDisclaimerScreenController() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: u16.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiDisclaimerScreenController f276354b;

            {
                this.f276354b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((n16.e) this.f276354b.L.getValue()).f211270a.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f276354b.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.e eVar = new n16.e();
                        eVar.f211270a = e4m.b.b(new m0m.a(11));
                        return eVar;
                    default:
                        DeFiDisclaimerScreenController deFiDisclaimerScreenController = this.f276354b;
                        return dli.f.a(deFiDisclaimerScreenController, (c) deFiDisclaimerScreenController.K.getValue(), u.c(deFiDisclaimerScreenController.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: u16.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiDisclaimerScreenController f276354b;

            {
                this.f276354b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((n16.e) this.f276354b.L.getValue()).f211270a.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f276354b.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.e eVar = new n16.e();
                        eVar.f211270a = e4m.b.b(new m0m.a(11));
                        return eVar;
                    default:
                        DeFiDisclaimerScreenController deFiDisclaimerScreenController = this.f276354b;
                        return dli.f.a(deFiDisclaimerScreenController, (c) deFiDisclaimerScreenController.K.getValue(), u.c(deFiDisclaimerScreenController.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: u16.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiDisclaimerScreenController f276354b;

            {
                this.f276354b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (c) ((n16.e) this.f276354b.L.getValue()).f211270a.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f276354b.m2()).a().get(n16.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n16.b.class, " is not found"));
                        }
                        n16.b bVar = ((n16.b) aVar2.b()).f211255n;
                        n16.e eVar = new n16.e();
                        eVar.f211270a = e4m.b.b(new m0m.a(11));
                        return eVar;
                    default:
                        DeFiDisclaimerScreenController deFiDisclaimerScreenController = this.f276354b;
                        return dli.f.a(deFiDisclaimerScreenController, (c) deFiDisclaimerScreenController.K.getValue(), u.c(deFiDisclaimerScreenController.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n16.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.N;
        d dVarB = rd0.e.b(promptMarketingContentDelegate.f53079c);
        ?? r102 = this.K;
        ViewController.P2(this, dVarB, new u16.e(2, 4, c.class, (c) r102.getValue(), "onCloseClicked", "onCloseClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new f(2, 4, c.class, (c) r102.getValue(), "onPrimaryActionClicked", "onPrimaryActionClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
