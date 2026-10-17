package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv;

import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ove.h;
import ste.j;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/card_deferred_cvv/CardDeferredCvvFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lste/j;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeferredCvvFlow extends ViewController<j> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CardDeferredCvvFlow(FacadeCardTopupFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new hl6.b(this, inputData, 26));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeferredCvvFlow f157147b;

            {
                this.f157147b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((ove.h) this.f157147b.L.getValue()).f.get();
                    default:
                        CardDeferredCvvFlow cardDeferredCvvFlow = this.f157147b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cardDeferredCvvFlow, (b) cardDeferredCvvFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: hze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeferredCvvFlow f157147b;

            {
                this.f157147b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((ove.h) this.f157147b.L.getValue()).f.get();
                    default:
                        CardDeferredCvvFlow cardDeferredCvvFlow = this.f157147b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cardDeferredCvvFlow, (b) cardDeferredCvvFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hze.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
