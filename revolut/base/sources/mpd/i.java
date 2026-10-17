package mpd;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.date_picker.DatePickerContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mpd.q;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomPeriodSelectController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CustomPeriodSelectController customPeriodSelectController, Continuation continuation) {
        super(2, continuation);
        this.v = customPeriodSelectController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (model == null) {
            model = null;
        }
        Object obj3 = model != null ? model.P : null;
        boolean zF = Intrinsics.f(obj3, q.b.f207807a);
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        CustomPeriodSelectController customPeriodSelectController = this.v;
        if (zF) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) customPeriodSelectController.d();
            y yVar = aVar2.f87685s;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            if (((a) j2Var.getValue()).f207787g != null) {
                aVar2.H2(aVar2.f87685s, new ml3.y(c.START_DATE, 22));
            } else {
                LocalDate localDate = ((a) j2Var2.getValue()).f207784a;
                if (localDate != null) {
                    a aVar3 = (a) j2Var2.getValue();
                    oki.h.v2(aVar2.f87686t, new CustomPeriodSelectContract$ModalStep.DatePicker(new DatePickerContract$InputData(new TextLocalisedClause(R$string.analytics_custom_period_start_date, null, null, 14), aVar3.d, localDate, aVar3.e), c.START_DATE), bottom_dialog);
                }
            }
        } else if (Intrinsics.f(obj3, q.a.f207806a)) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) customPeriodSelectController.d();
            y yVar2 = aVar4.f87685s;
            if (((a) ((j2) yVar2.f22677a).getValue()).f207787g != null) {
                aVar4.H2(aVar4.f87685s, new ml3.y(c.END_DATE, 22));
            } else {
                a aVar5 = (a) ((j2) yVar2.f22677a).getValue();
                oki.h.v2(aVar4.f87686t, new CustomPeriodSelectContract$ModalStep.DatePicker(new DatePickerContract$InputData(new TextLocalisedClause(R$string.analytics_custom_period_end_date, null, null, 14), aVar5.e, aVar5.d, ((l80.f) aVar4.f87682p).e()), c.END_DATE), bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
