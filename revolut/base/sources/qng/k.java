package qng;

import cli.y;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements i {
    public final y o;

    public k(AddressSuggestionScreenContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new e(inputData.e, inputData.f), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
