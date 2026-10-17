package za7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements ra7.d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        return v.k(new RowDelegate.Model("HIDE_TRANSACTION_ANALYTICS_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_analytics_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_analytics_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HIDE_TRANSACTION_ACCESS_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_access_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_access_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("HIDE_TRANSACTION_BALANCE_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_balance_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.hidden_transaction_hide_info_item_balance_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
    }
}
