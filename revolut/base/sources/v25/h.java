package v25;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, LoanKompotFeatureConfig.RenameLoanNavigationDestination.class, "<init>", "<init>(Lcom/revolut/feature/credit/loan/api/models/rev10/Loan;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Loan p0 = (Loan) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new LoanKompotFeatureConfig.RenameLoanNavigationDestination(p0);
    }
}
