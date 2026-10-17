package brc;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusDetails;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SalaryStatusScreen salaryStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = salaryStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarD3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) qVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53008a;
        Object obj3 = model.f53016n;
        boolean zF = Intrinsics.f(str, "PROGRESS_STEP_THREE_ID");
        m mVar = m.f17988a;
        if (zF) {
            SalarySwitchV2StatusDetails salarySwitchV2StatusDetails = obj3 instanceof SalarySwitchV2StatusDetails ? (SalarySwitchV2StatusDetails) obj3 : null;
            if (salarySwitchV2StatusDetails != null && salarySwitchV2StatusDetails.f85255h == bqc.k.FAILED) {
                aVar2.C2(mVar);
            }
        } else if (Intrinsics.f(str, "DISPUTE_PROGRESS_STEP_THREE_ID")) {
            cqc.a aVar3 = obj3 instanceof cqc.a ? (cqc.a) obj3 : null;
            if (aVar3 != null && aVar3.f108072b == cqc.d.FAILED) {
                aVar2.C2(mVar);
            }
        }
        return Unit.f186387a;
    }
}
