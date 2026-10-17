package gi3;

import aw0.ka;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.checkout.impl.R$string;
import com.revolut.feature.checkout.models.PreorderCardResult;
import com.revolut.feature.checkout.models.PreorderPlanAndCardResult;
import com.revolut.feature.checkout.models.PreorderResult;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import g8i.h;
import h93.f0;
import h93.l0;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import te0.w;
import zh3.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements rh3.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u89.a f144075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ph3.b f144076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f144077c;
    public final v60.e d;
    public final gte.a e;
    public final Object f;

    public c(u89.a promptsRouter, ph3.b checkoutNavigationFactory, e cardOrderServerErrorDialogProvider, v60.e serverErrorsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(promptsRouter, "promptsRouter");
        Intrinsics.checkNotNullParameter(checkoutNavigationFactory, "checkoutNavigationFactory");
        Intrinsics.checkNotNullParameter(cardOrderServerErrorDialogProvider, "cardOrderServerErrorDialogProvider");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f144075a = promptsRouter;
        this.f144076b = checkoutNavigationFactory;
        this.f144077c = cardOrderServerErrorDialogProvider;
        this.d = serverErrorsProvider;
        this.e = featureToggleInteractor;
        this.f = w.y0(new h(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.core.navigation.NaviCommand r9, qd9.a r10, h93.f0 r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof gi3.b
            if (r0 == 0) goto L13
            r0 = r12
            gi3.b r0 = (gi3.b) r0
            int r1 = r0.f144074w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144074w = r1
            goto L18
        L13:
            gi3.b r0 = new gi3.b
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144074w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L72
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r12)
            if (r11 == 0) goto L61
            boolean r12 = r11.M()
            if (r12 == 0) goto L61
            boolean r12 = r11.J()
            if (r12 == 0) goto L61
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig r0 = new com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig
            com.revolut.retail.core.navigation.FinishCommand r2 = new com.revolut.retail.core.navigation.FinishCommand
            r12 = 0
            r1 = 7
            r2.<init>(r12, r12, r12, r1)
            com.revolut.retail.core.navigation.FinishCommand r3 = new com.revolut.retail.core.navigation.FinishCommand
            r3.<init>(r12, r12, r12, r1)
            r6 = 0
            r7 = 482(0x1e2, float:6.75E-43)
            r4 = 0
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.<init>(r0)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r10)
            return r9
        L61:
            u89.a r11 = r8.f144075a
            ec9.b r11 = (ec9.b) r11
            ufm.i r9 = r11.a(r10, r9)
            r0.f144074w = r3
            java.lang.Object r12 = nim.a.b(r9, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            qd9.d r12 = (qd9.d) r12
            com.revolut.retail.core.navigation.CompositeCommand r9 = r12.f244895b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gi3.c.a(com.revolut.retail.core.navigation.NaviCommand, qd9.a, h93.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final StatusViewConfiguration.Success b(f0 card, PreorderResult preorderResult) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(card, "card");
        LocalDate localDateA = card.k.a(((Boolean) this.f.getValue()).booleanValue());
        if (card.b0()) {
            textLocalisedClause = null;
        } else {
            textLocalisedClause = localDateA != null ? new TextLocalisedClause(R$string.checkout_result_card_on_its_way_subtitle, u.c(new TimeClause(jli.b.b(localDateA), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12) : null;
        }
        return new StatusViewConfiguration.Success("STATUS_DIALOG_CARD_CHECKOUT_ID", card.b0() ? new TextLocalisedClause(R$string.junior_card_order_success_title, null, null, 14) : new TextLocalisedClause(R$string.checkout_result_card_on_its_way_title, null, null, 14), textLocalisedClause, preorderResult, null, 2032);
    }

    public final StatusViewConfiguration.Error c() {
        return new StatusViewConfiguration.Error("STATUS_DIALOG_PREORDER_ERROR_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, 8188);
    }

    public final StatusViewConfiguration.Success d(PreorderResult preorderResult) {
        return new StatusViewConfiguration.Success("STATUS_DIALOG_ORDER_SUCCESS_ID", new TextLocalisedClause(R$string.checkout_result_order_processed, null, null, 14), null, preorderResult, null, 2036);
    }

    public final StatusViewConfiguration.Pending e(PreorderResult preorderResult, boolean z) {
        f0 f0Var = preorderResult instanceof PreorderCardResult.Preordered ? ((PreorderCardResult.Preordered) preorderResult).f65858b : preorderResult instanceof PreorderPlanAndCardResult.Preordered ? ((PreorderPlanAndCardResult.Preordered) preorderResult).f65872b.f65858b : preorderResult instanceof PreorderPlanAndCardResult.PlanSubscribedCardPreorder ? ((PreorderPlanAndCardResult.PlanSubscribedCardPreorder) preorderResult).f65870b.f65858b : null;
        if (f0Var != null && f0Var.b0()) {
            if (((d) this.e).c(JuniorOnboardingApi$Toggles.JuniorPendingKyc.f76949c)) {
                return new StatusViewConfiguration.Pending("STATUS_DIALOG_PREORDERED_ID", new TextLocalisedClause(R$string.junior_card_checkout_preorder_ordered_title, null, null, 14), new TextLocalisedClause(z ? R$string.junior_card_checkout_preorder_ordered_description_with_topup : f0Var.f150112c ? R$string.junior_card_checkout_preorder_ordered_description_virtual : R$string.junior_card_checkout_preorder_ordered_description_physical, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, preorderResult, false, 7600);
            }
        }
        return new StatusViewConfiguration.Pending("STATUS_DIALOG_PREORDERED_ID", new TextLocalisedClause((f0Var != null ? f0Var.G : null) == l0.INDIA_GLOBAL ? R$string.checkout_result_processing_payment : R$string.checkout_result_preorder_placed, null, null, 14), null, null, null, preorderResult, false, 8120);
    }
}
