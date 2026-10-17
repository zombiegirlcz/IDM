package y63;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y a(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.card_cancel_order_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_cancel_order_dialog_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_cancel_order_dialog_negative_button, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CANCEL_CARD_ORDER_NEGATIVE_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i2, i2, 496);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_cancel_order_dialog_positive_button, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp16;
        return new y(zhm.v.k(model, new LargeActionButtonDelegate.Model("CANCEL_CARD_ORDER_POSITIVE_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, checkoutOrder, i3, R$attr.uikit_dp24, i5, i5, 368)), tVar, null, null, checkoutOrder, null, 988);
    }
}
