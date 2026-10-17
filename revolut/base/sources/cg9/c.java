package cg9;

import android.os.Parcelable;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FormDetailsScreen formDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        String actionId = item.f58316a;
        Object obj3 = item.f58324n;
        n nVar = (n) hVarE3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        if (Intrinsics.f(actionId, "CANCEL_FORM_ACTION_ID")) {
            Bill bill = obj3 instanceof Bill ? (Bill) obj3 : null;
            if (bill != null) {
                int i = R$string.pay_bills_taxes_tax_form_cancel_dialog_title;
                String str = bill.f61249g;
                if (str == null) {
                    str = "";
                }
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(i, u.c(str), null, 12), null, null, null, false, 30);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_cancel_dialog_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CANCEL_BUTTON_LOADING_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.pay_bills_taxes_tax_form_cancel_dialog_button_decline, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                c7e.i block = new c7e.i(nVar, bill, 14);
                Intrinsics.checkNotNullParameter(block, "block");
                actionsBottomSheetController.H = block;
                nVar.C1(new com.revolut.kompot.common.b(actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
            }
        }
        return Unit.f186387a;
    }
}
