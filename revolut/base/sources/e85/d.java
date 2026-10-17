package e85;

import android.os.Parcelable;
import aw0.n6;
import cli.y;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanRepaymentConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.b;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$RepaymentStrategyType;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AmountInputController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AmountInputController amountInputController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = amountInputController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? arrayList;
        com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.b tVar;
        int i = this.u;
        AmountInputController amountInputController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                amountInputController.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) amountInputController.k3();
                y yVar = aVar3.z;
                f fVar = (f) ((g) ((j2) yVar.f22677a).getValue()).f123582b.getContent();
                if (fVar != null) {
                    LoanDetails loanDetails = fVar.f123579a;
                    dj0.d amount = ((g) ((j2) yVar.f22677a).getValue()).f123583c;
                    if (amount != null) {
                        s sVar = aVar3.f70558x;
                        LoanRepaymentConfig loanRepaymentConfig = loanDetails.f70152n;
                        Loan loan = loanDetails.f70144a;
                        dj0.d dVar = loan.f70110c;
                        sVar.getClass();
                        m mVarA = s.a(amount, loanRepaymentConfig, dVar);
                        boolean z = amount.compareTo(fVar.f123580b.f70504a.getBalance()) > 0;
                        if (mVarA == null && !z) {
                            LoanRepaymentConfig config = loanDetails.f70152n;
                            com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.c cVar = aVar3.f70559y;
                            dj0.d settlementAmount = loan.f70110c;
                            cVar.getClass();
                            Intrinsics.checkNotNullParameter(amount, "amount");
                            Intrinsics.checkNotNullParameter(config, "config");
                            Intrinsics.checkNotNullParameter(settlementAmount, "settlementAmount");
                            if (amount.equals(settlementAmount)) {
                                tVar = new b.a(null);
                            } else {
                                dj0.d dVar2 = config.f70180g;
                                if (dVar2 == null || amount.compareTo(dVar2) > 0) {
                                    List<g0> list = config.d;
                                    if (list != null) {
                                        Intrinsics.checkNotNullParameter(list, "<this>");
                                        arrayList = new ArrayList();
                                        for (g0 g0Var : list) {
                                            Intrinsics.checkNotNullParameter(g0Var, "<this>");
                                            int i2 = g85.a.f141283a[g0Var.ordinal()];
                                            Parcelable parcelable = i2 != 1 ? i2 != 2 ? null : StrategyPickerContract$RepaymentStrategyType.TermReduction.f70563a : StrategyPickerContract$RepaymentStrategyType.AmountReduction.f70562a;
                                            if (parcelable != null) {
                                                arrayList.add(parcelable);
                                            }
                                        }
                                    } else {
                                        arrayList = 0;
                                    }
                                    if (arrayList == 0) {
                                        arrayList = f0.f322471a;
                                    }
                                    tVar = arrayList.size() > 1 ? new t(arrayList) : new b.a((StrategyPickerContract$RepaymentStrategyType) d0.d0(arrayList));
                                } else {
                                    tVar = new b.a(null);
                                }
                            }
                            if (tVar instanceof t) {
                                oki.h.v2(aVar3.A, new AmountInputControllerContract$ModalStep.StrategyPicker(((t) tVar).f123599a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                if (!(tVar instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                StrategyPickerContract$RepaymentStrategyType strategyPickerContract$RepaymentStrategyType = ((b.a) tVar).f70560a;
                                aVar3.I2(amount, strategyPickerContract$RepaymentStrategyType != null ? com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.a.a(strategyPickerContract$RepaymentStrategyType) : null);
                            }
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
