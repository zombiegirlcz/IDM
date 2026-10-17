package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qve.n;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/flow/TopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupFlow extends ViewController<Object> implements yki.f {
    public final uye.g K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TopupFlow(uye.g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: uye.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupFlow f284270b;

            {
                this.f284270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TopupFlow topupFlow = this.f284270b;
                        phm.a aVar = (phm.a) ue0.e.j(topupFlow.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        g gVar = topupFlow.K;
                        gVar.getClass();
                        return new qve.n(kVar, topupFlow, gVar);
                    case 1:
                        return (f) ((qve.n) this.f284270b.L.getValue()).o.get();
                    default:
                        TopupFlow topupFlow2 = this.f284270b;
                        return czi.c.d(0, 6, null, topupFlow2, (f) topupFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: uye.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupFlow f284270b;

            {
                this.f284270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TopupFlow topupFlow = this.f284270b;
                        phm.a aVar = (phm.a) ue0.e.j(topupFlow.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        g gVar = topupFlow.K;
                        gVar.getClass();
                        return new qve.n(kVar, topupFlow, gVar);
                    case 1:
                        return (f) ((qve.n) this.f284270b.L.getValue()).o.get();
                    default:
                        TopupFlow topupFlow2 = this.f284270b;
                        return czi.c.d(0, 6, null, topupFlow2, (f) topupFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: uye.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupFlow f284270b;

            {
                this.f284270b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TopupFlow topupFlow = this.f284270b;
                        phm.a aVar = (phm.a) ue0.e.j(topupFlow.m2()).a().get(qve.z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qve.z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        g gVar = topupFlow.K;
                        gVar.getClass();
                        return new qve.n(kVar, topupFlow, gVar);
                    case 1:
                        return (f) ((qve.n) this.f284270b.L.getValue()).o.get();
                    default:
                        TopupFlow topupFlow2 = this.f284270b;
                        return czi.c.d(0, 6, null, topupFlow2, (f) topupFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uye.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
