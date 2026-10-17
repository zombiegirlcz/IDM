package com.revolut.sso.impl.ui.revolut_id;

import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlow;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mjl.m;
import mjl.n;
import mjl.q;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Luki/c;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutIDFlow extends ViewController<Object> implements uki.c {
    public final RevolutIDFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public RevolutIDFlow(RevolutIDFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: apl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDFlow f8195b;

            {
                this.f8195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RevolutIDFlow revolutIDFlow = this.f8195b;
                        return czi.c.a(R$id.container, (b) revolutIDFlow.N.getValue(), revolutIDFlow);
                    case 1:
                        RevolutIDFlow revolutIDFlow2 = this.f8195b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutIDFlow2.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        m mVar = ((m) ((q) aVar2.b())).f206109t;
                        RevolutIDFlowContract$InputData revolutIDFlowContract$InputData = revolutIDFlow2.K;
                        revolutIDFlowContract$InputData.getClass();
                        return new n(mVar, revolutIDFlowContract$InputData);
                    default:
                        return (b) ((n) this.f8195b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: apl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDFlow f8195b;

            {
                this.f8195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RevolutIDFlow revolutIDFlow = this.f8195b;
                        return czi.c.a(R$id.container, (b) revolutIDFlow.N.getValue(), revolutIDFlow);
                    case 1:
                        RevolutIDFlow revolutIDFlow2 = this.f8195b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutIDFlow2.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        m mVar = ((m) ((q) aVar2.b())).f206109t;
                        RevolutIDFlowContract$InputData revolutIDFlowContract$InputData = revolutIDFlow2.K;
                        revolutIDFlowContract$InputData.getClass();
                        return new n(mVar, revolutIDFlowContract$InputData);
                    default:
                        return (b) ((n) this.f8195b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: apl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutIDFlow f8195b;

            {
                this.f8195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RevolutIDFlow revolutIDFlow = this.f8195b;
                        return czi.c.a(R$id.container, (b) revolutIDFlow.N.getValue(), revolutIDFlow);
                    case 1:
                        RevolutIDFlow revolutIDFlow2 = this.f8195b;
                        phm.a aVar = (phm.a) ue0.e.j(revolutIDFlow2.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        m mVar = ((m) ((q) aVar2.b())).f206109t;
                        RevolutIDFlowContract$InputData revolutIDFlowContract$InputData = revolutIDFlow2.K;
                        revolutIDFlowContract$InputData.getClass();
                        return new n(mVar, revolutIDFlowContract$InputData);
                    default:
                        return (b) ((n) this.f8195b.M.getValue()).d.get();
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
    public final pki.b R2() {
        return (apl.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.L.getValue();
    }
}
