package yx7;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import ip0.y10;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static sa a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        sa saVar = new sa("plain.text.warning.cancellation.ud", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, v.k(new ActionsView.Item("ADD_NEW_POLICY_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.pets_profile_cancelled_banner_add_new_policy_button, null, null, 14), null, null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("REMOVE_PROFILE_ACTION_ID", mx0.d.NEGATIVE, false, null, null, new TextLocalisedClause(R$string.pets_profile_cancelled_banner_remove_profile_button, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), y10.LIGHT, (Object) null, 3968);
        int i = R$attr.uikit_dp16;
        yp0.b.l(saVar, i, i, 0, 0, null, false, 60);
        return saVar;
    }
}
