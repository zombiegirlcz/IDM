package sh2;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.wero.api.R$string;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends yji.n implements tak.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz1.j f263410l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nh2.e f263411m;

    public m(oz1.j interactor, nh2.e weroKeyProvider) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(weroKeyProvider, "weroKeyProvider");
        this.f263410l = interactor;
        this.f263411m = weroKeyProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r24, gim.c r25) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.m.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(6, new TextLocalisedClause(R$string.wero_pending_payments_disclaimer, null, null, 14)), 2);
    }

    @Override // tak.d
    public final void T1(tak.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        if (r24.f263410l.d(r2, r5, r3) == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r25, gim.c r26) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.m.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = parcel instanceof ApmPaymentAuthorisationSummary ? (ApmPaymentAuthorisationSummary) parcel : null;
        if (apmPaymentAuthorisationSummary == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        if (apmPaymentAuthorisationSummary.f61993b != PaymentAuthorisationState.PENDING) {
            return new v1(new rp1.c(2, 4, null));
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Wero");
        PaymentMethodDetails.Wero wero = (PaymentMethodDetails.Wero) paymentMethodDetails;
        PaymentMethodDetails.Creditor creditor = wero.f62072a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_title_placeholder, zhm.u.c(ApmWero.f61829c.e()), null, 12);
        CdnImage cdnImageA = zw1.a.a();
        dj0.d dVar = wero.f62073b;
        Image imageA = rak.a.a(creditor);
        TextClause textClause = new TextClause(creditor.f62030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = wero.f62074c;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.f61999m;
        return new go.g(zi0.c.P(new sak.g(textLocalisedClause, cdnImageA, dVar, imageA, textClause, textClause2, localDateTime != null ? new PendingPaymentInfo$TimerInfo(oi0.d.R(localDateTime) - oi0.d.R(apmPaymentAuthorisationSummary.f61997j), oi0.d.R(localDateTime)) : null, apmPaymentAuthorisationSummary, new sak.d(ApmPaymentMethod.WERO.f62179a)), false, null, 3), 2);
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(f0.f322471a, 2);
    }
}
