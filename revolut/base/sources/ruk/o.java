package ruk;

import com.revolut.data.model.Data;
import jel.i1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f257612w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, t tVar) {
        super(2, continuation);
        this.u = i;
        this.f257612w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, continuation, this.f257612w);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(1, continuation, this.f257612w);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(2, continuation, this.f257612w);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        t tVar = this.f257612w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.x2(new rtl.s(data, 10));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.x2(new rsl.p((Data) pair.f186385a, (dj0.d) pair.f186386b, 5));
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data2 = (Data) pair2.f186385a;
                Data data3 = (Data) pair2.f186386b;
                i1 i1Var = (i1) data3.getContent();
                Integer num = new Integer(i1Var != null ? zhm.v.j(i1Var.f173476b) : -1);
                int iIntValue = num.intValue();
                if (((i) tVar.t2()).f257603h != -1 && ((i) tVar.t2()).f257603h <= iIntValue) {
                    num = null;
                }
                tVar.x2(new a94.e(data2, data3, num != null ? num.intValue() : ((i) tVar.t2()).f257603h, 11));
                break;
        }
        return Unit.f186387a;
    }
}
