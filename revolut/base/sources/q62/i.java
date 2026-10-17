package q62;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.iris.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        q62.a domainState = (q62.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new RowDelegate.Model("ID_DEREGISTER_INFO_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.iris_settings_deregister_dialog_info1_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("ID_DEREGISTER_INFO_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.iris_settings_deregister_dialog_info2_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.iris_settings_deregister_dialog_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "DEREGISTER_DIALOG_BUTTON_PRIMARY_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.iris_settings_deregister_dialog_action_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "DEREGISTER_DIALOG_BUTTON_SECONDARY_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 121), listK, new lw0.a(new TextLocalisedClause(R$string.iris_settings_deregister_dialog_title, null, null, 14), null, null, null, false, 30));
    }
}
