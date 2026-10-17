package xng;

import cli.y;
import com.revolut.feature.user_declarations.shared.flows.income.screen.IncomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(IncomeScreen incomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncomeScreen incomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                incomeScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.user_declarations.shared.flows.income.screen.b bVar = (com.revolut.feature.user_declarations.shared.flows.income.screen.b) incomeScreen.R2();
                y yVar = bVar.f94636t;
                xi0.b bVar2 = (xi0.b) ((h) ((j2) yVar.f22677a).getValue()).f.getContent();
                if (bVar2 != null) {
                    h hVar = (h) ((j2) yVar.f22677a).getValue();
                    bVar.C2(new i(new dj0.d(hVar.f307495j, bVar2), hVar.i));
                }
                break;
        }
        return Unit.f186387a;
    }
}
