package gkf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static ActionsView.Item a(Object obj2, String str) {
        return new ActionsView.Item(str, mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.details_action_payment_cancel_split_bill, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, obj2, null, 24476);
    }
}
