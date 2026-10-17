package com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal;

import a0.d;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qve.g;
import qve.k;
import qve.z;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/IdealTopUpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/ideal/a;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdealTopUpFlow extends ViewController<a> implements f {
    public final IdealTopUpFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public IdealTopUpFlow(IdealTopUpFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdealTopUpFlow f200967b;

            {
                this.f200967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IdealTopUpFlow idealTopUpFlow = this.f200967b;
                        phm.a aVar = (phm.a) e.j(idealTopUpFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        IdealTopUpFlowContract$InputData idealTopUpFlowContract$InputData = idealTopUpFlow.K;
                        idealTopUpFlowContract$InputData.getClass();
                        return new g(kVar, idealTopUpFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f200967b.M.getValue()).d.get();
                    default:
                        IdealTopUpFlow idealTopUpFlow2 = this.f200967b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, idealTopUpFlow2, (b) idealTopUpFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdealTopUpFlow f200967b;

            {
                this.f200967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IdealTopUpFlow idealTopUpFlow = this.f200967b;
                        phm.a aVar = (phm.a) e.j(idealTopUpFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        IdealTopUpFlowContract$InputData idealTopUpFlowContract$InputData = idealTopUpFlow.K;
                        idealTopUpFlowContract$InputData.getClass();
                        return new g(kVar, idealTopUpFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f200967b.M.getValue()).d.get();
                    default:
                        IdealTopUpFlow idealTopUpFlow2 = this.f200967b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, idealTopUpFlow2, (b) idealTopUpFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdealTopUpFlow f200967b;

            {
                this.f200967b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        IdealTopUpFlow idealTopUpFlow = this.f200967b;
                        phm.a aVar = (phm.a) e.j(idealTopUpFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        IdealTopUpFlowContract$InputData idealTopUpFlowContract$InputData = idealTopUpFlow.K;
                        idealTopUpFlowContract$InputData.getClass();
                        return new g(kVar, idealTopUpFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f200967b.M.getValue()).d.get();
                    default:
                        IdealTopUpFlow idealTopUpFlow2 = this.f200967b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, idealTopUpFlow2, (b) idealTopUpFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lze.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
