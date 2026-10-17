package gie;

import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((SlotChecklistPayload) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SlotChecklistPayload slotChecklistPayload = (SlotChecklistPayload) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = this.v;
        ((eie.b) sVar.f144151n).a();
        sVar.f144157w.k(new Pair(new TabAccountsScreenContract$ModalStep.SlotChecklist(slotChecklistPayload), ModalDestination.Style.BOTTOM_DIALOG.f98301a));
        return Unit.f186387a;
    }
}
