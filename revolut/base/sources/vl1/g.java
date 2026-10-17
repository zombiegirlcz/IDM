package vl1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmount;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.retail.feature.pending_payments.api.R$string;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import sak.i;
import vkm.v1;
import yji.n;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends n implements tak.d {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f290171l;

    public g(j interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f290171l = interactor;
    }

    public static ApmPaymentAuthorisationSummary Z2(sak.c cVar) {
        Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData");
        Object obj2 = cVar.f261440a.i;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary");
        return (ApmPaymentAuthorisationSummary) obj2;
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
            boolean r0 = r6 instanceof vl1.e
            if (r0 == 0) goto L13
            r0 = r6
            vl1.e r0 = (vl1.e) r0
            int r1 = r0.f290169w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290169w = r1
            goto L18
        L13:
            vl1.e r0 = new vl1.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290169w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r5 = Z2(r5)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r6 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.AANI
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r2 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r2.<init>(r5)
            r0.f290169w = r3
            j02.c r5 = j02.c.f169914a
            oz1.j r3 = r4.f290171l
            java.lang.Object r5 = r3.a(r6, r2, r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vl1.g.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(7, null), 2);
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
            boolean r0 = r6 instanceof vl1.f
            if (r0 == 0) goto L13
            r0 = r6
            vl1.f r0 = (vl1.f) r0
            int r1 = r0.f290170w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290170w = r1
            goto L18
        L13:
            vl1.f r0 = new vl1.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290170w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r5 = Z2(r5)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r6 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.AANI
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r2 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r2.<init>(r5)
            r0.f290170w = r3
            oz1.j r5 = r4.f290171l
            java.lang.Object r5 = r5.d(r6, r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vl1.g.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        dj0.d dVar;
        xi0.b bVarB;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = parcel instanceof ApmPaymentAuthorisationSummary ? (ApmPaymentAuthorisationSummary) parcel : null;
        if (apmPaymentAuthorisationSummary == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        if (apmPaymentAuthorisationSummary.f61993b != PaymentAuthorisationState.PENDING) {
            return new v1(new rp1.c(2, 17, null));
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        PaymentMethodDetails.Aani aani = paymentMethodDetails instanceof PaymentMethodDetails.Aani ? (PaymentMethodDetails.Aani) paymentMethodDetails : null;
        if (aani == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        PaymentMethodDetails.Creditor creditor = aani.f62025a;
        dj0.d dVar2 = apmPaymentAuthorisationSummary.f;
        if (dVar2 != null) {
            dVar = dVar2;
        } else {
            ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount = apmPaymentAuthorisationSummary.f62005t;
            if (apmPaymentAuthorisationAmount != null) {
                dVar2 = apmPaymentAuthorisationAmount.f61989c;
                dVar = dVar2;
            } else {
                dVar = null;
            }
        }
        int i = R$string.pending_payments_title_placeholder;
        ApmAani apmAani = ApmAani.f61807c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(apmAani.e()), null, 12);
        Image imageF = apmAani.F();
        if (dVar == null || (bVarB = dVar.f115083b) == null) {
            bVarB = apmAani.b();
        }
        xi0.b bVar = bVarB;
        Image imageA = rak.a.a(creditor);
        TextClause textClause = new TextClause(creditor.f62030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.f61999m;
        return new go.g(zi0.c.P(new sak.g(textLocalisedClause, imageF, dVar, bVar, imageA, textClause, null, localDateTime != null ? new PendingPaymentInfo$TimerInfo(oi0.d.R(localDateTime) - oi0.d.R(apmPaymentAuthorisationSummary.f61997j), oi0.d.R(localDateTime), i.FOOTER) : null, apmPaymentAuthorisationSummary, new sak.d(ApmPaymentMethod.AANI.f62162a)), false, null, 3), 2);
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        PaymentMethodDetails paymentMethodDetails = Z2(paymentData).f61995g;
        Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Aani");
        String str = ((PaymentMethodDetails.Aani) paymentMethodDetails).f62027c;
        if (str == null) {
            return new go.g(f0.f322471a, 2);
        }
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("PAYMENT_PURPOSE_LIST_ID", new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_confirm_payment_purpose_of_payment_title, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_confirm_payment_purpose_of_payment_description, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new go.g(u.c(model), 2);
    }
}
