package rdc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    public d(b errorReasonMapper) {
        Intrinsics.checkNotNullParameter(errorReasonMapper, "errorReasonMapper");
    }

    public static y0 a(boolean z) {
        return new y0("PENDING_PAYMENT_DIALOG_ID", new c0(z ? new TextLocalisedClause(R$string.revolut_pay_accept_payment_pending_zero_authorization_title, null, null, 14) : new TextLocalisedClause(R$string.revolut_pay_accept_payment_pending_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_accept_payment_pending_description, null, null, 14), null, false, null, false, false, null, 1916), false, 4);
    }
}
