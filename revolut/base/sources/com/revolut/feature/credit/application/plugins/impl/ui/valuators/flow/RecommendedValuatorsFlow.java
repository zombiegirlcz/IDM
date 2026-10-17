package com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.flow.RecommendedValuatorsFlow;
import czi.c;
import dw3.c1;
import dw3.i5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/valuators/flow/RecommendedValuatorsFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginSubFlowController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecommendedValuatorsFlow extends PluginSubFlowController<q> {
    public final Object K;
    public final Object L;
    public final Object M;

    public RecommendedValuatorsFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: hj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedValuatorsFlow f152667b;

            {
                this.f152667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f152667b.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i5(((c1) ((dw3.e) aVar2.b())).m0);
                        }
                        throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                    case 1:
                        return (b) ((i5) this.f152667b.K.getValue()).f118980c.get();
                    default:
                        RecommendedValuatorsFlow recommendedValuatorsFlow = this.f152667b;
                        return c.d(0, 6, null, recommendedValuatorsFlow, (b) recommendedValuatorsFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: hj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedValuatorsFlow f152667b;

            {
                this.f152667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f152667b.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i5(((c1) ((dw3.e) aVar2.b())).m0);
                        }
                        throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                    case 1:
                        return (b) ((i5) this.f152667b.K.getValue()).f118980c.get();
                    default:
                        RecommendedValuatorsFlow recommendedValuatorsFlow = this.f152667b;
                        return c.d(0, 6, null, recommendedValuatorsFlow, (b) recommendedValuatorsFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: hj4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecommendedValuatorsFlow f152667b;

            {
                this.f152667b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f152667b.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i5(((c1) ((dw3.e) aVar2.b())).m0);
                        }
                        throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                    case 1:
                        return (b) ((i5) this.f152667b.K.getValue()).f118980c.get();
                    default:
                        RecommendedValuatorsFlow recommendedValuatorsFlow = this.f152667b;
                        return c.d(0, 6, null, recommendedValuatorsFlow, (b) recommendedValuatorsFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i5) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i5) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (hj4.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginSubFlowController, oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
