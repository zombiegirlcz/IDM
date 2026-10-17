package rnd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ v0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v0 v0Var, Continuation continuation) {
        super(2, continuation);
        this.v = v0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j0 j0Var = new j0(this.v, continuation);
        j0Var.u = obj2;
        return j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((npg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        npg.a aVar = (npg.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = aVar.f218206b;
        int i = i0.f255616a[((SavingsAccountDetails) obj3).f86460a.f234889n.ordinal()];
        if (i == 1) {
            return zi0.c.i(new AnalyticsAccount.Savings.PersonalIndividual(((SavingsAccountDetails) obj3).f86460a.f234881a));
        }
        Continuation continuation = null;
        v0 v0Var = this.v;
        if (i == 2) {
            SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
            v0Var.getClass();
            String str = savingsAccountDetails.f86460a.f;
            return xam.a.h(new r0(v0Var, savingsAccountDetails, null), xam.a.h(new qqj.g(v0Var, str, continuation, 6), zh9.u0.m(toh.d.g(v0Var.f255640a, null, 3), new njj.l(new ae8.c(bla.b.b(v0Var.f, "YOUTH"), 25), 28))));
        }
        if (i == 3) {
            throw new IllegalArgumentException("MoneyBoxAccountType.PERSONAL_UNDER_18 not supported");
        }
        if (i != 4) {
            if (i == 5) {
                return zi0.c.i(AnalyticsAccount.Personal.All.f99192a);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((SavingsAccountDetails) obj3).f86460a.f234881a;
        return xam.a.h(new n0(str2, null), v0Var.f255643g.h(w4l.h.f294642c));
    }
}
