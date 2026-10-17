package xre;

import aii.u;
import com.revolut.feature.three_ds_verification.api.ThreeDsVerificationApi$Toggles;
import com.revolut.feature.three_ds_verification.api.navigation.ThreeDsMerchantRedirectDestination;
import com.revolut.feature.three_ds_verification.api.navigation.ThreeDsVerificationDestination;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlow;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$InputData;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlow;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return ThreeDsVerificationApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ThreeDsVerificationDestination) {
            return new ThreeDsVerificationFlow(new ThreeDsVerificationFlowContract$InputData(((ThreeDsVerificationDestination) destination).getF90394a()));
        }
        if (destination instanceof ThreeDsMerchantRedirectDestination) {
            return new MerchantRedirectFlow(new MerchantRedirectFlowContract$InputData(((ThreeDsMerchantRedirectDestination) destination).getF90393a()));
        }
        return null;
    }
}
