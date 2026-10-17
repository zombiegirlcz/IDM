package com.revolut.feature.apm.wero.impl.ui.pay;

import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import gi2.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nh2.o;
import nh2.v;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/WeroPayFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgi2/c;", "Lyki/f;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WeroPayFlow extends ViewController<c> implements f {
    public final WeroPayFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public WeroPayFlow(WeroPayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPayFlow f144059b;

            {
                this.f144059b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WeroPayFlow weroPayFlow = this.f144059b;
                        phm.a aVar = (phm.a) ue0.e.j(weroPayFlow.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                        }
                        o oVar = ((o) ((nh2.h) aVar2.b())).f215326t;
                        WeroPayFlowContract$InputData weroPayFlowContract$InputData = weroPayFlow.K;
                        weroPayFlowContract$InputData.getClass();
                        return new v(oVar, weroPayFlowContract$InputData);
                    case 1:
                        return (b) ((v) this.f144059b.L.getValue()).f.get();
                    default:
                        WeroPayFlow weroPayFlow2 = this.f144059b;
                        return czi.c.d(0, 6, null, weroPayFlow2, (b) weroPayFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: gi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPayFlow f144059b;

            {
                this.f144059b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WeroPayFlow weroPayFlow = this.f144059b;
                        phm.a aVar = (phm.a) ue0.e.j(weroPayFlow.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                        }
                        o oVar = ((o) ((nh2.h) aVar2.b())).f215326t;
                        WeroPayFlowContract$InputData weroPayFlowContract$InputData = weroPayFlow.K;
                        weroPayFlowContract$InputData.getClass();
                        return new v(oVar, weroPayFlowContract$InputData);
                    case 1:
                        return (b) ((v) this.f144059b.L.getValue()).f.get();
                    default:
                        WeroPayFlow weroPayFlow2 = this.f144059b;
                        return czi.c.d(0, 6, null, weroPayFlow2, (b) weroPayFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: gi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeroPayFlow f144059b;

            {
                this.f144059b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WeroPayFlow weroPayFlow = this.f144059b;
                        phm.a aVar = (phm.a) ue0.e.j(weroPayFlow.m2()).a().get(nh2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nh2.h.class, " is not found"));
                        }
                        o oVar = ((o) ((nh2.h) aVar2.b())).f215326t;
                        WeroPayFlowContract$InputData weroPayFlowContract$InputData = weroPayFlow.K;
                        weroPayFlowContract$InputData.getClass();
                        return new v(oVar, weroPayFlowContract$InputData);
                    case 1:
                        return (b) ((v) this.f144059b.L.getValue()).f.get();
                    default:
                        WeroPayFlow weroPayFlow2 = this.f144059b;
                        return czi.c.d(0, 6, null, weroPayFlow2, (b) weroPayFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gi2.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
