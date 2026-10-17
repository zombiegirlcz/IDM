package xnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f307424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f307425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge3.a f307426c;
    public final le3.a d;
    public final djb.n e;

    public n(ang.f userInteractor, wsg.n walletInteractor, ge3.a analyticsPocketsInteractor, le3.a analyticsCurrencyInteractor, djb.n savingsAccountsDetailsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(analyticsCurrencyInteractor, "analyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        this.f307424a = userInteractor;
        this.f307425b = walletInteractor;
        this.f307426c = analyticsPocketsInteractor;
        this.d = analyticsCurrencyInteractor;
        this.e = savingsAccountsDetailsInteractor;
    }

    public final jhi.k a(AnalyticsAccountsSelection analyticsAccountsSelection) {
        Object objQ;
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        Flow flowE = ((le3.f) this.f307426c).e(analyticsAccountsSelection.getF99208a());
        ang.f fVar = this.f307424a;
        w4l.h hVar = w4l.h.f294642c;
        Flow flowQ = vkm.q.q(nim.a.v(fVar.j(hVar), new xlj.h(19)));
        Set<AnalyticsAccount> f99208a = analyticsAccountsSelection.getF99208a();
        ArrayList arrayList = new ArrayList(zhm.w.t(f99208a, 10));
        for (AnalyticsAccount analyticsAccount : f99208a) {
            if ((analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) || (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual)) {
                objQ = vkm.q.q(nim.a.v(fVar.j(hVar), new xlj.h(19)));
            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                objQ = zi0.c.i(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99199a.f51412a);
            } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                objQ = zi0.c.i(((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a.f51412a);
            } else if (analyticsAccount instanceof AnalyticsAccount.Joint) {
                objQ = zi0.c.i(((AnalyticsAccount.Joint) analyticsAccount).getF99182a().f51412a);
            } else if (analyticsAccount instanceof AnalyticsAccount.Junior) {
                objQ = zi0.c.i(((AnalyticsAccount.Junior) analyticsAccount).getF99186a());
            } else {
                if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                    throw new NoWhenBranchMatchedException();
                }
                objQ = rd0.e.b(nim.a.w(((rnb.i) this.e).b(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99201a, hVar), new xlj.h(20)));
            }
            arrayList.add(objQ);
        }
        j23.b bVarK = zh9.u0.k(arrayList);
        Set f99208a2 = analyticsAccountsSelection.getF99208a();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(f99208a2, 10));
        Iterator it8 = f99208a2.iterator();
        while (it8.hasNext()) {
            arrayList2.add(com.revolut.retail.feature.api.a.a((AnalyticsAccount) it8.next()));
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it9.hasNext()) {
                return nim.a.u(new xjl.g(continuation, analyticsAccountsSelection, 8), zh9.u0.m(zh9.u0.i(flowE, flowQ, bVarK), zh9.u0.m(zh9.u0.k(arrayList3), vkm.q.q(this.d.b(analyticsAccountsSelection)))));
            }
            ufm.i iVarE = this.f307425b.E((AccountId) it9.next());
            m function = m.f307422a;
            Intrinsics.checkNotNullParameter(function, "function");
            ufm.i iVar = new ufm.i(iVarE, new nd.n(20), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            arrayList3.add(new v1(new xge.f(iVar, continuation, 9)));
        }
    }
}
