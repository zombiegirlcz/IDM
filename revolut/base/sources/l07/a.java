package l07;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1081a Companion = new C1081a();

    /* JADX INFO: renamed from: l07.a$a, reason: collision with other inner class name */
    public static final class C1081a {
        private C1081a() {
        }
    }

    public static RowDelegate.Model a(String str) {
        return new RowDelegate.Model("ITEM_ID_PRO_VAT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_id_back_side, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.freelancer_vat_number, null, null, 14), null, 0, (str == null || d0.W(str)) ? new TextLocalisedClause(R$string.freelancer_vat_common_title_not_added, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    public static RowDelegate.Model b(Boolean bool) {
        Clause textClause;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_account_settings_items_vat_reminder_title, null, null, 14);
        if (Intrinsics.f(bool, Boolean.TRUE)) {
            textClause = new TextLocalisedClause(R$string.freelancer_account_settings_items_vat_reminder_enabled, null, null, 14);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new RowDelegate.Model("ITEM_ID_PRO_VAT_REMINDER", image24, textLocalisedClause, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }
}
