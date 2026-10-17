package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3;

import aii.r;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.WaitingListV3RootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.i7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list_v3/WaitingListV3RootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListV3RootFlow extends ViewController<r> implements f {
    public final WaitingListV3FlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public WaitingListV3RootFlow(WaitingListV3FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: oj4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3RootFlow f225731b;

            {
                this.f225731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        WaitingListV3RootFlow waitingListV3RootFlow = this.f225731b;
                        phm.a aVar = (phm.a) ue0.e.j(waitingListV3RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        WaitingListV3FlowContract$InputData waitingListV3FlowContract$InputData = waitingListV3RootFlow.K;
                        waitingListV3FlowContract$InputData.getClass();
                        return new i7(c1Var, waitingListV3FlowContract$InputData);
                    case 1:
                        return (a) ((i7) this.f225731b.M.getValue()).d.get();
                    default:
                        WaitingListV3RootFlow waitingListV3RootFlow2 = this.f225731b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, waitingListV3RootFlow2, (a) waitingListV3RootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: oj4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3RootFlow f225731b;

            {
                this.f225731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        WaitingListV3RootFlow waitingListV3RootFlow = this.f225731b;
                        phm.a aVar = (phm.a) ue0.e.j(waitingListV3RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        WaitingListV3FlowContract$InputData waitingListV3FlowContract$InputData = waitingListV3RootFlow.K;
                        waitingListV3FlowContract$InputData.getClass();
                        return new i7(c1Var, waitingListV3FlowContract$InputData);
                    case 1:
                        return (a) ((i7) this.f225731b.M.getValue()).d.get();
                    default:
                        WaitingListV3RootFlow waitingListV3RootFlow2 = this.f225731b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, waitingListV3RootFlow2, (a) waitingListV3RootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: oj4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListV3RootFlow f225731b;

            {
                this.f225731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        WaitingListV3RootFlow waitingListV3RootFlow = this.f225731b;
                        phm.a aVar = (phm.a) ue0.e.j(waitingListV3RootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        WaitingListV3FlowContract$InputData waitingListV3FlowContract$InputData = waitingListV3RootFlow.K;
                        waitingListV3FlowContract$InputData.getClass();
                        return new i7(c1Var, waitingListV3FlowContract$InputData);
                    case 1:
                        return (a) ((i7) this.f225731b.M.getValue()).d.get();
                    default:
                        WaitingListV3RootFlow waitingListV3RootFlow2 = this.f225731b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, waitingListV3RootFlow2, (a) waitingListV3RootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i7) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i7) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (oj4.a) this.N.getValue();
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
