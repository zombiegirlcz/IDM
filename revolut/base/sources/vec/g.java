package vec;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shipping.shared.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_shipping_addresses_management_option_edit, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        int i = R$drawable.uikit_icn_24_edit;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        CircleBadgeModel circleBadgeModel = null;
        ProgressStyle progressStyle = null;
        boolean z = false;
        NewBadgeContent newBadgeContent = null;
        List listK = v.k(new RowDelegate.Model("EDIT_SHIPPING_CONTACT_OPTION_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, null, null, 48), circleBadgeModel, progressStyle, z, newBadgeContent, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("DELETE_SHIPPING_CONTACT_OPTION_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(R$string.revolut_pay_shipping_addresses_management_option_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, R$attr.uikit_dp32, R$attr.uikit_dp24, 0, 0, 28);
        return new d(listK);
    }
}
