package xzd;

import cli.y;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CustomStatementScreen customStatementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CustomStatementScreen customStatementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) customStatementScreen.d();
                y yVar = bVar.f88354x;
                CustomStatementData customStatementData = (CustomStatementData) ((k) ((j2) yVar.f22677a).getValue()).f309930a.getContent();
                CustomisationSelection customisationSelection = ((k) ((j2) yVar.f22677a).getValue()).f309931b;
                StatementPeriodSelection period = customisationSelection.getPeriod();
                if (customStatementData != null && period != null) {
                    bVar.l2(new wh3.h(21, bVar, customStatementData, customisationSelection, period, (Continuation) null), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                customStatementScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
