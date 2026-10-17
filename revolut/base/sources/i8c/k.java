package i8c;

import cli.y;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements j {
    public final y o;

    public k(CashbackExplainerScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new f(inputData.f84471a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
