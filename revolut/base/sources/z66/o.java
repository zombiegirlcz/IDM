package z66;

import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;
import z55.w;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.trade.impl.ui.trade.a f319698w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, com.revolut.feature.defi.trade.impl.ui.trade.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f319698w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, this.f319698w, continuation);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(1, this.f319698w, continuation);
                oVar2.v = obj2;
                return oVar2;
            default:
                o oVar3 = new o(2, this.f319698w, continuation);
                oVar3.v = obj2;
                return oVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.defi.trade.impl.ui.trade.a aVar = this.f319698w;
        switch (i) {
            case 0:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f71892x, new a3e.s(gVar, 19));
                break;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                SortingType sortingType = (SortingType) rVar.f314201a;
                String str = (String) rVar.f314202b;
                xi0.b bVar = (xi0.b) rVar.f314203c;
                if (bVar != null) {
                    com.revolut.feature.defi.trade.impl.ui.trade.a aVar4 = this.f319698w;
                    a2 a2Var = aVar4.u;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    aVar4.H2(aVar4.f71892x, new w(6));
                    aVar4.u = aVar4.l2(new wh3.h(29, aVar4, sortingType, str, bVar, (Continuation) null), new yi5.b(26));
                }
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f71892x, new yvk.n(data, 16));
                break;
        }
        return Unit.f186387a;
    }
}
