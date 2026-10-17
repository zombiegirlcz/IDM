package com.revolut.feature.add_card_to_google_pay_shared.impl.card_security;

import a0.d;
import aii.q;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlow;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.CardSecurityFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import og1.b;
import og1.i;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/card_security/CardSecurityFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSecurityFlow extends ViewController<q> implements f {
    public final CardSecurityFlowContract$InputData.CardSecurityPrompt K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CardSecurityFlow(CardSecurityFlowContract$InputData.CardSecurityPrompt inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityFlow f235792b;

            {
                this.f235792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardSecurityFlow cardSecurityFlow = this.f235792b;
                        return c.d(0, 6, null, cardSecurityFlow, (b) cardSecurityFlow.N.getValue());
                    case 1:
                        CardSecurityFlow cardSecurityFlow2 = this.f235792b;
                        phm.a aVar = (phm.a) e.j(cardSecurityFlow2.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f;
                        CardSecurityFlowContract$InputData.CardSecurityPrompt cardSecurityPrompt = cardSecurityFlow2.K;
                        cardSecurityPrompt.getClass();
                        return new og1.b(iVar, cardSecurityPrompt);
                    default:
                        return (b) ((og1.b) this.f235792b.M.getValue()).f224959b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityFlow f235792b;

            {
                this.f235792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardSecurityFlow cardSecurityFlow = this.f235792b;
                        return c.d(0, 6, null, cardSecurityFlow, (b) cardSecurityFlow.N.getValue());
                    case 1:
                        CardSecurityFlow cardSecurityFlow2 = this.f235792b;
                        phm.a aVar = (phm.a) e.j(cardSecurityFlow2.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f;
                        CardSecurityFlowContract$InputData.CardSecurityPrompt cardSecurityPrompt = cardSecurityFlow2.K;
                        cardSecurityPrompt.getClass();
                        return new og1.b(iVar, cardSecurityPrompt);
                    default:
                        return (b) ((og1.b) this.f235792b.M.getValue()).f224959b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityFlow f235792b;

            {
                this.f235792b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardSecurityFlow cardSecurityFlow = this.f235792b;
                        return c.d(0, 6, null, cardSecurityFlow, (b) cardSecurityFlow.N.getValue());
                    case 1:
                        CardSecurityFlow cardSecurityFlow2 = this.f235792b;
                        phm.a aVar = (phm.a) e.j(cardSecurityFlow2.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f;
                        CardSecurityFlowContract$InputData.CardSecurityPrompt cardSecurityPrompt = cardSecurityFlow2.K;
                        cardSecurityPrompt.getClass();
                        return new og1.b(iVar, cardSecurityPrompt);
                    default:
                        return (b) ((og1.b) this.f235792b.M.getValue()).f224959b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (pg1.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
