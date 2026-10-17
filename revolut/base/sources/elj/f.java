package elj;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanPacNumberTransferConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute = bVar.o.e.i;
        if (Intrinsics.f(listId, esimPhoneNumberPortingAttribute.f100338a)) {
            bVar.H2(bVar.u, new ei8.d(new mlj.i(text, esimPhoneNumberPortingAttribute.f, esimPhoneNumberPortingAttribute.f100341g, false), 16));
        }
        return Unit.f186387a;
    }
}
