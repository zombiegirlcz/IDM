package t6i;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static eii.a a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, boolean z, c cVar) {
        return new eii.a(new AccountCellItemDelegate.Model(str, z, (Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, Float.valueOf(40.0f), null, 32), (Clause) textLocalisedClause, (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) textLocalisedClause2, (RowDelegate.Model.c) null, (CircleIconBadge) (z ? new WhiteCircleBadge(dw0.a.Checked) : null), (Object) cVar, (AnalyticsContext) null, 128432));
    }
}
