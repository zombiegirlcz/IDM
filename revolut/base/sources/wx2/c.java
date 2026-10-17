package wx2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static RowDelegate.Model b(boolean z) {
        return a(R$drawable.uikit_icn_24_map_point, new TextLocalisedClause(R$string.card_choose_india_info_dialog_local_spend_item_title, null, null, 14), z ? new TextLocalisedClause(R$string.card_choose_india_info_dialog_local_spend_item_description, u.c(new TextLocalisedClause(R$string.card_choose_india_info_dialog_local_spend_item_link, null, new Click(30, (Integer) null, (Object) null, "ID_GO_TO_GLOBAL_INDIA_CARD_CLAUSE", false), 10)), null, 12) : new TextLocalisedClause(R$string.card_choose_india_info_dialog_local_spend_item_description_onboarding, null, null, 14), "ID_SPEND_ITEM");
    }
}
