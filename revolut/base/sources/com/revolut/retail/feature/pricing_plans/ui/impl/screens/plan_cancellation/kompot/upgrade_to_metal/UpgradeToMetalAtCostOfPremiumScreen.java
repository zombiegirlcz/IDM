package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal.UpgradeToMetalAtCostOfPremiumScreen;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import plk.c;
import plk.d;
import plk.e;
import plk.f;
import plk.g;
import qgk.b2;
import qgk.i0;
import qgk.p1;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/upgrade_to_metal/UpgradeToMetalAtCostOfPremiumScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lplk/e;", "Ldli/a;", "Lplk/g;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpgradeToMetalAtCostOfPremiumScreen extends ViewController<e> implements a {
    public final int K = R$layout.screen_prompt;
    public final boolean L = true;
    public final PromptMarketingContentDelegate M = new PromptMarketingContentDelegate();
    public final Object N;
    public final Object O;
    public final Object P;

    public UpgradeToMetalAtCostOfPremiumScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: plk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToMetalAtCostOfPremiumScreen f237436b;

            {
                this.f237436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UpgradeToMetalAtCostOfPremiumScreen upgradeToMetalAtCostOfPremiumScreen = this.f237436b;
                        return dli.f.a(upgradeToMetalAtCostOfPremiumScreen, (f) upgradeToMetalAtCostOfPremiumScreen.P.getValue(), u.c(upgradeToMetalAtCostOfPremiumScreen.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f237436b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        b2 b2Var = new b2();
                        int i2 = 6;
                        b2Var.f245892a = e4m.b.b(new p1(i0Var, b2Var, 1, i2));
                        b2Var.f245893b = e4m.b.b(new p1(i0Var, b2Var, 0, i2));
                        return b2Var;
                    default:
                        return (f) ((b2) this.f237436b.O.getValue()).f245893b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: plk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToMetalAtCostOfPremiumScreen f237436b;

            {
                this.f237436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UpgradeToMetalAtCostOfPremiumScreen upgradeToMetalAtCostOfPremiumScreen = this.f237436b;
                        return dli.f.a(upgradeToMetalAtCostOfPremiumScreen, (f) upgradeToMetalAtCostOfPremiumScreen.P.getValue(), u.c(upgradeToMetalAtCostOfPremiumScreen.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f237436b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        b2 b2Var = new b2();
                        int i22 = 6;
                        b2Var.f245892a = e4m.b.b(new p1(i0Var, b2Var, 1, i22));
                        b2Var.f245893b = e4m.b.b(new p1(i0Var, b2Var, 0, i22));
                        return b2Var;
                    default:
                        return (f) ((b2) this.f237436b.O.getValue()).f245893b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: plk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToMetalAtCostOfPremiumScreen f237436b;

            {
                this.f237436b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        UpgradeToMetalAtCostOfPremiumScreen upgradeToMetalAtCostOfPremiumScreen = this.f237436b;
                        return dli.f.a(upgradeToMetalAtCostOfPremiumScreen, (f) upgradeToMetalAtCostOfPremiumScreen.P.getValue(), u.c(upgradeToMetalAtCostOfPremiumScreen.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f237436b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        b2 b2Var = new b2();
                        int i22 = 6;
                        b2Var.f245892a = e4m.b.b(new p1(i0Var, b2Var, 1, i22));
                        b2Var.f245893b = e4m.b.b(new p1(i0Var, b2Var, 0, i22));
                        return b2Var;
                    default:
                        return (f) ((b2) this.f237436b.O.getValue()).f245893b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new plk.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
