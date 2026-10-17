package com.revolut.feature.topup_screen.impl.mcy;

import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlow;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g0f.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qve.m;
import qve.z;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/McyTopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg0f/d;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class McyTopupFlow extends ViewController<d> implements f {
    public final McyTopupFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public McyTopupFlow(McyTopupFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupFlow f139472b;

            {
                this.f139472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        McyTopupFlow mcyTopupFlow = this.f139472b;
                        phm.a aVar = (phm.a) ue0.e.j(mcyTopupFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        McyTopupFlowContract$InputData mcyTopupFlowContract$InputData = mcyTopupFlow.K;
                        mcyTopupFlowContract$InputData.getClass();
                        return new qve.m(kVar, mcyTopupFlow, mcyTopupFlowContract$InputData);
                    case 1:
                        return (b) ((qve.m) this.f139472b.M.getValue()).e.get();
                    default:
                        McyTopupFlow mcyTopupFlow2 = this.f139472b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mcyTopupFlow2, (b) mcyTopupFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupFlow f139472b;

            {
                this.f139472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        McyTopupFlow mcyTopupFlow = this.f139472b;
                        phm.a aVar = (phm.a) ue0.e.j(mcyTopupFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        McyTopupFlowContract$InputData mcyTopupFlowContract$InputData = mcyTopupFlow.K;
                        mcyTopupFlowContract$InputData.getClass();
                        return new qve.m(kVar, mcyTopupFlow, mcyTopupFlowContract$InputData);
                    case 1:
                        return (b) ((qve.m) this.f139472b.M.getValue()).e.get();
                    default:
                        McyTopupFlow mcyTopupFlow2 = this.f139472b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mcyTopupFlow2, (b) mcyTopupFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: g0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ McyTopupFlow f139472b;

            {
                this.f139472b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        McyTopupFlow mcyTopupFlow = this.f139472b;
                        phm.a aVar = (phm.a) ue0.e.j(mcyTopupFlow.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        qve.k kVar = ((qve.k) aVar2.b()).X;
                        McyTopupFlowContract$InputData mcyTopupFlowContract$InputData = mcyTopupFlow.K;
                        mcyTopupFlowContract$InputData.getClass();
                        return new qve.m(kVar, mcyTopupFlow, mcyTopupFlowContract$InputData);
                    case 1:
                        return (b) ((qve.m) this.f139472b.M.getValue()).e.get();
                    default:
                        McyTopupFlow mcyTopupFlow2 = this.f139472b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mcyTopupFlow2, (b) mcyTopupFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g0f.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
