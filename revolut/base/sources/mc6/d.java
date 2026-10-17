package mc6;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringDonationScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RecurringDonationScheduleScreen recurringDonationScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringDonationScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarH3 = this.v.T2();
        Intrinsics.h(model);
        k kVar = (k) hVarH3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        Period period = obj3 instanceof Period ? (Period) obj3 : null;
        if (period != null) {
            kVar.f204290x = period;
            kVar.n2(new j(kVar, period, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
