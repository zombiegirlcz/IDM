package n8i;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a f213477w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(com.revolut.feature_move_money.impl.topup.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213477w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v0 v0Var = new v0(this.f213477w, continuation, 0);
                v0Var.v = obj2;
                return v0Var;
            case 1:
                v0 v0Var2 = new v0(this.f213477w, continuation, 1);
                v0Var2.v = obj2;
                return v0Var2;
            case 2:
                v0 v0Var3 = new v0(this.f213477w, continuation, 2);
                v0Var3.v = obj2;
                return v0Var3;
            case 3:
                v0 v0Var4 = new v0(this.f213477w, continuation, 3);
                v0Var4.v = obj2;
                return v0Var4;
            case 4:
                v0 v0Var5 = new v0(this.f213477w, continuation, 4);
                v0Var5.v = obj2;
                return v0Var5;
            default:
                v0 v0Var6 = new v0(this.f213477w, continuation, 5);
                v0Var6.v = obj2;
                return v0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v0) create((x5i.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v0) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v0) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v0) create((s6i.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 28;
        com.revolut.feature_move_money.impl.topup.a aVar = this.f213477w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new mtl.k(data, 27));
                break;
            case 1:
                x5i.e eVar = (x5i.e) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new ghk.x(eVar, i2));
                break;
            case 2:
                Boolean bool = (Boolean) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new ghk.x(bool, 29));
                break;
            case 3:
                o oVar = (o) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new n7h.c(oVar, 6));
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new mtl.k(data2, 28));
                break;
            default:
                s6i.e eVar2 = (s6i.e) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.M, new b1(eVar2, 0));
                break;
        }
        return Unit.f186387a;
    }
}
