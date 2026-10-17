package com.revolut.sso.impl.ui.card_pin.card_pin;

import bll.b;
import cll.h;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.ui.card_pin.card_pin.CardPINFlowContract$State;
import com.revolut.sso.impl.ui.card_pin.card_pin.CardPINFlowContract$Step;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin.EnterCardPINScreen;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin.EnterCardPINScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import tll.n;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements b {

    @NotNull
    public static final bll.g Companion = new bll.g();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f106396t;
    public final CardPINFlowContract$Step.EnterCardNumber u;
    public final CardPINFlowContract$State v;

    public a(n parentStateReceiver) {
        Intrinsics.checkNotNullParameter(parentStateReceiver, "parentStateReceiver");
        this.f106396t = parentStateReceiver;
        this.u = CardPINFlowContract$Step.EnterCardNumber.f106394a;
        this.v = new CardPINFlowContract$State(null, null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f106396t.f272117a, null, new bi2.n(this, null, 6), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardPINFlowContract$Step step = (CardPINFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, CardPINFlowContract$Step.EnterCardNumber.f106394a)) {
            EnterCardNumberScreen enterCardNumberScreen = new EnterCardNumberScreen();
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: bll.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.card_pin.card_pin.a f16744b;

                {
                    this.f16744b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            gll.g outputData = (gll.g) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof gll.e;
                            com.revolut.sso.impl.ui.card_pin.card_pin.a aVar = this.f16744b;
                            if (z) {
                                aVar.G2(c.f16740a);
                            } else {
                                if (!(outputData instanceof gll.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CardPINFlowContract$State cardPINFlowContract$State = (CardPINFlowContract$State) aVar.A2().f98429a;
                                String str = ((gll.f) outputData).f144730a;
                                String str2 = cardPINFlowContract$State.f106392a;
                                cardPINFlowContract$State.getClass();
                                aVar.L2(new CardPINFlowContract$State(str2, str));
                                String str3 = ((CardPINFlowContract$State) aVar.A2().f98429a).f106392a;
                                if (str3 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                String str4 = ((CardPINFlowContract$State) aVar.A2().f98429a).f106393b;
                                if (str4 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                aVar.G2(new d(str3, str4));
                            }
                            return Unit.f186387a;
                        default:
                            h outputData2 = (h) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z3 = outputData2 instanceof cll.f;
                            com.revolut.sso.impl.ui.card_pin.card_pin.a aVar2 = this.f16744b;
                            if (z3) {
                                aVar2.G2(c.f16740a);
                            } else {
                                if (!(outputData2 instanceof cll.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CardPINFlowContract$State cardPINFlowContract$State2 = (CardPINFlowContract$State) aVar2.A2().f98429a;
                                String str5 = ((cll.g) outputData2).f25057a;
                                String str6 = cardPINFlowContract$State2.f106393b;
                                cardPINFlowContract$State2.getClass();
                                aVar2.L2(new CardPINFlowContract$State(str5, str6));
                                aVar2.E2(CardPINFlowContract$Step.EnterPIN.f106395a, true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            enterCardNumberScreen.H = function1;
            return enterCardNumberScreen;
        }
        if (!Intrinsics.f(step, CardPINFlowContract$Step.EnterPIN.f106395a)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CardPINFlowContract$State) A2().f98429a).f106392a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        EnterCardPINScreen enterCardPINScreen = new EnterCardPINScreen(new EnterCardPINScreenContract$InputData(f0.V0(4, str)));
        final int i2 = 0;
        Function1 function12 = new Function1(this) { // from class: bll.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.sso.impl.ui.card_pin.card_pin.a f16744b;

            {
                this.f16744b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        gll.g outputData = (gll.g) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof gll.e;
                        com.revolut.sso.impl.ui.card_pin.card_pin.a aVar = this.f16744b;
                        if (z) {
                            aVar.G2(c.f16740a);
                        } else {
                            if (!(outputData instanceof gll.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CardPINFlowContract$State cardPINFlowContract$State = (CardPINFlowContract$State) aVar.A2().f98429a;
                            String str2 = ((gll.f) outputData).f144730a;
                            String str22 = cardPINFlowContract$State.f106392a;
                            cardPINFlowContract$State.getClass();
                            aVar.L2(new CardPINFlowContract$State(str22, str2));
                            String str3 = ((CardPINFlowContract$State) aVar.A2().f98429a).f106392a;
                            if (str3 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            String str4 = ((CardPINFlowContract$State) aVar.A2().f98429a).f106393b;
                            if (str4 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            aVar.G2(new d(str3, str4));
                        }
                        return Unit.f186387a;
                    default:
                        h outputData2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean z3 = outputData2 instanceof cll.f;
                        com.revolut.sso.impl.ui.card_pin.card_pin.a aVar2 = this.f16744b;
                        if (z3) {
                            aVar2.G2(c.f16740a);
                        } else {
                            if (!(outputData2 instanceof cll.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CardPINFlowContract$State cardPINFlowContract$State2 = (CardPINFlowContract$State) aVar2.A2().f98429a;
                            String str5 = ((cll.g) outputData2).f25057a;
                            String str6 = cardPINFlowContract$State2.f106393b;
                            cardPINFlowContract$State2.getClass();
                            aVar2.L2(new CardPINFlowContract$State(str5, str6));
                            aVar2.E2(CardPINFlowContract$Step.EnterPIN.f106395a, true, null, false);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        enterCardPINScreen.H = function12;
        return enterCardPINScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
