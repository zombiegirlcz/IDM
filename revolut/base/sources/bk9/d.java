package bk9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PreferredScheduleController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PreferredScheduleController preferredScheduleController, Continuation continuation) {
        super(2, continuation);
        this.u = preferredScheduleController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.u.d();
        jVar.getClass();
        jVar.n2(new i(jVar, null, 0), new whi.b(6));
        return Unit.f186387a;
    }
}
