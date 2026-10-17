package nn7;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements z {
    public final y o;

    public h(DateRangeScreenContract$InputData inputData, n mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new e(vim.i.b(inputData.f75515b, inputData.f75516c), vim.i.b(inputData.d, inputData.e), inputData.f), mapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
