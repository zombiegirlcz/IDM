package e9d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransactionsTroubleshooterTopLevelScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TransactionsTroubleshooterTopLevelScreen transactionsTroubleshooterTopLevelScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transactionsTroubleshooterTopLevelScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        TransactionsTroubleshooterTopLevelScreen transactionsTroubleshooterTopLevelScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) transactionsTroubleshooterTopLevelScreen.T2()).u2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((z) transactionsTroubleshooterTopLevelScreen.T2()).y2(null, "SEARCH_ITEM_ID");
                break;
        }
        return Unit.f186387a;
    }
}
