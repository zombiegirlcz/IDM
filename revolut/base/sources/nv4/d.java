package nv4;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import njj.n0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardStatementExportScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditCardStatementExportScreen creditCardStatementExportScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardStatementExportScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.card.impl.ui.statement.export.b bVar = (com.revolut.feature.credit.card.impl.ui.statement.export.b) this.u.d();
        LocalDate localDate = ((i) ((j2) bVar.f69703t.f22677a).getValue()).f219464a;
        if (localDate != null) {
            bVar.n2(new n0(bVar, localDate, null, 23), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
