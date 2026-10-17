package t52;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import io3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.na;
import tof.xa;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final i7 a(ApmPaymentProfile apmPaymentProfile) {
        Intrinsics.checkNotNullParameter(apmPaymentProfile, "<this>");
        int i = a.f268035a[apmPaymentProfile.ordinal()];
        if (i == 1) {
            return new na(new xa(l.MERCHANT));
        }
        if (i == 2) {
            return new xa(l.MERCHANT);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TransferMoneyPocket b(ApmPaymentProfile apmPaymentProfile) {
        Intrinsics.checkNotNullParameter(apmPaymentProfile, "<this>");
        int i = a.f268035a[apmPaymentProfile.ordinal()];
        if (i == 1) {
            return new TransferMoneyPocket(null, null, 3);
        }
        if (i == 2) {
            return new TransferMoneyPocket(null, new SourceAccount.Pocket(null, l.MERCHANT, null, 4), 1);
        }
        throw new NoWhenBranchMatchedException();
    }
}
