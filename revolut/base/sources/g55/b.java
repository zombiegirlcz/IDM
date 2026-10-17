package g55;

import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements vx4.a {
    @Override // vx4.a
    public final FeatureCommand b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return new FeatureCommand(new LoanHomeFeatureConfig(facilityId));
    }
}
