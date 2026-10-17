package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade;

import a0.d;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ove.m;
import ove.t;
import qji.b;
import ste.j;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_facade/FacadeCardTopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lste/j;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FacadeCardTopupFlow extends ViewController<j> implements f {
    public final FacadeCardTopupFlowDescriptor$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public FacadeCardTopupFlow(FacadeCardTopupFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FacadeCardTopupFlow f179797b;

            {
                this.f179797b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FacadeCardTopupFlow facadeCardTopupFlow = this.f179797b;
                        phm.a aVar = (phm.a) e.j(facadeCardTopupFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = facadeCardTopupFlow.K;
                        facadeCardTopupFlowDescriptor$InputData.getClass();
                        return new m(tVar, facadeCardTopupFlowDescriptor$InputData);
                    case 1:
                        return (b) ((m) this.f179797b.M.getValue()).f230095b.get();
                    default:
                        FacadeCardTopupFlow facadeCardTopupFlow2 = this.f179797b;
                        return c.d(R$id.screen_transparent_container, 4, null, facadeCardTopupFlow2, (b) facadeCardTopupFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FacadeCardTopupFlow f179797b;

            {
                this.f179797b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FacadeCardTopupFlow facadeCardTopupFlow = this.f179797b;
                        phm.a aVar = (phm.a) e.j(facadeCardTopupFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = facadeCardTopupFlow.K;
                        facadeCardTopupFlowDescriptor$InputData.getClass();
                        return new m(tVar, facadeCardTopupFlowDescriptor$InputData);
                    case 1:
                        return (b) ((m) this.f179797b.M.getValue()).f230095b.get();
                    default:
                        FacadeCardTopupFlow facadeCardTopupFlow2 = this.f179797b;
                        return c.d(R$id.screen_transparent_container, 4, null, facadeCardTopupFlow2, (b) facadeCardTopupFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FacadeCardTopupFlow f179797b;

            {
                this.f179797b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        FacadeCardTopupFlow facadeCardTopupFlow = this.f179797b;
                        phm.a aVar = (phm.a) e.j(facadeCardTopupFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = facadeCardTopupFlow.K;
                        facadeCardTopupFlowDescriptor$InputData.getClass();
                        return new m(tVar, facadeCardTopupFlowDescriptor$InputData);
                    case 1:
                        return (b) ((m) this.f179797b.M.getValue()).f230095b.get();
                    default:
                        FacadeCardTopupFlow facadeCardTopupFlow2 = this.f179797b;
                        return c.d(R$id.screen_transparent_container, 4, null, facadeCardTopupFlow2, (b) facadeCardTopupFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jze.b) this.N.getValue();
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
