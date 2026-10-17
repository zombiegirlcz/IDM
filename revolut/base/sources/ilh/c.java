package ilh;

import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingsSelectorOutputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$ModalStep;
import glh.d;
import glh.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c f162242b;

    public /* synthetic */ c(com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c cVar, int i) {
        this.f162241a = i;
        this.f162242b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CashHoldingsInfoFlowContract$ModalStep availableToWithdraw;
        switch (this.f162241a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f162242b.f96021r);
                return Boolean.TRUE;
            case 1:
                e output = (e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c cVar = this.f162242b;
                CashHoldingsInfoFlowContract$InputData cashHoldingsInfoFlowContract$InputData = cVar.f96019p;
                if (output instanceof glh.c) {
                    availableToWithdraw = new CashHoldingsInfoFlowContract$ModalStep.UnsettledCash(((glh.c) output).f144695a, cashHoldingsInfoFlowContract$InputData.getE());
                } else {
                    if (!(output instanceof d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    availableToWithdraw = new CashHoldingsInfoFlowContract$ModalStep.AvailableToWithdraw(((d) output).f144696a, cashHoldingsInfoFlowContract$InputData.getE(), cashHoldingsInfoFlowContract$InputData.getD());
                }
                cVar.I2(availableToWithdraw);
                return Unit.f186387a;
            default:
                CashHoldingsSelectorOutputData output2 = (CashHoldingsSelectorOutputData) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c cVar2 = this.f162242b;
                CashHoldingsInfoFlowContract$InputData cashHoldingsInfoFlowContract$InputData2 = cVar2.f96019p;
                cVar2.I2(new CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation(cashHoldingsInfoFlowContract$InputData2.getF96005b(), cashHoldingsInfoFlowContract$InputData2.getF96006c(), output2.f95935a));
                return Unit.f186387a;
        }
    }
}
