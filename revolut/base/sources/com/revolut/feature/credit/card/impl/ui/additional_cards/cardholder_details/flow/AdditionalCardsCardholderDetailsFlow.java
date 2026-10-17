package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlow;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow.AdditionalCardsCardholderDetailsFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import jm4.a3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsCardholderDetailsFlow extends ViewController<q> implements f {
    public final AdditionalCardsCardholderDetailsFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public AdditionalCardsCardholderDetailsFlow(AdditionalCardsCardholderDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: kp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsFlow f188168b;

            {
                this.f188168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((jm4.w) this.f188168b.O.getValue()).d.get();
                    case 1:
                        int i2 = R$id.screen_transparent_container;
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow = this.f188168b;
                        return c.d(i2, 4, null, additionalCardsCardholderDetailsFlow, (b) additionalCardsCardholderDetailsFlow.L.getValue());
                    default:
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow2 = this.f188168b;
                        phm.a aVar = (phm.a) e.j(additionalCardsCardholderDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderDetailsFlowContract$InputData additionalCardsCardholderDetailsFlowContract$InputData = additionalCardsCardholderDetailsFlow2.K;
                        additionalCardsCardholderDetailsFlowContract$InputData.getClass();
                        return new jm4.w(a3Var, additionalCardsCardholderDetailsFlowContract$InputData);
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: kp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsFlow f188168b;

            {
                this.f188168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((jm4.w) this.f188168b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow = this.f188168b;
                        return c.d(i22, 4, null, additionalCardsCardholderDetailsFlow, (b) additionalCardsCardholderDetailsFlow.L.getValue());
                    default:
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow2 = this.f188168b;
                        phm.a aVar = (phm.a) e.j(additionalCardsCardholderDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderDetailsFlowContract$InputData additionalCardsCardholderDetailsFlowContract$InputData = additionalCardsCardholderDetailsFlow2.K;
                        additionalCardsCardholderDetailsFlowContract$InputData.getClass();
                        return new jm4.w(a3Var, additionalCardsCardholderDetailsFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: kp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsCardholderDetailsFlow f188168b;

            {
                this.f188168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((jm4.w) this.f188168b.O.getValue()).d.get();
                    case 1:
                        int i22 = R$id.screen_transparent_container;
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow = this.f188168b;
                        return c.d(i22, 4, null, additionalCardsCardholderDetailsFlow, (b) additionalCardsCardholderDetailsFlow.L.getValue());
                    default:
                        AdditionalCardsCardholderDetailsFlow additionalCardsCardholderDetailsFlow2 = this.f188168b;
                        phm.a aVar = (phm.a) e.j(additionalCardsCardholderDetailsFlow2.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        AdditionalCardsCardholderDetailsFlowContract$InputData additionalCardsCardholderDetailsFlowContract$InputData = additionalCardsCardholderDetailsFlow2.K;
                        additionalCardsCardholderDetailsFlowContract$InputData.getClass();
                        return new jm4.w(a3Var, additionalCardsCardholderDetailsFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jm4.w) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (jm4.w) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (kp4.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
