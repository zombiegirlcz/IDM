package xzd;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CustomStatementScreen customStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f51913a;
        boolean z = model.f51915c;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_HIDE_BALANCES_SWITCH")) {
            bVar.J2(CustomisationSelection.copy$default(bVar.I2(), null, null, null, !z, null, null, null, null, null, 503, null));
        }
        return Unit.f186387a;
    }
}
