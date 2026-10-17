package fw9;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.payments.profile.api.navigation.PaymentsProfileDestination;
import com.revolut.feature.payments.profile.impl.flow.PaymentProfileUsernameFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.PaymentProfileLazyFlowContract$InputData;
import com.revolut.feature.payments.profile.impl.ui_kompot.onboarding.ProfileController;
import ew9.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof c) {
            return ((c) descriptor).a(new ProfileController());
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof PaymentsProfileDestination)) {
            return null;
        }
        int i = a.f138586a[((PaymentsProfileDestination) destination).getF79621a().getF79620a().ordinal()];
        if (i == 1) {
            return new PaymentProfileLazyFlow(new PaymentProfileLazyFlowContract$InputData(sw9.a.CODE));
        }
        if (i == 2) {
            return new PaymentProfileLazyFlow(new PaymentProfileLazyFlowContract$InputData(sw9.a.SCAN));
        }
        if (i == 3) {
            return new PaymentProfileUsernameFlow();
        }
        throw new NoWhenBranchMatchedException();
    }
}
