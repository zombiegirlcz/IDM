package up2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a f281829w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281829w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f281829w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f281829w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar = this.f281829w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    aVar.l2(new n(aVar, null, 1), new yi5.b(26));
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    aVar.I2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
