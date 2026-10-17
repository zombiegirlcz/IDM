package com.revolut.feature.card_management.impl.ui.change_pin;

import a03.d;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$InputData;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$State;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$Step;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreen;
import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.change_pin.information.ChangePinInformationScreen;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.feature.card_order_new.common.setpin.kompot.b;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import grl.k9;
import i13.j;
import i13.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import xz2.c;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends g implements xz2.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f64846t;
    public final h u;
    public final ChangePinFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ChangePinFlowContract$State f64847w;

    public b(ChangePinFlowContract$InputData inputData, f revolutCardsInteractor, h serverErrorParser) {
        ChangePinFlowContract$Step activation;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f64846t = revolutCardsInteractor;
        this.u = serverErrorParser;
        if (inputData instanceof ChangePinFlowContract$InputData.ChangePin) {
            activation = ChangePinFlowContract$Step.Information.f64843a;
        } else {
            if (!(inputData instanceof ChangePinFlowContract$InputData.ActivatePin)) {
                throw new NoWhenBranchMatchedException();
            }
            activation = new ChangePinFlowContract$Step.Activation(((ChangePinFlowContract$InputData.ActivatePin) inputData).f64836a);
        }
        this.v = activation;
        this.f64847w = new ChangePinFlowContract$State(inputData.getF64837a(), null);
    }

    public final void O2() {
        C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardsTroubleshooter("category.cards"), (SharedFaqDestination.PassthroughData) null, false, 14));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = this.u.a(throwable);
        if (serverErrorA == null || serverErrorA.f51362a != 1134) {
            super.o1(throwable);
            return false;
        }
        l.a1(this, X1(new y0("new_pin_same_as_old_one_error_dialog", new z(new TextLocalisedClause(R$string.change_pin_pin_input_same_pins_alert, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new xni.h(this, null, 20), 3);
        return true;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ChangePinFlowContract$Step step = (ChangePinFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ChangePinFlowContract$Step.Information) {
            ChangePinInformationScreen changePinInformationScreen = new ChangePinInformationScreen();
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: xz2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_management.impl.ui.change_pin.b f309775b;

                {
                    this.f309775b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            a03.d result = (a03.d) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, d.a.f117a);
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar = this.f309775b;
                            if (zF) {
                                bVar.O2();
                            } else if (Intrinsics.f(result, d.b.f118a)) {
                                bVar.E2(ChangePinFlowContract$Step.CreatePin.f64842a, true, null, false);
                            } else {
                                if (!Intrinsics.f(result, d.c.f119a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.O2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.card_order_new.common.setpin.kompot.b result2 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof k;
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar2 = this.f309775b;
                            if (z) {
                                bVar2.E2(new ChangePinFlowContract$Step.ConfirmPin(((k) result2).f157538a), true, null, false);
                            } else {
                                if (!(result2 instanceof b.a)) {
                                    throw new IllegalStateException("Create pin cannot return other output");
                                }
                                bVar2.q2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.card_order_new.common.setpin.kompot.b result3 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z3 = result3 instanceof j;
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar3 = this.f309775b;
                            if (z3) {
                                ChangePinFlowContract$State changePinFlowContract$State = (ChangePinFlowContract$State) bVar3.A2().f98429a;
                                String str = ((j) result3).f157537a;
                                String cardId = changePinFlowContract$State.f64838a;
                                Intrinsics.checkNotNullParameter(cardId, "cardId");
                                bVar3.L2(new ChangePinFlowContract$State(cardId, str));
                                bVar3.l2(new xnl.f(bVar3, str, null, 21), new yi5.b(26));
                            } else {
                                if (!(result3 instanceof b.a)) {
                                    throw new IllegalStateException("Confirm pin cannot return other output");
                                }
                                bVar3.q2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            changePinInformationScreen.H = function1;
            return changePinInformationScreen;
        }
        if (step instanceof ChangePinFlowContract$Step.CreatePin) {
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            SetPinController setPinController = new SetPinController(new SetPinScreenContract$InputData.CreatePin(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), R$string.change_pin_pin_input_new_pin_title, null, 4));
            final int i2 = 1;
            Function1 block = new Function1(this) { // from class: xz2.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_management.impl.ui.change_pin.b f309775b;

                {
                    this.f309775b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            a03.d result = (a03.d) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, d.a.f117a);
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar = this.f309775b;
                            if (zF) {
                                bVar.O2();
                            } else if (Intrinsics.f(result, d.b.f118a)) {
                                bVar.E2(ChangePinFlowContract$Step.CreatePin.f64842a, true, null, false);
                            } else {
                                if (!Intrinsics.f(result, d.c.f119a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar.O2();
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.card_order_new.common.setpin.kompot.b result2 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z = result2 instanceof k;
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar2 = this.f309775b;
                            if (z) {
                                bVar2.E2(new ChangePinFlowContract$Step.ConfirmPin(((k) result2).f157538a), true, null, false);
                            } else {
                                if (!(result2 instanceof b.a)) {
                                    throw new IllegalStateException("Create pin cannot return other output");
                                }
                                bVar2.q2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.card_order_new.common.setpin.kompot.b result3 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            boolean z3 = result3 instanceof j;
                            com.revolut.feature.card_management.impl.ui.change_pin.b bVar3 = this.f309775b;
                            if (z3) {
                                ChangePinFlowContract$State changePinFlowContract$State = (ChangePinFlowContract$State) bVar3.A2().f98429a;
                                String str = ((j) result3).f157537a;
                                String cardId = changePinFlowContract$State.f64838a;
                                Intrinsics.checkNotNullParameter(cardId, "cardId");
                                bVar3.L2(new ChangePinFlowContract$State(cardId, str));
                                bVar3.l2(new xnl.f(bVar3, str, null, 21), new yi5.b(26));
                            } else {
                                if (!(result3 instanceof b.a)) {
                                    throw new IllegalStateException("Confirm pin cannot return other output");
                                }
                                bVar3.q2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            setPinController.H = block;
            return setPinController;
        }
        final int i3 = 2;
        if (!(step instanceof ChangePinFlowContract$Step.ConfirmPin)) {
            if (!(step instanceof ChangePinFlowContract$Step.Activation)) {
                throw new NoWhenBranchMatchedException();
            }
            ChangePinActivationScreen changePinActivationScreen = new ChangePinActivationScreen(new ChangePinActivationScreenContract$InputData(((ChangePinFlowContract$Step.Activation) step).f64840a));
            xyc.j jVar = new xyc.j(this, step, i3);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            changePinActivationScreen.H = jVar;
            return changePinActivationScreen;
        }
        String str = ((ChangePinFlowContract$Step.ConfirmPin) step).f64841a;
        k9 value = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        SetPinController setPinController2 = new SetPinController(new SetPinScreenContract$InputData.ConfirmPin(new AnalyticsProduct.Retail(value), str, null));
        Function1 block2 = new Function1(this) { // from class: xz2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.card_management.impl.ui.change_pin.b f309775b;

            {
                this.f309775b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        a03.d result = (a03.d) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF = Intrinsics.f(result, d.a.f117a);
                        com.revolut.feature.card_management.impl.ui.change_pin.b bVar = this.f309775b;
                        if (zF) {
                            bVar.O2();
                        } else if (Intrinsics.f(result, d.b.f118a)) {
                            bVar.E2(ChangePinFlowContract$Step.CreatePin.f64842a, true, null, false);
                        } else {
                            if (!Intrinsics.f(result, d.c.f119a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.O2();
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.feature.card_order_new.common.setpin.kompot.b result2 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        boolean z = result2 instanceof k;
                        com.revolut.feature.card_management.impl.ui.change_pin.b bVar2 = this.f309775b;
                        if (z) {
                            bVar2.E2(new ChangePinFlowContract$Step.ConfirmPin(((k) result2).f157538a), true, null, false);
                        } else {
                            if (!(result2 instanceof b.a)) {
                                throw new IllegalStateException("Create pin cannot return other output");
                            }
                            bVar2.q2();
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.card_order_new.common.setpin.kompot.b result3 = (com.revolut.feature.card_order_new.common.setpin.kompot.b) obj2;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        boolean z3 = result3 instanceof j;
                        com.revolut.feature.card_management.impl.ui.change_pin.b bVar3 = this.f309775b;
                        if (z3) {
                            ChangePinFlowContract$State changePinFlowContract$State = (ChangePinFlowContract$State) bVar3.A2().f98429a;
                            String str2 = ((j) result3).f157537a;
                            String cardId = changePinFlowContract$State.f64838a;
                            Intrinsics.checkNotNullParameter(cardId, "cardId");
                            bVar3.L2(new ChangePinFlowContract$State(cardId, str2));
                            bVar3.l2(new xnl.f(bVar3, str2, null, 21), new yi5.b(26));
                        } else {
                            if (!(result3 instanceof b.a)) {
                                throw new IllegalStateException("Confirm pin cannot return other output");
                            }
                            bVar3.q2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        setPinController2.H = block2;
        return setPinController2;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f64847w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
