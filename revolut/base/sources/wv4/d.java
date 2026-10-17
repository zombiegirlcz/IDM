package wv4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardStatementBottomSheetScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardStatementBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((i) this.u.R2()).I2();
        return Unit.f186387a;
    }
}
