package z47;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreen;
import gim.i;
import java.time.Month;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerVatReminderAccountingPeriodPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FreelancerVatReminderAccountingPeriodPickerScreen freelancerVatReminderAccountingPeriodPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerVatReminderAccountingPeriodPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        Object obj3 = model.f;
        dVar.getClass();
        if (obj3 instanceof Month) {
            dVar.C2(new c((Month) obj3));
        }
        return Unit.f186387a;
    }
}
