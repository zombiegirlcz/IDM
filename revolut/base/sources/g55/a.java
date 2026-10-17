package g55;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import r35.e;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements r35.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f140624a;

    public a(e repaymentNavigationHelper) {
        Intrinsics.checkNotNullParameter(repaymentNavigationHelper, "repaymentNavigationHelper");
        this.f140624a = repaymentNavigationHelper;
    }

    public final FeatureCommand a(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        String strB = com.revolut.feature.credit.loan.api.models.rev10.e.b(loan);
        if (strB != null) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CreditPostTerminationPlanEntryPoint.Repay(strB, null), false, (Integer) null, 0, 61));
        }
        return ((c) this.f140624a).a(loan.f70108a, loan.o);
    }
}
