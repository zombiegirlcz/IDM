package jq5;

import cli.y;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends oki.h implements dli.b {
    public final CryptoSendLimitExceededBottomSheetControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f177473p;

    public e(f stateMapper, CryptoSendLimitExceededBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f177473p = mra.d.b(this, new b(inputData.f71297a, inputData.f71298b, inputData.f71299c, inputData.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f177473p;
    }
}
