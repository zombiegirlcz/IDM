package tph;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tb6.x;
import uqh.u;
import uqh.z;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a f273391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f273391w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f273391w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f273391w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f273391w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            default:
                o oVar4 = new o(this.f273391w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((ScreenerCollection) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a aVar = this.f273391w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new x(data, 12));
                break;
            case 1:
                ScreenerCollection screenerCollection = (ScreenerCollection) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zel.f fVarA = aVar.f96230r.a(screenerCollection.f105157g);
                u uVar = aVar.f96229q;
                List list = screenerCollection.i;
                if (list == null) {
                    list = f0.f322471a;
                }
                Integer num = screenerCollection.f;
                uVar.c3(num != null ? num.intValue() : 1000, list, fVarA);
                uVar.e3(screenerCollection.f105159j);
                break;
            case 2:
                z zVar = (z) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new cqh.n(zVar, 4));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.u, new x(data2, 13));
                break;
        }
        return Unit.f186387a;
    }
}
