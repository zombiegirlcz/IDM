package xzd;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomStatementPeriods;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CustomStatementScreen customStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CustomStatementPeriods periods;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        y yVar = bVar.f88354x;
        StatementPeriod statementPeriod = ((k) ((j2) yVar.f22677a).getValue()).f309932c;
        j2 j2Var = (j2) yVar.f22677a;
        StatementPeriodSelection period = ((k) j2Var.getValue()).f309931b.getPeriod();
        CustomStatementData customStatementData = (CustomStatementData) ((k) j2Var.getValue()).f309930a.getContent();
        TaxPeriod taxPeriod = (customStatementData == null || (periods = customStatementData.getPeriods()) == null) ? null : periods.getTaxPeriod();
        if (Intrinsics.f(listId, "ID_PERIOD_ITEM") && statementPeriod != null && period != null && taxPeriod != null) {
            oki.h.v2(bVar.z, new CustomStatementScreenContract$ModalStep.PeriodSelector(statementPeriod, period, taxPeriod), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
