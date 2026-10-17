package ped;

import aw0.o9;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements a {
    public final ShotDialogDisplayer$Configuration a(String symbol, boolean z) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return z ? ShotDialogDisplayer$Configuration.Companion.c(ShotDialogDisplayer$Configuration.INSTANCE, "ALERT_ITEM_REMOVED_TOAST_ID", new TextLocalisedClause(R$string.shared_alerts_remove_item_from_alerts_toast_success_title, u.c(new TextClause(symbol, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 60) : ShotDialogDisplayer$Configuration.Companion.d(ShotDialogDisplayer$Configuration.INSTANCE, "ALERT_ITEM_REMOVED_TOAST_ID", new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_error_state_title, null, null, 14), null, 60);
    }
}
