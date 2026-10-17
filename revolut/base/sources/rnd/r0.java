package rnd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ v0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsAccountDetails f255632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, SavingsAccountDetails savingsAccountDetails, Continuation continuation) {
        super(2, continuation);
        this.v = v0Var;
        this.f255632w = savingsAccountDetails;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r0 r0Var = new r0(this.v, this.f255632w, continuation);
        r0Var.u = ((Boolean) obj2).booleanValue();
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((r0) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!z) {
            return zi0.c.i(AnalyticsAccount.Personal.All.f99192a);
        }
        v0 v0Var = this.v;
        hj8.a aVar2 = v0Var.d;
        SavingsAccountDetails savingsAccountDetails = this.f255632w;
        return nim.a.v(hj8.a.a(aVar2, savingsAccountDetails.f86460a.f, w4l.h.f294642c), new rgf.m(v0Var, savingsAccountDetails, 15));
    }
}
