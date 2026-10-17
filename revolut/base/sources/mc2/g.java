package mc2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12.f f204253a;

    public g(c12.f apmNewContactExtension) {
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f204253a = apmNewContactExtension;
    }

    public final c12.g a(hrf.f transferDirection, boolean z, String str) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        IconNavBarMenuItem iconNavBarMenuItem = z ? new IconNavBarMenuItem("SETTINGS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_settings, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null;
        int i = f.f204252a[transferDirection.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.secondary_id_new_contact_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.apm_new_contact_title, u.c(ApmQvik.f61823c.e()), null, 12);
        }
        IconNavBarMenuItem iconNavBarMenuItem2 = iconNavBarMenuItem;
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        n02.b bVar = n02.b.QVIK;
        List listK = v.k(ApmNewContactNavigation$Tab.PHONE.f62253b, ApmNewContactNavigation$Tab.EMAIL.f62252b, new ApmNewContactNavigation$Tab.TAX(new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_new_contact_tab_tax_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.qvik.api.R$string.qvik_new_contact_tab_tax_input_title, null, null, 14), null));
        wi0.b.Companion.getClass();
        return new c12.g(new ApmNewContactNavigation$InputData(bVar, listK, transferDirection, textLocalisedClause2, wi0.b.I0, v.l(iconNavBarMenuItem2), str, 32), this.f204253a);
    }
}
