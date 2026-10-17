package com.revolut.feature.in_app_calls.flow;

import aii.q;
import be7.k;
import com.revolut.feature.in_app_calls.flow.InAppCallsFlow;
import com.revolut.feature.in_app_calls.flow.InAppCallsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vc.s;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/in_app_calls/flow/InAppCallsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_in_app_calls_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InAppCallsFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public InAppCallsFlow(InAppCallsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ge7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppCallsFlow f143264b;

            {
                this.f143264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InAppCallsFlow inAppCallsFlow = this.f143264b;
                        return czi.c.d(0, 6, null, inAppCallsFlow, (b) inAppCallsFlow.M.getValue());
                    default:
                        ee7.b bVar = (ee7.b) this.f143264b.L.getValue();
                        InAppCallsFlowContract$InputData inAppCallsFlowContract$InputData = bVar.f125122a;
                        ee7.a aVar = bVar.f125123b;
                        k kVar = (k) aVar.f125115h.get();
                        y80.a aVarR = aVar.f125111a.r();
                        s.j(aVarR);
                        return new com.revolut.feature.in_app_calls.flow.c(inAppCallsFlowContract$InputData, kVar, aVarR);
                }
            }
        });
        this.L = w.y0(new fx5.a(this, inputData, 25));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ge7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InAppCallsFlow f143264b;

            {
                this.f143264b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InAppCallsFlow inAppCallsFlow = this.f143264b;
                        return czi.c.d(0, 6, null, inAppCallsFlow, (b) inAppCallsFlow.M.getValue());
                    default:
                        ee7.b bVar = (ee7.b) this.f143264b.L.getValue();
                        InAppCallsFlowContract$InputData inAppCallsFlowContract$InputData = bVar.f125122a;
                        ee7.a aVar = bVar.f125123b;
                        k kVar = (k) aVar.f125115h.get();
                        y80.a aVarR = aVar.f125111a.r();
                        s.j(aVarR);
                        return new com.revolut.feature.in_app_calls.flow.c(inAppCallsFlowContract$InputData, kVar, aVarR);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ee7.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ee7.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ge7.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
