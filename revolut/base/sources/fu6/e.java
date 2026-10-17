package fu6;

import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerAcquiringOrderDetailsScreen freelancerAcquiringOrderDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsStandaloneNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsStandaloneNoteDelegate.Model model = (CellDetailsStandaloneNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Object obj3 = model.f51903b;
        com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) jVarE3;
        aVar2.getClass();
        if (obj3 instanceof ru6.g) {
            aVar2.I2(((ru6.g) obj3).f257451a);
        } else if (obj3 instanceof ru6.i) {
            aVar2.I2(((ru6.i) obj3).f257452a);
        }
        return Unit.f186387a;
    }
}
