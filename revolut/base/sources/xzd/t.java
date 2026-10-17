package xzd;

import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.custom_statement.screen.b u;
    public final /* synthetic */ CustomStatementData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CustomisationSelection f309946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ StatementPeriodSelection f309947x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar, CustomStatementData customStatementData, CustomisationSelection customisationSelection, StatementPeriodSelection statementPeriodSelection, Continuation continuation) {
        super(1, continuation);
        this.u = bVar;
        this.v = customStatementData;
        this.f309946w = customisationSelection;
        this.f309947x = statementPeriodSelection;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, this.v, this.f309946w, this.f309947x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = this.u;
        zxd.c cVar = bVar.f88349q;
        CustomisationParameters parameters = this.v.getParameters();
        StatementPeriodSelection statementPeriodSelection = this.f309947x;
        StatementPeriod statementPeriod = statementPeriodSelection.f88218b;
        LocalDate start = statementPeriod.getStart();
        LocalDate end2 = statementPeriod.getEnd();
        StatementPeriodType statementPeriodType = statementPeriodSelection.f88217a;
        CustomisationSelection customisationSelection = this.f309946w;
        return yji.l.b1(bVar, new vvh.e(mo3.a.g(byd.g.c(boh.f.e(rd0.e.b(o70.a.f(((ryd.w) cVar).i(parameters, this.f309946w, start, end2, statementPeriodType, customisationSelection.getFormat()))), new xyc.j(customisationSelection, bVar, 4)), bVar.X(), bVar.v.d(), new o(bVar, 6), new o(bVar, 7)), null, new xx9.e(25), 1), 10), null, new xv4.o(bVar, (Continuation) null, 11), 3);
    }
}
