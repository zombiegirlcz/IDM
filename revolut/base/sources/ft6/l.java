package ft6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import ip0.zj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final FullScreenStateDelegate.Model a() {
        return new FullScreenStateDelegate.Model("LIST_ID_EMPTY_PERKS", new TextLocalisedClause(R$string.freelancer_perks_widget_empty_title, null, null, 14), null, new ComplexImage.Regular(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_price_tag, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48)), null, zj.SMALL, false, null, null, null, 1988);
    }
}
