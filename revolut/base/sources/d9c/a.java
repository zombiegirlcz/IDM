package d9c;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.impl.R$string;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0667a Companion = new C0667a();

    /* JADX INFO: renamed from: d9c.a$a, reason: collision with other inner class name */
    public static final class C0667a {
        private C0667a() {
        }
    }

    public static RowDelegate.Model.c.a a(BigDecimal bigDecimal) {
        TextLocalisedClause textLocalisedClause;
        if (bigDecimal.signum() == 0) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_schedule_zero_interest_badge, null, new Custom(Integer.valueOf(R$attr.uikit_colorOnAccent), false, null, false, null, 254), 10);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_payment_schedule_interest_badge, u.c(bigDecimal.toPlainString()), new Custom(Integer.valueOf(R$attr.uikit_colorOnAccent), false, null, false, null, 254), 8);
        }
        return new RowDelegate.Model.c.a(new TagViewData(null, textLocalisedClause, new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorWidgetBackground), 0.1f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024), null, false, 6);
    }
}
