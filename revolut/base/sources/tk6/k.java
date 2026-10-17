package tk6;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension$Parcel;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension$PaymentModel;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import q12.l;
import vkm.j2;
import vkm.q;
import vkm.v1;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends n implements tak.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f271902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f271903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x02.d f271904n;
    public final j2 o;

    public k(d interactor, e mapper, x02.d router) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f271902l = interactor;
        this.f271903m = mapper;
        this.f271904n = router;
        this.o = q.c(new g(true));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(tk6.k r24, com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r25, gim.c r26) throws com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentNotAvailableError {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tk6.k.Z2(tk6.k, com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction, gim.c):java.lang.Object");
    }

    public static PsePendingPaymentExtension$PaymentModel b3(sak.c cVar) {
        Object obj2 = cVar.f261440a.i;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension.PaymentModel");
        return (PsePendingPaymentExtension$PaymentModel) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tk6.i
            if (r0 == 0) goto L13
            r0 = r7
            tk6.i r0 = (tk6.i) r0
            int r1 = r0.f271900x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271900x = r1
            goto L18
        L13:
            tk6.i r0 = new tk6.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271900x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r6 = r0.u
            yhm.o.b(r7)
            goto L5f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension$PaymentModel r6 = b3(r6)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r6 = r6.f72725a
            vkm.j2 r7 = r5.o
            java.lang.Object r7 = r7.getValue()
            tk6.g r7 = (tk6.g) r7
            boolean r7 = r7.f271895a
            r0.u = r6
            r0.f271900x = r3
            tk6.d r2 = r5.f271902l
            oz1.j r2 = r2.f271891a
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r3 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.PSE
            j02.d r4 = new j02.d
            r4.<init>(r7)
            java.lang.Object r7 = r2.a(r3, r6, r4, r0)
            if (r7 != r1) goto L5a
            goto L5c
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L5c:
            if (r7 != r1) goto L5f
            return r1
        L5f:
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse r6 = uk6.a.a(r6)
            r7 = 0
            if (r6 == 0) goto L69
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse$ExecutionType r6 = r6.f
            goto L6a
        L69:
            r6 = r7
        L6a:
            boolean r0 = r6 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pse.ExecutionType.OneTime
            if (r0 != 0) goto L6f
            r6 = r7
        L6f:
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Pse$ExecutionType$OneTime r6 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Pse.ExecutionType.OneTime) r6
            if (r6 == 0) goto L75
            java.lang.String r7 = r6.f62065a
        L75:
            if (r7 == 0) goto L7d
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl r6 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl
            r6.<init>(r7)
            return r6
        L7d:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r6 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tk6.k.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new v1(new sma.f(this, paymentData, null, 21));
    }

    @Override // tak.d
    public final void T1(tak.c event) {
        j2 j2Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f269359a;
        if (Intrinsics.f(str, "TRUST_MERCHANT_SELECTABLE_ID")) {
            do {
                j2Var = this.o;
            } while (!j2Var.h(j2Var.getValue(), new g(!((g) r0).f271895a)));
        } else if (Intrinsics.f(str, "PSE_DETAILS_PURCHASE_TAX_ID")) {
            Object obj2 = event.f269360b;
            ApmQuote apmQuote = obj2 instanceof ApmQuote ? (ApmQuote) obj2 : null;
            if (apmQuote == null) {
                return;
            }
            A2(((l) this.f271904n).c(apmQuote));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tk6.j
            if (r0 == 0) goto L13
            r0 = r6
            tk6.j r0 = (tk6.j) r0
            int r1 = r0.f271901w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271901w = r1
            goto L18
        L13:
            tk6.j r0 = new tk6.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271901w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension$PaymentModel r5 = b3(r5)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r5 = r5.f72725a
            r0.f271901w = r3
            tk6.d r6 = r4.f271902l
            oz1.j r6 = r6.f271891a
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.PSE
            java.lang.Object r5 = r6.d(r2, r5, r0)
            if (r5 != r1) goto L47
            goto L49
        L47:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L49:
            if (r5 != r1) goto L4c
            return r1
        L4c:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tk6.k.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        PsePendingPaymentExtension$Parcel psePendingPaymentExtension$Parcel = parcel instanceof PsePendingPaymentExtension$Parcel ? (PsePendingPaymentExtension$Parcel) parcel : null;
        String authorisationId = psePendingPaymentExtension$Parcel != null ? psePendingPaymentExtension$Parcel.f72724a : null;
        if (authorisationId == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        d dVar = this.f271902l;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        return q.H(new sma.f(this, continuation, 20), dVar.f271891a.c(authorisationId, j02.n.MANDATE, ApmPaymentAuthorisationPaymentMethod.PSE));
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return q.H(new qqj.g(this, paymentData, (Continuation) null, 25), this.o);
    }
}
