package com.revolut.feature.card_payment_method.impl.flows.link_card.flow;

import aii.q;
import c43.l;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkCardFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public LinkCardFlow(LinkCardFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: f43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkCardFlow f131997b;

            {
                this.f131997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LinkCardFlow linkCardFlow = this.f131997b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, linkCardFlow, (b) linkCardFlow.N.getValue());
                    default:
                        return (b) ((l) this.f131997b.M.getValue()).d.get();
                }
            }
        });
        this.M = w.y0(new eq8.b(this, inputData, 24));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkCardFlow f131997b;

            {
                this.f131997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LinkCardFlow linkCardFlow = this.f131997b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, linkCardFlow, (b) linkCardFlow.N.getValue());
                    default:
                        return (b) ((l) this.f131997b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f43.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
