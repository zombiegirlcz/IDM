package com.revolut.feature.credit.application.plugins.impl.ui.card_ordering;

import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingRootFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import dw3.c0;
import dw3.c1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardOrderingRootFlow extends PluginFlowControllerV2 {
    public final CardOrderingFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CardOrderingRootFlow(CardOrderingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: g64.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOrderingRootFlow f140866b;

            {
                this.f140866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardOrderingRootFlow cardOrderingRootFlow = this.f140866b;
                        phm.a aVar = (phm.a) ue0.e.j(cardOrderingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = cardOrderingRootFlow.L;
                        cardOrderingFlowContract$InputData.getClass();
                        return new c0(c1Var, new iq3.a(), cardOrderingRootFlow, cardOrderingFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f140866b.M.getValue()).f118418x.get();
                    default:
                        CardOrderingRootFlow cardOrderingRootFlow2 = this.f140866b;
                        return czi.c.d(0, 6, null, cardOrderingRootFlow2, (b) cardOrderingRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: g64.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOrderingRootFlow f140866b;

            {
                this.f140866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardOrderingRootFlow cardOrderingRootFlow = this.f140866b;
                        phm.a aVar = (phm.a) ue0.e.j(cardOrderingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = cardOrderingRootFlow.L;
                        cardOrderingFlowContract$InputData.getClass();
                        return new c0(c1Var, new iq3.a(), cardOrderingRootFlow, cardOrderingFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f140866b.M.getValue()).f118418x.get();
                    default:
                        CardOrderingRootFlow cardOrderingRootFlow2 = this.f140866b;
                        return czi.c.d(0, 6, null, cardOrderingRootFlow2, (b) cardOrderingRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: g64.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOrderingRootFlow f140866b;

            {
                this.f140866b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardOrderingRootFlow cardOrderingRootFlow = this.f140866b;
                        phm.a aVar = (phm.a) ue0.e.j(cardOrderingRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData = cardOrderingRootFlow.L;
                        cardOrderingFlowContract$InputData.getClass();
                        return new c0(c1Var, new iq3.a(), cardOrderingRootFlow, cardOrderingFlowContract$InputData);
                    case 1:
                        return (b) ((c0) this.f140866b.M.getValue()).f118418x.get();
                    default:
                        CardOrderingRootFlow cardOrderingRootFlow2 = this.f140866b;
                        return czi.c.d(0, 6, null, cardOrderingRootFlow2, (b) cardOrderingRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g64.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
