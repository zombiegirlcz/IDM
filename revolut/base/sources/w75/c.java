package w75;

import cli.y;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanRepaymentAccountsController f295468w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(LoanRepaymentAccountsController loanRepaymentAccountsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f295468w = loanRepaymentAccountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f295468w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f295468w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(obj2, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Unit unit;
        int i = this.u;
        LoanRepaymentAccountsController loanRepaymentAccountsController = this.f295468w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) loanRepaymentAccountsController.Y.getValue();
                koi.j item = (koi.j) obj3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                lVar.n2(new w3k.i(lVar, item, null, 12), new whi.b(6));
                break;
            default:
                Object obj4 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) loanRepaymentAccountsController.Y.getValue();
                koi.j item2 = (koi.j) obj4;
                lVar2.getClass();
                y yVar = lVar2.f295482t;
                Intrinsics.checkNotNullParameter(item2, "item");
                Object f55191g = ((p) item2).getF55191g();
                if (f55191g instanceof LoanBorrower) {
                    lVar2.H2(yVar, new w3c.n((LoanBorrower) f55191g, 12));
                    lVar2.f295478p.A(lVar2.f295479q.a(((e) ((j2) yVar.f22677a).getValue()).d, ((e) ((j2) yVar.f22677a).getValue()).f295470b));
                    unit = Unit.f186387a;
                } else {
                    unit = null;
                }
                if (unit == null && Intrinsics.f(item2.getF55189b(), "ITEM_ID_BUTTON_SAVE_PRIORITY")) {
                    lVar2.n2(new vmf.k(lVar2, null, 29), new vsl.f(1, lVar2, l.class, "showErrorStatusDialog", "showErrorStatusDialog(Ljava/lang/Throwable;)Z", 0, 15));
                    Unit unit2 = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
