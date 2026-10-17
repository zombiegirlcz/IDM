package otc;

import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final WealthProtectionFeatureState.Visible a(WealthProtectionFeatureDetails wealthProtectionFeatureDetails) {
        Intrinsics.checkNotNullParameter(wealthProtectionFeatureDetails, "<this>");
        if (wealthProtectionFeatureDetails instanceof WealthProtectionFeatureDetails.Disabled) {
            WealthProtectionFeatureDetails.Disabled disabled = (WealthProtectionFeatureDetails.Disabled) wealthProtectionFeatureDetails;
            return new WealthProtectionFeatureState.Visible.Disabled(disabled.f85438b, disabled.f85439c, disabled.d);
        }
        if (!(wealthProtectionFeatureDetails instanceof WealthProtectionFeatureDetails.Enabled)) {
            throw new NoWhenBranchMatchedException();
        }
        WealthProtectionFeatureDetails.Enabled enabled = (WealthProtectionFeatureDetails.Enabled) wealthProtectionFeatureDetails;
        return new WealthProtectionFeatureState.Visible.Enabled(enabled.f85441b, enabled.f85442c, enabled.d, enabled.e);
    }
}
