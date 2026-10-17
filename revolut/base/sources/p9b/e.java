package p9b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.global_accounts.impl.R$string;
import eii.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static l a(String str) {
        return new l((Clause) new TextLocalisedClause(R$string.user_country_profiles_country_profiles_manage_sheet_destructive_answer, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_trash, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 4.0f, null, null, 48), null, null, false, null, true, 28), true, false, (RowDelegate.Model.c) null, (Object) new b(str, a.CLOSE), 232);
    }
}
