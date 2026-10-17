package com.revolut.feature.revolut_x_promo.impl.ui.in_app_install;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.revolut_x_promo.impl.ui.in_app_install.RevolutXInAppInstallController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import v5c.c;
import v5c.e;
import v5c.g;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_x_promo/impl/ui/in_app_install/RevolutXInAppInstallController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lv5c/e;", "<init>", "()V", "feature_revolut_x_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutXInAppInstallController extends ViewController<q> implements a {
    public final Object K;
    public final Object L;
    public final PromptMarketingContentDelegate M = new PromptMarketingContentDelegate();
    public final int N = R$layout.screen_prompt;
    public final Object O;

    public RevolutXInAppInstallController() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: v5c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXInAppInstallController f286190b;

            {
                this.f286190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RevolutXInAppInstallController revolutXInAppInstallController = this.f286190b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutXInAppInstallController.m2()).a().get(m5c.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m5c.a(((m5c.c) aVar2.b()).k, revolutXInAppInstallController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m5c.c.class, " is not found"));
                    case 1:
                        return (g) ((m5c.a) this.f286190b.K.getValue()).f202881c.get();
                    default:
                        RevolutXInAppInstallController revolutXInAppInstallController2 = this.f286190b;
                        return dli.f.a(revolutXInAppInstallController2, (g) revolutXInAppInstallController2.L.getValue(), u.c(revolutXInAppInstallController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: v5c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXInAppInstallController f286190b;

            {
                this.f286190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RevolutXInAppInstallController revolutXInAppInstallController = this.f286190b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutXInAppInstallController.m2()).a().get(m5c.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m5c.a(((m5c.c) aVar2.b()).k, revolutXInAppInstallController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m5c.c.class, " is not found"));
                    case 1:
                        return (g) ((m5c.a) this.f286190b.K.getValue()).f202881c.get();
                    default:
                        RevolutXInAppInstallController revolutXInAppInstallController2 = this.f286190b;
                        return dli.f.a(revolutXInAppInstallController2, (g) revolutXInAppInstallController2.L.getValue(), u.c(revolutXInAppInstallController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: v5c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutXInAppInstallController f286190b;

            {
                this.f286190b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RevolutXInAppInstallController revolutXInAppInstallController = this.f286190b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutXInAppInstallController.m2()).a().get(m5c.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new m5c.a(((m5c.c) aVar2.b()).k, revolutXInAppInstallController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m5c.c.class, " is not found"));
                    case 1:
                        return (g) ((m5c.a) this.f286190b.K.getValue()).f202881c.get();
                    default:
                        RevolutXInAppInstallController revolutXInAppInstallController2 = this.f286190b;
                        return dli.f.a(revolutXInAppInstallController2, (g) revolutXInAppInstallController2.L.getValue(), u.c(revolutXInAppInstallController2.M), R$id.recyclerView, null, null, null, 56);
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
        return (m5c.a) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new v5c.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53081h.f121375b), new v44.e(this, null, 4), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
