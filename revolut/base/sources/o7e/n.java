package o7e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    public static y a(p recurringPayment, String accountId) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bill_accounts_details_payment_action_view_details, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(new RowDelegate.Model("ACTION_ID_PAYMENT_DETAILS", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_info_outline, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new k6e.f(recurringPayment, accountId), null, 0, 0, 0, 0, 532676600), new RowDelegate.Model("ACTION_ID_DELETE_PAYMENT", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_cross, R$attr.uikit_colorRed, R$attr.uikit_colorRed_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bill_accounts_details_payment_action_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new k6e.f(recurringPayment, accountId), null, 0, 0, 0, 0, 532676600));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new y(listK, new t(new TextLocalisedClause(R$string.bill_accounts_details_scheduled_outgoings_bottom_sheet_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016);
    }
}
