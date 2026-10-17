package gvl;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.ui.screens.schedule.ScheduleSettingsScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ScheduleSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ScheduleSettingsScreen scheduleSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = scheduleSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "START_DATE_ITEM_ID");
        ScheduleSettingsScreen scheduleSettingsScreen = this.v;
        if (zF) {
            o oVarE3 = scheduleSettingsScreen.d();
            oVarE3.f147230p.x(oVarE3.I2(((j) ((j2) oVarE3.getState().f22677a).getValue()).f147221a));
        } else if (Intrinsics.f(str, "PERIOD_ITEM_ID")) {
            o oVarE32 = scheduleSettingsScreen.d();
            a aVar2 = oVarE32.o;
            List availablePeriods = ((j) ((j2) oVarE32.getState().f22677a).getValue()).f147224g;
            sel.a selectedPeriod = ((j) ((j2) oVarE32.getState().f22677a).getValue()).f;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            List<sel.a> list = availablePeriods;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (sel.a aVar3 : list) {
                arrayList.add(new SingleChoiceDelegate.Model("SELECT_PERIOD_SINGLE_CHOICE_ITEM_ID_PREFIX_" + aVar3, aVar2.f147214b.k(aVar3), aVar3 == selectedPeriod, null, aVar3, YearClass.CLASS_2008));
            }
            yp0.b.k(arrayList, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
            oVarE32.f147230p.x(new y(arrayList, new t(new TextLocalisedClause(R$string.trading_orders_frequency_settings_repeat, null, null, 14), null, null, 30), rp0.l.WINDOW, null, "SELECT_PERIOD_DIALOG_TAG", null, 984));
        } else {
            hx7.e.n(new IllegalStateException(j6.a.q("Handler is not found ", model.f52580a)));
        }
        return Unit.f186387a;
    }
}
