package rsl;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f257125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f257125w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f257125w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f257125w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f257125w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d(this.f257125w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d(this.f257125w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d(this.f257125w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            default:
                d dVar7 = new d(this.f257125w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f257125w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jsl.o oVar = (jsl.o) data.getContent();
                if (oVar != null) {
                    hVar.X2(hVar.f257136w, new psl.f(oVar, 1));
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hVar.X2(hVar.f257136w, new rj9.i(data2, 20));
                break;
            case 2:
                Data instrument = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                hVar.X2(hVar.f257136w, new rj9.i(instrument, 19));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hVar.X2(hVar.f257136w, new rj9.i(data3, 21));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hVar.X2(hVar.f257136w, new rj9.i(data4, 22));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hVar.X2(hVar.f257136w, new rj9.i(data5, 23));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hVar.X2(hVar.f257136w, new rj9.i(data6, 24));
                break;
        }
        return Unit.f186387a;
    }
}
