package mzk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RowDelegate.Model f210813a = new RowDelegate.Model("ImmediateFamilyMemberDialogScreen", new ResourceImage(R$drawable.uikit_icn_24_utilities, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ff.DP_24, null, new TextLocalisedClause(R$string.wealth_onboarding_sg_affiliation_title, null, null, 14), new TextLocalisedClause(R$string.wealth_onboarding_sg_affiliation_body, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737576);

    public static final class a {
        private a() {
        }
    }
}
