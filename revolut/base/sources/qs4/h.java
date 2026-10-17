package qs4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements dli.b {
    public final y o;

    public h(CreditCardAnticipationPrepayScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f69458b, inputData.f69457a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
