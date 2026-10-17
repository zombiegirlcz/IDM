package rk1;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.alipay.api.AlipayApi$Toggles$AlipayPlus;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import go.g;
import j49.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l80.e;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import qna.n;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements gk1.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f254723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f254724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f254725c;
    public final t12.c d;

    public d(e dateProvider, gte.a featureToggleInteractor, j interactor, t12.c mapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f254723a = dateProvider;
        this.f254724b = featureToggleInteractor;
        this.f254725c = interactor;
        this.d = mapper;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f254724b.a(AlipayApi$Toggles$AlipayPlus.f61059c) ? new g(f0.f322471a, 2) : new n(this.f254725c.b(ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS), this, 18);
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
            boolean r0 = r14 instanceof rk1.b
            if (r0 == 0) goto L13
            r0 = r14
            rk1.b r0 = (rk1.b) r0
            int r1 = r0.f254721w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254721w = r1
            goto L1a
        L13:
            rk1.b r0 = new rk1.b
            gim.c r14 = (gim.c) r14
            r0.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254721w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            goto L72
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            yhm.o.b(r14)
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$Model r14 = r13.f54722b
            java.lang.Object r14 = r14.f51596l
            boolean r2 = r14 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction
            if (r2 == 0) goto L40
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r14 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction) r14
            goto L41
        L40:
            r14 = r4
        L41:
            if (r14 != 0) goto L44
            goto L8d
        L44:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a r13 = r13.f54721a
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$c r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.c.f51609a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r13, r2)
            if (r2 == 0) goto L5d
            j49.b r13 = new j49.b
            com.revolut.feature.alipay.impl.ui.confirmation.AlipayPlusPendingPaymentDestination r0 = new com.revolut.feature.alipay.impl.ui.confirmation.AlipayPlusPendingPaymentDestination
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r14 = r14.getF61991a()
            r0.<init>(r14)
            r13.<init>(r0)
            return r13
        L5d:
            com.revolut.core.ui_kit.delegates.ActionWidgetDelegate$a$d r2 = com.revolut.core.ui_kit.delegates.ActionWidgetDelegate.a.d.f51610a
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r2)
            if (r13 == 0) goto L8d
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r13 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS
            r0.f254721w = r3
            oz1.j r2 = r12.f254725c
            java.lang.Object r13 = r2.d(r13, r14, r0)
            if (r13 != r1) goto L72
            return r1
        L72:
            j49.f r13 = new j49.f
            mii.k r5 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_decline_success_title
            r0 = 14
            r7.<init>(r14, r4, r4, r0)
            r10 = 0
            r11 = 28
            java.lang.String r6 = "ALIPAY_PLUS_REJECT_SUCCESS_SHOT_DIALOG_ID"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.<init>(r5)
            return r13
        L8d:
            j49.c r13 = j49.c.f171322a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rk1.d.g(com.revolut.core.ui_kit.delegates.t, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
