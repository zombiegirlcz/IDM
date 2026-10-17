package vq5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            default:
                return new r(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.D, new vq0.g(8));
                aVar.C.a();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.B2();
                break;
        }
        return Unit.f186387a;
    }
}
