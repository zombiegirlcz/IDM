package mc6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import com.revolut.feature.period_chooser.R$string;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringDonationScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecurringDonationScheduleScreen recurringDonationScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = recurringDonationScheduleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DonationSchedule donationSchedule;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarH3 = this.v.T2();
        Intrinsics.h(model);
        k kVar = (k) hVarH3;
        j60.a aVar2 = kVar.f204287s;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52580a;
        if (Intrinsics.f(str, "ITEM_ID_PERIOD")) {
            DonationSchedule donationSchedule2 = (DonationSchedule) ((f) kVar.t2()).f204279a.getContent();
            if (donationSchedule2 != null) {
                aVar2.x(((oc6.c) kVar.u).a(donationSchedule2.f72098a));
            }
        } else if (Intrinsics.f(str, "ITEM_ID_START_DATE") && (donationSchedule = (DonationSchedule) ((f) kVar.t2()).f204279a.getContent()) != null) {
            LocalDate minDate = ((l80.f) kVar.f204286r).e();
            LocalDate localDateE = jli.b.e(donationSchedule.f72099b);
            LocalDate preselectedDate = localDateE.isBefore(minDate) ? minDate : localDateE;
            ((nc6.c) kVar.f204288t).getClass();
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(preselectedDate, "preselectedDate");
            g5 g5Var = new g5("ITEM_ID_DATE", preselectedDate, preselectedDate, false, null, minDate, null, null, null, null, 0, 0, 1048504);
            yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ITEM_ID_ACTION_BUTTON_DATE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.period_chooser_common_action_set, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            aVar2.x(new y(v.k(g5Var, model2), new t(new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_recurring_schedule_selection_start_date, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
