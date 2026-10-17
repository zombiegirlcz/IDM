package com.revolut.feature.giro.impl.ui;

import aii.q;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.feature.giro.impl.ui.GiroFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/GiroFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiroFlow extends ViewController<q> implements f {
    public final GiroCreationFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public GiroFlow(GiroCreationFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: z67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiroFlow f319707b;

            {
                this.f319707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        GiroFlow giroFlow = this.f319707b;
                        return czi.c.d(0, 6, null, giroFlow, (b) giroFlow.N.getValue());
                    case 1:
                        GiroFlow giroFlow2 = this.f319707b;
                        phm.a aVar = (phm.a) e.j(giroFlow2.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        GiroCreationFlowInputData giroCreationFlowInputData = giroFlow2.K;
                        giroCreationFlowInputData.getClass();
                        return new y67.e(dVar, giroCreationFlowInputData);
                    default:
                        return (b) ((y67.e) this.f319707b.M.getValue()).f311221b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: z67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiroFlow f319707b;

            {
                this.f319707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        GiroFlow giroFlow = this.f319707b;
                        return czi.c.d(0, 6, null, giroFlow, (b) giroFlow.N.getValue());
                    case 1:
                        GiroFlow giroFlow2 = this.f319707b;
                        phm.a aVar = (phm.a) e.j(giroFlow2.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        GiroCreationFlowInputData giroCreationFlowInputData = giroFlow2.K;
                        giroCreationFlowInputData.getClass();
                        return new y67.e(dVar, giroCreationFlowInputData);
                    default:
                        return (b) ((y67.e) this.f319707b.M.getValue()).f311221b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: z67.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiroFlow f319707b;

            {
                this.f319707b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        GiroFlow giroFlow = this.f319707b;
                        return czi.c.d(0, 6, null, giroFlow, (b) giroFlow.N.getValue());
                    case 1:
                        GiroFlow giroFlow2 = this.f319707b;
                        phm.a aVar = (phm.a) e.j(giroFlow2.m2()).a().get(y67.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", y67.d.class, " is not found"));
                        }
                        y67.d dVar = ((y67.d) aVar2.b()).f;
                        GiroCreationFlowInputData giroCreationFlowInputData = giroFlow2.K;
                        giroCreationFlowInputData.getClass();
                        return new y67.e(dVar, giroCreationFlowInputData);
                    default:
                        return (b) ((y67.e) this.f319707b.M.getValue()).f311221b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y67.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y67.e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (z67.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
