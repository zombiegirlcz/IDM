package tpd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f273342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f273343c;

    public /* synthetic */ b(xi0.b bVar, AccountId accountId, int i) {
        this.f273341a = i;
        this.f273342b = bVar;
        this.f273343c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        IncomeSorterDestinationInfo personalCurrencyPocket;
        xi0.b bVar;
        Object next;
        List pockets = (List) obj2;
        switch (this.f273341a) {
            case 0:
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    if (lqd.a.d(dVar.f163147c, this.f273342b) && dVar.e == l.CURRENT && cp5.d.A(z92.f.l(dVar))) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList<io3.d> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (io3.d dVar2 : arrayList2) {
                    AccountId accountId = this.f273343c;
                    if (accountId instanceof AccountId.Joint) {
                        personalCurrencyPocket = new IncomeSorterDestinationInfo.JointPocket(dVar2, zld.a.ACTIVE);
                    } else {
                        if (!accountId.equals(AccountId.Personal.f51414a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        personalCurrencyPocket = new IncomeSorterDestinationInfo.PersonalCurrencyPocket(dVar2, zld.a.ACTIVE);
                    }
                    arrayList3.add(personalCurrencyPocket);
                }
                return arrayList3;
            default:
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it8 = pockets.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    bVar = this.f273342b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar3 = (io3.d) next;
                AccountId accountId2 = this.f273343c;
                if (dVar3 != null) {
                    return new bcb.f(accountId2, z92.f.j(dVar3), dVar3.f163145a);
                }
                xi0.a aVar = xi0.b.Companion;
                String str = bVar.f306286a;
                aVar.getClass();
                return new bcb.f(accountId2, new dj0.d(0L, xi0.a.a(str)), null);
        }
    }
}
