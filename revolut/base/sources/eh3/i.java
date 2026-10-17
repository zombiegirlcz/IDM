package eh3;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ ChecklistCollectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ChecklistCollectionScreen checklistCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = checklistCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar2 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.u.R2();
        aVar2.getClass();
        aVar2.n2(new ebg.o(aVar2, null, 8), new whi.b(6));
        return Unit.f186387a;
    }
}
