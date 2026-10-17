package tk1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import go.g;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oz1.j;
import tak.d;
import vkm.v1;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends n implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f271832l;

    public c(j interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f271832l = interactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tk1.a
            if (r0 == 0) goto L13
            r0 = r6
            tk1.a r0 = (tk1.a) r0
            int r1 = r0.f271830w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271830w = r1
            goto L18
        L13:
            tk1.a r0 = new tk1.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271830w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r5 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r5
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r6 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r2 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r2.<init>(r5)
            r0.f271830w = r3
            j02.c r5 = j02.c.f169914a
            oz1.j r3 = r4.f271832l
            java.lang.Object r5 = r3.a(r6, r2, r5, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tk1.c.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new g(new tak.b(7, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tk1.b
            if (r0 == 0) goto L13
            r0 = r6
            tk1.b r0 = (tk1.b) r0
            int r1 = r0.f271831w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271831w = r1
            goto L18
        L13:
            tk1.b r0 = new tk1.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271831w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r5 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r5
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r6 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r2 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r2.<init>(r5)
            r0.f271831w = r3
            oz1.j r5 = r4.f271832l
            java.lang.Object r5 = r5.d(r6, r2, r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tk1.c.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = parcel instanceof ApmPaymentAuthorisationSummary ? (ApmPaymentAuthorisationSummary) parcel : null;
        if (apmPaymentAuthorisationSummary == null) {
            return new g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        int i = 2;
        if (apmPaymentAuthorisationSummary.f61993b != PaymentAuthorisationState.PENDING) {
            return new v1(new rp1.c(i, 8, continuation));
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        PaymentMethodDetails.AlipayPlus alipayPlus = paymentMethodDetails instanceof PaymentMethodDetails.AlipayPlus ? (PaymentMethodDetails.AlipayPlus) paymentMethodDetails : null;
        if (alipayPlus == null) {
            return new g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        PaymentMethodDetails.Creditor creditor = alipayPlus.f62028a;
        dj0.d dVar = apmPaymentAuthorisationSummary.f;
        if (dVar == null) {
            return new v1(new rp1.c(i, 9, continuation));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.alipay_plus_confirm_payment_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_alipayplus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Image imageA = rak.a.a(creditor);
        TextClause textClause = new TextClause(creditor.f62030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = alipayPlus.f62029b;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.f61999m;
        return new g(zi0.c.P(new sak.g(textLocalisedClause, resourceImage, dVar, imageA, textClause, textClause2, localDateTime != null ? new PendingPaymentInfo$TimerInfo(oi0.d.R(localDateTime) - oi0.d.R(apmPaymentAuthorisationSummary.f61997j), oi0.d.R(localDateTime)) : null, apmPaymentAuthorisationSummary, new sak.d(ApmPaymentMethod.ALIPAY_PLUS.f62163a)), false, null, 3), 2);
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new g(f0.f322471a, 2);
    }
}
