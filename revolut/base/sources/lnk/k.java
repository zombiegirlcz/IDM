package lnk;

import cli.y;
import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import fci.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        n nVar = this.v;
        y yVar = nVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((e) ((j2) yVar.f22677a).getValue()).f197293c) {
                cha.b bVar = nVar.f197306s;
                this.u = 1;
                obj2 = q.x(mo3.a.g(((ffk.h) bVar).g(), null, new e0(6), 1), this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        FamilyPlanState familyPlanState = (FamilyPlanState) obj2;
        if (familyPlanState instanceof FamilyPlanState.FamilyPlan) {
            z = ((FamilyPlanState.FamilyPlan) familyPlanState).f81189a.f195207h;
        } else {
            if (!(familyPlanState instanceof FamilyPlanState.PendingInvite) && !Intrinsics.f(familyPlanState, FamilyPlanState.Empty.f81188a)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        nVar.H2(yVar, new jck.y(z, 28));
        return Unit.f186387a;
    }
}
