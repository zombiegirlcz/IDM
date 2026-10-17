package vqc;

import cli.y;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EmployerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EmployerDetailsScreen employerDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = employerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EmployerDetailsScreen employerDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a) employerDetailsScreen.e3();
                y yVar = aVar2.f85289p;
                aVar2.C2(new i(((f) ((j2) yVar.f22677a).getValue()).f291372a, ((f) ((j2) yVar.f22677a).getValue()).f291373b));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a) employerDetailsScreen.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
