package s65;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2ScreenContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoanSelectNewRepaymentDayV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen, Continuation continuation) {
        super(2, continuation);
        this.v = loanSelectNewRepaymentDayV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        if (obj3 instanceof LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel) {
            oki.h.v2(aVar2.f70415s, new LoanSelectNewRepaymentDayV2ScreenContract$ModalStep.ShowNewAmountExplainer(((LoanSelectNewRepaymentDayV2StateMapper$NewRepaymentAmountParcel) obj3).f70411a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
