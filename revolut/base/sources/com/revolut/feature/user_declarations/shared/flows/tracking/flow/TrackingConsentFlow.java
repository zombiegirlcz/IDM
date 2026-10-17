package com.revolut.feature.user_declarations.shared.flows.tracking.flow;

import com.revolut.feature.user_declarations.shared.flows.tracking.flow.TrackingConsentFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nbl.d;
import nng.o;
import nng.p;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/tracking/flow/TrackingConsentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnbl/d;", "Lyki/f;", "Lkji/f;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingConsentFlow extends ViewController<d> implements f, kji.f {
    public final TrackingConsentInputData.Workflow K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TrackingConsentFlow(TrackingConsentInputData.Workflow inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentFlow f256006b;

            {
                this.f256006b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TrackingConsentFlow trackingConsentFlow = this.f256006b;
                        phm.a aVar = (phm.a) e.j(trackingConsentFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        TrackingConsentInputData.Workflow workflow = trackingConsentFlow.K;
                        workflow.getClass();
                        return new o(pVar, workflow);
                    case 1:
                        return (b) ((o) this.f256006b.L.getValue()).f217672b.get();
                    default:
                        TrackingConsentFlow trackingConsentFlow2 = this.f256006b;
                        return czi.c.d(0, 6, null, trackingConsentFlow2, (b) trackingConsentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: rog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentFlow f256006b;

            {
                this.f256006b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TrackingConsentFlow trackingConsentFlow = this.f256006b;
                        phm.a aVar = (phm.a) e.j(trackingConsentFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        TrackingConsentInputData.Workflow workflow = trackingConsentFlow.K;
                        workflow.getClass();
                        return new o(pVar, workflow);
                    case 1:
                        return (b) ((o) this.f256006b.L.getValue()).f217672b.get();
                    default:
                        TrackingConsentFlow trackingConsentFlow2 = this.f256006b;
                        return czi.c.d(0, 6, null, trackingConsentFlow2, (b) trackingConsentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: rog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingConsentFlow f256006b;

            {
                this.f256006b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TrackingConsentFlow trackingConsentFlow = this.f256006b;
                        phm.a aVar = (phm.a) e.j(trackingConsentFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        TrackingConsentInputData.Workflow workflow = trackingConsentFlow.K;
                        workflow.getClass();
                        return new o(pVar, workflow);
                    case 1:
                        return (b) ((o) this.f256006b.L.getValue()).f217672b.get();
                    default:
                        TrackingConsentFlow trackingConsentFlow2 = this.f256006b;
                        return czi.c.d(0, 6, null, trackingConsentFlow2, (b) trackingConsentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (rog.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
