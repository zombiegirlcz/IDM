package gp3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CorporateEventDetailsController corporateEventDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.corporate_events.impl.ui.screen.details.a aVar2 = (com.revolut.feature.corporate_events.impl.ui.screen.details.a) aVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "CORPORATE_EVENTS_DESCRIPTION_BUTTON_ID")) {
            aVar2.I2();
        } else if (Intrinsics.f(str, "CORPORATE_EVENTS_EARNING_CALL_BUTTON_ID")) {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
