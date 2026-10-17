package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import android.os.Parcelable;
import bm9.e;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.tracking.v3.BiometricPaymentAttemptContext;
import cp5.d;
import java.math.BigDecimal;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import oki.h;
import skm.e0;
import ul9.g;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements bm9.b {
    public final PayWithSmileEnrollmentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f78978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsContext f78979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f78980r;

    public c(PayWithSmileEnrollmentFlowContract$InputData inputData, g biometricPaymentsSettingsInteractor) {
        AnalyticsContext analyticsContext;
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(biometricPaymentsSettingsInteractor, "biometricPaymentsSettingsInteractor");
        this.o = inputData;
        this.f78978p = biometricPaymentsSettingsInteractor;
        String str = inputData.f78971a;
        Continuation continuation = null;
        if (str != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            BiometricPaymentAttemptContext.a aVarNewBuilder = BiometricPaymentAttemptContext.newBuilder();
            aVarNewBuilder.c();
            ((BiometricPaymentAttemptContext) aVarNewBuilder.f49761b).setRelatedPaymentId(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        this.f78979q = analyticsContext;
        int i = e.f16774a[biometricPaymentsSettingsInteractor.c().ordinal()];
        if (i == 1) {
            flowStep = PayWithSmileEnrollmentFlowContract$Step.Processing.f78977a;
        } else if (i == 2) {
            flowStep = PayWithSmileEnrollmentFlowContract$Step.AcceptConsent.f78972a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String paymentId = inputData.f78971a;
            if (paymentId != null) {
                nl9.a reason = nl9.a.PRODUCT_FEATURE_NOT_AVAILABLE;
                Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                Intrinsics.checkNotNullParameter(reason, "reason");
                e0.C(biometricPaymentsSettingsInteractor.d, null, null, new sxe.g(biometricPaymentsSettingsInteractor, paymentId, reason, continuation, 7), 3);
            }
            flowStep = PayWithSmileEnrollmentFlowContract$Step.FeatureUnavailable.f78976a;
        }
        this.f78980r = d.a(this, flowStep, f0.f322471a, new bm9.c(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r11 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        if (r11 == r2) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c r8, java.math.BigDecimal r9, boolean r10, gim.c r11) throws java.lang.Throwable {
        /*
            ul9.g r0 = r8.f78978p
            boolean r1 = r11 instanceof bm9.f
            if (r1 == 0) goto L15
            r1 = r11
            bm9.f r1 = (bm9.f) r1
            int r2 = r1.f16777y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16777y = r2
            goto L1a
        L15:
            bm9.f r1 = new bm9.f
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.f16775w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f16777y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L41
            if (r3 == r5) goto L39
            if (r3 != r4) goto L31
            boolean r10 = r1.v
            java.math.BigDecimal r9 = r1.u
            yhm.o.b(r11)
            goto Lbb
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            boolean r10 = r1.v
            java.math.BigDecimal r9 = r1.u
            yhm.o.b(r11)
            goto L57
        L41:
            yhm.o.b(r11)
            com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$InputData r11 = r8.o
            java.lang.String r11 = r11.f78971a
            if (r11 == 0) goto L94
            r1.u = r9
            r1.v = r10
            r1.f16777y = r5
            java.lang.Object r11 = r0.a(r11, r1)
            if (r11 != r2) goto L57
            goto Lba
        L57:
            nl9.e r11 = (nl9.e) r11
            boolean r0 = r11 instanceof nl9.b
            if (r0 == 0) goto L61
            r8.K2(r9, r10)
            goto Lbe
        L61:
            boolean r0 = r11 instanceof nl9.c
            if (r0 == 0) goto L7f
            yki.a r2 = r8.f78980r
            com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step$FallbackConfirmation r3 = new com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step$FallbackConfirmation
            nl9.c r11 = (nl9.c) r11
            com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge r11 = r11.f217100a
            com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$FlowContext$Acceptance r0 = new com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$FlowContext$Acceptance
            r0.<init>(r9, r10)
            r3.<init>(r11, r0)
            r6 = 0
            r7 = 12
            r4 = 0
            r5 = 0
            r1 = r8
            oki.h.t2(r1, r2, r3, r4, r5, r6, r7)
            goto Lbe
        L7f:
            boolean r9 = r11 instanceof nl9.d
            if (r9 == 0) goto L8e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Consent just has been accepted"
            r9.<init>(r10)
            r8.J2(r9)
            goto Lbe
        L8e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L94:
            r1.u = r9
            r1.v = r10
            r1.f16777y = r4
            ql9.d r11 = r0.f280917a
            r11.getClass()
            ql9.b r0 = new ql9.b
            r3 = 3
            r4 = 0
            r0.<init>(r11, r4, r4, r3)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r0, r1)
            if (r11 != r2) goto Lb1
            goto Lb3
        Lb1:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        Lb3:
            if (r11 != r2) goto Lb6
            goto Lb8
        Lb6:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        Lb8:
            if (r11 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            r8.K2(r9, r10)
        Lbe:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c.I2(com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c, java.math.BigDecimal, boolean, gim.c):java.lang.Object");
    }

    public final void J2(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new bf5.a(this, null, 17), 3);
    }

    public final void K2(BigDecimal bigDecimal, boolean z) {
        l.a1(this, X1(new y0("id_pwc_enabled", new j0((Clause) new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_enable_pay_with_smile_enrollment_accepted_title, null, null, 14), (Clause) (bigDecimal == null ? null : new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_enable_pay_with_smile_enrollment_accepted_description, u.c(nub.a.j(bigDecimal, null, 7)), null, 12)), (StatusDialogDescriptionProgress) null, (Parcelable) null, z ? u1.b.f216225a : new w1(6, new TextLocalisedClause(com.revolut.feature.pay_with_smile.impl.R$string.revolut_pay_enable_pay_with_smile_enrollment_accepted_action_create_passcode, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, nii.h0.CONFETTI, (ResourceImage) null, 3052), false, 4)), null, null, new b(this, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78980r;
    }
}
