package pb2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b f234623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f234623w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f234623w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f234623w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            default:
                w wVar3 = new w(this.f234623w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((tb2.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b bVar = this.f234623w;
        switch (i) {
            case 0:
                tb2.a aVar = (tb2.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new v(aVar, 0));
                break;
            case 1:
                mii.q qVar = (mii.q) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (qVar instanceof mii.n) {
                    bVar.C1(u0.b(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b.I2(bVar)));
                }
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    bVar.s1();
                    bVar.C1(u0.b(com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.b.I2(bVar)));
                } else {
                    int i2 = jli.h.f175850a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
