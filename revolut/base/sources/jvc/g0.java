package jvc;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wtc.o0;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.security_hub.c f178822w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.security_hub.impl.ui.security_hub.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178822w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(this.f178822w, continuation, 0);
                g0Var.v = obj2;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.f178822w, continuation, 1);
                g0Var2.v = obj2;
                return g0Var2;
            case 2:
                g0 g0Var3 = new g0(this.f178822w, continuation, 2);
                g0Var3.v = obj2;
                return g0Var3;
            case 3:
                g0 g0Var4 = new g0(this.f178822w, continuation, 3);
                g0Var4.v = obj2;
                return g0Var4;
            case 4:
                g0 g0Var5 = new g0(this.f178822w, continuation, 4);
                g0Var5.v = obj2;
                return g0Var5;
            case 5:
                g0 g0Var6 = new g0(this.f178822w, continuation, 5);
                g0Var6.v = obj2;
                return g0Var6;
            default:
                g0 g0Var7 = new g0(this.f178822w, continuation, 6);
                g0Var7.v = obj2;
                return g0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((o0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g0) create((qtc.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.security_hub.impl.ui.security_hub.c cVar = this.f178822w;
        switch (i) {
            case 0:
                o0 o0Var = (o0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new jud.d(o0Var, 6));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new jkh.h(data, 22));
                break;
            case 2:
                List list = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new i2l.e0(list, 24));
                break;
            case 3:
                cli.y yVar = cVar.K;
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair = (Pair) data2.component1();
                ArrayList arrayList = null;
                List list2 = pair != null ? (List) pair.f186385a : null;
                List list3 = pair != null ? (List) pair.f186386b : null;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        h93.f0 card = (h93.f0) obj3;
                        cVar.B.getClass();
                        Intrinsics.checkNotNullParameter(card, "card");
                        h93.r rVar = card.f;
                        if (rVar == h93.r.ACTIVE || rVar == h93.r.BLOCKED) {
                            if (!card.d && !card.f150112c && (card.R || card.S)) {
                                if (!wtc.t.a(card)) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                    }
                }
                if (arrayList != null && list3 != null) {
                    cVar.H2(yVar, new j2c.o(cVar, 17, list3, arrayList));
                }
                if (cVar.o.f85636a && !((i) ((j2) yVar.f22677a).getValue()).e) {
                    cVar.H2(yVar, new jt2.d(19));
                    cVar.K2();
                }
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new jkh.h(data3, 23));
                break;
            case 5:
                qtc.t tVar = (qtc.t) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new jud.d(tVar, 7));
                break;
            default:
                List list4 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.K, new i2l.e0(list4, 25));
                break;
        }
        return Unit.f186387a;
    }
}
