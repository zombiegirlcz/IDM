package lig;

import a3e.s;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l7j.t;
import l9k.v;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f195520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f195520w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f195520w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f195520w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(this.f195520w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f195520w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.f195525t, new t(data, 20));
                break;
            case 1:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.f195525t, new s(gVar, 8));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.f195525t, new v(pVar, data2, 21));
                break;
        }
        return Unit.f186387a;
    }
}
