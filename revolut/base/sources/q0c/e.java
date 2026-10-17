package q0c;

import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import java.time.YearMonth;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;
import pig.y;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionsListScreen f241229w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RevPointsTransactionsListScreen revPointsTransactionsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241229w = revPointsTransactionsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f241229w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f241229w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f241229w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsTransactionsListScreen revPointsTransactionsListScreen = this.f241229w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) revPointsTransactionsListScreen.k3();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                if (dVar.o.f83877b.f83882b) {
                    dVar.H2(dVar.f83893w, new y(input, 13));
                }
                return Unit.f186387a;
            case 1:
                String monthId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarF3 = revPointsTransactionsListScreen.k3();
                Intrinsics.h(monthId);
                com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar2 = (com.revolut.feature.rev_points.impl.ui.transactions.list.d) pVarF3;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(monthId, "monthId");
                YearMonth yearMonth = YearMonth.parse(monthId);
                cli.y yVar = dVar2.f83893w;
                Object value = ((j2) yVar.f22677a).getValue();
                l lVar = value instanceof l ? (l) value : null;
                if (lVar != null) {
                    YearMonth yearMonthJ2 = com.revolut.feature.rev_points.impl.ui.transactions.list.d.J2(lVar);
                    if (yearMonthJ2 == null || yearMonthJ2.compareTo(yearMonth) > 0) {
                        k kVar = lVar.f241233a;
                        boolean zA = false;
                        if (kVar instanceof i) {
                            lk0.e eVar = (lk0.e) d0.o0(((i) kVar).f241231a.f196174a);
                            if (eVar != null) {
                                zA = x5d.b.a(eVar);
                            }
                        } else {
                            if (!(kVar instanceof j)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lk0.e eVar2 = (lk0.e) d0.o0(((j) kVar).f241232a.f196174a);
                            if (eVar2 != null) {
                                zA = x5d.b.a(eVar2);
                            }
                        }
                        if (!zA) {
                            dVar2.z = yearMonth;
                            dVar2.H2(yVar, new kp7.q(yearMonth, 3));
                            dVar2.f83895y.onNext(h.b.f196176a);
                        }
                    } else {
                        dVar2.H2(yVar, new kp7.q(yearMonth, 2));
                    }
                }
                return Unit.f186387a;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(bool);
                revPointsTransactionsListScreen.U = bool.booleanValue();
                revPointsTransactionsListScreen.g3();
                return Unit.f186387a;
        }
    }
}
