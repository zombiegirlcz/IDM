package lge;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m {
    public static final Clause a(pie.a aVar) {
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (l.f195109a[aVar.ordinal()]) {
            case 1:
                List listK = v.k(new TextLocalisedClause(R$string.account_switcher_space_restricted_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_lock_closed, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
                m70.a.t(t0.f186434a);
                return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 2:
                List listK2 = v.k(new TextLocalisedClause(R$string.account_switcher_favourites_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_24_star_filled, new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16));
                m70.a.t(t0.f186434a);
                return new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 3:
                return new TextLocalisedClause(R$string.account_switcher_space_personal_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.account_switcher_space_joint_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.account_switcher_space_pro_rebranding_professional_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.account_switcher_space_linked_title, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.account_switcher_space_youth_title, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.account_switcher_space_youth_title, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.home_total_wealth_title, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.account_switcher_sub_space_credit_title, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
