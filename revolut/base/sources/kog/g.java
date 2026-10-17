package kog;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PersonsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PersonsListScreen personsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = personsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) this.u.R2();
        oki.h.v2(bVar.f94670p, new PersonsListScreenContract$ModalStep.Profile(null, ((PersonsListScreenContract$DomainState) ((j2) bVar.o.f22677a).getValue()).f94662a), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
