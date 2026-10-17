package mtl;

import b8f.z;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f208921w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f208921w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f208921w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f208921w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j(this.f208921w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j(this.f208921w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j(this.f208921w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j(this.f208921w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            default:
                j jVar7 = new j(this.f208921w, continuation, 6);
                jVar7.v = obj2;
                return jVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        p pVar = this.f208921w;
        switch (i) {
            case 0:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new z(gVar, 12));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new me7.h(data, 29));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new k(data2, 0));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new k(data3, 1));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new k(data4, 2));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new k(data5, 3));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pVar.H2(pVar.getState(), new k(data6, 4));
                break;
        }
        return Unit.f186387a;
    }
}
