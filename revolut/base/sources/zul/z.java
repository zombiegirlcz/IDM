package zul;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.investment_plan.projection.a f325562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f325562w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f325562w, continuation);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(1, this.f325562w, continuation);
                zVar2.v = obj2;
                return zVar2;
            case 2:
                z zVar3 = new z(2, this.f325562w, continuation);
                zVar3.v = obj2;
                return zVar3;
            case 3:
                z zVar4 = new z(3, this.f325562w, continuation);
                zVar4.v = obj2;
                return zVar4;
            case 4:
                z zVar5 = new z(4, this.f325562w, continuation);
                zVar5.v = obj2;
                return zVar5;
            case 5:
                z zVar6 = new z(5, this.f325562w, continuation);
                zVar6.v = obj2;
                return zVar6;
            case 6:
                z zVar7 = new z(6, this.f325562w, continuation);
                zVar7.v = obj2;
                return zVar7;
            default:
                z zVar8 = new z(7, this.f325562w, continuation);
                zVar8.v = obj2;
                return zVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        int i = this.u;
        int i2 = 14;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar = this.f325562w;
        switch (i) {
            case 0:
                a3h.d dVar = (a3h.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new fvk.t(dVar, 1));
                break;
            case 1:
                e3h.c cVar = (e3h.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new avk.x(cVar, 8));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new znc.m(data2, 11));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new znc.m(data3, 12));
                break;
            case 4:
                cli.y yVar = aVar.C;
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tel.d projections = (tel.d) data4.getContent();
                if (projections != null) {
                    Intrinsics.checkNotNullParameter(projections, "projections");
                    dj0.d dVar2 = ((n) ((j2) yVar.f22677a).getValue()).f325541b;
                    if (dVar2 == null || !projections.f270124b.contains(dVar2)) {
                        aVar.H2(yVar, new zp5.f(aVar, projections, i2));
                    }
                }
                try {
                    Object content = data4.getContent();
                    data = new Data(content != null ? ((tel.d) content).f270124b : null, data4.getError(), data4.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                aVar.H2(yVar, new znc.m(data, 13));
                break;
            case 5:
                jdf.f fVar = (jdf.f) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new psl.h(fVar, 1));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new znc.m(data5, 14));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.C, new znc.m(data6, 15));
                break;
        }
        return Unit.f186387a;
    }
}
