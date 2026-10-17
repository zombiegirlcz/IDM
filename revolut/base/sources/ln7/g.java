package ln7;

import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_list.BenefitListScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f197113p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, BenefitListScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f197113p = new c(inputData.f75513a);
    }

    @Override // jki.g
    public final i r2() {
        return this.f197113p;
    }
}
