package lq4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.yt;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ListCellDelegate.Model a() {
        return b(R$drawable.uikit_icn_24_auto_exchange, new TextLocalisedClause(R$string.credit_cashback_auto_deposit_description, null, null, 14), "id_credit_card_cashback_item_autopay");
    }

    public static ListCellDelegate.Model b(int i, TextLocalisedClause textLocalisedClause, String str) {
        return new ListCellDelegate.Model(str, new j8(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), yt.TOP), textLocalisedClause, null, false, null, null, 0, 0, 0, 0, 4088);
    }

    public static LargeActionButtonDelegate.Model c() {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("id_credit_card_cashback_button_got_it", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        yp0.b.r(model, i, i, 0, 0, 12);
        return model;
    }
}
