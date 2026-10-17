package ob1;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static com.revolut.core.ui_kit.widget.dashboard.a a(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType cardReaderProductDetailsScreenContract$ProductDetailsWidgetType, boolean z, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        String string = cardReaderProductDetailsScreenContract$ProductDetailsWidgetType.toString();
        int i = R$attr.uikit_colorGreyTone50;
        return new com.revolut.core.ui_kit.widget.dashboard.a(string, cardReaderProductDetailsScreenContract$ProductDetailsWidgetType, z, new ly0.a(textLocalisedClause, new pq0.n(i, i)), new com.revolut.core.ui_kit.widget.dashboard.b(u.c(new ListCellDelegate.Model(textLocalisedClause2.toString(), null, null, textLocalisedClause2, false, null, null, 0, 0, 0, 0, 4068))));
    }
}
