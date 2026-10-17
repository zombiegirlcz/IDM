package com.revolut.feature.apm.services.ideal.impl.ui.flow;

import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.ui.flow.IDealFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import fd2.j;
import jd2.c;
import jd2.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/flow/IDealFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljd2/f;", "Lyki/f;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IDealFlow extends ViewController<f> implements yki.f {
    public final Object K;
    public final Object L;
    public final Object M;

    public IDealFlow(IDealFlowDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: jd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealFlow f172946b;

            {
                this.f172946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IDealFlow iDealFlow = this.f172946b;
                        return czi.c.d(0, 6, null, iDealFlow, (c) iDealFlow.M.getValue());
                    default:
                        return (c) ((j) ((kd2.a) this.f172946b.L.getValue())).d.get();
                }
            }
        });
        this.L = w.y0(new j68.a(this, inputData, 15));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: jd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealFlow f172946b;

            {
                this.f172946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IDealFlow iDealFlow = this.f172946b;
                        return czi.c.d(0, 6, null, iDealFlow, (c) iDealFlow.M.getValue());
                    default:
                        return (c) ((j) ((kd2.a) this.f172946b.L.getValue())).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kd2.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (kd2.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
