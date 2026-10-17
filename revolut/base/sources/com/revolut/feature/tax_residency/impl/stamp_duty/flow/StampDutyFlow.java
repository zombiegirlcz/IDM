package com.revolut.feature.tax_residency.impl.stamp_duty.flow;

import com.revolut.feature.tax_residency.impl.stamp_duty.flow.StampDutyFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import ene.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import woe.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/stamp_duty/flow/StampDutyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lene/d;", "Lyki/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StampDutyFlow extends ViewController<d> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final Object N;

    public StampDutyFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: woe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StampDutyFlow f298933b;

            {
                this.f298933b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        StampDutyFlow stampDutyFlow = this.f298933b;
                        return czi.c.d(0, 6, null, stampDutyFlow, (b) stampDutyFlow.N.getValue());
                    case 1:
                        StampDutyFlow stampDutyFlow2 = this.f298933b;
                        phm.a aVar = (phm.a) e.j(stampDutyFlow2.m2()).a().get(voe.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", voe.c.class, " is not found"));
                        }
                        voe.c cVar = ((voe.c) aVar2.b()).e;
                        c cVar2 = stampDutyFlow2.K;
                        cVar2.getClass();
                        return new voe.d(cVar, cVar2);
                    default:
                        return (b) ((voe.d) this.f298933b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: woe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StampDutyFlow f298933b;

            {
                this.f298933b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        StampDutyFlow stampDutyFlow = this.f298933b;
                        return czi.c.d(0, 6, null, stampDutyFlow, (b) stampDutyFlow.N.getValue());
                    case 1:
                        StampDutyFlow stampDutyFlow2 = this.f298933b;
                        phm.a aVar = (phm.a) e.j(stampDutyFlow2.m2()).a().get(voe.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", voe.c.class, " is not found"));
                        }
                        voe.c cVar = ((voe.c) aVar2.b()).e;
                        c cVar2 = stampDutyFlow2.K;
                        cVar2.getClass();
                        return new voe.d(cVar, cVar2);
                    default:
                        return (b) ((voe.d) this.f298933b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: woe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StampDutyFlow f298933b;

            {
                this.f298933b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        StampDutyFlow stampDutyFlow = this.f298933b;
                        return czi.c.d(0, 6, null, stampDutyFlow, (b) stampDutyFlow.N.getValue());
                    case 1:
                        StampDutyFlow stampDutyFlow2 = this.f298933b;
                        phm.a aVar = (phm.a) e.j(stampDutyFlow2.m2()).a().get(voe.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", voe.c.class, " is not found"));
                        }
                        voe.c cVar = ((voe.c) aVar2.b()).e;
                        c cVar2 = stampDutyFlow2.K;
                        cVar2.getClass();
                        return new voe.d(cVar, cVar2);
                    default:
                        return (b) ((voe.d) this.f298933b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (voe.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (voe.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (woe.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
