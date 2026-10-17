package g55;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotDestination;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import l35.h;
import r35.e;
import y45.i;
import y45.q;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f140625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f140626b;

    public c(i loanProductInteractor, h repaymentV2AvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(repaymentV2AvailabilityInteractor, "repaymentV2AvailabilityInteractor");
        this.f140625a = loanProductInteractor;
        this.f140626b = repaymentV2AvailabilityInteractor;
    }

    public final FeatureCommand a(String loanId, b95.a product) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(product, "product");
        return ((q) this.f140626b).a(product) ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new LoanKompotFeatureConfig.RepaymentV2Destination(loanId, product, (d) null, 12), false, (Integer) null, 0, 61)) : new FeatureCommand(new LoanKompotFeatureConfig.PartialRepayment(loanId));
    }

    public final LoanKompotDestination b(LoanDetails loanDetails, d dVar) {
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Loan loan = loanDetails.f70144a;
        return ((q) this.f140626b).a(loan.o) ? new LoanKompotFeatureConfig.RepaymentV2Destination(loan.f70108a, loan.o, dVar, 8) : new LoanKompotFeatureConfig.RepaymentTypePreloadedDestination(loanDetails);
    }
}
