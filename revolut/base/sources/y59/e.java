package y59;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import j49.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import vkm.v1;
import y20.a1;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements i49.c {

    @NotNull
    public static final a Companion = new a();
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f311012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t59.a f311013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f311014c;
    public final ApmPaymentAuthorisationPaymentMethod d;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        e = kotlin.time.c.g(1, pkm.e.SECONDS);
    }

    public e(l80.e dateProvider, t59.a masavFeatureChecker, j interactor, z59.a pendingActionMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(masavFeatureChecker, "masavFeatureChecker");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pendingActionMapper, "pendingActionMapper");
        this.f311012a = dateProvider;
        this.f311013b = masavFeatureChecker;
        this.f311014c = interactor;
        this.d = ApmPaymentAuthorisationPaymentMethod.MASAV_IL_R2P;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mii.q r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof y59.c
            if (r0 == 0) goto L13
            r0 = r8
            y59.c r0 = (y59.c) r0
            int r1 = r0.f311010x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311010x = r1
            goto L1a
        L13:
            y59.c r0 = new y59.c
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311010x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            mii.p r7 = r0.u
            yhm.o.b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof mii.p
            if (r8 == 0) goto L6c
            long r4 = y59.e.e
            long r4 = kotlin.time.b.f(r4)
            r8 = r7
            mii.p r8 = (mii.p) r8
            r0.u = r8
            r0.f311010x = r3
            java.lang.Object r8 = skm.k0.b(r4, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            mii.p r7 = (mii.p) r7
            mii.o r7 = r7.f205878a
            android.os.Parcelable r7 = r7.f205877b
            boolean r8 = r7 instanceof com.revolut.feature.masav.impl.pending_actions.MasavRequestToPayPendingActionsDelegateImpl$RejectShotDialogPayload
            r0 = 0
            if (r8 == 0) goto L5c
            com.revolut.feature.masav.impl.pending_actions.MasavRequestToPayPendingActionsDelegateImpl$RejectShotDialogPayload r7 = (com.revolut.feature.masav.impl.pending_actions.MasavRequestToPayPendingActionsDelegateImpl$RejectShotDialogPayload) r7
            goto L5d
        L5c:
            r7 = r0
        L5d:
            if (r7 == 0) goto L6c
            j49.b r8 = new j49.b
            com.revolut.kompot.common.ExternalDestination$Browser r1 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r7 = r7.f78098a
            r1.<init>(r7, r0)
            r8.<init>(r1)
            return r8
        L6c:
            j49.c r7 = j49.c.f171322a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y59.e.b(mii.q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new v1(new a1(this, null, 5));
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
            boolean r0 = r14 instanceof y59.b
            if (r0 == 0) goto L13
            r0 = r14
            y59.b r0 = (y59.b) r0
            int r1 = r0.f311008x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311008x = r1
            goto L1a
        L13:
            y59.b r0 = new y59.b
            gim.c r14 = (gim.c) r14
            r0.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311008x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r13 = r0.u
            yhm.o.b(r14)
            goto L7c
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            yhm.o.b(r14)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r14 = r13.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r13 = r13.f54722b
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r2 == 0) goto L59
            java.lang.Object r13 = r13.f51596l
            boolean r14 = r13 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
            if (r14 == 0) goto L4c
            r4 = r13
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r4 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r4
        L4c:
            if (r4 == 0) goto Lb2
            j49.b r13 = new j49.b
            com.revolut.feature.masav.api.navigation.MasavPayToMerchantDestination$WithPendingAction r14 = new com.revolut.feature.masav.api.navigation.MasavPayToMerchantDestination$WithPendingAction
            r14.<init>(r4)
            r13.<init>(r14)
            return r13
        L59:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r14 = kotlin.jvm.internal.Intrinsics.f(r14, r2)
            if (r14 == 0) goto Lb2
            java.lang.Object r13 = r13.f51596l
            boolean r14 = r13 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
            if (r14 == 0) goto L6a
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r13 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r13
            goto L6b
        L6a:
            r13 = r4
        L6b:
            if (r13 == 0) goto Lb2
            r0.u = r13
            r0.f311008x = r3
            oz1.j r14 = r12.f311014c
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = r12.d
            java.lang.Object r14 = r14.d(r2, r13, r0)
            if (r14 != r1) goto L7c
            return r1
        L7c:
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.apm.core.api.R$string.apm_payment_confirmation_status_title_rejected
            r0 = 14
            r7.<init>(r14, r4, r4, r0)
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r13 = r13.getF61991a()
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r13 = r13.f61995g
            boolean r14 = r13 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.MasavRequestToPay
            if (r14 == 0) goto L92
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$MasavRequestToPay r13 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.MasavRequestToPay) r13
            goto L93
        L92:
            r13 = r4
        L93:
            if (r13 == 0) goto L98
            java.lang.String r13 = r13.e
            goto L99
        L98:
            r13 = r4
        L99:
            if (r13 == 0) goto La0
            com.revolut.feature.masav.impl.pending_actions.MasavRequestToPayPendingActionsDelegateImpl$RejectShotDialogPayload r4 = new com.revolut.feature.masav.impl.pending_actions.MasavRequestToPayPendingActionsDelegateImpl$RejectShotDialogPayload
            r4.<init>(r13)
        La0:
            r9 = r4
            mii.k r5 = new mii.k
            java.lang.String r6 = "REJECT_SUCCESS_SHOT_DIALOG_ID"
            r8 = 0
            r10 = 0
            r11 = 20
            r5.<init>(r6, r7, r8, r9, r10, r11)
            j49.f r13 = new j49.f
            r13.<init>(r5)
            return r13
        Lb2:
            j49.c r13 = j49.c.f171322a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y59.e.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
