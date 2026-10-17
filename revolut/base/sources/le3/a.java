package le3;

import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.SpendingAnalyticsAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f194447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnb.w f194448b;

    public a(wsg.n walletInteractor, rnb.w savingsVaultsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultsInteractor, "savingsVaultsInteractor");
        this.f194447a = walletInteractor;
        this.f194448b = savingsVaultsInteractor;
    }

    public final Flow a(AnalyticsAccount analyticsAccount) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        boolean z = analyticsAccount instanceof AnalyticsAccount.Personal;
        w4l.j jVar = w4l.j.f294644c;
        wsg.n nVar = this.f194447a;
        if (z || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) || (analyticsAccount instanceof AnalyticsAccount.Joint)) {
            return rd0.e.b(nVar.J(com.revolut.retail.feature.api.a.a(analyticsAccount), jVar));
        }
        boolean z3 = analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual;
        rnb.w wVar = this.f194448b;
        if (z3) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99200b, jVar), new lbh.a(29));
        }
        if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccount).f99204a, jVar), new lbh.a(29));
        }
        if (analyticsAccount instanceof AnalyticsAccount.Junior) {
            return rd0.e.b(nim.a.w(nVar.a0(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), false), new lbh.a(28)));
        }
        if (analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99201a, jVar), new lbh.a(29));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow b(AnalyticsAccountsSelection analyticsAccountsSelection) {
        boolean z;
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        boolean z3 = analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth;
        AnalyticsAccount.Personal.All all2 = AnalyticsAccount.Personal.All.f99192a;
        if (z3) {
            return a(all2);
        }
        if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Pro) {
            return a(AnalyticsAccount.Pro.All.f99196a);
        }
        if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending) {
            Set set = ((AnalyticsAccountsSelection.Spending) analyticsAccountsSelection).f99207a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    if (!(((SpendingAnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Joint)) {
                        return a(all2);
                    }
                }
            }
            return a((AnalyticsAccount) d0.a0(set));
        }
        if (!(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Savings)) {
            throw new NoWhenBranchMatchedException();
        }
        Set set2 = ((AnalyticsAccountsSelection.Savings) analyticsAccountsSelection).f99206a;
        Set set3 = set2;
        if ((set3 instanceof Collection) && set3.isEmpty()) {
            z = true;
        } else {
            Iterator it9 = set3.iterator();
            while (it9.hasNext()) {
                if (!(((AnalyticsAccount.Savings) it9.next()) instanceof AnalyticsAccount.Savings.JointIndividual)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (set2.size() == 1) {
            return a((AnalyticsAccount) d0.a0(set2));
        }
        if (!z) {
            return a(AnalyticsAccount.Savings.PersonalAll.f99203a);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (obj2 instanceof AnalyticsAccount.Savings.JointIndividual) {
                arrayList.add(obj2);
            }
        }
        return a(new AnalyticsAccount.Savings.JointAll(((AnalyticsAccount.Savings.JointIndividual) d0.b0(arrayList)).f99199a));
    }
}
