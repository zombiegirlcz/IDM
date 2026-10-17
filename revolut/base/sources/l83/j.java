package l83;

import cli.y;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements dli.b {
    public final ReactivateCardConfirmationBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f192772p;

    public j(m stateMapper, ReactivateCardConfirmationBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f192772p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f192772p;
    }
}
