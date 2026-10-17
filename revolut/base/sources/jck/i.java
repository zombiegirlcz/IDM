package jck;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanGiftingReceiverPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planGiftingReceiverPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar2 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) vVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof zm3.l) {
            aVar2.C2(new r((zm3.l) obj3));
        } else if (Intrinsics.f(obj3, "id_upcoming_birthdays_item_sharing_disabled")) {
            aVar2.C2(s.f172867a);
        }
        return Unit.f186387a;
    }
}
