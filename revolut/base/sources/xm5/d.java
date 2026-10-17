package xm5;

import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$Step;
import com.revolut.retail.core.navigation.FinishCommand;
import km5.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xif.k;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements km5.a {
    public final TfrValidationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f307093p;

    public d(TfrValidationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f307093p = cp5.d.a(this, inputData.f71016b == f.MESH ? TfrValidationFlowContract$Step.ActionRequired.f71018a : TfrValidationFlowContract$Step.ProvideMoreDetails.f71022a, f0.f322471a, new k(this, 8));
    }

    public final void I2() {
        if (this.o.d != null) {
            C1(u0.b(new FinishCommand(-1, null, null, 6)));
        } else {
            C2(km5.b.f185718a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f307093p;
    }
}
