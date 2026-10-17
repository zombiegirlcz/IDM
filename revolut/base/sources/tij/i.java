package tij;

import aw0.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OpenPortingStatusParcel;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i {
    public static n3 a(int i, int i2, EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress, String str) {
        int i3 = R$drawable.uikit_icn_24_arrow_right_left;
        int i5 = R$attr.uikit_colorGreyTone50;
        return new n3(new TextLocalisedClause(R$string.esim_subscriptions_mobile_plan_item_porting_actions_template, zhm.v.k(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new EsimSubscriptionsScreenContract$OpenPortingStatusParcel(esimPhoneNumberPortingProgress, str), String.valueOf(i2), false), 10)), new Custom(Integer.valueOf(i5), false, null, false, null, 254), 8), new ResourceImage(i3, (Integer) null, (Integer) null, Integer.valueOf(i5), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }
}
