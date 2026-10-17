package jb0;

import com.revolut.core.backend_flow.impl.ui.entities_selection.EntitiesSelectionController;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ EntitiesSelectionController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EntitiesSelectionController entitiesSelectionController, Continuation continuation) {
        super(2, continuation);
        this.u = entitiesSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        gb0.f fVar = (gb0.f) ((i) this.u.R2()).f172543s;
        fVar.getClass();
        fVar.T2(new gb0.e(fVar, null), new yi5.b(27));
        return Unit.f186387a;
    }
}
