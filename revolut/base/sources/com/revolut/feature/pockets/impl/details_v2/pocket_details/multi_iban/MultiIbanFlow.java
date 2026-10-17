package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban;

import com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.MultiIbanFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lea.b;
import lea.c;
import lea.e;
import oda.h;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/MultiIbanFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llea/e;", "Lyki/f;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiIbanFlow extends ViewController<e> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultiIbanFlow(MultiIbanFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiIbanFlow f194519b;

            {
                this.f194519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MultiIbanFlow multiIbanFlow = this.f194519b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, multiIbanFlow, (c) multiIbanFlow.N.getValue());
                    default:
                        return (c) ((h) this.f194519b.M.getValue()).f224362b.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 0));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiIbanFlow f194519b;

            {
                this.f194519b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MultiIbanFlow multiIbanFlow = this.f194519b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, multiIbanFlow, (c) multiIbanFlow.N.getValue());
                    default:
                        return (c) ((h) this.f194519b.M.getValue()).f224362b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
