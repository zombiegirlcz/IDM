package lh9;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.bills.core.api.model.BillFieldV2;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FormReviewScreen formReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BillFormField.Tooltip tooltip;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Object obj3 = model.o;
        r rVar = (r) nVarE3;
        rVar.getClass();
        if ((obj3 instanceof BillFieldV2.BillFieldText) && (tooltip = ((BillFieldV2.BillFieldText) obj3).f61269c) != null) {
            String str = tooltip.f61290b;
            if (str == null && (str = tooltip.f61289a) == null) {
                m70.a.c(t0.f186434a);
                str = "";
            }
            String str2 = str;
            String str3 = tooltip.f61291c;
            if (str3 == null) {
                str3 = tooltip.d;
            }
            lw0.a aVar2 = new lw0.a(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55);
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            rVar.C1(new com.revolut.kompot.common.b(new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
        }
        return Unit.f186387a;
    }
}
