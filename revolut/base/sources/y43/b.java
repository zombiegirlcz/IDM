package y43;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.impl.R$string;
import h93.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static LayeredImage a(int i) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(16.0f), null, 32);
    }

    public static RowDelegate.Model b(Clause clause, Image image, TextLocalisedClause textLocalisedClause, f0 f0Var) {
        return new RowDelegate.Model("LIST_ID_CARD_PAYMENT_METHOD_WIDGET", new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 62), clause, null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 532676568);
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("LIST_ID_CARD_PAYMENT_METHOD_WIDGET_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.card_payment_method_spend_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
