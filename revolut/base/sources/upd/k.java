package upd;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        WealthAccount wealthAccount = (WealthAccount) pair.f186385a;
        List list = (List) pair.f186386b;
        j23.b bVarK = null;
        switch (j.f281975a[wealthAccount.getF95255c().ordinal()]) {
            case 1:
            case 2:
            case 3:
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (v.k(xdh.c.ACTIVE, xdh.c.SUSPENDED).contains(((RoboPortfolioInfo) obj3).f95704g)) {
                        arrayList.add(obj3);
                    }
                }
                List list2 = (List) ue0.e.M(arrayList);
                if (list2 != null) {
                    List<RoboPortfolioInfo> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                    for (RoboPortfolioInfo roboPortfolioInfo : list3) {
                        n nVar = this.v;
                        arrayList2.add(xam.a.h(new m(nVar, roboPortfolioInfo, wealthAccount, null), rd0.e.b(nVar.e.J(AccountId.Personal.f51414a, w4l.h.f294642c))));
                    }
                    bVarK = u0.k(arrayList2);
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return bVarK == null ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : bVarK;
    }
}
