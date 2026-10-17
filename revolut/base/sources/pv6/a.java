package pv6;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import oi0.d;
import rr6.q;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static TextLocalisedClause a(q nextPayout) {
        Intrinsics.checkNotNullParameter(nextPayout, "nextPayout");
        return new TextLocalisedClause(R$string.freelancer_cashback_widget_details_subtitle, v.k(new MoneyClause(nextPayout.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), new TimeClause(d.c0(nextPayout.f256731c), new TimeClause.Format.DayAndMonth(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }
}
