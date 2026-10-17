package buc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.security_hub.api.R$string;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static PermissionsController a(a aVar) {
        int i = R$string.security_hub_street_mode_prompt_access_required_subtitle;
        aVar.getClass();
        return new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.security_hub_street_mode_prompt_access_required_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.security_hub_street_mode_prompt_access_required_action, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_location_arrow, null, null, 6), new TextLocalisedClause(R$string.security_hub_street_mode_prompt_access_required_cancel, null, null, 14)), true, 2))));
    }
}
