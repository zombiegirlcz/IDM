package bh9;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BillsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(BillsSearchScreen billsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = billsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BillsSearchScreen billsSearchScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((t) billsSearchScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) billsSearchScreen.d();
                Biller.Details details = tVar.o.f15270b.k;
                if (details == null || !details.d) {
                    tVar.J2();
                } else {
                    ep1.b bVar = tVar.f15287s;
                    jte.d dVar = (jte.d) tVar.u;
                    boolean zC = dVar.c(PayBillsAndTaxesApi$Toggles.MxPhoneTopUps.f78660c);
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (zC || dVar.c(PayBillsAndTaxesApi$Toggles.CoPhoneTopUps.f78659c)) {
                        ((wp1.a) bVar).getClass();
                        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_mobile_plan_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_mobile_plan_dialog_description, null, null, 14), new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_sim_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null), null, false, 24);
                        m6 m6Var = n6.Companion;
                        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_mobile_plan_dialog_button_postpaid, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.pay_bills_taxes_country_mx_mobile_plan_dialog_button_prepaid, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                        k9 k9Var = k9.Retail;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        tVar.f2(new ActionsBottomSheetController(new dii.a(aVar3, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), bottom_dialog, new q(tVar, 1));
                    } else {
                        tVar.f2(new ActionsBottomSheetController(((wp1.a) bVar).b()), bottom_dialog, new q(tVar, 2));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
