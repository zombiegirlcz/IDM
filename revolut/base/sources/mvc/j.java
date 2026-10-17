package mvc;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_rename, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = v.k(new RowDelegate.Model("RENAME_LOCATION_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_edit, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("EDIT_LOCATION_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_location_pin, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_edit, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("REMOVE_LOCATION_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_trash, R$attr.uikit_colorRed, R$attr.uikit_colorRed_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.security_hub_street_mode_trusted_locations_list_action_remove, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorRed), false, false, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        int i = R$attr.uikit_dp32;
        yp0.b.k(listK, i, i, 0, 0, 28);
        return new h(listK);
    }
}
