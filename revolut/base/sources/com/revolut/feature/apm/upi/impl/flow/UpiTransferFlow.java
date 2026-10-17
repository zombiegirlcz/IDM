package com.revolut.feature.apm.upi.impl.flow;

import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlow;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d2k.f;
import if2.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/f;", "Lyki/f;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiTransferFlow extends ViewController<f> implements yki.f {
    public final UpiTransferFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public UpiTransferFlow(UpiTransferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f194629b;

            {
                this.f194629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f194629b;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new n(fVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f194629b.M.getValue()).f.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        UpiTransferFlow upiTransferFlow2 = this.f194629b;
                        return czi.c.d(i2, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f194629b;

            {
                this.f194629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f194629b;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new n(fVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f194629b.M.getValue()).f.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        UpiTransferFlow upiTransferFlow2 = this.f194629b;
                        return czi.c.d(i22, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lf2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f194629b;

            {
                this.f194629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f194629b;
                        phm.a aVar = (phm.a) ue0.e.j(upiTransferFlow.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", if2.f.class, " is not found"));
                        }
                        if2.f fVar = ((if2.f) aVar2.b()).f160865w;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new n(fVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f194629b.M.getValue()).f.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        UpiTransferFlow upiTransferFlow2 = this.f194629b;
                        return czi.c.d(i22, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (lf2.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
