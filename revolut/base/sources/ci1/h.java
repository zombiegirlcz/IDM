package ci1;

import cli.n;
import cli.y;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(AddManuallyScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        String str = inputData.f60972b;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this.o = mra.d.b(this, new e(str), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
