package k0e;

import cli.y;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreen;
import do3.q;
import ix6.l0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import vkm.j2;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SavingsStatementsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SavingsStatementsScreen savingsStatementsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = savingsStatementsScreen;
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        StatementsFormat statementsFormat;
        int i = this.u;
        SavingsStatementsScreen savingsStatementsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.statements.impl.ui.savings.a) savingsStatementsScreen.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.statements.impl.ui.savings.a aVar3 = (com.revolut.feature.statements.impl.ui.savings.a) savingsStatementsScreen.R2();
                vyd.a aVar4 = aVar3.f88378s;
                y yVar = aVar3.f88381x;
                StatementPeriod statementPeriod = ((e) ((j2) yVar.f22677a).getValue()).d;
                j2 j2Var = (j2) yVar.f22677a;
                List list = ((e) j2Var.getValue()).f180025b;
                ArrayList accountIds = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    accountIds.add(((SavingsAccountsStatementFeatureConfig$SavingsAccountInfo) it8.next()).f88261a);
                }
                e eVar = (e) j2Var.getValue();
                Continuation continuation = null;
                if (eVar.d == null || eVar.f180025b.isEmpty()) {
                    IllegalStateException illegalStateException = new IllegalStateException("Savings statement generate button was clicked when account data is not initialized");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    aVar3.X1(new y0(null, aVar4.c(illegalStateException), false, 5));
                } else {
                    if (statementPeriod == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    e eVar2 = (e) j2Var.getValue();
                    String str = eVar2.f180024a;
                    if (Intrinsics.f(str, "TAB_ID_PDF")) {
                        statementsFormat = StatementsFormat.PDF;
                    } else if (Intrinsics.f(str, "TAB_ID_EXCEL")) {
                        statementsFormat = StatementsFormat.EXCEL;
                    } else {
                        hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown selected tab: ", eVar2.f180024a)));
                        statementsFormat = StatementsFormat.PDF;
                    }
                    StatementsFormat format = statementsFormat;
                    zxd.c cVar = aVar3.f88375p;
                    LocalDate fromDate = statementPeriod.getStart();
                    LocalDate toDate = statementPeriod.getEnd();
                    ryd.w wVar = (ryd.w) cVar;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(fromDate, "fromDate");
                    Intrinsics.checkNotNullParameter(toDate, "toDate");
                    Intrinsics.checkNotNullParameter(accountIds, "accountIds");
                    Intrinsics.checkNotNullParameter(format, "format");
                    yji.l.a1(aVar3, byd.g.a(byd.g.b(q.w(rd0.e.b(o70.a.f(wVar.n(3, new ryd.f(wVar, fromDate, toDate, accountIds, format, 1)))), aVar3), aVar3.X(), aVar4)), null, null, new l0((Object) aVar3, (Object) format, false, continuation, 29), 3);
                }
                return Unit.f186387a;
        }
    }
}
