package li8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorPersonalDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorPersonalDetailsScreen juniorPersonalDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorPersonalDetailsScreen;
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
        yhm.o.b(obj2);
        j jVarD = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) jVarD;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_GENDER")) {
            oki.h.v2(cVar.v, new JuniorPersonalDetailsScreenContract$ModalStep.UpdateGender(((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) ((j2) cVar.u.f22677a).getValue()).e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
