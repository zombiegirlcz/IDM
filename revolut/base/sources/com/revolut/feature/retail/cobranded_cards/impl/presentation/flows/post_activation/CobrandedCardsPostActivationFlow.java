package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation;

import b6b.o;
import b6b.x;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$InputData;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/post_activation/CobrandedCardsPostActivationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPostActivationFlow extends ViewController<Object> implements f {
    public final CobrandedCardsPostActivationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CobrandedCardsPostActivationFlow(CobrandedCardsPostActivationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: n6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPostActivationFlow f212755b;

            {
                this.f212755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow = this.f212755b;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPostActivationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = cobrandedCardsPostActivationFlow.K;
                        cobrandedCardsPostActivationFlowContract$InputData.getClass();
                        return new x(oVar, new agk.a(), cobrandedCardsPostActivationFlowContract$InputData);
                    case 1:
                        return (b) ((x) this.f212755b.M.getValue()).f12697l.get();
                    default:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow2 = this.f212755b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsPostActivationFlow2, (b) cobrandedCardsPostActivationFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: n6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPostActivationFlow f212755b;

            {
                this.f212755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow = this.f212755b;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPostActivationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = cobrandedCardsPostActivationFlow.K;
                        cobrandedCardsPostActivationFlowContract$InputData.getClass();
                        return new x(oVar, new agk.a(), cobrandedCardsPostActivationFlowContract$InputData);
                    case 1:
                        return (b) ((x) this.f212755b.M.getValue()).f12697l.get();
                    default:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow2 = this.f212755b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsPostActivationFlow2, (b) cobrandedCardsPostActivationFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: n6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPostActivationFlow f212755b;

            {
                this.f212755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow = this.f212755b;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPostActivationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = cobrandedCardsPostActivationFlow.K;
                        cobrandedCardsPostActivationFlowContract$InputData.getClass();
                        return new x(oVar, new agk.a(), cobrandedCardsPostActivationFlowContract$InputData);
                    case 1:
                        return (b) ((x) this.f212755b.M.getValue()).f12697l.get();
                    default:
                        CobrandedCardsPostActivationFlow cobrandedCardsPostActivationFlow2 = this.f212755b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsPostActivationFlow2, (b) cobrandedCardsPostActivationFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n6b.b) this.N.getValue();
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
