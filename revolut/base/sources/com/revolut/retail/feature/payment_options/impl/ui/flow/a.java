package com.revolut.retail.feature.payment_options.impl.ui.flow;

import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payment_options.impl.ui.flow.PaymentOptionsFlowContract$Step;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreen;
import com.revolut.retail.feature.payment_options.impl.ui.screens.options.PaymentOptionsScreenContract$InputData;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreenContract$InputData;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import dki.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s1k.e;
import s1k.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements r1k.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PaymentOptionsFlowContract$InputData f101885t;
    public final PaymentOptionsFlowContract$Step.PaymentOptions u;
    public final EmptyFlowState v;

    public a(PaymentOptionsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101885t = inputData;
        this.u = PaymentOptionsFlowContract$Step.PaymentOptions.f101883a;
        this.v = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentOptionsFlowContract$Step step = (PaymentOptionsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PaymentOptionsFlowContract$Step.PaymentOptions) {
            PaymentOptionsScreen paymentOptionsScreen = new PaymentOptionsScreen(new PaymentOptionsScreenContract$InputData(this.f101885t.f101882a));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: r1k.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.payment_options.impl.ui.flow.a f251016b;

                {
                    this.f251016b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            s1k.g output = (s1k.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof e;
                            com.revolut.retail.feature.payment_options.impl.ui.flow.a aVar = this.f251016b;
                            if (z) {
                                aVar.C1(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(((e) output).f259150a), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null));
                            } else {
                                if (!(output instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new PaymentOptionsFlowContract$Step.VaultWithdrawal(((f) output).f259151a), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            u1k.f it8 = (u1k.f) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f251016b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            paymentOptionsScreen.H = function1;
            return paymentOptionsScreen;
        }
        if (!(step instanceof PaymentOptionsFlowContract$Step.VaultWithdrawal)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = new PaymentOptionsVaultWithdrawalScreen(new PaymentOptionsVaultWithdrawalScreenContract$InputData(((PaymentOptionsFlowContract$Step.VaultWithdrawal) step).f101884a));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: r1k.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.payment_options.impl.ui.flow.a f251016b;

            {
                this.f251016b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        s1k.g output = (s1k.g) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof e;
                        com.revolut.retail.feature.payment_options.impl.ui.flow.a aVar = this.f251016b;
                        if (z) {
                            aVar.C1(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney((StartUpPocket) new StartUpPocket.CurrencyAccount(((e) output).f259150a), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, false), (Set) null, 6), null));
                        } else {
                            if (!(output instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.E2(new PaymentOptionsFlowContract$Step.VaultWithdrawal(((f) output).f259151a), true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        u1k.f it8 = (u1k.f) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f251016b.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        paymentOptionsVaultWithdrawalScreen.H = function12;
        return paymentOptionsVaultWithdrawalScreen;
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
