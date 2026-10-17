package hw2;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;
import lw0.c;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static ActionsBottomSheetController a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_apple_wallet_confirmation_title, u.c(card.I), null, 12), new TextLocalisedClause(R$string.card_google_pay_confirmation_subtitle, u.c(card.I), null, 12), new c(new GlyphImage(R$drawable.uikit_icn_24_card_expired, null, null, 6)), null, false, 24);
        h hVar = new h(false, new n6(null, LargeActionButton.ButtonStyle.f58728g, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.card_google_pay_confirmation_continue_without_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
