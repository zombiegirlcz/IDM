package qs2;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import android.content.Context;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlow;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {
    @Override // aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof uu.a) {
            return ((uu.a) descriptor).a(new ReferralWithIncentiveFlow(new ReferralWithIncentiveFlowContract$InputData(null, null)));
        }
        return null;
    }

    @Override // nhi.h
    public final void f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        context.deleteDatabase("s-contacts-storage.sh");
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
