package com.revolut.feature.tax_residency.impl.flows.single_tin;

import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/single_tin/SingleTinCollectionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/tax_residency/impl/flows/single_tin/a;", "Lyki/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SingleTinCollectionFlow extends ViewController<a> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public SingleTinCollectionFlow(SingleTinCollectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: doe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleTinCollectionFlow f116557b;

            {
                this.f116557b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SingleTinCollectionFlow singleTinCollectionFlow = this.f116557b;
                        return czi.c.d(0, 6, null, singleTinCollectionFlow, (b) singleTinCollectionFlow.M.getValue());
                    default:
                        return (b) ((i) this.f116557b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new dgg.b(this, inputData, 8));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: doe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleTinCollectionFlow f116557b;

            {
                this.f116557b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SingleTinCollectionFlow singleTinCollectionFlow = this.f116557b;
                        return czi.c.d(0, 6, null, singleTinCollectionFlow, (b) singleTinCollectionFlow.M.getValue());
                    default:
                        return (b) ((i) this.f116557b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (doe.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
