package imb;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.savings.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yik.h;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f162342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f162343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f162344c;

    public e(dcd.b savingsInterestRateFormatter, h pricingPlanStringMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f162342a = savingsInterestRateFormatter;
        this.f162343b = pricingPlanStringMapper;
        this.f162344c = featureToggleInteractor;
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.savings_hys_review_details_badge_text, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccentNeutral), false, false, 254), 10);
    }
}
