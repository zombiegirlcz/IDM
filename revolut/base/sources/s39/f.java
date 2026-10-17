package s39;

import cli.n;
import cli.y;
import cli.z;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements z {
    public final y o;

    public f(n stateMapper, DateInputInputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = mra.d.b(this, new d(inputData.f78063a, inputData.f78064b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
