package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.termination;

import a0.d;
import b6b.o;
import b6b.y;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.termination.CobrandedCardsTerminationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import s5b.c;
import s5b.i;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/termination/CobrandedCardsTerminationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls5b/i;", "Lyki/f;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsTerminationFlow extends ViewController<i> implements f {
    public final CobrandedCardsTerminationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CobrandedCardsTerminationFlow(CobrandedCardsTerminationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: p6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTerminationFlow f233246b;

            {
                this.f233246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow = this.f233246b;
                        phm.a aVar = (phm.a) e.j(cobrandedCardsTerminationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsTerminationFlowContract$InputData cobrandedCardsTerminationFlowContract$InputData = cobrandedCardsTerminationFlow.K;
                        cobrandedCardsTerminationFlowContract$InputData.getClass();
                        return new y(oVar, cobrandedCardsTerminationFlowContract$InputData);
                    case 1:
                        return (c) ((y) this.f233246b.M.getValue()).d.get();
                    default:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow2 = this.f233246b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsTerminationFlow2, (c) cobrandedCardsTerminationFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: p6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTerminationFlow f233246b;

            {
                this.f233246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow = this.f233246b;
                        phm.a aVar = (phm.a) e.j(cobrandedCardsTerminationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsTerminationFlowContract$InputData cobrandedCardsTerminationFlowContract$InputData = cobrandedCardsTerminationFlow.K;
                        cobrandedCardsTerminationFlowContract$InputData.getClass();
                        return new y(oVar, cobrandedCardsTerminationFlowContract$InputData);
                    case 1:
                        return (c) ((y) this.f233246b.M.getValue()).d.get();
                    default:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow2 = this.f233246b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsTerminationFlow2, (c) cobrandedCardsTerminationFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: p6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsTerminationFlow f233246b;

            {
                this.f233246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow = this.f233246b;
                        phm.a aVar = (phm.a) e.j(cobrandedCardsTerminationFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsTerminationFlowContract$InputData cobrandedCardsTerminationFlowContract$InputData = cobrandedCardsTerminationFlow.K;
                        cobrandedCardsTerminationFlowContract$InputData.getClass();
                        return new y(oVar, cobrandedCardsTerminationFlowContract$InputData);
                    case 1:
                        return (c) ((y) this.f233246b.M.getValue()).d.get();
                    default:
                        CobrandedCardsTerminationFlow cobrandedCardsTerminationFlow2 = this.f233246b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cobrandedCardsTerminationFlow2, (c) cobrandedCardsTerminationFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
