package d7j;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112076w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f112076w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x0 x0Var = new x0(0, this.f112076w, continuation);
                x0Var.v = obj2;
                return x0Var;
            case 1:
                x0 x0Var2 = new x0(1, this.f112076w, continuation);
                x0Var2.v = obj2;
                return x0Var2;
            case 2:
                x0 x0Var3 = new x0(2, this.f112076w, continuation);
                x0Var3.v = obj2;
                return x0Var3;
            case 3:
                x0 x0Var4 = new x0(3, this.f112076w, continuation);
                x0Var4.v = obj2;
                return x0Var4;
            case 4:
                x0 x0Var5 = new x0(4, this.f112076w, continuation);
                x0Var5.v = obj2;
                return x0Var5;
            case 5:
                x0 x0Var6 = new x0(5, this.f112076w, continuation);
                x0Var6.v = obj2;
                return x0Var6;
            default:
                x0 x0Var7 = new x0(6, this.f112076w, continuation);
                x0Var7.v = obj2;
                return x0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((x0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112076w;
        switch (i) {
            case 0:
                Set set = (Set) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new a83.d0(13, set));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new czc.b0(data, 18));
                break;
            case 2:
                i7j.f fVar = (i7j.f) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new d34.b(fVar, 16));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new czc.b0(data2, 19));
                break;
            case 4:
                Set set2 = (Set) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new a83.d0(14, set2));
                break;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new czc.b0(data3, 20));
                break;
            default:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.T, new czc.b0(data4, 21));
                break;
        }
        return Unit.f186387a;
    }
}
