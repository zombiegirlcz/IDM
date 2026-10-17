package wje;

import cli.y;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import v2e.x;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.settings.a f298076w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.tab.crypto.impl.ui.settings.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298076w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f298076w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f298076w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f298076w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(this.f298076w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l(this.f298076w, continuation, 4);
                lVar5.v = obj2;
                return lVar5;
            default:
                l lVar6 = new l(this.f298076w, continuation, 5);
                lVar6.v = obj2;
                return lVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((ec5.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.tab.crypto.impl.ui.settings.a aVar = this.f298076w;
        switch (i) {
            case 0:
                y yVar = aVar.F;
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Boolean bool = (Boolean) data.getContent();
                if (bool != null) {
                    aVar.H2(yVar, new x(bool.booleanValue(), 14));
                } else {
                    aVar.H2(yVar, new wgk.f(29));
                }
                break;
            case 1:
                xi0.b bVar = (xi0.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new vgc.b(4, bVar));
                break;
            case 2:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new v77.a(list, 13));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new wgd.k(data2, 5));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.F, new wgd.k(data3, 6));
                break;
            default:
                ec5.c cVar = (ec5.c) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (cVar.f124432a == ec5.j.COMPLETED && aVar.H) {
                    aVar.H = false;
                    aVar.l2(new q(aVar, null, null), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
