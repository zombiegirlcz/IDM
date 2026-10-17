package hkk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.FamilyPlanCheckoutScreen;
import grl.k9;
import hha.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FamilyPlanCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FamilyPlanCheckoutScreen familyPlanCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = familyPlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ggk.a aVar;
        TextLocalisedClause textLocalisedClause;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f51832a;
        p pVar = (p) hVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_PAYMENT_TOTAL_DUE") && (aVar = (ggk.a) ((e) ((j2) pVar.v.f22677a).getValue()).f152941a.getContent()) != null) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.family_plans_checkout_pay_now_sheet_title, null, null, 14);
            z zVar = aVar.e.f81136m;
            DateTime dateTime = zVar != null ? zVar.f152376b : null;
            lha.q qVar = aVar.d.e;
            if (!vc.o.k(zVar) || dateTime == null || qVar == null) {
                textLocalisedClause = new TextLocalisedClause(R$string.family_plans_checkout_pay_now_sheet_description_charged_today, null, null, 14);
            } else {
                hha.i iVar = aVar.f143699c;
                int i = (iVar == null ? -1 : j.f152947a[iVar.ordinal()]) == 1 ? R$string.family_plans_checkout_pay_now_sheet_description_free_trial_annual : R$string.family_plans_checkout_pay_now_sheet_description_free_trial_monthly;
                long millis = dateTime.getMillis();
                TimeClause.Format.INSTANCE.getClass();
                textLocalisedClause = new TextLocalisedClause(i, v.k(new TimeClause(millis, TimeClause.Format.f57959a, null, null, 12), dok.b.b(qVar.f195227b.f152326a, null, null, null, 7), dok.g.d(aVar.f143698b, null)), null, 12);
            }
            lw0.a aVar3 = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
            k9 k9Var = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            yji.l.j2(pVar, new ActionsBottomSheetController(new dii.a(aVar3, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        return Unit.f186387a;
    }
}
