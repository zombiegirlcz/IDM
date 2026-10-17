package za7;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import mii.k;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public final ActionsBottomSheetController a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.secret_accounts_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.secret_accounts_bottom_sheet_description, u.c(new TextLocalisedClause(R$string.secret_accounts_bottom_sheet_path, null, new Click(30, (Integer) null, (Object) null, "HIDDEN_ACCOUNTS_FROM_VIEW_CLICK_ID", false), 10)), null, 12), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.secret_accounts_bottom_sheet_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    public final k b() {
        return new k("HIDE_ACCOUNT_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.hidden_accounts_toast_account_hidden, null, null, 14), null, null, null, 28);
    }
}
