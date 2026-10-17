package kog;

import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$DomainState;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$ModalStep;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PersonsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PersonsListScreen personsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = personsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PersonsListScreen personsListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b bVar = (com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) personsListScreen.e3();
                bVar.C2(new h(d0.d1(((PersonsListScreenContract$DomainState) ((j2) bVar.o.f22677a).getValue()).f94663b.values())));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) personsListScreen.e3()).C2(a.C0582a.f94669a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.b) personsListScreen.e3()).f94670p, PersonsListScreenContract$ModalStep.CloseConnectionsDescription.f94666a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
