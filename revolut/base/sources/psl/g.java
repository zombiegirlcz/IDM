package psl;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pnh.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f239522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239522w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f239522w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f239522w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f239522w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f239522w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g(this.f239522w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            case 5:
                g gVar6 = new g(this.f239522w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
            case 6:
                g gVar7 = new g(this.f239522w, continuation, 6);
                gVar7.v = obj2;
                return gVar7;
            case 7:
                g gVar8 = new g(this.f239522w, continuation, 7);
                gVar8.v = obj2;
                return gVar8;
            case 8:
                g gVar9 = new g(this.f239522w, continuation, 8);
                gVar9.v = obj2;
                return gVar9;
            case 9:
                g gVar10 = new g(this.f239522w, continuation, 9);
                gVar10.v = obj2;
                return gVar10;
            case 10:
                g gVar11 = new g(this.f239522w, continuation, 10);
                gVar11.v = obj2;
                return gVar11;
            case 11:
                g gVar12 = new g(this.f239522w, continuation, 11);
                gVar12.v = obj2;
                return gVar12;
            default:
                g gVar13 = new g(this.f239522w, continuation, 12);
                gVar13.v = obj2;
                return gVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f239522w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jsl.o oVar = (jsl.o) data.getContent();
                if (oVar != null) {
                    nVar.X2(nVar.A, new f(oVar, 0));
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data2, 14));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data3, 15));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data4, 16));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data5, 17));
                break;
            case 5:
                Data instrument = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                nVar.X2(nVar.A, new d0(instrument, 12));
                break;
            case 6:
                Data investOrderWrapper = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(investOrderWrapper, "investOrderWrapper");
                nVar.X2(nVar.A, new d0(investOrderWrapper, 13));
                break;
            case 7:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data6, 18));
                break;
            case 8:
                List list = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new njf.e(list, 25));
                break;
            case 9:
                jdf.f fVar = (jdf.f) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new h(fVar, 0));
                break;
            case 10:
                Data data7 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data7, 19));
                break;
            case 11:
                Data data8 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data8, 20));
                break;
            default:
                Data data9 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.X2(nVar.A, new d0(data9, 21));
                break;
        }
        return Unit.f186387a;
    }
}
