package inc;

import alc.n;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import fnc.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a f162786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162786w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f162786w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f162786w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f162786w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            case 3:
                l lVar4 = new l(this.f162786w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
            case 4:
                l lVar5 = new l(this.f162786w, continuation, 4);
                lVar5.v = obj2;
                return lVar5;
            case 5:
                l lVar6 = new l(this.f162786w, continuation, 5);
                lVar6.v = obj2;
                return lVar6;
            default:
                l lVar7 = new l(this.f162786w, continuation, 6);
                lVar7.v = obj2;
                return lVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Template) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l) create((Template) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l) create((doc.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.a aVar = this.f162786w;
        switch (i) {
            case 0:
                Template template = (Template) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return aVar.f85175r.d(template.f95706a);
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new ilk.i(data, 16));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new ilk.i(data2, 17));
                return Unit.f186387a;
            case 3:
                Template template2 = (Template) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.f85174q.e3(new doc.c(template2.f95706a));
                return Unit.f186387a;
            case 4:
                doc.j jVar = (doc.j) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new c0(jVar, 1));
                return Unit.f186387a;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.u, new ilk.i(data3, 18));
                return Unit.f186387a;
            default:
                n nVar = (n) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                emc.e eVar = aVar.f85175r;
                String str = nVar.e;
                if (str != null) {
                    return eVar.a(str);
                }
                throw new IllegalStateException("Portfolio template is missing but PortfolioStrategyInformationScreen shown");
        }
    }
}
