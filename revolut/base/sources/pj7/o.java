package pj7;

import at.r;
import cli.y;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends oki.h implements m {
    public final CFACInsuranceBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f236689p;

    public o(r stateMapper, CFACInsuranceBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f236689p = mra.d.b(this, new e(inputData.f75061a, inputData.f75062b, inputData.f75063c, inputData.d, inputData.e, inputData.f), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236689p;
    }
}
