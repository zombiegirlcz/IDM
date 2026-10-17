package tn2;

import com.revolut.feature.bank_account_switching.api.BankAccountSwitchingToggles$AccountSwitchFR;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingJointReviewSwitchInDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingReviewSwitchOutDestination;
import com.revolut.feature.bank_account_switching.api.navigation.HowOverstapWorksDestination;
import com.revolut.feature.bank_account_switching.impl.ui.how_it_works.HowOverstapWorksScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review_joint.SwitchInJointReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review_joint.SwitchInJointReviewScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlow;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.MobilityAccountSwitchingFlow;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.OverstapAccountSwitchingFlow;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.BankAccountSwitchingSwitchOutFlow;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.BankAccountSwitchingSwitchOutFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(BankAccountSwitchingToggles$AccountSwitchFR.f63882c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof BankAccountSwitchingDestination)) {
            if (destination instanceof BankAccountSwitchingReviewSwitchOutDestination) {
                return new BankAccountSwitchingSwitchOutFlow(new BankAccountSwitchingSwitchOutFlowContract$InputData(((BankAccountSwitchingReviewSwitchOutDestination) destination).f63891b));
            }
            if (destination instanceof BankAccountSwitchingJointReviewSwitchInDestination) {
                return new SwitchInJointReviewScreen(new SwitchInJointReviewScreenContract$InputData(((BankAccountSwitchingJointReviewSwitchInDestination) destination).f63889b));
            }
            if (destination instanceof HowOverstapWorksDestination) {
                return new HowOverstapWorksScreen();
            }
            return null;
        }
        BankAccountSwitchingFlowInputData bankAccountSwitchingFlowInputData = ((BankAccountSwitchingDestination) destination).f63883a;
        int i = a.f272283a[bankAccountSwitchingFlowInputData.getF63886a().ordinal()];
        if (i == 1) {
            return new OverstapAccountSwitchingFlow(bankAccountSwitchingFlowInputData);
        }
        if (i == 2) {
            return new CassAccountSwitchingFlow(bankAccountSwitchingFlowInputData);
        }
        if (i == 3) {
            return new MobilityAccountSwitchingFlow(bankAccountSwitchingFlowInputData);
        }
        throw new NoWhenBranchMatchedException();
    }
}
