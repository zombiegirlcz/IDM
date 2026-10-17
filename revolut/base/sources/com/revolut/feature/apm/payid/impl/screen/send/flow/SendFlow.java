package com.revolut.feature.apm.payid.impl.screen.send.flow;

import a0.d;
import aii.q;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlow;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import ea2.h;
import ea2.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/send/flow/SendFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SendFlow extends ViewController<q> implements f {
    public final SendFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public SendFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wa2.b) this.L.getValue();
    }

    public SendFlow(SendFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFlow f295793b;

            {
                this.f295793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((j) this.f295793b.M.getValue()).d.get();
                    case 1:
                        SendFlow sendFlow = this.f295793b;
                        phm.a aVar = (phm.a) ue0.e.j(sendFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f124079n;
                        SendFlowContract$InputData sendFlowContract$InputData = sendFlow.K;
                        sendFlowContract$InputData.getClass();
                        return new j(hVar, sendFlowContract$InputData);
                    default:
                        SendFlow sendFlow2 = this.f295793b;
                        return c.d(0, 6, null, sendFlow2, (b) sendFlow2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFlow f295793b;

            {
                this.f295793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((j) this.f295793b.M.getValue()).d.get();
                    case 1:
                        SendFlow sendFlow = this.f295793b;
                        phm.a aVar = (phm.a) ue0.e.j(sendFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f124079n;
                        SendFlowContract$InputData sendFlowContract$InputData = sendFlow.K;
                        sendFlowContract$InputData.getClass();
                        return new j(hVar, sendFlowContract$InputData);
                    default:
                        SendFlow sendFlow2 = this.f295793b;
                        return c.d(0, 6, null, sendFlow2, (b) sendFlow2.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wa2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendFlow f295793b;

            {
                this.f295793b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((j) this.f295793b.M.getValue()).d.get();
                    case 1:
                        SendFlow sendFlow = this.f295793b;
                        phm.a aVar = (phm.a) ue0.e.j(sendFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        h hVar = ((h) aVar2.b()).f124079n;
                        SendFlowContract$InputData sendFlowContract$InputData = sendFlow.K;
                        sendFlowContract$InputData.getClass();
                        return new j(hVar, sendFlowContract$InputData);
                    default:
                        SendFlow sendFlow2 = this.f295793b;
                        return c.d(0, 6, null, sendFlow2, (b) sendFlow2.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }

    public /* synthetic */ SendFlow(int i) {
        this(new SendFlowContract$InputData(false));
    }
}
