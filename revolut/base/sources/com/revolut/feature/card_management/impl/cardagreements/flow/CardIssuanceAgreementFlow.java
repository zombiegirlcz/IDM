package com.revolut.feature.card_management.impl.cardagreements.flow;

import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlow;
import com.revolut.feature.card_management.impl.cardagreements.flow.CardIssuanceAgreementFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dz2.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardagreements/flow/CardIssuanceAgreementFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxy2/a;", "Lyki/f;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardIssuanceAgreementFlow extends ViewController<xy2.a> implements f {
    public final CardIssuanceAgreementFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CardIssuanceAgreementFlow(CardIssuanceAgreementFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ez2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementFlow f130879b;

            {
                this.f130879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow = this.f130879b;
                        phm.a aVar = (phm.a) e.j(cardIssuanceAgreementFlow.m2()).a().get(dz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dz2.a.class, " is not found"));
                        }
                        dz2.a aVar3 = ((dz2.a) aVar2.b()).f121217c;
                        CardIssuanceAgreementFlowContract$InputData cardIssuanceAgreementFlowContract$InputData = cardIssuanceAgreementFlow.K;
                        cardIssuanceAgreementFlowContract$InputData.getClass();
                        return new dz2.b(aVar3, cardIssuanceAgreementFlowContract$InputData);
                    case 1:
                        return (b) ((dz2.b) this.f130879b.L.getValue()).e.get();
                    default:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow2 = this.f130879b;
                        return czi.c.d(0, 6, null, cardIssuanceAgreementFlow2, (b) cardIssuanceAgreementFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ez2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementFlow f130879b;

            {
                this.f130879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow = this.f130879b;
                        phm.a aVar = (phm.a) e.j(cardIssuanceAgreementFlow.m2()).a().get(dz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dz2.a.class, " is not found"));
                        }
                        dz2.a aVar3 = ((dz2.a) aVar2.b()).f121217c;
                        CardIssuanceAgreementFlowContract$InputData cardIssuanceAgreementFlowContract$InputData = cardIssuanceAgreementFlow.K;
                        cardIssuanceAgreementFlowContract$InputData.getClass();
                        return new dz2.b(aVar3, cardIssuanceAgreementFlowContract$InputData);
                    case 1:
                        return (b) ((dz2.b) this.f130879b.L.getValue()).e.get();
                    default:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow2 = this.f130879b;
                        return czi.c.d(0, 6, null, cardIssuanceAgreementFlow2, (b) cardIssuanceAgreementFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ez2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardIssuanceAgreementFlow f130879b;

            {
                this.f130879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow = this.f130879b;
                        phm.a aVar = (phm.a) e.j(cardIssuanceAgreementFlow.m2()).a().get(dz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dz2.a.class, " is not found"));
                        }
                        dz2.a aVar3 = ((dz2.a) aVar2.b()).f121217c;
                        CardIssuanceAgreementFlowContract$InputData cardIssuanceAgreementFlowContract$InputData = cardIssuanceAgreementFlow.K;
                        cardIssuanceAgreementFlowContract$InputData.getClass();
                        return new dz2.b(aVar3, cardIssuanceAgreementFlowContract$InputData);
                    case 1:
                        return (b) ((dz2.b) this.f130879b.L.getValue()).e.get();
                    default:
                        CardIssuanceAgreementFlow cardIssuanceAgreementFlow2 = this.f130879b;
                        return czi.c.d(0, 6, null, cardIssuanceAgreementFlow2, (b) cardIssuanceAgreementFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ez2.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
