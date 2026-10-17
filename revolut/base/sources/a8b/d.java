package a8b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CobrandedCardsDowngradeConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cobrandedCardsDowngradeConfirmationScreen;
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

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        Object obj3 = model.u;
        j jVar = (j) hVar;
        jVar.getClass();
        e eVar = obj3 instanceof e ? (e) obj3 : null;
        if (eVar != null) {
            jVar.C2(new f(eVar.f2147a, eVar.f2148b));
        }
        return Unit.f186387a;
    }
}
