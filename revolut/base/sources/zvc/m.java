package zvc;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import zhm.u;
import zul.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(ConnectedWifi connectedWifi) {
        boolean z = connectedWifi.f85468b;
        return yp0.b.g(u.c(new RowDelegate.Model(z ? "UNSECURED_NETWORK_ITEM_ID" : "CONNECTED_WIFI_ITEM_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6), null, null, false, null, false, 60), new TextClause(connectedWifi.f85467a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, z ? new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_cell_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_currently_connected_cell_subtitle, null, null, 14), null, null, 0, z ? new tf(new yy0.h(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_cell_subtitle, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))) : new pf(new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_unknown_section_action_add, null, null, 14), null, h4.ACCENT, false, null, null, 506), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)), new ListSubheaderDelegate.Model("CONNECTED_WIFI_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.security_hub_street_mode_trusted_wifi_list_unknown_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f325643a, new l0(1), new zs4.d(10), new y(29, domainState, this)));
    }
}
