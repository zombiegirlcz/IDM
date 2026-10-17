package sl1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.aani.api.R$string;
import com.revolut.feature.apm.aani.api.navigation.AaniDestination;
import com.revolut.feature.apm.aani.impl.pending_actions.AaniMerchantPendingPayment;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import j49.i;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import oz1.j;
import rp0.d0;
import rp0.d2;
import s9b.n;
import vkm.q;
import vkm.v1;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ll1.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f264079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f264080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f264081c;

    public c(uw1.c apmFeatureChecker, j interactor, h mapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f264079a = apmFeatureChecker;
        this.f264080b = interactor;
        this.f264081c = mapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r2 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.apm.aani.impl.pending_actions.AaniMerchantPendingPayment h(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r12) {
        /*
            boolean r0 = r12 instanceof com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Mandate
            r1 = 0
            if (r0 != 0) goto L6
            goto L43
        L6:
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction$Mandate r12 = (com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction.Mandate) r12
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary r12 = r12.f61991a
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails r0 = r12.f61995g
            boolean r2 = r0 instanceof com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Aani
            if (r2 == 0) goto L13
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Aani r0 = (com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails.Aani) r0
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L17
            goto L43
        L17:
            java.time.LocalDateTime r2 = r12.f61999m
            if (r2 == 0) goto L43
            long r10 = oi0.d.R(r2)
            dj0.d r2 = r12.f
            if (r2 != 0) goto L2e
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmount r2 = r12.f62005t
            if (r2 == 0) goto L2a
            dj0.d r2 = r2.f61989c
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 != 0) goto L2e
            goto L43
        L2e:
            r7 = r2
            com.revolut.feature.apm.aani.impl.pending_actions.AaniMerchantPendingPayment r3 = new com.revolut.feature.apm.aani.impl.pending_actions.AaniMerchantPendingPayment
            java.lang.String r4 = r12.f61992a
            com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails$Creditor r0 = r0.f62025a
            java.lang.String r5 = r0.f62030a
            java.lang.String r6 = r0.d
            java.time.LocalDateTime r12 = r12.f61997j
            long r8 = oi0.d.R(r12)
            r3.<init>(r4, r5, r6, r7, r8, r10)
            return r3
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.c.h(com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction):com.revolut.feature.apm.aani.impl.pending_actions.AaniMerchantPendingPayment");
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj2 = data.f54722b.f51596l;
        return (obj2 instanceof ApmPaymentAuthorisationPendingAction) && ((ApmPaymentAuthorisationPendingAction) obj2).B3() == ApmPaymentAuthorisationPaymentMethod.AANI;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i49.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r11, j60.a r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r3 = r13 instanceof sl1.b
            if (r3 == 0) goto L13
            r3 = r13
            sl1.b r3 = (sl1.b) r3
            int r4 = r3.f264078x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L13
            int r4 = r4 - r5
            r3.f264078x = r4
            goto L1b
        L13:
            sl1.b r3 = new sl1.b
            r2 = r13
            gim.c r2 = (gim.c) r2
            r3.<init>(r10, r2)
        L1b:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f264078x
            r6 = 3
            r7 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L37
            if (r5 != r8) goto L2f
            j60.a r0 = r3.u
            yhm.o.b(r2)
            goto L6e
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            yhm.o.b(r2)
            boolean r2 = r11 instanceof com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model
            if (r2 == 0) goto L42
            r0 = r11
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r0
            goto L43
        L42:
            r0 = r9
        L43:
            if (r0 == 0) goto L48
            java.lang.Object r0 = r0.i
            goto L49
        L48:
            r0 = r9
        L49:
            boolean r2 = r0 instanceof sl1.f
            if (r2 == 0) goto L50
            sl1.f r0 = (sl1.f) r0
            goto L51
        L50:
            r0 = r9
        L51:
            if (r0 != 0) goto L56
            j49.c r0 = j49.c.f171322a
            return r0
        L56:
            boolean r2 = r0 instanceof sl1.d
            if (r2 == 0) goto L8c
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod r2 = com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod.AANI
            sl1.d r0 = (sl1.d) r0
            com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction r0 = r0.f264082a
            r3.u = r12
            r3.f264078x = r8
            oz1.j r5 = r10.f264080b
            java.lang.Object r0 = r5.d(r2, r0, r3)
            if (r0 != r4) goto L6d
            return r4
        L6d:
            r0 = r12
        L6e:
            j60.a.v(r0, r7, r9, r6)
            j49.f r0 = new j49.f
            mii.k r1 = new mii.k
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.apm.core.api.R$string.apm_payment_confirmation_status_title_rejected
            r4 = 14
            r3.<init>(r2, r9, r9, r4)
            r6 = 0
            r7 = 28
            java.lang.String r2 = "AANI_REJECT_SUCCESS_SHOT_DIALOG_ID"
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
        L8c:
            sl1.e r2 = sl1.e.f264083a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9a
            j60.a.v(r12, r7, r9, r6)
            j49.a r0 = j49.a.f171320a
            return r0
        L9a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.c.e(java.lang.Object, j60.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        return q.Q(new v1(new rhl.b(this, continuation, 29)), new n(continuation, this, 4));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        AaniMerchantPendingPayment payment;
        Object obj2 = tVar.f54722b.f51596l;
        ApmPaymentAuthorisationPendingAction pendingAction = obj2 instanceof ApmPaymentAuthorisationPendingAction ? (ApmPaymentAuthorisationPendingAction) obj2 : null;
        if (pendingAction != null) {
            ActionWidgetDelegate.a aVar = tVar.f54721a;
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a) || Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                return new j49.b(new AaniDestination(new AaniDestination.StartType.PendingPayment(pendingAction.getF61991a())));
            }
            if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a) && (payment = h(pendingAction)) != null) {
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
                return new j49.d(d0.d(new TextLocalisedClause(R$string.aani_payment_confirmation_pending_action_decline_confirmation_title, u.c(new TextClause(payment.f61124b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.aani_payment_confirmation_pending_action_decline_confirmation_description, null, null, 14), new d2("BOTTOM_DIALOG_BUTTON_DECLINE_CONFIRM", new TextLocalisedClause(R$string.aani_payment_confirmation_pending_action_decline_confirmation_primary_action, null, null, 14), new d(pendingAction), 56), new d2("BOTTOM_DIALOG_BUTTON_DECLINE_DISMISS", new TextLocalisedClause(R$string.aani_payment_confirmation_pending_action_decline_confirmation_secondary_action, null, null, 14), e.f264083a, 56), null, 112));
            }
        }
        return j49.c.f171322a;
    }
}
