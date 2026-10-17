package rrd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rrd.o;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tsj.g f256823a;

    public q(tsj.g customAssetsInteractor) {
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        this.f256823a = customAssetsInteractor;
    }

    public final RowDelegate.Model a(boolean z, boolean z3, o subtitleVariant) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(subtitleVariant, "subtitleVariant");
        if (!this.f256823a.e()) {
            return null;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_market_order, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_banner_title, null, null, 14);
        mf mfVar = new mf(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
        if (subtitleVariant instanceof o.a) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_banner_subtitle, null, null, 14);
        } else {
            if (!(subtitleVariant instanceof o.b)) {
                if (!(subtitleVariant instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_banner_next_subtitle, u.c(((p) subtitleVariant).f256822a), null, 12);
                return new RowDelegate.Model("smart_estimation_toggle", image40, textLocalisedClause3, null, 0, textLocalisedClause, null, null, 0, new vf(z, z3), false, null, false, null, null, mfVar, null, null, null, null, null, 0, 0, 0, 0, 536802264);
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_smart_estimation_banner_estimating_subtitle, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        return new RowDelegate.Model("smart_estimation_toggle", image40, textLocalisedClause3, null, 0, textLocalisedClause, null, null, 0, new vf(z, z3), false, null, false, null, null, mfVar, null, null, null, null, null, 0, 0, 0, 0, 536802264);
    }
}
