package xzd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CustomStatementScreen customStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f51832a;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_SETTINGS_ITEM")) {
            bVar.H2(bVar.f88354x, new xx9.f(18));
        }
        return Unit.f186387a;
    }
}
