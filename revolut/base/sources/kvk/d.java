package kvk;

import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$FinancialsStatementsKompotMigration;
import com.revolut.retail.feature.stockdetails.api.navigation.StockFinancialsStatementsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials.StockFinancialsControllerContract$InputData;
import ip0.t3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.q;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StockFinancialsController f190140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StockFinancialsController stockFinancialsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f190140w = stockFinancialsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f190140w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f190140w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f190140w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((uqk.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        StockFinancialsController stockFinancialsController = this.f190140w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qsk.l chart = (qsk.l) pair.f186385a;
                t3 category = (t3) pair.f186386b;
                o oVar = (o) stockFinancialsController.d();
                oVar.getClass();
                Intrinsics.checkNotNullParameter(chart, "chart");
                Intrinsics.checkNotNullParameter(category, "category");
                oVar.H2(oVar.u, new q(chart, category, 17));
                break;
            case 1:
                uqk.l statementType = (uqk.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) stockFinancialsController.d();
                StockFinancialsControllerContract$InputData stockFinancialsControllerContract$InputData = oVar2.o;
                Intrinsics.checkNotNullParameter(statementType, "statementType");
                if (((jte.d) oVar2.f190153s).c(StockDetailsApi$Toggles$FinancialsStatementsKompotMigration.f103733c)) {
                    oVar2.C1(new StockFinancialsStatementsDestination(stockFinancialsControllerContract$InputData.f103960a, statementType));
                } else {
                    csk.c cVar = csk.h.Companion;
                    String str = stockFinancialsControllerContract$InputData.f103960a;
                    cVar.getClass();
                    oVar2.C1(u0.b(csk.c.a(str, statementType)));
                }
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qsk.l chart2 = (qsk.l) pair2.f186385a;
                String selectedTabId = (String) pair2.f186386b;
                o oVar3 = (o) stockFinancialsController.d();
                oVar3.getClass();
                Intrinsics.checkNotNullParameter(chart2, "chart");
                Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                oVar3.H2(oVar3.u, new q(chart2, selectedTabId, 16));
                break;
        }
        return Unit.f186387a;
    }
}
