package hee;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferTrackerInputFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransferTrackerInputFormScreen transferTrackerInputFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferTrackerInputFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) oVarE3;
        bVar.getClass();
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f89423w;
        Intrinsics.checkNotNullParameter(listId, "listId");
        bVar.u.R();
        boolean zF = Intrinsics.f(listId, "ITEM_COUNTRY_ID");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (zF) {
            oki.h.v2(aVar2, TransferTrackerInputFormScreenContract$ModalStep.CountryPicker.f89413a, popup);
        } else if (Intrinsics.f(listId, "ITEM_DATE_ID")) {
            oki.h.v2(aVar2, TransferTrackerInputFormScreenContract$ModalStep.DatePicker.f89415a, popup);
        }
        return Unit.f186387a;
    }
}
