package n9h;

import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import do3.q;
import gim.i;
import kge.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mhd.o0;
import ue8.c;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f213649w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f213650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ DepositInfo f213651y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, d dVar, DepositInfo depositInfo, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f213649w = aVar;
        this.f213650x = dVar;
        this.f213651y = depositInfo;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f213649w, this.f213650x, this.f213651y, continuation, 0);
            default:
                return new b(this.f213649w, this.f213650x, this.f213651y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    o0 o0Var = new o0(this.f213650x, this.f213651y, null, 26);
                    this.v = 1;
                    if (c.f0(this.f213649w, o0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar3 = this.f213649w;
                    b bVar = new b(aVar3, this.f213650x, this.f213651y, null, 0);
                    this.v = 1;
                    if (q.t(aVar3, bVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
