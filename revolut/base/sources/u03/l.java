package u03;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l {
    public static a a(i93.i securityOption, boolean z) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(securityOption, "securityOption");
        i93.e eVar = securityOption.f159561a;
        boolean z3 = securityOption.f159563c;
        boolean z4 = securityOption.f159562b;
        i93.l lVar = securityOption.d;
        if (lVar != null) {
            dj0.d dVar = lVar.f159569b;
            textLocalisedClause = dVar == null ? new TextLocalisedClause(R.string.card_change_limits_info_noLimit, null, null, 14) : new TextLocalisedClause(R.string.card_change_limits_info_limit, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        } else {
            textLocalisedClause = null;
        }
        switch (k.f276050a[eVar.ordinal()]) {
            case 1:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_location_arrow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_location_arrow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_location_title, null, null, 14), new TextLocalisedClause(R.string.card_security_location_v2_description, null, null, 14), textLocalisedClause, z3, z4);
            case 2:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_magstripe_enabled_title, null, null, 14), new TextLocalisedClause(R.string.card_security_magstripe_enabled_v2_description, null, null, 14), textLocalisedClause, z3, z4);
            case 3:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_contactless, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_contactless, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_contactless_enabled_title, null, null, 14), new TextLocalisedClause(z ? R.string.card_security_contactless_enabled_v2_description_google_pay : R.string.card_security_contactless_enabled_v2_description, null, null, 14), textLocalisedClause, z3, z4);
            case 4:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_atm_enabled_title, null, null, 14), new TextLocalisedClause(R.string.card_security_atm_enabled_v2_description, null, null, 14), textLocalisedClause, z3, z4);
            case 5:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_globe_p2p, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_globe_p2p, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_ecomm_enabled_title, null, null, 14), new TextLocalisedClause(z ? R$string.card_security_ecomm_enabled_v2_description_with_google_pay : R.string.card_security_ecomm_enabled_v2_description, null, null, 14), textLocalisedClause, z3, z4);
            case 6:
                return new a(eVar, securityOption, new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new ResourceImage(R$drawable.uikit_icn_24_merchant, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.card_security_pos_enabled_title, null, null, 14), new TextLocalisedClause(R.string.card_security_pos_enabled_description, null, null, 14), textLocalisedClause, z3, z4);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
