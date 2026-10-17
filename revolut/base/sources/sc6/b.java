package sc6;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.donations.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.j;
import nii.y0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static y0 a(dj0.d minAmount) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        return new y0(null, new g0(new TextLocalisedClause(R$string.donations_single_donation_campaign_alert_title, null, null, 14), new TextLocalisedClause(R$string.donations_single_donation_campaign_alert_subtitle, u.c(new MoneyClause(minAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, new TextLocalisedClause(R$string.donations_single_donation_campaign_alert_action, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), null, null, j.b.f216170a, false, null, false, null, 16228), false, 5);
    }
}
