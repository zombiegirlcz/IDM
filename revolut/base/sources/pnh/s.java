package pnh;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trades.b f237797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.wealth.ui.impl.trades.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237797w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f237797w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f237797w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f237797w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(this.f237797w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(this.f237797w, continuation, 4);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(this.f237797w, continuation, 5);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(this.f237797w, continuation, 6);
                sVar7.v = obj2;
                return sVar7;
            default:
                s sVar8 = new s(this.f237797w, continuation, 7);
                sVar8.v = obj2;
                return sVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.ui.impl.trades.b bVar = this.f237797w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new njf.e(list, 19));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new pig.u(data, 29));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new d0(data2, 0));
                break;
            case 3:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new djc.z(18, iVar));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new d0(data3, 1));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new d0(data4, 2));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new d0(data5, 3));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.D, new d0(data6, 4));
                break;
        }
        return Unit.f186387a;
    }
}
