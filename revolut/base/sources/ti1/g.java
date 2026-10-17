package ti1;

import cli.n;
import cli.y;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements dli.b {
    public final SuggestionSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f271403p;

    public g(SuggestionSheetContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f271403p = mra.d.b(this, new b(inputData.f61037c ? a.ORIGINAL : a.SUGGESTED), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f271403p;
    }
}
