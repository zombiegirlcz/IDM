package com.revolut.feature.paynow.impl.flow;

import a0.d;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlow;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g7a.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t6a.c;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/paynow/impl/flow/PayNowQrFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg7a/b;", "Lyki/f;", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayNowQrFlow extends ViewController<b> implements f {
    public final PayNowQrFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PayNowQrFlow(PayNowQrFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrFlow f319714b;

            {
                this.f319714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PayNowQrFlow payNowQrFlow = this.f319714b;
                        phm.a aVar = (phm.a) e.j(payNowQrFlow.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrFlowContract$InputData payNowQrFlowContract$InputData = payNowQrFlow.K;
                        payNowQrFlowContract$InputData.getClass();
                        return new c(bVar, payNowQrFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f319714b.M.getValue()).f268279b.get();
                    default:
                        PayNowQrFlow payNowQrFlow2 = this.f319714b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payNowQrFlow2, (b) payNowQrFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrFlow f319714b;

            {
                this.f319714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PayNowQrFlow payNowQrFlow = this.f319714b;
                        phm.a aVar = (phm.a) e.j(payNowQrFlow.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrFlowContract$InputData payNowQrFlowContract$InputData = payNowQrFlow.K;
                        payNowQrFlowContract$InputData.getClass();
                        return new c(bVar, payNowQrFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f319714b.M.getValue()).f268279b.get();
                    default:
                        PayNowQrFlow payNowQrFlow2 = this.f319714b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payNowQrFlow2, (b) payNowQrFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z6a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayNowQrFlow f319714b;

            {
                this.f319714b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PayNowQrFlow payNowQrFlow = this.f319714b;
                        phm.a aVar = (phm.a) e.j(payNowQrFlow.m2()).a().get(t6a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t6a.b.class, " is not found"));
                        }
                        t6a.b bVar = ((t6a.b) aVar2.b()).e;
                        PayNowQrFlowContract$InputData payNowQrFlowContract$InputData = payNowQrFlow.K;
                        payNowQrFlowContract$InputData.getClass();
                        return new c(bVar, payNowQrFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f319714b.M.getValue()).f268279b.get();
                    default:
                        PayNowQrFlow payNowQrFlow2 = this.f319714b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payNowQrFlow2, (b) payNowQrFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (z6a.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
