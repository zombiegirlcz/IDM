package ugb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.income_insurance_claim_bottom_sheet.IncomeInsuranceClaimBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ud3.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IncomeInsuranceClaimBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IncomeInsuranceClaimBottomSheetController incomeInsuranceClaimBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = incomeInsuranceClaimBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        b criterion = obj3 instanceof b ? (b) obj3 : null;
        if (criterion != null) {
            f fVar = (f) this.v.T.getValue();
            fVar.getClass();
            Intrinsics.checkNotNullParameter(criterion, "criterion");
            fVar.H2(fVar.f279995q, new n(fVar, criterion, 19));
        }
        return Unit.f186387a;
    }
}
