package com.revolut.feature.retail.cfd.impl.flows.position;

import aii.q;
import com.revolut.feature.retail.cfd.impl.flows.position.CfdPositionFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.p;
import m2b.v;
import qji.b;
import te0.w;
import y2b.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdPositionFlow extends ViewController<q> implements f {
    public final e K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CfdPositionFlow(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: y2b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionFlow f310610b;

            {
                this.f310610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CfdPositionFlow cfdPositionFlow = this.f310610b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdPositionFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        e eVar = cfdPositionFlow.K;
                        eVar.getClass();
                        return new p(vVar, cfdPositionFlow, eVar);
                    case 1:
                        return (b) ((p) this.f310610b.L.getValue()).f201882h.get();
                    default:
                        CfdPositionFlow cfdPositionFlow2 = this.f310610b;
                        return czi.c.d(0, 6, null, cfdPositionFlow2, (b) cfdPositionFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: y2b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionFlow f310610b;

            {
                this.f310610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CfdPositionFlow cfdPositionFlow = this.f310610b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdPositionFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        e eVar = cfdPositionFlow.K;
                        eVar.getClass();
                        return new p(vVar, cfdPositionFlow, eVar);
                    case 1:
                        return (b) ((p) this.f310610b.L.getValue()).f201882h.get();
                    default:
                        CfdPositionFlow cfdPositionFlow2 = this.f310610b;
                        return czi.c.d(0, 6, null, cfdPositionFlow2, (b) cfdPositionFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: y2b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdPositionFlow f310610b;

            {
                this.f310610b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CfdPositionFlow cfdPositionFlow = this.f310610b;
                        phm.a aVar = (phm.a) ue0.e.j(cfdPositionFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).C;
                        e eVar = cfdPositionFlow.K;
                        eVar.getClass();
                        return new p(vVar, cfdPositionFlow, eVar);
                    case 1:
                        return (b) ((p) this.f310610b.L.getValue()).f201882h.get();
                    default:
                        CfdPositionFlow cfdPositionFlow2 = this.f310610b;
                        return czi.c.d(0, 6, null, cfdPositionFlow2, (b) cfdPositionFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (y2b.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
