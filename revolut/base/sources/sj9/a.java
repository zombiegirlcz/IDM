package sj9;

import cj9.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.api.models.PayLaterActivationError;
import com.revolut.feature.pay_later.impl.network.PayLaterApiService;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import di9.c;
import dj9.b0;
import dj9.u;
import efm.d0;
import ej9.e0;
import ej9.q;
import ej9.s;
import grl.r2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import nii.l0;
import nii.y0;
import nii.z;
import pfm.h;
import pi9.b;
import qi9.d;
import te0.w;
import ti9.g;
import yji.n;
import zh9.p1;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xh9.a f263688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f263689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vi9.d f263690n;

    public a(xh9.a payLaterInteractor, d payLaterNavigationCommandFactory, vi9.d payLaterActivationErrorDialogMapper) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(payLaterActivationErrorDialogMapper, "payLaterActivationErrorDialogMapper");
        this.f263688l = payLaterInteractor;
        this.f263689m = payLaterNavigationCommandFactory;
        this.f263690n = payLaterActivationErrorDialogMapper;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final Object Z2(Integer num, p1 origin, gim.c cVar) {
        g gVar = (g) this.f263688l;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(origin, "origin");
        e0 e0Var = (e0) gVar.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(origin, "origin");
        PayLaterApiService payLaterApiService = e0Var.f126799a;
        Object obj2 = f.f24629a;
        Intrinsics.checkNotNullParameter(origin, "origin");
        d0<u.b> d0VarTurnOnPayLater = payLaterApiService.turnOnPayLater(new b0(u1.g(origin, f.f24629a), num));
        int i = 3;
        s sVar = new s(new q(e0Var, 12), i);
        d0VarTurnOnPayLater.getClass();
        pfm.a aVar = new pfm.a(new h(new ufm.f(d0VarTurnOnPayLater, sVar, i), 4), new eif.h(new q(e0Var, 0), 28), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        Object objA = nim.a.a(w.g0(aVar), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final boolean b3(Throwable throwable) {
        vi9.c cVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof PayLaterActivationError.FacilityNotCreated) {
            this.f263689m.getClass();
            A2(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(r2.PAY_LATER_SWITCH, ft3.d.INSTANCE, null, null, null, null, 16378))));
            return true;
        }
        if (!(throwable instanceof PayLaterActivationError)) {
            return false;
        }
        PayLaterActivationError error = (PayLaterActivationError) throwable;
        this.f263690n.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        Continuation continuation = null;
        if (error instanceof PayLaterActivationError.Overdue) {
            cVar = new vi9.c("ID_OVERDUE_ERROR", new TextLocalisedClause(R$string.pay_later_activation_failure_overdue_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_activation_failure_overdue_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_repay, null, null, 14), false);
        } else if (error instanceof PayLaterActivationError.Outstanding) {
            cVar = new vi9.c("ID_OUTSTANDING_ERROR", new TextLocalisedClause(R$string.pay_later_activation_failure_outstanding_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_activation_failure_outstanding_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_repay, null, null, 14), false);
        } else if ((error instanceof PayLaterActivationError.Cancelled) || (error instanceof PayLaterActivationError.Terminated)) {
            cVar = new vi9.c("ID_DEACTIVATING_ERROR", new TextLocalisedClause(R$string.pay_later_activation_failure_deactivating_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_activation_failure_deactivating_description, null, null, 14), null, true);
        } else if (error instanceof PayLaterActivationError.NoEligibleCards) {
            cVar = new vi9.c("ID_NO_ELIGIBLE_CARDS", new TextLocalisedClause(R$string.pay_later_cards_ineligible_create_card_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_cards_ineligible_create_card_description, null, null, 14), new TextLocalisedClause(R$string.pay_later_cards_ineligible_create_card_button, null, null, 14), false);
        } else if (error instanceof PayLaterActivationError.MaxPurchaseAmountTooLow) {
            cVar = new vi9.c("ID_MAX_PURCHASE_AMOUNT_TOO_LOW", new TextLocalisedClause(R$string.pay_later_switch_warning_max_purchase_amount_too_low_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_switch_warning_max_purchase_amount_too_low_description, zhm.u.c(b.a(((PayLaterActivationError.MaxPurchaseAmountTooLow) error).f78810a, null, 3)), null, 12), null, true);
        } else {
            if (!(error instanceof PayLaterActivationError.UnknownError) && !(error instanceof PayLaterActivationError.FacilityNotCreated)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new vi9.c("ID_UNKNOWN_ERROR", new TextLocalisedClause(R$string.pay_later_not_available_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_not_available_description, null, null, 14), null, true);
        }
        boolean z = cVar.e;
        String str = cVar.f289531a;
        y0 y0Var = z ? new y0(str, new z(cVar.f289532b, cVar.f289533c, cVar.d, null, null, null, false, null, null, null, null, null, null, 32756), false, 4) : new y0(str, new l0(cVar.f289532b, cVar.f289533c, null, cVar.d, null, null, false, null, 1012), false, 4);
        n.j2(this, L2(y0Var), null, new qqj.g(this, y0Var, continuation, 11), 3);
        return true;
    }
}
