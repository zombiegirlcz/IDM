package ig2;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import j49.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements i49.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f161074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f161075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f161076c;

    public d(l80.e dateProvider, uw1.c apmFeatureChecker, e pendingActionMapper, j apmPaymentsAuthorisationsPendingActionInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(pendingActionMapper, "pendingActionMapper");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsPendingActionInteractor, "apmPaymentsAuthorisationsPendingActionInteractor");
        this.f161074a = dateProvider;
        this.f161075b = apmFeatureChecker;
        this.f161076c = apmPaymentsAuthorisationsPendingActionInteractor;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.UPI;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new v1(new i44.a(this, null, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.ui_kit.delegates.t r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof ig2.b
            if (r0 == 0) goto L13
            r0 = r14
            ig2.b r0 = (ig2.b) r0
            int r1 = r0.f161072w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161072w = r1
            goto L1a
        L13:
            ig2.b r0 = new ig2.b
            gim.c r14 = (gim.c) r14
            r0.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161072w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L7d
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            yhm.o.b(r14)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r14 = r13.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r13 = r13.f54722b
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r2 == 0) goto L5c
            java.lang.Object r13 = r13.f51596l
            boolean r14 = r13 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
            if (r14 == 0) goto L4a
            r4 = r13
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r4 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r4
        L4a:
            if (r4 == 0) goto L98
            j49.b r13 = new j49.b
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination r14 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination
            com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PendingAction r0 = new com.revolut.feature.apm.upi.api.UpiFeatureConfig$Destination$PendingPaymentConfirmationDestination$InputData$PendingAction
            r0.<init>(r4)
            r14.<init>(r0)
            r13.<init>(r14)
            return r13
        L5c:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r14 == 0) goto L98
            java.lang.Object r13 = r13.f51596l
            boolean r14 = r13 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
            if (r14 == 0) goto L6d
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r13 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r13
            goto L6e
        L6d:
            r13 = r4
        L6e:
            if (r13 == 0) goto L98
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r14 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.UPI
            r0.f161072w = r3
            oz1.j r2 = r12.f161076c
            java.lang.Object r13 = r2.d(r14, r13, r0)
            if (r13 != r1) goto L7d
            return r1
        L7d:
            j49.f r13 = new j49.f
            mii.k r5 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.apm.core.api.R$string.apm_payment_confirmation_status_title_rejected
            r0 = 14
            r7.<init>(r14, r4, r4, r0)
            r10 = 0
            r11 = 28
            java.lang.String r6 = "REJECT_SUCCESS_SHOT_DIALOG_ID"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.<init>(r5)
            return r13
        L98:
            j49.c r13 = j49.c.f171322a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ig2.d.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
