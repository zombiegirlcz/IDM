package le3;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.q f194504a;

    public x(djb.q savingsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        this.f194504a = savingsTransactionsInteractor;
    }

    public final Flow a(AnalyticsAccount.Savings account) {
        Intrinsics.checkNotNullParameter(account, "account");
        boolean z = account instanceof AnalyticsAccount.Savings.PersonalIndividual;
        djb.q qVar = this.f194504a;
        if (z) {
            return ((rnb.v) qVar).f(((AnalyticsAccount.Savings.PersonalIndividual) account).f99204a);
        }
        if (account instanceof AnalyticsAccount.Savings.PersonalAll) {
            return ((rnb.v) qVar).c();
        }
        if (account instanceof AnalyticsAccount.Savings.JuniorSaving) {
            return ((rnb.v) qVar).f(((AnalyticsAccount.Savings.JuniorSaving) account).f99201a);
        }
        if (account instanceof AnalyticsAccount.Savings.JointAll) {
            return ((rnb.v) qVar).b(((AnalyticsAccount.Savings.JointAll) account).f99198a);
        }
        if (!(account instanceof AnalyticsAccount.Savings.JointIndividual)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((rnb.v) qVar).f(((AnalyticsAccount.Savings.JointIndividual) account).f99200b);
    }
}
