package t4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static eii.l a(int i, Integer num, LayeredImage layeredImage, l4a.a aVar) {
        TextLocalisedClause title = new TextLocalisedClause(i, null, null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(num.intValue(), null, null, 14);
        Intrinsics.checkNotNullParameter(title, "title");
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        return new eii.l((Clause) title, textLocalisedClause, new RowDelegate.Model.MainImage.Image40(layeredImage, circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), true, (MoneyClause) (0 == true ? 1 : 0), (MoneyClause) (0 == true ? 1 : 0), (Object) aVar, 288);
    }
}
