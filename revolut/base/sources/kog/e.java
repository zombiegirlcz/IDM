package kog;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PersonsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PersonsListScreen personsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = personsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        bVar.H2(bVar.o, new k7c.n(personalDetailId, 15));
        return Unit.f186387a;
    }
}
