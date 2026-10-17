package com.revolut.feature.apm.aani.impl.ui;

import aii.q;
import com.revolut.feature.apm.aani.impl.ui.AaniFlow;
import com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pl1.j;
import pl1.m;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/ui/AaniFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AaniFlow extends ViewController<q> implements f {
    public final AaniFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public AaniFlow(AaniFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ul1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniFlow f280846b;

            {
                this.f280846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AaniFlow aaniFlow = this.f280846b;
                        phm.a aVar = (phm.a) ue0.e.j(aaniFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).e;
                        AaniFlowContract$InputData aaniFlowContract$InputData = aaniFlow.K;
                        aaniFlowContract$InputData.getClass();
                        return new j(mVar, aaniFlowContract$InputData);
                    case 1:
                        return (c) ((j) this.f280846b.L.getValue()).d.get();
                    default:
                        AaniFlow aaniFlow2 = this.f280846b;
                        return czi.c.d(0, 6, null, aaniFlow2, (c) aaniFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ul1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniFlow f280846b;

            {
                this.f280846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AaniFlow aaniFlow = this.f280846b;
                        phm.a aVar = (phm.a) ue0.e.j(aaniFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).e;
                        AaniFlowContract$InputData aaniFlowContract$InputData = aaniFlow.K;
                        aaniFlowContract$InputData.getClass();
                        return new j(mVar, aaniFlowContract$InputData);
                    case 1:
                        return (c) ((j) this.f280846b.L.getValue()).d.get();
                    default:
                        AaniFlow aaniFlow2 = this.f280846b;
                        return czi.c.d(0, 6, null, aaniFlow2, (c) aaniFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ul1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AaniFlow f280846b;

            {
                this.f280846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AaniFlow aaniFlow = this.f280846b;
                        phm.a aVar = (phm.a) ue0.e.j(aaniFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).e;
                        AaniFlowContract$InputData aaniFlowContract$InputData = aaniFlow.K;
                        aaniFlowContract$InputData.getClass();
                        return new j(mVar, aaniFlowContract$InputData);
                    case 1:
                        return (c) ((j) this.f280846b.L.getValue()).d.get();
                    default:
                        AaniFlow aaniFlow2 = this.f280846b;
                        return czi.c.d(0, 6, null, aaniFlow2, (c) aaniFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (ul1.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
