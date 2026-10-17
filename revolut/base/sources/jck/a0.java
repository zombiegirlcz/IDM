package jck;

import aqd.n1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a f172835w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172835w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f172835w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            default:
                a0 a0Var2 = new a0(this.f172835w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar = this.f172835w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new n1(8, bool));
                break;
            default:
                n nVar = (n) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.v, new j87.m(nVar, 19));
                break;
        }
        return Unit.f186387a;
    }
}
