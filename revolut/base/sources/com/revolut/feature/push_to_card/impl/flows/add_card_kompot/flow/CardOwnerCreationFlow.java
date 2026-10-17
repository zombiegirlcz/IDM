package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow;

import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/flow/CardOwnerCreationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldqa/b;", "Lyki/f;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardOwnerCreationFlow extends ViewController<dqa.b> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public CardOwnerCreationFlow(CardOwnerCreationInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: wqa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerCreationFlow f299426b;

            {
                this.f299426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardOwnerCreationFlow cardOwnerCreationFlow = this.f299426b;
                        return czi.c.d(0, 6, null, cardOwnerCreationFlow, (b) cardOwnerCreationFlow.M.getValue());
                    default:
                        return (b) ((jqa.b) this.f299426b.L.getValue()).f.get();
                }
            }
        });
        this.L = w.y0(new w83.a(this, inputData, 25));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wqa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerCreationFlow f299426b;

            {
                this.f299426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardOwnerCreationFlow cardOwnerCreationFlow = this.f299426b;
                        return czi.c.d(0, 6, null, cardOwnerCreationFlow, (b) cardOwnerCreationFlow.M.getValue());
                    default:
                        return (b) ((jqa.b) this.f299426b.L.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jqa.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (jqa.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wqa.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
