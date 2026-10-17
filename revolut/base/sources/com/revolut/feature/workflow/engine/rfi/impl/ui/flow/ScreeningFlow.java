package com.revolut.feature.workflow.engine.rfi.impl.ui.flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlow;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import nuh.d;
import qji.b;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/flow/ScreeningFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyth/a;", "Luki/c;", "Lno/m;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreeningFlow extends ViewController<yth.a> implements c, m {
    public final ScreeningFlowContract$InputData K;
    public final AnalyticsProduct.Shared L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ScreeningFlow(ScreeningFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = iuh.a.f168605a;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreeningFlow f219304b;

            {
                this.f219304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ScreeningFlow screeningFlow = this.f219304b;
                        phm.a aVar = (phm.a) ue0.e.j(screeningFlow.m2()).a().get(euh.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", euh.d.class, " is not found"));
                        }
                        euh.d dVar = ((euh.d) aVar2.b()).f129577h;
                        ScreeningFlowContract$InputData screeningFlowContract$InputData = screeningFlow.K;
                        screeningFlowContract$InputData.getClass();
                        return new euh.e(dVar, screeningFlowContract$InputData);
                    case 1:
                        return (d) ((euh.e) this.f219304b.M.getValue()).f129585g.get();
                    default:
                        ScreeningFlow screeningFlow2 = this.f219304b;
                        return czi.c.a(R$id.container, (d) screeningFlow2.N.getValue(), screeningFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreeningFlow f219304b;

            {
                this.f219304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ScreeningFlow screeningFlow = this.f219304b;
                        phm.a aVar = (phm.a) ue0.e.j(screeningFlow.m2()).a().get(euh.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", euh.d.class, " is not found"));
                        }
                        euh.d dVar = ((euh.d) aVar2.b()).f129577h;
                        ScreeningFlowContract$InputData screeningFlowContract$InputData = screeningFlow.K;
                        screeningFlowContract$InputData.getClass();
                        return new euh.e(dVar, screeningFlowContract$InputData);
                    case 1:
                        return (d) ((euh.e) this.f219304b.M.getValue()).f129585g.get();
                    default:
                        ScreeningFlow screeningFlow2 = this.f219304b;
                        return czi.c.a(R$id.container, (d) screeningFlow2.N.getValue(), screeningFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nuh.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreeningFlow f219304b;

            {
                this.f219304b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ScreeningFlow screeningFlow = this.f219304b;
                        phm.a aVar = (phm.a) ue0.e.j(screeningFlow.m2()).a().get(euh.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", euh.d.class, " is not found"));
                        }
                        euh.d dVar = ((euh.d) aVar2.b()).f129577h;
                        ScreeningFlowContract$InputData screeningFlowContract$InputData = screeningFlow.K;
                        screeningFlowContract$InputData.getClass();
                        return new euh.e(dVar, screeningFlowContract$InputData);
                    case 1:
                        return (d) ((euh.e) this.f219304b.M.getValue()).f129585g.get();
                    default:
                        ScreeningFlow screeningFlow2 = this.f219304b;
                        return czi.c.a(R$id.container, (d) screeningFlow2.N.getValue(), screeningFlow2);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (euh.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (euh.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
