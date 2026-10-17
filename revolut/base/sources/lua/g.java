package lua;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsContract$ModalStep;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RecurringSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RecurringSettingsController recurringSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = recurringSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.L.getValue();
        String listId = model.f52580a;
        com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar2 = (com.revolut.feature.recurring_buys.schedule.impl.ui.a) bVar;
        y yVar = aVar2.o;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f81648p;
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "START_DATE_ITEM_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            oki.h.v2(aVar3, new RecurringSettingsContract$ModalStep.CalendarPicker(((a) ((j2) yVar.f22677a).getValue()).f200202a), bottom_dialog);
        } else if (Intrinsics.f(listId, "FREQUENCY_ITEM_ID")) {
            oki.h.v2(aVar3, new RecurringSettingsContract$ModalStep.FrequencyPicker(((a) ((j2) yVar.f22677a).getValue()).f200203b), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
