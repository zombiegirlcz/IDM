package io7;

import cli.n;
import cli.y;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.view_driver.ViewDriverScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements dli.b {
    public final y o;

    public f(ViewDriverScreenContract$InputData inputData, n mapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = mra.d.b(this, new d(inputData.f75541a), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
