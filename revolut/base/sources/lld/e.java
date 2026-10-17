package lld;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ SlotChecklistController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SlotChecklistController slotChecklistController, Continuation continuation) {
        super(2, continuation);
        this.u = slotChecklistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z1 z1Var = ((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.u.d()).z;
        c cVar = (c) d0.d0(z1Var.d());
        if (cVar == null) {
            cVar = c.INPUT_DATA;
        }
        z1Var.k(cVar);
        return Unit.f186387a;
    }
}
