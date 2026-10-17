package y65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f311172a = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LoanDetails loanDetails = (LoanDetails) obj2;
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        if (loanDetails.f70144a.f70120s != null) {
            return loanDetails;
        }
        return null;
    }
}
