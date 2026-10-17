package f62;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.retail.feature.pending_payments.api.R$string;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends yji.n implements tak.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz1.j f132389l;

    public l(oz1.j interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f132389l = interactor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f62.j
            if (r0 == 0) goto L13
            r0 = r8
            f62.j r0 = (f62.j) r0
            int r1 = r0.f132386x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132386x = r1
            goto L18
        L13:
            f62.j r0 = new f62.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132386x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Iris r7 = r0.u
            yhm.o.b(r8)
            goto L6f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            java.lang.String r8 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r7, r8)
            sak.g r8 = r7.f261440a
            java.lang.Object r8 = r8.i
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary"
            kotlin.jvm.internal.Intrinsics.i(r8, r2)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r8 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r8
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r2 = r8.f61995g
            java.lang.String r4 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Iris"
            kotlin.jvm.internal.Intrinsics.i(r2, r4)
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Iris r2 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Iris) r2
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r4 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.IRIS
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r5 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r5.<init>(r8)
            j02.b r8 = new j02.b
            sak.a r7 = r7.f261441b
            com.revolut.feature.transfer.core.models.FundingSource r7 = r7.f261435a
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r7 = oc.c.u(r7)
            r8.<init>(r7)
            r0.u = r2
            r0.f132386x = r3
            oz1.j r7 = r6.f132389l
            java.lang.Object r7 = r7.a(r4, r5, r8, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r7 = r2
        L6f:
            java.lang.String r7 = r7.d
            if (r7 == 0) goto L79
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl r8 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl
            r8.<init>(r7)
            return r8
        L79:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r7 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f62.l.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(7, null), 2);
    }

    @Override // tak.d
    public final void T1(tak.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof f62.k
            if (r0 == 0) goto L13
            r0 = r7
            f62.k r0 = (f62.k) r0
            int r1 = r0.f132388x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132388x = r1
            goto L18
        L13:
            f62.k r0 = new f62.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132388x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Iris r6 = r0.u
            yhm.o.b(r7)
            goto L62
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            sak.g r6 = r6.f261440a
            java.lang.Object r6 = r6.i
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r6 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary) r6
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r7 = r6.f61995g
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Iris"
            kotlin.jvm.internal.Intrinsics.i(r7, r2)
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Iris r7 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Iris) r7
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.IRIS
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r4 = new com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate
            r4.<init>(r6)
            r0.u = r7
            r0.f132388x = r3
            oz1.j r6 = r5.f132389l
            java.lang.Object r6 = r6.d(r2, r4, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r6 = r7
        L62:
            java.lang.String r6 = r6.d
            if (r6 == 0) goto L6c
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl r7 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl
            r7.<init>(r6)
            return r7
        L6c:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r6 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f62.l.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = parcel instanceof ApmPaymentAuthorisationSummary ? (ApmPaymentAuthorisationSummary) parcel : null;
        if (apmPaymentAuthorisationSummary == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        if (apmPaymentAuthorisationSummary.f61993b != PaymentAuthorisationState.PENDING) {
            return new v1(new e31.i(2, 6, continuation));
        }
        PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
        Intrinsics.i(paymentMethodDetails, "null cannot be cast to non-null type com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Iris");
        PaymentMethodDetails.Iris iris = (PaymentMethodDetails.Iris) paymentMethodDetails;
        PaymentMethodDetails.Creditor creditor = iris.f62036a;
        int i = R$string.pending_payments_title_placeholder;
        ApmIris apmIris = ApmIris.f61811c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(apmIris.e()), null, 12);
        Image imageF = apmIris.F();
        dj0.d dVar = iris.f62037b;
        Image imageA = rak.a.a(creditor);
        TextClause textClause = new TextClause(creditor.f62030a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = iris.f62038c;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        LocalDateTime localDateTime = apmPaymentAuthorisationSummary.f61999m;
        return new go.g(zi0.c.P(new sak.g(textLocalisedClause, imageF, dVar, imageA, textClause, textClause2, localDateTime != null ? new PendingPaymentInfo$TimerInfo(oi0.d.R(localDateTime) - oi0.d.R(apmPaymentAuthorisationSummary.f61997j), oi0.d.R(localDateTime)) : null, apmPaymentAuthorisationSummary, new sak.d(ApmPaymentMethod.IRIS.f62171a)), false, null, 3), 2);
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(f0.f322471a, 2);
    }
}
