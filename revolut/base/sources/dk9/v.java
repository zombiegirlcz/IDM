package dk9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mjf.b0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.y0;
import tof.i1;
import tof.q6;
import vi9.c0;
import zh9.r0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f115483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r0 f115484x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0 a0Var, r0 r0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f115483w = a0Var;
        this.f115484x = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f115483w, this.f115484x, continuation, 0);
            case 1:
                return new v(this.f115483w, this.f115484x, continuation, 1);
            case 2:
                return new v(this.f115484x, this.f115483w, continuation);
            default:
                return new v(this.f115483w, this.f115484x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objY2;
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        r0 r0Var = this.f115484x;
        a0 a0Var = this.f115483w;
        int i3 = 0;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    xh9.a aVar2 = a0Var.f115463q;
                    String planId = r0Var.f322326a;
                    ti9.g gVar = (ti9.g) aVar2;
                    gVar.getClass();
                    ci9.a aVar3 = gVar.f271458c;
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    ej9.p pVar = (ej9.p) aVar3;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    pfm.r rVarG0 = te0.w.g0(pVar.f126821a.cancelPlan(planId));
                    pfm.d dVarQ = efm.b.q(((b0) gVar.f).g(i1.f272794a), ((ej9.p) aVar3).b());
                    Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
                    Intrinsics.checkNotNullParameter(planId, "planId");
                    pfm.d dVarQ2 = efm.b.q(dVarQ, pVar.f126824g.g(planId, true));
                    Intrinsics.checkNotNullExpressionValue(dVarQ2, "mergeArrayDelayError(...)");
                    pfm.a aVarE = rVarG0.e(ue0.e.v(dVarQ2));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    j60.a.v(a0Var.f115464r, false, null, 3);
                    v vVar = new v(a0Var, r0Var, continuation, i3);
                    this.v = 1;
                    if (a0Var.p2(this, vVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        a0Var.getClass();
                        a0Var.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.credit_common_transactions, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65534)));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                a0Var.u.getClass();
                Flow flowX1 = a0Var.X1(new y0("ID_SUCCESS_CANCELLATION_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.pay_later_plan_cancellation_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.pay_later_plan_cancellation_success_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.pay_later_plan_cancellation_success_see_transactions, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4));
                d4f.m mVar = new d4f.m(i2, 4, continuation);
                this.v = 2;
                if (vkm.q.y(flowX1, mVar, this) == aVar4) {
                    return aVar4;
                }
                a0Var.getClass();
                a0Var.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.credit_common_transactions, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) null, (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65534)));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    dj0.d dVarH = pyd.c.H(r0Var.f322331j, u0.u(r0Var));
                    this.v = 1;
                    objY2 = a0.y2(a0Var, dVarH, this);
                    if (objY2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objY2 = obj2;
                }
                if (((Boolean) objY2).booleanValue()) {
                    j60.a aVar6 = a0Var.f115464r;
                    a0Var.u.getClass();
                    r0 plan = this.f115484x;
                    Intrinsics.checkNotNullParameter(plan, "plan");
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14);
                    int i22 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CONFIRM_CANCELLATION", defaultFilledButton, null, textLocalisedClause, false, null, plan, i22, R$attr.uikit_dp8, i22, i22, 368);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_common_cancel, null, null, 14);
                    int i32 = R$attr.uikit_dp16;
                    aVar6.x(new rp0.y(i2b.a.r(model, new LargeActionButtonDelegate.Model("ID_CANCEL", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, i32, i32, i32, 496)), new rp0.t(new TextLocalisedClause(R$string.pay_later_plan_cancellation_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_plan_cancellation_confirmation_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                } else {
                    j60.a aVar7 = a0Var.f115464r;
                    a0Var.u.getClass();
                    aVar7.x(c0.b(new TextLocalisedClause(R$string.pay_later_plan_cancellation_insufficient_funds_description, null, null, 14)));
                }
                return Unit.f186387a;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar9 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(r0Var, a0Var, continuation, 7);
                    this.v = 1;
                    if (a0Var.p2(this, aVar9) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r0 r0Var, a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f115484x = r0Var;
        this.f115483w = a0Var;
    }
}
