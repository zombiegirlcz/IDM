package knd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import djb.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f186061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnb.w f186062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le3.a f186063c;
    public final ppk.f d;
    public final j9l.a e;
    public final wa7.m f;

    public e(djb.n savingsAccountsDetailsInteractor, rnb.w savingsVaultInteractor, le3.a analyticsCurrencyInteractor, ppk.f ratesInteractor, j9l.a moneyCalculator, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f186061a = savingsAccountsDetailsInteractor;
        this.f186062b = savingsVaultInteractor;
        this.f186063c = analyticsCurrencyInteractor;
        this.d = ratesInteractor;
        this.e = moneyCalculator;
        this.f = hiddenAccountsInteractor;
    }

    public final cxe.u a(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Flow gVar;
        Flow gVar2;
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        boolean zJ = ind.a.j(analyticsAccountsSelection);
        od0.i iVar = od0.i.f224256b;
        if (zJ) {
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) zhm.d0.a0(analyticsAccountsSelection.getF99208a());
            if ((analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Junior) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Joint)) {
                od0.i.Companion.getClass();
                gVar2 = new go.g(new Data(iVar, null, false, 6, null), 2);
            } else {
                if (!(analyticsAccount instanceof AnalyticsAccount.Savings)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar2 = nim.a.v(b((AnalyticsAccount.Savings) analyticsAccount), new a(0));
            }
            return nim.a.A(gVar2, new a(1));
        }
        if (analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Savings) {
            AnalyticsAccountsSelection.Savings savings = (AnalyticsAccountsSelection.Savings) analyticsAccountsSelection;
            Set set = savings.f99206a;
            ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((AnalyticsAccount.Savings) it8.next()));
            }
            gVar = xam.a.h(new d(this, savings, null), zh9.u0.k(arrayList));
        } else {
            if (!(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.TotalWealth) && !(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Spending) && !(analyticsAccountsSelection instanceof AnalyticsAccountsSelection.Pro)) {
                throw new NoWhenBranchMatchedException();
            }
            od0.i.Companion.getClass();
            gVar = new go.g(new Data(iVar, null, false, 6, null), 2);
        }
        return nim.a.A(gVar, new kkk.u(29));
    }

    public final Flow b(AnalyticsAccount.Savings savings) {
        if (savings instanceof AnalyticsAccount.Savings.PersonalAll) {
            return c(savings, k.b.f115282a);
        }
        if (savings instanceof AnalyticsAccount.Savings.JointAll) {
            return c(savings, k.a.f115281a);
        }
        boolean z = savings instanceof AnalyticsAccount.Savings.PersonalIndividual;
        w4l.j jVar = w4l.j.f294644c;
        rnb.w wVar = this.f186062b;
        if (z) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.PersonalIndividual) savings).f99204a, jVar), new a(2));
        }
        if (savings instanceof AnalyticsAccount.Savings.JointIndividual) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.JointIndividual) savings).f99200b, jVar), new a(2));
        }
        if (savings instanceof AnalyticsAccount.Savings.JuniorSaving) {
            return nim.a.v(wVar.c(((AnalyticsAccount.Savings.JuniorSaving) savings).f99201a, jVar), new a(2));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow c(AnalyticsAccount.Savings savings, djb.k kVar) {
        return xam.a.h(new c(this, savings, null), new t38.e(((rnb.i) this.f186061a).e(kVar), 24, this.f.k(), new b(3, null)));
    }
}
