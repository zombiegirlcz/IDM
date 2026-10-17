package fa8;

import com.revolut.feature.junior.isa.impl.ui.child_details.JuniorIsaChildDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorIsaChildDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorIsaChildDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorIsaChildDetailsScreen juniorIsaChildDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((oki.h) juniorIsaChildDetailsScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.child_details.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.child_details.a) juniorIsaChildDetailsScreen.d();
                com.revolut.feature.junior_profile.api.models.a aVar4 = (com.revolut.feature.junior_profile.api.models.a) ((f) ((j2) aVar3.u.f22677a).getValue()).f133250a.getContent();
                if (aVar4 != null) {
                    aVar3.l2(new esa.i(aVar3, aVar4, null, 21), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
