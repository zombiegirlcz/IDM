package g6d;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static b a(ConfirmationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ConfirmationResult.ResultCode resultCode = result.f60304c;
        String str = result.f60303b;
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        if (Intrinsics.f(str, "AslAu.Confirmation.Payee")) {
            return b.AU;
        }
        if (Intrinsics.f(str, "Obconnect.NZ.Confirmation.Payee")) {
            return b.NZ;
        }
        if (Intrinsics.f(str, "CBWSI.AE.Confirmation.Payee")) {
            return b.UAE;
        }
        ConfirmationResult.INSTANCE.getClass();
        return ConfirmationResult.f60301h.contains(resultCode) ? b.EU : b.Generic;
    }
}
