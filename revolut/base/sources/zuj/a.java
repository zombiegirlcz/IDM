package zuj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static eii.l a(int i, int i2, m mVar) {
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        return new eii.l((Clause) new TextLocalisedClause(i, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i2, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), true, false, (RowDelegate.Model.c) (0 == true ? 1 : 0), (Object) mVar, 232);
    }
}
