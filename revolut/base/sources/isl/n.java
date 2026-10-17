package isl;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements d {
    public static CellDetailsDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, MoneyClause moneyClause, f fVar) {
        return new CellDetailsDelegate.Model("EXPANDABLE_DIALOG_CELL_DETAILS_".concat(str), textLocalisedClause, moneyClause, null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, 0, null, fVar, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
    }
}
