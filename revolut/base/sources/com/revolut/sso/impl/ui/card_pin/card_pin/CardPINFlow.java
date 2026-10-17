package com.revolut.sso.impl.ui.card_pin.card_pin;

import bll.e;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.ui.card_pin.card_pin.CardPINFlow;
import dki.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.q0;
import te0.w;
import wii.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/sso/impl/ui/card_pin/card_pin/CardPINFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/sso/impl/ui/card_pin/card_pin/CardPINFlowContract$Step;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lbll/e;", "Lwii/b;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPINFlow extends BaseFlow<CardPINFlowContract$Step, IOData$EmptyInput, e> implements b {
    public final ModalTransitionAnimation.Style.POPUP P;
    public final Object Q;
    public final Object R;

    public CardPINFlow() {
        super(IOData$EmptyInput.f98299a);
        this.P = ModalTransitionAnimation.Style.POPUP.f98391a;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPINFlow f16739b;

            {
                this.f16739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ljl.e(((q0) kli.a.n(this.f16739b.m2())).E);
                    default:
                        return (b) ((ljl.e) this.f16739b.Q.getValue()).f195924c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bll.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPINFlow f16739b;

            {
                this.f16739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ljl.e(((q0) kli.a.n(this.f16739b.m2())).E);
                    default:
                        return (b) ((ljl.e) this.f16739b.Q.getValue()).f195924c.get();
                }
            }
        });
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getV() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (ljl.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (ljl.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (bll.b) this.R.getValue();
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2 */
    public final ModalTransitionAnimation.Style getL() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        CardPINFlowContract$Step step = (CardPINFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
