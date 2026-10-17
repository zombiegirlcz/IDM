package o59;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.marketplace.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public e(vfg.g milesFeatureAvailabilityInteractor, ifg.a milesEntryPointProvider) {
        Intrinsics.checkNotNullParameter(milesFeatureAvailabilityInteractor, "milesFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(milesEntryPointProvider, "milesEntryPointProvider");
        new TextLocalisedClause(R$string.marketplace_app_miles_title, null, null, 14);
    }
}
