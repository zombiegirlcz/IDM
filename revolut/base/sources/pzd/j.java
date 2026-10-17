package pzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.CustomisationState;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.impl.ui.consolidated.StatementsModeConfig;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n33.r0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConsolidatedStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ConsolidatedStatementScreen consolidatedStatementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = consolidatedStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarN;
        CustomisationState customisationState;
        CustomisationState customisationState2;
        int i = this.u;
        ConsolidatedStatementScreen consolidatedStatementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.statements.impl.ui.consolidated.screen.a) consolidatedStatementScreen.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar3 = (com.revolut.feature.statements.impl.ui.consolidated.screen.a) consolidatedStatementScreen.R2();
                p state = (p) ((j2) aVar3.f88322x.f22677a).getValue();
                zxd.c cVar = aVar3.o.f240965a;
                Intrinsics.checkNotNullParameter(state, "state");
                StatementsModeConfig statementsModeConfig = state.i;
                q qVar = state.e;
                Data data = state.f240973h;
                StatementPeriod statementPeriod = state.f240971c;
                StatementsMode statementsMode = statementsModeConfig.f88295a;
                Continuation continuation = null;
                if (statementsMode instanceof StatementsMode.Consolidated) {
                    CustomisationParameters parameters = (data == null || (customisationState2 = (CustomisationState) data.getContent()) == null) ? null : customisationState2.getParameters();
                    CustomisationSelection selection = (data == null || (customisationState = (CustomisationState) data.getContent()) == null) ? null : customisationState.getSelection();
                    if (statementPeriod == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate start = statementPeriod.getStart();
                    LocalDate end2 = statementPeriod.getEnd();
                    StatementPeriodType statementPeriodType = state.d;
                    if (statementPeriodType == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    rVarN = ((ryd.w) cVar).i(parameters, selection, start, end2, statementPeriodType, qVar.b());
                } else if (statementsMode instanceof StatementsMode.TaxCertificate) {
                    if (statementPeriod == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate fromDate = statementPeriod.getStart();
                    LocalDate toDate = statementPeriod.getEnd();
                    StatementsFormat format = qVar.b();
                    ryd.w wVar = (ryd.w) cVar;
                    Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate, "toDate");
                    Intrinsics.checkNotNullParameter(format, "format");
                    rVarN = wVar.n(2, new ryd.h(wVar, fromDate, toDate, format, 2));
                } else {
                    if (!(statementsMode instanceof StatementsMode.TaxFiling)) {
                        if (!Intrinsics.f(statementsMode, StatementsMode.BankIDAnnualStatements.f88212a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException(statementsMode + " not supported");
                    }
                    if (statementPeriod == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    LocalDate fromDate2 = statementPeriod.getStart();
                    LocalDate toDate2 = statementPeriod.getEnd();
                    wi0.b countryCode = statementsMode.getF88215a();
                    ryd.w wVar2 = (ryd.w) cVar;
                    Intrinsics.checkNotNullParameter(fromDate2, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate2, "toDate");
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    rVarN = wVar2.n(2, new q2k.b(wVar2, fromDate2, toDate2, countryCode, 23));
                }
                yji.l.b1(aVar3, new r0(mo3.a.g(byd.g.c(boh.f.e(rd0.e.b(o70.a.f(rVarN)), new pth.m(state, aVar3, 17)), aVar3.X(), aVar3.f88319s.d(), new s(aVar3, 0), new s(aVar3, 1)), null, new pyb.g(8), 1), 22), null, new a0(4, aVar3, continuation), 3);
                return Unit.f186387a;
        }
    }
}
