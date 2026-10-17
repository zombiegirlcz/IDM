package ead;

import com.revolut.data.model.Data;
import e50.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f124207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, o oVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f124207w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(0, this.f124207w, continuation);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(1, this.f124207w, continuation);
                nVar2.v = obj2;
                return nVar2;
            default:
                n nVar3 = new n(2, this.f124207w, continuation);
                nVar3.v = obj2;
                return nVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f124207w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.H2(oVar.f124212t, new t(data, 21));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.H2(oVar.f124212t, new t(data2, 22));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.H2(oVar.f124212t, new t(data3, 23));
                break;
        }
        return Unit.f186387a;
    }
}
