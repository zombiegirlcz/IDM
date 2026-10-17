package t18;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarB = oih.j.b(bVar.u);
            this.u = 1;
            obj2 = nim.a.b(d0VarB, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        sy6.j jVar = new sy6.j(bVar, (NaviCommand) obj2, null, 6);
        p0 p0Var = p0.f264001a;
        tkm.e eVar = zkm.o.f323119a.e;
        this.u = 2;
        Object objJ = e0.J(eVar, jVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
