package tq7;

import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreenContract$InputData;
import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f273534p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, ActivateTelematicsDeviceScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f273534p = new c(inputData.f75675a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f273534p;
    }
}
