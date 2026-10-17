package f9d;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpcomingTransactionTroubleshooterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UpcomingTransactionTroubleshooterScreen upcomingTransactionTroubleshooterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upcomingTransactionTroubleshooterScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.v.i0.getValue();
        com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b bVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) mVar;
        bVar.y2(model.e, model.f51822a);
        return Unit.f186387a;
    }
}
