package pqa;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$ModalStep;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdditionalFieldsScreen additionalFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalFieldsScreen;
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
        o.b(obj2);
        k kVarE3 = this.v.d();
        Object obj3 = model.P;
        com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar2 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) kVarE3;
        if (obj3 instanceof AdditionalFieldInput.DropdownInput) {
            oki.h.v2(aVar2.f81558s, new AdditionalFieldsScreenContract$ModalStep.DropdownSelector(((i) ((j2) aVar2.f81557r.f22677a).getValue()).f238709a, (AdditionalFieldInput.DropdownInput) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
