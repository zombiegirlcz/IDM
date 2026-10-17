package s55;

import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$Step;
import com.revolut.feature.full_screen_prompt.c;
import ek4.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qk4.b;
import rbh.k;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.autopay.flow.a f259926b;

    public /* synthetic */ b(com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar, int i) {
        this.f259925a = i;
        this.f259926b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f259925a) {
            case 0:
                ek4.c output = (ek4.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof ek4.b;
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar = this.f259926b;
                if (z) {
                    LoanAutopayFlowContract$State loanAutopayFlowContract$State = (LoanAutopayFlowContract$State) aVar.A2().f98429a;
                    AccountDetails.LinkedAccount linkedAccount = ((ek4.b) output).f126955a;
                    wi0.b bVar = loanAutopayFlowContract$State.f70316b;
                    loanAutopayFlowContract$State.getClass();
                    aVar.L2(new LoanAutopayFlowContract$State(linkedAccount, bVar));
                    aVar.E2(LoanAutopayFlowContract$Step.ConfirmAutopay.f70319a, true, null, false);
                } else {
                    if (!(output instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.q2();
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a outputData = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof a.C0475a) {
                    com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar2 = this.f259926b;
                    aVar2.l2(new k(aVar2, null, 29), new b(aVar2, 4));
                    return Unit.f186387a;
                }
                if ((outputData instanceof a.c) || (outputData instanceof a.b)) {
                    throw new IllegalStateException("Unsupported operation: Picker step is not implemented in this flow");
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                com.revolut.feature.full_screen_prompt.c outputData2 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean z3 = outputData2 instanceof c.C0497c;
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar3 = this.f259926b;
                if (z3) {
                    aVar3.E2(LoanAutopayFlowContract$Step.SelectPaymentMethod.f70320a, true, null, false);
                } else if (outputData2 instanceof c.a) {
                    aVar3.I2();
                }
                return Unit.f186387a;
            case 3:
                qk4.b outputData3 = (qk4.b) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                boolean zF = Intrinsics.f(outputData3, b.c.f246964a);
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar4 = this.f259926b;
                if (zF) {
                    aVar4.E2(LoanAutopayFlowContract$Step.ConfirmAutopay.f70319a, true, null, false);
                } else if (Intrinsics.f(outputData3, b.C1350b.f246963a)) {
                    aVar4.E2(LoanAutopayFlowContract$Step.AddExternalAccount.f70317a, true, null, false);
                } else {
                    if (!Intrinsics.f(outputData3, b.a.f246962a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.q2();
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar5 = this.f259926b;
                aVar5.u.getClass();
                aVar5.X1(wj4.a.a());
                return Boolean.TRUE;
        }
    }
}
