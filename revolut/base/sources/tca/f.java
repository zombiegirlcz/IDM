package tca;

import com.revolut.feature.payments.api.qr.QrCodeHandlingException;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeFailureReason;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import vca.h;
import vca.i;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f269773a;

    public f(i pixQrCodeErrorMapper) {
        Intrinsics.checkNotNullParameter(pixQrCodeErrorMapper, "pixQrCodeErrorMapper");
        this.f269773a = pixQrCodeErrorMapper;
    }

    public final PixQrCodeDecodeData a(PixQrCodeDecodeResult qrCodeResult) throws QrCodeHandlingException {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(qrCodeResult, "qrCodeResult");
        PixQrCodeDecodeData pixQrCodeDecodeData = qrCodeResult.f;
        PixQrCodeDecodeFailureReason pixQrCodeDecodeFailureReason = qrCodeResult.e;
        if (pixQrCodeDecodeData != null) {
            return pixQrCodeDecodeData;
        }
        xo9.d dVar = xo9.d.WARNING;
        this.f269773a.getClass();
        switch (pixQrCodeDecodeFailureReason == null ? -1 : h.f287662a[pixQrCodeDecodeFailureReason.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_malformed);
                break;
            case 2:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_no_longer_payable);
                break;
            case 3:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_payment_already_completed);
                break;
            case 4:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_creditor_not_found);
                break;
            case 5:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_internal_error);
                break;
            case 6:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_unsupported_implementation);
                break;
            case 7:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_unsupported_functionality);
                break;
            case 8:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_removed_by_creditor);
                break;
            case 9:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_removed_by_creditor);
                break;
            case 10:
                numValueOf = Integer.valueOf(R$string.pix_new_recipient_error_rate_limit_title);
                break;
            case 11:
                numValueOf = Integer.valueOf(R$string.pix_decode_error_handling_creditor_agent_not_reachable);
                break;
            case 12:
                numValueOf = Integer.valueOf(R$string.pix_new_recipient_error_fraud_risk_title);
                break;
            default:
                numValueOf = null;
                break;
        }
        int i = pixQrCodeDecodeFailureReason == null ? -1 : h.f287662a[pixQrCodeDecodeFailureReason.ordinal()];
        Integer numValueOf2 = i != 10 ? i != 12 ? null : Integer.valueOf(R$string.pix_new_recipient_error_fraud_risk_description) : Integer.valueOf(R$string.pix_new_recipient_error_rate_limit_description);
        int i2 = pixQrCodeDecodeFailureReason != null ? h.f287662a[pixQrCodeDecodeFailureReason.ordinal()] : -1;
        throw new QrCodeHandlingException(new xo9.e(numValueOf, numValueOf2, new xo9.c((i2 == 10 || i2 == 12) ? R.string.common_action_got_it : R.string.common_action_try_again, null), dVar));
    }
}
