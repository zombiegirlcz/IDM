package oh9;

import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final ApmPaymentMethod a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        switch (a.f225323a[gVar.ordinal()]) {
            case 1:
                return ApmPaymentMethod.BPAY.f62166a;
            case 2:
                return ApmPaymentMethod.F24.f62168a;
            case 3:
                return ApmPaymentMethod.TAPI.f62176a;
            case 4:
                return ApmPaymentMethod.TAPI_CO.f62177a;
            case 5:
                return ApmPaymentMethod.MBREF.f62172a;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
