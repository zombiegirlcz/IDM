package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlow;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import hwe.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qve.x;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhwe/k;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupMethodsFlow extends ViewController<k> implements f {
    public final TopupMethodsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TopupMethodsFlow(TopupMethodsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsFlow f156131b;

            {
                this.f156131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TopupMethodsFlow topupMethodsFlow = this.f156131b;
                        phm.a aVar = (phm.a) ue0.e.j(topupMethodsFlow.m2()).a().get(qve.w.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.w.class, " is not found"));
                        }
                        qve.w wVar = ((qve.w) aVar2.b()).f249678t;
                        TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = topupMethodsFlow.K;
                        topupMethodsFlowContract$InputData.getClass();
                        return new qve.x(wVar, topupMethodsFlowContract$InputData);
                    case 1:
                        return (b) ((qve.x) this.f156131b.L.getValue()).f.get();
                    default:
                        TopupMethodsFlow topupMethodsFlow2 = this.f156131b;
                        return czi.c.d(0, 6, null, topupMethodsFlow2, (b) topupMethodsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsFlow f156131b;

            {
                this.f156131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TopupMethodsFlow topupMethodsFlow = this.f156131b;
                        phm.a aVar = (phm.a) ue0.e.j(topupMethodsFlow.m2()).a().get(qve.w.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.w.class, " is not found"));
                        }
                        qve.w wVar = ((qve.w) aVar2.b()).f249678t;
                        TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = topupMethodsFlow.K;
                        topupMethodsFlowContract$InputData.getClass();
                        return new qve.x(wVar, topupMethodsFlowContract$InputData);
                    case 1:
                        return (b) ((qve.x) this.f156131b.L.getValue()).f.get();
                    default:
                        TopupMethodsFlow topupMethodsFlow2 = this.f156131b;
                        return czi.c.d(0, 6, null, topupMethodsFlow2, (b) topupMethodsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: hwe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupMethodsFlow f156131b;

            {
                this.f156131b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TopupMethodsFlow topupMethodsFlow = this.f156131b;
                        phm.a aVar = (phm.a) ue0.e.j(topupMethodsFlow.m2()).a().get(qve.w.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.w.class, " is not found"));
                        }
                        qve.w wVar = ((qve.w) aVar2.b()).f249678t;
                        TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = topupMethodsFlow.K;
                        topupMethodsFlowContract$InputData.getClass();
                        return new qve.x(wVar, topupMethodsFlowContract$InputData);
                    case 1:
                        return (b) ((qve.x) this.f156131b.L.getValue()).f.get();
                    default:
                        TopupMethodsFlow topupMethodsFlow2 = this.f156131b;
                        return czi.c.d(0, 6, null, topupMethodsFlow2, (b) topupMethodsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (x) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hwe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
