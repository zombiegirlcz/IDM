package com.revolut.core.backend_flow.impl.ui.card_photo;

import at4.b;
import bb0.c;
import com.revolut.core.backend_flow.impl.ui.card_photo.BackendFlowCardPhotoFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/impl/ui/card_photo/BackendFlowCardPhotoFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbb0/c;", "Lyki/f;", "core_backend_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackendFlowCardPhotoFlow extends ViewController<c> implements f {
    public final BackendFlowCardPhotoFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public BackendFlowCardPhotoFlow(BackendFlowCardPhotoFlowContract$InputData inputData, BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        this.K = inputData;
        this.L = w.y0(new b(this, backendFlow, 26));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendFlowCardPhotoFlow f14123b;

            {
                this.f14123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((fa0.c) this.f14123b.L.getValue()).e.get();
                    default:
                        BackendFlowCardPhotoFlow backendFlowCardPhotoFlow = this.f14123b;
                        return czi.c.d(0, 6, null, backendFlowCardPhotoFlow, (b) backendFlowCardPhotoFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bb0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackendFlowCardPhotoFlow f14123b;

            {
                this.f14123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((fa0.c) this.f14123b.L.getValue()).e.get();
                    default:
                        BackendFlowCardPhotoFlow backendFlowCardPhotoFlow = this.f14123b;
                        return czi.c.d(0, 6, null, backendFlowCardPhotoFlow, (b) backendFlowCardPhotoFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fa0.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (fa0.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (bb0.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
