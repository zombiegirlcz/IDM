package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow;

import a0.d;
import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow.PlanManagementFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qgk.i0;
import qgk.p0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_management/flow/PlanManagementFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanManagementFlow extends ViewController<q> implements f {
    public final boolean K = true;
    public final int L = R$layout.screen_transparent;
    public final Object M;
    public final Object N;
    public final Object O;

    public PlanManagementFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: omk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanManagementFlow f226858b;

            {
                this.f226858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        PlanManagementFlow planManagementFlow = this.f226858b;
                        return c.d(i2, 4, null, planManagementFlow, (b) planManagementFlow.O.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f226858b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p0(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                    default:
                        return (b) ((p0) this.f226858b.N.getValue()).f246189c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: omk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanManagementFlow f226858b;

            {
                this.f226858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanManagementFlow planManagementFlow = this.f226858b;
                        return c.d(i22, 4, null, planManagementFlow, (b) planManagementFlow.O.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f226858b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p0(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                    default:
                        return (b) ((p0) this.f226858b.N.getValue()).f246189c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: omk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanManagementFlow f226858b;

            {
                this.f226858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        PlanManagementFlow planManagementFlow = this.f226858b;
                        return c.d(i22, 4, null, planManagementFlow, (b) planManagementFlow.O.getValue());
                    case 1:
                        phm.a aVar = (phm.a) e.j(this.f226858b.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new p0(((i0) aVar2.b()).X);
                        }
                        throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                    default:
                        return (b) ((p0) this.f226858b.N.getValue()).f246189c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (omk.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
