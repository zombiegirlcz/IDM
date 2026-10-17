package dqd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f116966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj2;
        List list2 = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                w wVar = new w(3, 0, continuation);
                wVar.v = list;
                wVar.f116966w = list2;
                return wVar.invokeSuspend(Unit.f186387a);
            case 1:
                w wVar2 = new w(3, 1, continuation);
                wVar2.v = list;
                wVar2.f116966w = list2;
                return wVar2.invokeSuspend(Unit.f186387a);
            case 2:
                w wVar3 = new w(3, 2, continuation);
                wVar3.v = list;
                wVar3.f116966w = list2;
                return wVar3.invokeSuspend(Unit.f186387a);
            case 3:
                w wVar4 = new w(3, 3, continuation);
                wVar4.v = list;
                wVar4.f116966w = list2;
                return wVar4.invokeSuspend(Unit.f186387a);
            default:
                w wVar5 = new w(3, 4, continuation);
                wVar5.v = list;
                wVar5.f116966w = list2;
                return wVar5.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                List list = this.v;
                List list2 = this.f116966w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return d0.E0(list2, list);
            case 1:
                List list3 = this.v;
                List list4 = this.f116966w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return d0.E0(list4, list3);
            case 2:
                List list5 = this.v;
                List list6 = this.f116966w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(list5);
                eVarB.addAll(list6);
                return zhm.u.a(eVarB);
            case 3:
                List list7 = this.v;
                List list8 = this.f116966w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ArrayList arrayListE0 = d0.E0(list8, list7);
                yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
                return arrayListE0;
            default:
                List list9 = this.v;
                List list10 = this.f116966w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return d0.E0(list10, list9);
        }
    }
}
