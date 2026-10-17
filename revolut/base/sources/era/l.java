package era;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextDelegate.Model f128618a;

    public static final class a {
        private a() {
        }
    }

    public l() {
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_contactless, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), new TextLocalisedClause(R.string.add_card_details_nfc_title, null, null, 14)));
        int i = R$attr.uikit_dp0;
        this.f128618a = new TextDelegate.Model(i, i, 828, compositeClauseM, "NFC_ITEM_LIST_ID");
    }
}
