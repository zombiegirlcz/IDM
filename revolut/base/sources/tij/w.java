package tij;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {
    public static ActionWidgetDelegate.Model a(List esimSubscriptions, EsimProfile esimProfile) {
        Object next;
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_banner_esim_frozen_title, null, null, 14);
        int i = R$string.esim_mobile_plan_banner_esim_frozen_subtitle;
        Iterator it8 = esimSubscriptions.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((t1) next).e.f100440a, esimProfile.f100423a)) {
                break;
            }
        }
        t1 t1Var = (t1) next;
        Instant instant = t1Var != null ? t1Var.f113664w : null;
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("UNFREEZE_ESIM_BANNER", textLocalisedClause, new TextLocalisedClause(i, zhm.v.l(instant != null ? new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : null), null, 12), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_snowflake, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10), null, new com.revolut.core.ui_kit.delegates.i(10, new TextLocalisedClause(R$string.esim_mobile_plan_banner_esim_frozen_cta, null, null, 14), null, true), null, esimProfile, null, 1744);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
