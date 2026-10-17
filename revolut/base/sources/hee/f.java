package hee;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ TransferTrackerInputFormScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferTrackerInputFormScreen transferTrackerInputFormScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferTrackerInputFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((AmountEditDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.u.R2();
        bVar.u.R();
        oki.h.v2(bVar.f89423w, TransferTrackerInputFormScreenContract$ModalStep.CurrencyPicker.f89414a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
