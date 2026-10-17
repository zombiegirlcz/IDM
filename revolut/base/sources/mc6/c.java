package mc6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ma2.s;
import org.joda.time.Period;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringDonationScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecurringDonationScheduleScreen recurringDonationScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringDonationScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Period period;
        LocalDate localDate;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarH3 = this.v.T2();
        Intrinsics.h(model);
        k kVar = (k) hVarH3;
        j60.a aVar2 = kVar.f204287s;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        int i = 3;
        if (Intrinsics.f(str, "ITEM_ID_ACTION_BUTTON_DATE")) {
            DonationSchedule donationSchedule = (DonationSchedule) ((f) kVar.t2()).f204279a.getContent();
            if (donationSchedule != null && (localDate = kVar.f204289w) != null) {
                kVar.x2(new s(donationSchedule, localDate, i));
            }
            j60.a.v(aVar2, false, null, 3);
        } else if (Intrinsics.f(str, "ITEM_ID_ACTION_BUTTON_PERIOD")) {
            DonationSchedule donationSchedule2 = (DonationSchedule) ((f) kVar.t2()).f204279a.getContent();
            if (donationSchedule2 != null && (period = kVar.f204290x) != null) {
                kVar.x2(new s(donationSchedule2, period, 4));
                kVar.f204290x = null;
            }
            j60.a.v(aVar2, false, null, 3);
        }
        return Unit.f186387a;
    }
}
