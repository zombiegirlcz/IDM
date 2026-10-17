package dq7;

import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation_details.CancellationDetailsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f116927p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CancellationDetailsScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f116927p = new d(inputData.f75648a, inputData.f75649b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f116927p;
    }
}
