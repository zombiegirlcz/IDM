package kog;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PersonsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PersonsListScreen personsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = personsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        String personalDetailId = model.f53228a;
        com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(personalDetailId, "personalDetailId");
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f94670p;
        y yVar = bVar.o;
        oki.h.v2(aVar2, new PersonsListScreenContract$ModalStep.Profile((PersonalDetails) ((PersonsListScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f94663b.get(personalDetailId), ((PersonsListScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f94662a), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
