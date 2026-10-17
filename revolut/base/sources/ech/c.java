package ech;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen;
import com.revolut.retail.wealth.resources.R$string;
import ech.k;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        f fVar = (f) this.receiver;
        KProperty[] kPropertyArr = ScheduleScreen.f95597b0;
        m mVar = (m) fVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.P;
        if (Intrinsics.f(obj4, k.a.f124742a)) {
            mVar.f124750s.e3();
        } else if (Intrinsics.f(obj4, k.b.f124743a)) {
            j60.a aVar = mVar.f124749r;
            e eVar = mVar.f124748q;
            LocalDate selectedDate = ((d) mVar.t2()).f124736a;
            ((p) eVar).getClass();
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            aVar.x(new y(u.c(new g5("calendar.picker", selectedDate, selectedDate, false, null, LocalDate.now(), null, null, null, null, 0, 0, 1048504)), new t(new TextLocalisedClause(R$string.wealth_robo_onboarding_recurring_contribution_schedule_start_date, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
