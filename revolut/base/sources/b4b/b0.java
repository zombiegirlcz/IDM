package b4b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.order.v2.a f12211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12211w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f12211w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f12211w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f12211w, continuation, 2);
                b0Var3.v = obj2;
                return b0Var3;
            case 3:
                b0 b0Var4 = new b0(this.f12211w, continuation, 3);
                b0Var4.v = obj2;
                return b0Var4;
            case 4:
                b0 b0Var5 = new b0(this.f12211w, continuation, 4);
                b0Var5.v = obj2;
                return b0Var5;
            case 5:
                b0 b0Var6 = new b0(this.f12211w, continuation, 5);
                b0Var6.v = obj2;
                return b0Var6;
            case 6:
                b0 b0Var7 = new b0(this.f12211w, continuation, 6);
                b0Var7.v = obj2;
                return b0Var7;
            case 7:
                b0 b0Var8 = new b0(this.f12211w, continuation, 7);
                b0Var8.v = obj2;
                return b0Var8;
            case 8:
                b0 b0Var9 = new b0(this.f12211w, continuation, 8);
                b0Var9.v = obj2;
                return b0Var9;
            default:
                b0 b0Var10 = new b0(this.f12211w, continuation, 9);
                b0Var10.v = obj2;
                return b0Var10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b0) create((CfdOrderData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b0) create((CfdOpenPositionsDelegate$OpenPositions) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar = this.f12211w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new ap7.j(data, 25));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new ap7.j(data2, 26));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new ap7.j(data3, 27));
                break;
            case 3:
                CfdOrderData cfdOrderData = (CfdOrderData) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new c0(cfdOrderData, 0));
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new ap7.j(data4, 28));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new ap7.j(data5, 29));
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data6.getContent() != null) {
                    aVar.H2(aVar.J, new d0(data6, 0));
                }
                break;
            case 7:
                CfdOpenPositionsDelegate$OpenPositions cfdOpenPositionsDelegate$OpenPositions = (CfdOpenPositionsDelegate$OpenPositions) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.f82249p.a(new z(cfdOpenPositionsDelegate$OpenPositions, 1));
                break;
            case 8:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new as9.a(data7, aVar, 24));
                break;
            default:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Boolean bool = (Boolean) hVar.f288433a;
                Boolean bool2 = (Boolean) hVar.f288434b;
                Boolean bool3 = (Boolean) hVar.f288435c;
                aVar.H2(aVar.J, new a5b.b(bool2, bool, (Boolean) hVar.d, bool3, 6));
                break;
        }
        return Unit.f186387a;
    }
}
