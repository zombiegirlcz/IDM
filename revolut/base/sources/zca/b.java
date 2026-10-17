package zca;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.pocket_actions.common.R$string;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static dii.a a(String institutionName) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.open_banking_external_account_details_revoke_linked_dialog_title, u.c(institutionName), null, 12), new TextLocalisedClause(R$string.open_banking_external_account_details_revoke_linked_dialog_subtitle, null, null, 14), null, null, false, 28);
        h hVar = new h(false, new n6(new TextLocalisedClause(R$string.pocket_actions_revoke_popup_button_revoke, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.pocket_actions_revoke_popup_button_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
