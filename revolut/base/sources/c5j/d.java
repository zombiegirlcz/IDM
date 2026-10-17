package c5j;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MissingFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MissingFieldsScreen missingFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = missingFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.d();
        Object obj3 = model.P;
        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar2 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) lVarE3;
        y yVar = aVar2.f99772t;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
        if (obj3 instanceof Field$BackendDefinition.DropdownDefinition) {
            oki.h.v2(aVar3, new MissingFieldsScreenContract$ModalStep.DefinitionSelector(((j) ((j2) yVar.f22677a).getValue()).f21568a, (Field$BackendDefinition.DropdownDefinition) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof Field$BackendDefinition.SearchList) {
            oki.h.v2(aVar3, new MissingFieldsScreenContract$ModalStep.SearchList(((j) ((j2) yVar.f22677a).getValue()).f21568a, (Field$BackendDefinition.SearchList) obj3), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        }
        return Unit.f186387a;
    }
}
