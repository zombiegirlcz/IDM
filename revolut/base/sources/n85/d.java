package n85;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import do3.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import q35.e0;
import qv0.p;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanRepaymentsListScreen f213206w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(LoanRepaymentsListScreen loanRepaymentsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213206w = loanRepaymentsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f213206w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f213206w, continuation, 1);
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
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        String str;
        String str2;
        int i = this.u;
        LoanRepaymentsListScreen loanRepaymentsListScreen = this.f213206w;
        switch (i) {
            case 0:
                String str3 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(str3);
                int i2 = Integer.parseInt(str3);
                KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                loanRepaymentsListScreen.h().post(new com.google.android.material.sidesheet.b(loanRepaymentsListScreen, i2, 9));
                break;
            default:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                koi.j item = (koi.j) obj3;
                k kVar = (k) ((g) loanRepaymentsListScreen.X.getValue());
                kVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Object f55203g = ((p) item).getF();
                if (f55203g instanceof e0) {
                    e0 e0Var = (e0) f55203g;
                    LoanDetails loanDetails = (LoanDetails) ((f) kVar.t2()).f213208a.getContent();
                    if (loanDetails != null && (nVar = (n) ((f) kVar.t2()).f213210c.getContent()) != null && (str = nVar.f116408a) != null) {
                        if (loanDetails.f70144a.o != b95.a.MORTGAGE_LOAN || (str2 = e0Var.f) == null || str2.equals(str)) {
                            d8l.d.t(kVar, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(e0Var.f241805b), null, null, null, 94)));
                        } else {
                            d8l.d.t(kVar, new FeatureCommand(new LoanKompotFeatureConfig.RepaymentDetails(loanDetails, e0Var, str)));
                        }
                    }
                    Unit unit = Unit.f186387a;
                } else if (f55203g instanceof q35.j) {
                    d8l.d.t(kVar, new FeatureCommand(new LoanKompotFeatureConfig.UpcomingInstalmentDetails((LoanDetails) zi0.c.I(((f) kVar.t2()).f213208a), (n) zi0.c.I(((f) kVar.t2()).f213210c))));
                    Unit unit2 = Unit.f186387a;
                }
                if (Intrinsics.f(item.getF52781a(), "ERROR_STATE_ID")) {
                    kVar.f213220t.a();
                    Unit unit3 = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
