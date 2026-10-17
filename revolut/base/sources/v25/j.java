package v25;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f285654w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f285654w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f285654w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVarG = m70.a.g(oVar.f285665n.b(this.f285654w, w4l.h.f294642c), null, new g(2), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        LoanDetails loanDetails = (LoanDetails) obj2;
        Intrinsics.h(loanDetails);
        String strB = com.revolut.feature.credit.loan.api.models.rev10.e.b(loanDetails);
        if (strB != null) {
            yji.n.P2(oVar, oVar.o2(new CreditPostTerminationPlanEntryPoint.Repay(strB, null)), null, null, 3);
        } else {
            oVar.A2(((g55.c) oVar.f285671w).b(loanDetails, null));
        }
        return Unit.f186387a;
    }
}
