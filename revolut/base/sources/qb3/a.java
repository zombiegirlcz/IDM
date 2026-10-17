package qb3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cash_topup.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public final y a() {
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.topup_cash_amount_dialog_fee_title, null, null, 14), new TextLocalisedClause(R$string.topup_cash_amount_dialog_fee_subtitle, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BUTTON_GOT_IT_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.topup_cash_amount_dialog_button_common_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new y(zhm.u.c(model), tVar, null, null, null, null, 1020);
    }

    public final y b(String limitsDescription) {
        Intrinsics.checkNotNullParameter(limitsDescription, "limitsDescription");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.topup_cash_amount_dialog_limits_title, null, null, 14), new TextClause(limitsDescription, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BUTTON_GOT_IT_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.topup_cash_amount_dialog_button_common_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new y(zhm.u.c(model), tVar, null, null, null, null, 1020);
    }
}
