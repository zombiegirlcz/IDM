package o74;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.ScheduleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ScheduleScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ScheduleScreen scheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.u = scheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a) this.u.d()).I2(i.f222710a);
        return Unit.f186387a;
    }
}
