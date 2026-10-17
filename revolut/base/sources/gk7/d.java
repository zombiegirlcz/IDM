package gk7;

import a83.c0;
import akl.p;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceSelectExpensesScreen f144329w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CFACInsuranceSelectExpensesScreen cFACInsuranceSelectExpensesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144329w = cFACInsuranceSelectExpensesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f144329w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f144329w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceSelectExpensesScreen cFACInsuranceSelectExpensesScreen = this.f144329w;
        switch (i) {
            case 0:
                String text = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) cFACInsuranceSelectExpensesScreen.Y.getValue();
                Intrinsics.h(text);
                m mVar = (m) iVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                mVar.x2(new g58.h(text, 25));
                mVar.y2();
                break;
            default:
                a3 transaction = (a3) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) cFACInsuranceSelectExpensesScreen.Y.getValue();
                Intrinsics.h(transaction);
                m mVar2 = (m) iVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                if (((f) mVar2.t2()).b().contains(transaction.f272579a)) {
                    ArrayList arrayListF1 = d0.f1(((f) mVar2.t2()).f144331b);
                    arrayListF1.removeIf(new p(new aqd.g(transaction, 4), 4));
                    mVar2.f144346t.c(arrayListF1);
                    mVar2.x2(new c0(22, arrayListF1));
                } else {
                    yji.l.j2(mVar2, new CFACInsuranceExpenseDetailsScreen(new CFACInsuranceExpenseDetailsScreenContract$InputData(transaction, mVar2.f144342p.f75110b, null, null, null, null, null, f0.f322471a, false)), null, new k(mVar2, 2), 1);
                }
                break;
        }
        return Unit.f186387a;
    }
}
