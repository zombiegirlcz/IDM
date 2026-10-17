package jck;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanGiftingReceiverPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planGiftingReceiverPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52373a;
        boolean zF = Intrinsics.f(str, "id_add_contacts");
        PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen = this.v;
        if (zF) {
            com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar2 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) planGiftingReceiverPickerScreen.d();
            aVar2.getClass();
            aVar2.C1(u0.c(new ContactsFeatureConfig.AddContact.ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.FINISH, null)));
        } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            ((com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) planGiftingReceiverPickerScreen.d()).f102512t.a();
        }
        return Unit.f186387a;
    }
}
