package com.revolut.feature.tax_residency.impl.v2.ui.crs_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ine.c;
import ine.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ope.g;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/crs_flow/CrsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lope/g;", "Lyki/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CrsFlow extends ViewController<g> implements f {
    public final CrsFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CrsFlow(CrsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ope.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrsFlow f227587b;

            {
                this.f227587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CrsFlow crsFlow = this.f227587b;
                        phm.a aVar = (phm.a) ue0.e.j(crsFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        CrsFlowContract$InputData crsFlowContract$InputData = crsFlow.K;
                        crsFlowContract$InputData.getClass();
                        return new ine.c(oVar, crsFlowContract$InputData);
                    case 1:
                        return (b) ((ine.c) this.f227587b.L.getValue()).f162844b.get();
                    default:
                        CrsFlow crsFlow2 = this.f227587b;
                        return czi.c.d(0, 6, null, crsFlow2, (b) crsFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ope.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrsFlow f227587b;

            {
                this.f227587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CrsFlow crsFlow = this.f227587b;
                        phm.a aVar = (phm.a) ue0.e.j(crsFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        CrsFlowContract$InputData crsFlowContract$InputData = crsFlow.K;
                        crsFlowContract$InputData.getClass();
                        return new ine.c(oVar, crsFlowContract$InputData);
                    case 1:
                        return (b) ((ine.c) this.f227587b.L.getValue()).f162844b.get();
                    default:
                        CrsFlow crsFlow2 = this.f227587b;
                        return czi.c.d(0, 6, null, crsFlow2, (b) crsFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ope.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CrsFlow f227587b;

            {
                this.f227587b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CrsFlow crsFlow = this.f227587b;
                        phm.a aVar = (phm.a) ue0.e.j(crsFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f162885l;
                        CrsFlowContract$InputData crsFlowContract$InputData = crsFlow.K;
                        crsFlowContract$InputData.getClass();
                        return new ine.c(oVar, crsFlowContract$InputData);
                    case 1:
                        return (b) ((ine.c) this.f227587b.L.getValue()).f162844b.get();
                    default:
                        CrsFlow crsFlow2 = this.f227587b;
                        return czi.c.d(0, 6, null, crsFlow2, (b) crsFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ope.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
