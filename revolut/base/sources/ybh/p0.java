package ybh;

import com.revolut.data.model.Data;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f312340w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p0 p0Var = new p0(0, this.f312340w, continuation);
                p0Var.v = obj2;
                return p0Var;
            case 1:
                p0 p0Var2 = new p0(1, this.f312340w, continuation);
                p0Var2.v = obj2;
                return p0Var2;
            case 2:
                p0 p0Var3 = new p0(2, this.f312340w, continuation);
                p0Var3.v = obj2;
                return p0Var3;
            case 3:
                p0 p0Var4 = new p0(3, this.f312340w, continuation);
                p0Var4.v = obj2;
                return p0Var4;
            case 4:
                p0 p0Var5 = new p0(4, this.f312340w, continuation);
                p0Var5.v = obj2;
                return p0Var5;
            case 5:
                p0 p0Var6 = new p0(5, this.f312340w, continuation);
                p0Var6.v = obj2;
                return p0Var6;
            case 6:
                p0 p0Var7 = new p0(6, this.f312340w, continuation);
                p0Var7.v = obj2;
                return p0Var7;
            default:
                p0 p0Var8 = new p0(7, this.f312340w, continuation);
                p0Var8.v = obj2;
                return p0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 19;
        com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar = this.f312340w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.K, new x5f.m(list, 14));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.K, new y4c.i(data, 19));
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.K, new y4c.i(data2, 20));
                break;
            case 3:
                m1h.h hVar = (m1h.h) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVar = new dj0.d(bVar.o.d, hVar.f201496a);
                cli.y yVar = bVar.K;
                bVar.H2(yVar, new y8a.h(hVar, i2));
                bVar.H2(yVar, new vtf.b(6, dVar));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.K, new y4c.i(data3, 21));
                break;
            case 5:
                rbh.c cVar = (rbh.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data4 = cVar.f253065a;
                Data data5 = null;
                if (data4 != null) {
                    try {
                        Object content = data4.getContent();
                        data5 = new Data(content != null ? new m((PocketInfo) content) : null, data4.getError(), data4.getLoading());
                    } catch (Throwable th10) {
                        data5 = new Data(null, th10, data4.getLoading());
                    }
                }
                bVar.H2(bVar.K, new y4c.i(data5, 22));
                break;
            case 6:
                Pair pair = (Pair) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVar2 = (dj0.d) pair.f186385a;
                Data data6 = (Data) pair.f186386b;
                cli.y yVar2 = bVar.K;
                if (Intrinsics.f(dVar2, ((n) ((j2) yVar2.f22677a).getValue()).f312323a)) {
                    bVar.H2(yVar2, new y4c.i(data6, 23));
                }
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair3 = (Pair) pair2.f186385a;
                Data data7 = (Data) pair2.f186386b;
                dj0.d dVar3 = (dj0.d) pair3.f186385a;
                cli.y yVar3 = bVar.K;
                if (Intrinsics.f(((n) ((j2) yVar3.f22677a).getValue()).f312323a, dVar3)) {
                    bVar.H2(yVar3, new y4c.i(data7, bVar));
                }
                break;
        }
        return Unit.f186387a;
    }
}
