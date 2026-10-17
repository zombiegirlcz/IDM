package kye;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        g0 g0Var = (g0) this.receiver;
        KProperty[] kPropertyArr = AmountNewScreen.f90823b0;
        k3 k3Var = (k3) g0Var;
        k3Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "ITEM_EXTERNAL_POCKET_LIMITS_DEPOSITED")) {
            j60.a aVar = k3Var.v;
            ((gye.e) k3Var.u).getClass();
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_deposited_cell_title, null, null, 14), new TextLocalisedClause(R$string.topup_amount_direct_debit_limits_deposited_info_description, null, null, 14), null, 28);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ITEM_PRE_KYC_LEARN_MORE_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.topup_checkout_got_it, null, null, 14), false, null, null, null, null, 1000);
            int i = R$attr.uikit_dp24;
            int i2 = R$attr.uikit_dp16;
            yp0.b.p(model2, i, R$attr.uikit_dp8, i2, i2);
            aVar.x(new rp0.y(zhm.u.c(model2), tVar, null, null, null, null, 1020));
        }
        return Unit.f186387a;
    }
}
