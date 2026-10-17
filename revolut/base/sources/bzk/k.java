package bzk;

import cli.y;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.GiaOnboardingFailedBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    private static final j Companion = new j();
    public final y o;

    public k(GiaOnboardingFailedBottomSheetContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new a(inputData.f104155a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
