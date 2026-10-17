package le3;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import klf.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.hc;
import tof.i1;
import tof.r2;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.q f194470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f194471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.b f194472c;

    public k(djb.q savingsTransactionsInteractor, wsg.n walletInteractor, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f194470a = savingsTransactionsInteractor;
        this.f194471b = walletInteractor;
        this.f194472c = newWalletsInteractor;
    }

    public final vkm.v a(List analyticsAccounts) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(analyticsAccounts, "analyticsAccounts");
        List list = analyticsAccounts;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            int i = 2;
            Continuation continuation = null;
            if (!it8.hasNext()) {
                return new vkm.v(nim.a.v(u0.k(arrayList), new b(18)), new w1(i, 6, continuation));
            }
            AnalyticsAccount analyticsAccount = (AnalyticsAccount) it8.next();
            if ((analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Pro)) {
                flowV = nim.a.v(this.f194472c.e(w4l.h.f294642c), new b(19));
            } else if (analyticsAccount instanceof AnalyticsAccount.Joint) {
                flowV = zi0.c.i(zhm.u.c(new hc(((AnalyticsAccount.Joint) analyticsAccount).getF99182a().f51413b, null)));
            } else {
                boolean z = analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual;
                djb.q qVar = this.f194470a;
                if (z) {
                    flowV = ((rnb.v) qVar).d(((AnalyticsAccount.Savings.PersonalIndividual) analyticsAccount).f99204a);
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                    flowV = ((rnb.v) qVar).d(((AnalyticsAccount.Savings.JointIndividual) analyticsAccount).f99200b);
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) {
                    flowV = zi0.c.i(zhm.v.k(r2.f273022a, i1.f272794a));
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                    flowV = ((rnb.v) qVar).a(((AnalyticsAccount.Savings.JointAll) analyticsAccount).f99198a);
                } else if (analyticsAccount instanceof AnalyticsAccount.Junior) {
                    flowV = rd0.e.b(nim.a.w(this.f194471b.a0(((AnalyticsAccount.Junior) analyticsAccount).getF99186a(), false), new b(17)));
                } else {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowV = ((rnb.v) qVar).d(((AnalyticsAccount.Savings.JuniorSaving) analyticsAccount).f99201a);
                }
            }
            arrayList.add(flowV);
        }
    }
}
