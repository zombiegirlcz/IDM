package yz2;

import com.revolut.feature.card_management.impl.ui.change_pin.activation.ChangePinActivationScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f318029p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, ChangePinActivationScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f318029p = new d(inputData.f64845a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f318029p;
    }
}
