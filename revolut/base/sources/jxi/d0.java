package jxi;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c f179211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f179211w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(0, this.f179211w, continuation);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(1, this.f179211w, continuation);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(2, this.f179211w, continuation);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(3, this.f179211w, continuation);
                d0Var4.v = obj2;
                return d0Var4;
            case 4:
                d0 d0Var5 = new d0(4, this.f179211w, continuation);
                d0Var5.v = obj2;
                return d0Var5;
            case 5:
                d0 d0Var6 = new d0(5, this.f179211w, continuation);
                d0Var6.v = obj2;
                return d0Var6;
            case 6:
                d0 d0Var7 = new d0(6, this.f179211w, continuation);
                d0Var7.v = obj2;
                return d0Var7;
            case 7:
                d0 d0Var8 = new d0(7, this.f179211w, continuation);
                d0Var8.v = obj2;
                return d0Var8;
            case 8:
                d0 d0Var9 = new d0(8, this.f179211w, continuation);
                d0Var9.v = obj2;
                return d0Var9;
            case 9:
                d0 d0Var10 = new d0(9, this.f179211w, continuation);
                d0Var10.v = obj2;
                return d0Var10;
            case 10:
                d0 d0Var11 = new d0(10, this.f179211w, continuation);
                d0Var11.v = obj2;
                return d0Var11;
            default:
                d0 d0Var12 = new d0(11, this.f179211w, continuation);
                d0Var12.v = obj2;
                return d0Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 26;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = this.f179211w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new i2l.e0(list, i2));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data, 24));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data2, 25));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data3, 26));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data4, 27));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data5, 28));
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new e0(data6, 0));
                break;
            case 7:
                Data data7 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new e0(data7, 1));
                break;
            case 8:
                Data data8 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new jkh.h(data8, 29));
                break;
            case 9:
                Data data9 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new e0(data9, 3));
                break;
            case 10:
                Data data10 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new e0(data10, 4));
                break;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.G, new e0(data11, 5));
                break;
        }
        return Unit.f186387a;
    }
}
