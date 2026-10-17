package mlk;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import grl.k9;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ h0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.u = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        Date date;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h0 h0Var = this.u;
        cli.y yVar = h0Var.E;
        hha.d currentPlan = ((PricingPlanSubscription) zi0.c.I(((v) ((j2) yVar.f22677a).getValue()).f207028b)).f81129a;
        t tVar = (t) zi0.c.I(((v) ((j2) yVar.f22677a).getValue()).d);
        s sVar = tVar instanceof s ? (s) tVar : null;
        w wVar = sVar != null ? sVar.e : null;
        h0Var.A.getClass();
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Clause clauseD = dok.g.d(currentPlan, null);
        Long lValueOf = (wVar == null || (date = wVar.f207031a) == null) ? null : Long.valueOf(date.getTime());
        if (lValueOf != null) {
            int i = R$string.plan_cancellation_screen_benefits_insurance_dialog_description;
            long jLongValue = lValueOf.longValue();
            TimeClause.Format.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i, zhm.v.k(new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12), clauseD), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_insurance_dialog_description_immediate, zhm.u.c(clauseD), null, 12);
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_insurance_dialog_title, null, null, 14), textLocalisedClause, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.plan_cancellation_screen_benefits_insurance_dialog_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Premium;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        yji.l.j2(h0Var, new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
