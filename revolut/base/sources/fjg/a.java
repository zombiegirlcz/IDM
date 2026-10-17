package fjg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import xig.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {
    public final y a(TrustedMerchant merchant, String str) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        t tVar = new t(new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_title, u.c(merchant.getF94412c()), null, 12), new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_description, u.c(merchant.getF94412c()), null, 12), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_main_button, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("TRUSTED_CONFIRMATION_DIALOG_MAIN_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, merchant, i, R$attr.uikit_dp8, i2, i2, 368);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trusted_merchants_approve_dialog_secondary_button, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        return new y(v.k(model, new LargeActionButtonDelegate.Model("TRUSTED_CONFIRMATION_DIALOG_SECONDARY_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i3, R$attr.uikit_dp24, i5, i5, 496)), tVar, null, null, merchant, null, str, null, null, null, 3772);
    }
}
