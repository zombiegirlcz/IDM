package q87;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a f243032w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f243032w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f243032w, continuation);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(1, this.f243032w, continuation);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(2, this.f243032w, continuation);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(3, this.f243032w, continuation);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(4, this.f243032w, continuation);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(5, this.f243032w, continuation);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(6, this.f243032w, continuation);
                sVar7.v = obj2;
                return sVar7;
            default:
                s sVar8 = new s(7, this.f243032w, continuation);
                sVar8.v = obj2;
                return sVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((h87.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((h87.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((eel.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar = this.f243032w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new q65.l(data, 7));
                break;
            case 1:
                h87.i iVar = (h87.i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new o87.e(iVar, 3));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new q65.l(data2, 8));
                break;
            case 3:
                h87.i iVar2 = (h87.i) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new o87.e(iVar2, 4));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new q65.l(data3, aVar));
                break;
            case 5:
                List list = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new q2j.j(list, 6));
                break;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new q65.l(data4, 10));
                break;
            default:
                eel.c cVar = (eel.c) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.B, new i4h.p(cVar, 3));
                break;
        }
        return Unit.f186387a;
    }
}
