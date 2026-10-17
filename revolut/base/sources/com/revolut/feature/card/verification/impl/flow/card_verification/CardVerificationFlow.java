package com.revolut.feature.card.verification.impl.flow.card_verification;

import a0.d;
import aii.q;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlow;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ev2.c;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/impl/flow/card_verification/CardVerificationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardVerificationFlow extends ViewController<q> implements f, g {
    public final CardVerificationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CardVerificationFlow(CardVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardVerificationFlow f155782b;

            {
                this.f155782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardVerificationFlow cardVerificationFlow = this.f155782b;
                        phm.a aVar = (phm.a) e.j(cardVerificationFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c.class, " is not found"));
                        }
                        c cVar = ((c) aVar2.b()).f;
                        CardVerificationFlowContract$InputData cardVerificationFlowContract$InputData = cardVerificationFlow.K;
                        cardVerificationFlowContract$InputData.getClass();
                        return new ev2.d(cVar, cardVerificationFlowContract$InputData);
                    case 1:
                        return (b) ((ev2.d) this.f155782b.M.getValue()).d.get();
                    default:
                        CardVerificationFlow cardVerificationFlow2 = this.f155782b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cardVerificationFlow2, (b) cardVerificationFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: hv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardVerificationFlow f155782b;

            {
                this.f155782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardVerificationFlow cardVerificationFlow = this.f155782b;
                        phm.a aVar = (phm.a) e.j(cardVerificationFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c.class, " is not found"));
                        }
                        c cVar = ((c) aVar2.b()).f;
                        CardVerificationFlowContract$InputData cardVerificationFlowContract$InputData = cardVerificationFlow.K;
                        cardVerificationFlowContract$InputData.getClass();
                        return new ev2.d(cVar, cardVerificationFlowContract$InputData);
                    case 1:
                        return (b) ((ev2.d) this.f155782b.M.getValue()).d.get();
                    default:
                        CardVerificationFlow cardVerificationFlow2 = this.f155782b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cardVerificationFlow2, (b) cardVerificationFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: hv2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardVerificationFlow f155782b;

            {
                this.f155782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardVerificationFlow cardVerificationFlow = this.f155782b;
                        phm.a aVar = (phm.a) e.j(cardVerificationFlow.m2()).a().get(c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", c.class, " is not found"));
                        }
                        c cVar = ((c) aVar2.b()).f;
                        CardVerificationFlowContract$InputData cardVerificationFlowContract$InputData = cardVerificationFlow.K;
                        cardVerificationFlowContract$InputData.getClass();
                        return new ev2.d(cVar, cardVerificationFlowContract$InputData);
                    case 1:
                        return (b) ((ev2.d) this.f155782b.M.getValue()).d.get();
                    default:
                        CardVerificationFlow cardVerificationFlow2 = this.f155782b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, cardVerificationFlow2, (b) cardVerificationFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ev2.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ev2.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hv2.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
