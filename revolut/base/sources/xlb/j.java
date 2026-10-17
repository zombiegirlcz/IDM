package xlb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SavingsOnboardingFlowContract$Step savingsOnboardingFlowContract$Step = domainState.e;
        if (savingsOnboardingFlowContract$Step == null || (savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Article.PreFlow) || (savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.PendingJointAccount)) {
            z = false;
        } else {
            if (!(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Article.InFlow) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.AccountCreation) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Documents) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.FundInfo) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.InterestAndFees) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.OptionSelection) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ProductDetailsReview) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ProtectionAndSafety) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.Upsell) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.TieredLimits) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.SelectCurrency) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.SelectTerm) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ChallengeSetup) && !(savingsOnboardingFlowContract$Step instanceof SavingsOnboardingFlowContract$Step.ChallengeReview)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        return new i(z);
    }
}
