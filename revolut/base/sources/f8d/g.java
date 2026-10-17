package f8d;

import cli.y;
import com.revolut.feature.shared.help_centre.api.faq.FaqEntriesScreenDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements e {
    public final y o;

    public g(FaqEntriesScreenDestination.InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f86104a, inputData.f86105b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
