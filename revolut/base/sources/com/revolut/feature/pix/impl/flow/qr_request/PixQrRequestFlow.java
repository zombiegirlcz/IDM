package com.revolut.feature.pix.impl.flow.qr_request;

import aii.q;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p8a.d0;
import p8a.o0;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_request/PixQrRequestFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrRequestFlow extends ViewController<q> implements f {
    public final PixQrRequestContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PixQrRequestFlow(PixQrRequestContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestFlow f312206b;

            {
                this.f312206b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PixQrRequestFlow pixQrRequestFlow = this.f312206b;
                        phm.a aVar = (phm.a) e.j(pixQrRequestFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixQrRequestContract$InputData pixQrRequestContract$InputData = pixQrRequestFlow.K;
                        pixQrRequestContract$InputData.getClass();
                        return new o0(d0Var, pixQrRequestContract$InputData);
                    case 1:
                        return (a) ((o0) this.f312206b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        PixQrRequestFlow pixQrRequestFlow2 = this.f312206b;
                        return czi.c.d(i2, 4, null, pixQrRequestFlow2, (a) pixQrRequestFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestFlow f312206b;

            {
                this.f312206b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PixQrRequestFlow pixQrRequestFlow = this.f312206b;
                        phm.a aVar = (phm.a) e.j(pixQrRequestFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixQrRequestContract$InputData pixQrRequestContract$InputData = pixQrRequestFlow.K;
                        pixQrRequestContract$InputData.getClass();
                        return new o0(d0Var, pixQrRequestContract$InputData);
                    case 1:
                        return (a) ((o0) this.f312206b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        PixQrRequestFlow pixQrRequestFlow2 = this.f312206b;
                        return czi.c.d(i22, 4, null, pixQrRequestFlow2, (a) pixQrRequestFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yba.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrRequestFlow f312206b;

            {
                this.f312206b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PixQrRequestFlow pixQrRequestFlow = this.f312206b;
                        phm.a aVar = (phm.a) e.j(pixQrRequestFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        PixQrRequestContract$InputData pixQrRequestContract$InputData = pixQrRequestFlow.K;
                        pixQrRequestContract$InputData.getClass();
                        return new o0(d0Var, pixQrRequestContract$InputData);
                    case 1:
                        return (a) ((o0) this.f312206b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        PixQrRequestFlow pixQrRequestFlow2 = this.f312206b;
                        return czi.c.d(i22, 4, null, pixQrRequestFlow2, (a) pixQrRequestFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yba.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
