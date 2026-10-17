package jmc;

import android.os.Parcelable;
import aw0.c7;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import mii.f;
import nii.h0;
import nii.j0;
import nii.u1;
import org.jmrtd.lds.LDSFile;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static f a() {
        return new f("delete-goal-confirmation-shot", new TextLocalisedClause(R$string.wealth_robo_edit_goal_success_delete_message, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG);
    }

    public static j0 b(PortfolioGoal portfolioGoal, int i) {
        return new j0((Clause) new TextLocalisedClause(i, null, null, 14), (Clause) new TextLocalisedClause(R$string.wealth_robo_edit_goal_success_create_dialog_description, v.k(new MoneyClause(portfolioGoal.f95699a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), j.b(c7.Companion, portfolioGoal.a(), new LocalDateClause$DateFormat.MonthAndYear(0))), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }
}
