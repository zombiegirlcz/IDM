package rgk;

import android.os.Parcelable;
import ble.e0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.i0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.ApplyDiscount f254212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function0 f254213x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, PricingPlanAction.ApplyDiscount applyDiscount, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f254212w = applyDiscount;
        this.f254213x = function0;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f254212w, this.f254213x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Long l2;
        TextLocalisedClause textLocalisedClause;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            i iVar = new i(bVar, this.f254212w, null);
            this.u = 1;
            objB = pu7.a.B(bVar.e, "apply_discount", iVar, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB = obj2;
        }
        PricingPlanSubscription subscription = (PricingPlanSubscription) objB;
        if (subscription == null) {
            return Unit.f186387a;
        }
        bVar.f102971q.getClass();
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Clause clauseD = dok.g.d(subscription.f81129a, null);
        i0 i0Var = subscription.f81137n;
        if (i0Var == null || (l2 = i0Var.f152313c) == null) {
            i0 i0Var2 = subscription.f81135l;
            l2 = i0Var2 != null ? i0Var2.f152313c : null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.plan_discount_applied_title, u.c(clauseD), null, 12);
        if (l2 != null) {
            long jLongValue = l2.longValue();
            int i2 = R$string.plan_discount_applied_subtitle;
            TimeClause.Format.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i2, v.k(clauseD, new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        yji.n.j2(bVar, bVar.L2(new y0("discount_applied_success", new j0((Clause) textLocalisedClause2, (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, new e0(2, null, this.f254213x), 3);
        return Unit.f186387a;
    }
}
