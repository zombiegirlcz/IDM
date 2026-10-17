package vn3;

import cli.n;
import cli.y;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(n mapper, CooldownCheckFailedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new d(inputData.f66104a, inputData.f66105b), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
