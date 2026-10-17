package com.revolut.feature.businessinstaller.impl.ui.in_app_install;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.businessinstaller.impl.ui.in_app_install.BusinessInstallerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ot2.b;
import pt2.c;
import pt2.e;
import pt2.f;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/businessinstaller/impl/ui/in_app_install/BusinessInstallerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpt2/e;", "<init>", "()V", "feature_business_installer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BusinessInstallerController extends ViewController<q> implements a {
    public final Object K;
    public final Object L;
    public final PromptMarketingContentDelegate M = new PromptMarketingContentDelegate();
    public final int N = R$layout.screen_prompt;
    public final Object O;

    public BusinessInstallerController() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: pt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessInstallerController f239594b;

            {
                this.f239594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BusinessInstallerController businessInstallerController = this.f239594b;
                        phm.a aVar = (phm.a) ue0.e.j(businessInstallerController.m2()).a().get(ot2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ot2.b(((ot2.a) aVar2.b()).f229427b, businessInstallerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ot2.a.class, " is not found"));
                    case 1:
                        return (f) ((ot2.b) this.f239594b.K.getValue()).f229431c.get();
                    default:
                        BusinessInstallerController businessInstallerController2 = this.f239594b;
                        return dli.f.a(businessInstallerController2, (f) businessInstallerController2.L.getValue(), u.c(businessInstallerController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: pt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessInstallerController f239594b;

            {
                this.f239594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BusinessInstallerController businessInstallerController = this.f239594b;
                        phm.a aVar = (phm.a) ue0.e.j(businessInstallerController.m2()).a().get(ot2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ot2.b(((ot2.a) aVar2.b()).f229427b, businessInstallerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ot2.a.class, " is not found"));
                    case 1:
                        return (f) ((ot2.b) this.f239594b.K.getValue()).f229431c.get();
                    default:
                        BusinessInstallerController businessInstallerController2 = this.f239594b;
                        return dli.f.a(businessInstallerController2, (f) businessInstallerController2.L.getValue(), u.c(businessInstallerController2.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pt2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BusinessInstallerController f239594b;

            {
                this.f239594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BusinessInstallerController businessInstallerController = this.f239594b;
                        phm.a aVar = (phm.a) ue0.e.j(businessInstallerController.m2()).a().get(ot2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ot2.b(((ot2.a) aVar2.b()).f229427b, businessInstallerController);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ot2.a.class, " is not found"));
                    case 1:
                        return (f) ((ot2.b) this.f239594b.K.getValue()).f229431c.get();
                    default:
                        BusinessInstallerController businessInstallerController2 = this.f239594b;
                        return dli.f.a(businessInstallerController2, (f) businessInstallerController2.L.getValue(), u.c(businessInstallerController2.M), R$id.recyclerView, null, null, null, 56);
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
        return (b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new pt2.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
