package i83;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReactivateCardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReactivateCardScreen reactivateCardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reactivateCardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarR2 = this.v.R2();
        String listId = model.f51822a;
        com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) iVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CANNOT_REACTIVATE_CELL_DETAILS_LIST_ID")) {
            bVar.H2(bVar.f65490p, new i6j.p(8));
        }
        return Unit.f186387a;
    }
}
