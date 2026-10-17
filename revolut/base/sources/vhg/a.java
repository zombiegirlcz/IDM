package vhg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C1598a Companion = new C1598a();

    /* JADX INFO: renamed from: vhg.a$a, reason: collision with other inner class name */
    public static final class C1598a {
        private C1598a() {
        }
    }

    public static ListSubheaderDelegate.Model a(boolean z) {
        return new ListSubheaderDelegate.Model("RECOMMENDED_AIRLINES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_search_results_recommended_airlines_section_title, null, null, 14), z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, z, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114);
    }
}
