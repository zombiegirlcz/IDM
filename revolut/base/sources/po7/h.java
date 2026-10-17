package po7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value.EstimatedCarValuePickerScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f237896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f237897q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, EstimatedCarValuePickerScreenContract$InputData inputData, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f237896p = bottomDialog;
        this.f237897q = new d(inputData.f75554a, 1);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f237897q;
    }
}
