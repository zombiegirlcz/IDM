package f9d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpcomingTransactionTroubleshooterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UpcomingTransactionTroubleshooterScreen upcomingTransactionTroubleshooterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upcomingTransactionTroubleshooterScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.v.i0.getValue();
        com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b bVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) mVar;
        bVar.y2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
