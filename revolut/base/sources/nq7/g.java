package nq7;

import com.revolut.feature.insurance_car.impl.data.model.FailedPaymentDetails;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.overdue_payment.OverduePaymentScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f218377p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, OverduePaymentScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Policy policy = inputData.f75662a;
        FailedPaymentDetails failedPaymentDetails = policy.k;
        if (failedPaymentDetails == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f218377p = new c(policy.f75287b, failedPaymentDetails);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f218377p;
    }
}
