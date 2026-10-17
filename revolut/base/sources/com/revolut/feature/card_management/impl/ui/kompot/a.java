package com.revolut.feature.card_management.impl.ui.kompot;

import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlowContract$Step;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitController;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitControllerContract$InputData;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.g;
import doe.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q03.j0;
import q03.k0;
import q03.l0;
import q03.m0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements e03.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RevolutCardSettingsFlowContract$Step f64866t;
    public final RevolutCardSettingsFlowContract$State u;

    public a(RevolutCardSettingsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f64866t = inputData.f64855a;
        this.u = new RevolutCardSettingsFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RevolutCardSettingsFlowContract$Step step = (RevolutCardSettingsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RevolutCardSettingsFlowContract$Step.Settings) {
            RevolutCardSettingsFlowContract$Step.Settings settings = (RevolutCardSettingsFlowContract$Step.Settings) step;
            RevolutCardSettingsController revolutCardSettingsController = new RevolutCardSettingsController(new RevolutCardSettingsScreenContract$InputData(settings.f64863a, settings.f64864b, settings.f64865c, settings.d));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: e03.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.a f121389b;

                {
                    this.f121389b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            m0 outputData = (m0) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, k0.f241086a);
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar = this.f121389b;
                            if (zF) {
                                aVar.I2();
                            } else if (outputData instanceof j0) {
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.LinkedWallets(((j0) outputData).f241084a), true, null, false);
                            } else {
                                if (!(outputData instanceof l0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0 l0Var = (l0) outputData;
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, l0Var.f241088a, l0Var.f241089b, l0Var.f241090c), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            g03.d outputData2 = (g03.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof g03.c;
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar2 = this.f121389b;
                            if (z) {
                                g03.c cVar = (g03.c) outputData2;
                                aVar2.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, cVar.f139262a, cVar.f139263b, cVar.f139264c), true, null, false);
                            } else {
                                if (!Intrinsics.f(outputData2, g03.b.f139259a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            otc.a outputData3 = (otc.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (!(outputData3 instanceof otc.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f121389b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            revolutCardSettingsController.H = block;
            return revolutCardSettingsController;
        }
        if (step instanceof RevolutCardSettingsFlowContract$Step.DisposableCardSettings) {
            RevolutCardSettingsFlowContract$Step.DisposableCardSettings disposableCardSettings = (RevolutCardSettingsFlowContract$Step.DisposableCardSettings) step;
            DisposableCardSettingsController disposableCardSettingsController = new DisposableCardSettingsController(new DisposableCardSettingsContract$InputData(disposableCardSettings.f64857a, disposableCardSettings.f64858b));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: e03.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.a f121389b;

                {
                    this.f121389b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            m0 outputData = (m0) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, k0.f241086a);
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar = this.f121389b;
                            if (zF) {
                                aVar.I2();
                            } else if (outputData instanceof j0) {
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.LinkedWallets(((j0) outputData).f241084a), true, null, false);
                            } else {
                                if (!(outputData instanceof l0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0 l0Var = (l0) outputData;
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, l0Var.f241088a, l0Var.f241089b, l0Var.f241090c), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            g03.d outputData2 = (g03.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof g03.c;
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar2 = this.f121389b;
                            if (z) {
                                g03.c cVar = (g03.c) outputData2;
                                aVar2.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, cVar.f139262a, cVar.f139263b, cVar.f139264c), true, null, false);
                            } else {
                                if (!Intrinsics.f(outputData2, g03.b.f139259a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            otc.a outputData3 = (otc.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (!(outputData3 instanceof otc.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f121389b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            disposableCardSettingsController.H = block2;
            return disposableCardSettingsController;
        }
        if (step instanceof RevolutCardSettingsFlowContract$Step.LinkedWallets) {
            ViewController viewControllerE1 = e1(new rtc.g(new SecurityHubInputData(new SecurityHubStartScreen.LinkedWalletsFromCardSettings(((RevolutCardSettingsFlowContract$Step.LinkedWallets) step).f64859a), true, null, false)));
            final int i3 = 2;
            Function1 block3 = new Function1(this) { // from class: e03.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.a f121389b;

                {
                    this.f121389b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            m0 outputData = (m0) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, k0.f241086a);
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar = this.f121389b;
                            if (zF) {
                                aVar.I2();
                            } else if (outputData instanceof j0) {
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.LinkedWallets(((j0) outputData).f241084a), true, null, false);
                            } else {
                                if (!(outputData instanceof l0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0 l0Var = (l0) outputData;
                                aVar.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, l0Var.f241088a, l0Var.f241089b, l0Var.f241090c), true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            g03.d outputData2 = (g03.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof g03.c;
                            com.revolut.feature.card_management.impl.ui.kompot.a aVar2 = this.f121389b;
                            if (z) {
                                g03.c cVar = (g03.c) outputData2;
                                aVar2.E2(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(wy2.c.DEFAULT, cVar.f139262a, cVar.f139263b, cVar.f139264c), true, null, false);
                            } else {
                                if (!Intrinsics.f(outputData2, g03.b.f139259a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            otc.a outputData3 = (otc.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (!(outputData3 instanceof otc.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f121389b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        if (!(step instanceof RevolutCardSettingsFlowContract$Step.SetTransactionLimit)) {
            throw new NoWhenBranchMatchedException();
        }
        RevolutCardSettingsFlowContract$Step.SetTransactionLimit setTransactionLimit = (RevolutCardSettingsFlowContract$Step.SetTransactionLimit) step;
        TransactionLimitController transactionLimitController = new TransactionLimitController(new TransactionLimitControllerContract$InputData(setTransactionLimit.f64860a, setTransactionLimit.f64861b, setTransactionLimit.f64862c, setTransactionLimit.d));
        c block4 = new c(step, this, 25);
        Intrinsics.checkNotNullParameter(block4, "block");
        transactionLimitController.H = block4;
        return transactionLimitController;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f64866t;
    }
}
