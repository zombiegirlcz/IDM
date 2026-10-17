package mc2;

import c12.x;
import c12.z;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.qvik.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f204263a;

    public n(z apmRecipientListExtension) {
        Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
        this.f204263a = apmRecipientListExtension;
    }

    public final x a(hrf.f transferDirection, boolean z) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.secondary_id_new_contact_title, null, null, 14);
        } else {
            int i = m.f204262a[transferDirection.ordinal()];
            if (i == 1) {
                ApmRecipientListInputData.INSTANCE.getClass();
                textLocalisedClause = ApmRecipientListInputData.f62260l;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ApmRecipientListInputData.INSTANCE.getClass();
                textLocalisedClause = ApmRecipientListInputData.f62261m;
            }
        }
        return new x(new ApmRecipientListInputData(ApmQvik.f61823c, transferDirection, textLocalisedClause, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_select_contact_search_placeholder, null, null, 14), v.l(z ? new IconNavBarMenuItem("SETTINGS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_settings, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null)), this.f204263a);
    }
}
