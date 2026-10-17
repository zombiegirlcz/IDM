package rnh;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static CellDetailsActionDelegate.Model a(TextLocalisedClause actionText, kp3.b corporateEvent) {
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
        return new CellDetailsActionDelegate.Model("CORPORATE_TRANSACTION_TYPE_ID", new TextLocalisedClause(R$string.wealth_trading_transaction_type_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), actionText, false, false, null, corporateEvent, 0, 0, 32224);
    }
}
