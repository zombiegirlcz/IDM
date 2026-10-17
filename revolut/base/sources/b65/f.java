package b65;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import q35.l;

/* JADX INFO: loaded from: classes21.dex */
public final class f {
    public static ResourceImage a(f fVar) {
        int i = R$attr.uikit_colorGreyTone50;
        fVar.getClass();
        return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static CellDetailsDelegate.Model b(l lVar) {
        if (lVar == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_INTEREST_ONLY_REPAYMENTS_LEFT_CELL", new t0((Clause) new TextLocalisedClause(R$string.loan_management_account_interest_only_period_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedQuantityClause(R$plurals.loan_management_account_interest_only_period_remaining, Integer.valueOf(lVar.f241830a), (List) null, (Style) null, 28), null, lVar, null, null, 0, null, false, false, null, null, 32696);
    }
}
